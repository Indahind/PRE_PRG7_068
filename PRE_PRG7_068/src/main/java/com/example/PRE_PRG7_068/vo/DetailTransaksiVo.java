package com.example.PRE_PRG7_068.vo;

import com.example.PRE_PRG7_068.model.DetailTransaksi;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
public class DetailTransaksiVo implements Serializable {
    private Integer ms_id;
    private String ms_nama;
    private Integer tr_id;
    private Date tanggal;
    private Integer jumlah;

    public DetailTransaksiVo() {
    }

    public DetailTransaksiVo(DetailTransaksi detailTransaksi) {
        this.ms_id = detailTransaksi.getDetailTranasaksiPK().getMs_id();
        this.tr_id = detailTransaksi.getDetailTranasaksiPK().getTr_id();
        this.tanggal = detailTransaksi.getTr_creadate();
        this.jumlah = detailTransaksi.getJumlah();
    }
}
