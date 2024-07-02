package com.example.PRE_PRG7_068.dao;

import com.example.PRE_PRG7_068.model.Layanan;
import com.example.PRE_PRG7_068.vo.LayananVo;

import java.util.List;

public interface LayananDao {
    List<LayananVo> getAllLayanan();
    LayananVo getLayananId(int id);
}
