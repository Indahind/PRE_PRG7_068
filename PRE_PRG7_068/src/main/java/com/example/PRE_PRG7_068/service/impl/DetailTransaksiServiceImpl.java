package com.example.PRE_PRG7_068.service.impl;

import com.example.PRE_PRG7_068.DtoResponse;
import com.example.PRE_PRG7_068.dao.DetailTransaksiDao;
import com.example.PRE_PRG7_068.model.DetailTranasaksiPK;
import com.example.PRE_PRG7_068.model.DetailTransaksi;
import com.example.PRE_PRG7_068.model.Layanan;
import com.example.PRE_PRG7_068.model.Transaksi;
import com.example.PRE_PRG7_068.repository.DetailTransaksiRepository;
import com.example.PRE_PRG7_068.repository.LayananRepository;
import com.example.PRE_PRG7_068.repository.TransaksiRepository;
import com.example.PRE_PRG7_068.service.DetailTransaksiService;
import com.example.PRE_PRG7_068.vo.DetailTransaksiVoForm;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

import static com.example.PRE_PRG7_068.Constant.DetailTransaksiConstant.*;
import static com.example.PRE_PRG7_068.Constant.LayananConstant.mEmptyData;

@Service
@Transactional
public class DetailTransaksiServiceImpl implements DetailTransaksiService {
    @Autowired
    private DetailTransaksiDao detailTransaksiDao;
    @Autowired
    private DetailTransaksiRepository detailTransaksiRepository;
    @Autowired
    private TransaksiRepository transaksiRepository;
    @Autowired
    private LayananRepository layananRepository;

    @Override
    public DtoResponse getAllDetailTransaksi() {
        if (detailTransaksiDao.getAllDetailTransaksi() != null) {
            return new DtoResponse(200,detailTransaksiDao.getAllDetailTransaksi());
        }
        return new DtoResponse(200,null, mEmptyData);
    }

    @Override
    public DtoResponse saveDetailTransaksi(DetailTransaksiVoForm detailTransaksiVoForm) {
        try {
            DetailTranasaksiPK detailTranasaksiPK = new DetailTranasaksiPK();
            detailTranasaksiPK.setMs_id(detailTransaksiVoForm.getMs_id());
            detailTranasaksiPK.setTr_id(detailTransaksiVoForm.getTr_id());

            Optional<Transaksi> optionalTransaksi = transaksiRepository.findById(detailTransaksiVoForm.getTr_id());
            Transaksi transaksi = optionalTransaksi.orElse(null);

            Optional<Layanan> optionalKue = layananRepository.findById(detailTransaksiVoForm.getMs_id());
            Layanan layanan = optionalKue.orElse(null);

            if (transaksi != null && layanan != null) {
//                transaksi.setTr_tanggal(new Date());
//                transaksi.setTr_total(detailTransaksiVoForm.getJumlah() * kue.getMs_harga());
//                transaksi.setTr_creaby(detailTransaksiVoForm.getTr_creaby());
//                transaksi.setTr_creadate(detailTransaksiVoForm.getTr_creadate());
//                transaksiRepository.save(transaksi);
//                layanan.setMs_stok(layanan.getMs_stok() - detailTransaksiVoForm.getJumlah());
                layananRepository.save(layanan);
            }

            //for (DetailTransaksiVoForm detailForm : detailTransaksiVoForm.getDetailTransaksiList()) {
            DetailTransaksi detailTransaksi = new DetailTransaksi();
            detailTransaksi.setDetailTranasaksiPK(detailTranasaksiPK);
            detailTransaksi.setJumlah(detailTransaksiVoForm.getJumlah());
            detailTransaksi.setTr_creaby(detailTransaksiVoForm.getTr_creaby());
            detailTransaksi.setTr_creadate(detailTransaksiVoForm.getTr_creadate());
            detailTransaksi.setTr_modiby(detailTransaksiVoForm.getTr_modiby());
            detailTransaksi.setTr_modidate(detailTransaksiVoForm.getTr_modidate());

            // Menyimpan detail transaksi
            detailTransaksiRepository.save(detailTransaksi);
            //}

            return new DtoResponse(200, detailTransaksi, mCreateSuccess);
        } catch (Exception e) {
            return new DtoResponse(500, detailTransaksiVoForm, mCreateFailed);
        }
    }

    @Override
    public DtoResponse getDetailId(int id) {
        if (detailTransaksiDao.getDetailId(id) != null) {
            return new DtoResponse(200,detailTransaksiDao.getDetailId(id));
        }
        return new DtoResponse(200,null, mEmptyData);
    }

}
