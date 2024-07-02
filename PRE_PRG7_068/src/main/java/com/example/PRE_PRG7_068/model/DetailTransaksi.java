package com.example.PRE_PRG7_068.model;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

@Entity
@Getter
@Setter
@Table(name = "dt_transaksi")
public class DetailTransaksi implements Serializable {
    @EmbeddedId
    private DetailTranasaksiPK detailTranasaksiPK;

    @Column(name = "jumlah")
    private Integer jumlah;

    @Column(name = "tr_creaby")
    private Integer tr_creaby;

    @Column(name = "tr_creadate")
    private Date tr_creadate;

    @Column(name = "tr_modiby")
    private Integer tr_modiby;

    @Column(name = "tr_modidate")
    private Date tr_modidate;

    public DetailTransaksi() {
    }

    public DetailTransaksi(DetailTranasaksiPK detailTranasaksiPK, Integer jumlah, Integer tr_creaby, Date tr_creadate, Integer tr_modiby, Date tr_modidate) {
        this.detailTranasaksiPK = detailTranasaksiPK;
        this.jumlah = jumlah;
        this.tr_creaby = tr_creaby;
        this.tr_creadate = tr_creadate;
        this.tr_modiby = tr_modiby;
        this.tr_modidate = tr_modidate;
    }
}
