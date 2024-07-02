package com.example.PRE_PRG7_068.vo;

import com.example.PRE_PRG7_068.model.Layanan;
import jakarta.persistence.Column;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class LayananVo {
    private String NamaLayanan;
    private String DeskripsiLayanan;
    private Integer HargaLayanan;
    private Integer StatusLayanan;
    public LayananVo() {
    }

    public LayananVo(Layanan vo) {
        NamaLayanan = vo.getNamaLayanan();
        DeskripsiLayanan = vo.getDeskripsiLayanan();
        HargaLayanan = vo.getHargaLayanan();
        StatusLayanan = vo.getStatusLayanan();
    }
}
