package com.example.PRE_PRG7_068.dao;

import com.example.PRE_PRG7_068.vo.DetailTransaksiVo;

import java.util.List;

public interface DetailTransaksiDao {
    List<DetailTransaksiVo> getAllDetailTransaksi();
    List<DetailTransaksiVo> getDetailId(int id);
}
