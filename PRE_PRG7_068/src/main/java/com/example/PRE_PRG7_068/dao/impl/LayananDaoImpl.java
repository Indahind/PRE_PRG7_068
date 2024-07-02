package com.example.PRE_PRG7_068.dao.impl;

import com.example.PRE_PRG7_068.dao.LayananDao;
import com.example.PRE_PRG7_068.model.Layanan;
import com.example.PRE_PRG7_068.repository.LayananRepository;
import com.example.PRE_PRG7_068.vo.LayananVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class LayananDaoImpl implements LayananDao {

    @Autowired
    private LayananRepository layananRepository;

    @Override
    public List<LayananVo> getAllLayanan() {
        Iterable<Layanan> Layanans = layananRepository.findAll();
        List<LayananVo> LayananVos = new ArrayList<>();
        for (Layanan item : Layanans) {
            LayananVo LayananVo = new LayananVo(item);
            LayananVos.add(LayananVo);
        }
        return LayananVos;
    }


    @Override
    public LayananVo getLayananId(int id){
        Layanan layananData = layananRepository.findById(id).orElseThrow();
        if (layananData != null) {
            LayananVo Layanantampil = new LayananVo(layananData);
            return Layanantampil;
        } else {
            return null;
        }
    }
}
