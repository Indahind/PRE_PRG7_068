package com.example.PRE_PRG7_068.service;

import com.example.PRE_PRG7_068.DtoResponse;
import com.example.PRE_PRG7_068.model.Layanan;
import com.example.PRE_PRG7_068.vo.LayananVo;

import java.util.List;

public interface LayananService {
    DtoResponse getAllLayanan();
    public DtoResponse getLayananId(int id);
    DtoResponse saveLayanan(Layanan Layanan);
    DtoResponse updateLayanan(Layanan Layanan);
    DtoResponse deleteLayanan(Layanan Layanan);
}
