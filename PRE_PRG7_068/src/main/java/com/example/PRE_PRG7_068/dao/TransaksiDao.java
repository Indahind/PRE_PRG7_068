package com.example.PRE_PRG7_068.dao;

import com.example.PRE_PRG7_068.vo.TransaksiVo;

import java.util.List;

public interface TransaksiDao {
    List<TransaksiVo> getAllTransaksi();
    List<TransaksiVo> getTransaksiByMonth(int month, int year);
}
