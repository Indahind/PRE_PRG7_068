package com.example.PRE_PRG7_068.dao.impl;

import com.example.PRE_PRG7_068.dao.DetailTransaksiDao;
import com.example.PRE_PRG7_068.model.DetailTransaksi;
import com.example.PRE_PRG7_068.model.Layanan;
import com.example.PRE_PRG7_068.repository.DetailTransaksiRepository;
import com.example.PRE_PRG7_068.repository.LayananRepository;
import com.example.PRE_PRG7_068.repository.TransaksiRepository;
import com.example.PRE_PRG7_068.vo.DetailTransaksiVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class DetailTransaksiDaoImpl implements DetailTransaksiDao {

    @Autowired
    private DetailTransaksiRepository detailTransaksiRepository;

    @Autowired
    private LayananRepository layananRepository;

    @Autowired
    private TransaksiRepository transaksiRepository;


    @Override
    public List<DetailTransaksiVo> getAllDetailTransaksi() {
        Iterable<DetailTransaksi> detailTransaksis = detailTransaksiRepository.findAll();
        List<DetailTransaksiVo> detailTransaksiVos = new ArrayList<>();
        for (DetailTransaksi item : detailTransaksis) {
            DetailTransaksiVo detailTransaksiVo = new DetailTransaksiVo(item);
            Layanan layanan = layananRepository.findById(detailTransaksiVo.getMs_id()).orElseThrow();
            //detailTransaksiVo.setMs_nama(layanan.getMs_nama());
            detailTransaksiVos.add(detailTransaksiVo);
        }
        return detailTransaksiVos;
    }

    @Override
    public List<DetailTransaksiVo> getDetailId(int id) {
        Iterable<DetailTransaksi> detailTransaksis = detailTransaksiRepository.findByTrId(id);
        List<DetailTransaksiVo> detailTransaksiVos = new ArrayList<>();
        for (DetailTransaksi item : detailTransaksis) {
            DetailTransaksiVo detailTransaksiVo = new DetailTransaksiVo(item);
            Layanan layanan = layananRepository.findById(detailTransaksiVo.getMs_id()).orElseThrow();
            //detailTransaksiVo.setMs_nama(layanan.getMs_nama());
            detailTransaksiVos.add(detailTransaksiVo);
        }
        return detailTransaksiVos;
    }
}
