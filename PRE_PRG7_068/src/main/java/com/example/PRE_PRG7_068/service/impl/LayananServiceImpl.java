package com.example.PRE_PRG7_068.service.impl;

import com.example.PRE_PRG7_068.DtoResponse;
import com.example.PRE_PRG7_068.dao.LayananDao;
import com.example.PRE_PRG7_068.model.Layanan;
import com.example.PRE_PRG7_068.repository.LayananRepository;
import com.example.PRE_PRG7_068.service.LayananService;
import com.example.PRE_PRG7_068.vo.LayananVo;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

import static com.example.PRE_PRG7_068.Constant.LayananConstant.*;

@Service
@Transactional
public class LayananServiceImpl implements LayananService {
    @Autowired
    private LayananDao LayananDao;
    @Autowired
    private LayananRepository LayananRepository;

    @Override
    public DtoResponse getAllLayanan() {
        if (LayananDao.getAllLayanan() != null) {
            return new DtoResponse(200,LayananDao.getAllLayanan());
        }
        return new DtoResponse(200,null, mEmptyData);
    }

    @Override
    public DtoResponse getLayananId(int id) {
        if (LayananDao.getLayananId(id) != null) {
            return new DtoResponse(200,LayananDao.getLayananId(id));
        }
        return new DtoResponse(200,null, mEmptyData);
    }

    @Override
    public DtoResponse saveLayanan(Layanan Layanan) {
        try {
            Layanan.setStatusLayanan(1);
            LayananRepository.save(Layanan);
            return new DtoResponse(200, Layanan, mCreateSuccess);
        } catch (Exception e) {
            return new DtoResponse(500, Layanan, mCreateFailed);
        }
    }

    @Override
    public DtoResponse updateLayanan(Layanan Layanan) {
        try {
            Layanan LayananData = LayananRepository.findById(Layanan.getIdLayanan()).orElseThrow();
            if (LayananData != null) {
                LayananData.setNamaLayanan(Layanan.getNamaLayanan());
                LayananData.setHargaLayanan(Layanan.getHargaLayanan());

                Layanan updatedLayanan = LayananRepository.save(LayananData);
                return new DtoResponse(200,updatedLayanan,mUpdateSuccess);
            } else {
                return new DtoResponse(404,null,mNotFound);
            }
        } catch (Exception o) {
            return new DtoResponse(500,null,mUpdateFailed);
        }
    }

    @Override
    public DtoResponse deleteLayanan(Layanan Layanan) {
        Layanan LayananData = LayananRepository.findById(Layanan.getIdLayanan()).orElseThrow();
        if (LayananData != null) {
            try {
                LayananData.setStatusLayanan(0);
                //LayananRepository.delete(Layanan);
                return new DtoResponse(200,LayananData,mDeleteSuccess);
            } catch (Exception o) {
                return new DtoResponse(500,null,mDeleteFailed);
            }
        }
        return new DtoResponse(404,null,mNotFound);
    }}
