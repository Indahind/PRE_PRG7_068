package com.example.PRE_PRG7_068.dao.impl;

import com.example.PRE_PRG7_068.dao.TransaksiDao;
import com.example.PRE_PRG7_068.model.Transaksi;
import com.example.PRE_PRG7_068.repository.TransaksiRepository;
import com.example.PRE_PRG7_068.vo.TransaksiVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class TransaksiDaoImpl implements TransaksiDao {

    @Autowired
    private TransaksiRepository transaksiRepository;

    @Override
    public List<TransaksiVo> getAllTransaksi() {
        Iterable<Transaksi> transaksis = transaksiRepository.findAllTransaksi();
        List<TransaksiVo> transaksiVos = new ArrayList<>();
        for (Transaksi item : transaksis) {
            TransaksiVo transaksiVo = new TransaksiVo(item);
            transaksiVos.add(transaksiVo);
        }
        return transaksiVos;
    }

    @Override
    public List<TransaksiVo> getTransaksiByMonth(int month, int year) {
        Iterable<Transaksi> transaksis = transaksiRepository.findByMonthAndYear(month, year);
        List<TransaksiVo> transaksiVos = new ArrayList<>();
        for (Transaksi item : transaksis) {
            TransaksiVo transaksiVo = new TransaksiVo(item);
            transaksiVos.add(transaksiVo);
        }
        return transaksiVos;
    }
}
