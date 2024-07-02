package com.example.PRE_PRG7_068.service;

import com.example.PRE_PRG7_068.DtoResponse;
import com.example.PRE_PRG7_068.vo.DetailTransaksiVoForm;

public interface DetailTransaksiService {
    DtoResponse getAllDetailTransaksi();
    DtoResponse saveDetailTransaksi(DetailTransaksiVoForm detailTransaksiVoForm);
    DtoResponse getDetailId(int id);
}
