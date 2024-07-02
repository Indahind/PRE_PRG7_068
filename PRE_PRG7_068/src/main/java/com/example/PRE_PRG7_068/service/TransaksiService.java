package com.example.PRE_PRG7_068.service;

import com.example.PRE_PRG7_068.DtoResponse;
import com.example.PRE_PRG7_068.model.Transaksi;

public interface TransaksiService {
    DtoResponse getAllTransaksi();
    DtoResponse saveTransaksi(Transaksi transaksi);
    DtoResponse getTransaksiByMonth(int month, int year);
}
