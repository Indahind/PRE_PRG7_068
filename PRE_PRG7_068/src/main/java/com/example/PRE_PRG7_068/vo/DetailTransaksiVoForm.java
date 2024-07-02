package com.example.PRE_PRG7_068.vo;

import com.example.PRE_PRG7_068.model.DetailTransaksi;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
public class DetailTransaksiVoForm implements Serializable {
    private Integer ms_id;
    private Integer tr_id;
    private Integer jumlah;
    private Integer tr_creaby;
    private Date tr_creadate;
    private Integer tr_modiby;
    private Date tr_modidate;

    public DetailTransaksiVoForm() {
    }

    public DetailTransaksiVoForm(DetailTransaksi detailTransaksi) {
        this.ms_id = detailTransaksi.getDetailTranasaksiPK().getMs_id();
        this.tr_id = detailTransaksi.getDetailTranasaksiPK().getTr_id();
        this.jumlah = detailTransaksi.getJumlah();
        this.tr_creaby = detailTransaksi.getTr_creaby();
        this.tr_creadate = detailTransaksi.getTr_creadate();
        this.tr_modiby = detailTransaksi.getTr_modiby();
        this.tr_modidate = detailTransaksi.getTr_modidate();
    }

    //private List<DetailTransaksiVoForm> detailTransaksiList;

//    public DetailTransaksiVoForm() {
//        this.detailTransaksiList = new ArrayList<>();
//    }

//    public void addDetailTransaksi(DetailTransaksiVoForm detailTransaksiItemVoForm) {
//        this.detailTransaksiList.add(detailTransaksiItemVoForm);
//    }

//    public List<DetailTransaksi> toDetailTransaksiList() {
//        List<DetailTransaksi> list = new ArrayList<>();
//        for (DetailTransaksiVoForm detailForm : detailTransaksiList) {
//            DetailTransaksi detailTransaksi = new DetailTransaksi();
//
//            // Inisialisasi objek DetailTranasaksiPK
//            DetailTranasaksiPK detailTranasaksiPK = new DetailTranasaksiPK();
//
//            // Set ms_id dan tr_id pada objek DetailTranasaksiPK
//            detailTranasaksiPK.setMs_id(detailForm.getMs_id());
//            detailTranasaksiPK.setTr_id(detailForm.getTr_id());
//
//            // Tetapkan objek DetailTranasaksiPK ke DetailTransaksi
//            detailTransaksi.setDetailTranasaksiPK(detailTranasaksiPK);
//
//            detailTransaksi.setJumlah(detailForm.getJumlah());
//            detailTransaksi.setTr_creaby(detailForm.getTr_creaby());
//            detailTransaksi.setTr_creadate(detailForm.getTr_creadate());
//            detailTransaksi.setTr_modiby(detailForm.getTr_modiby());
//            detailTransaksi.setTr_modidate(detailForm.getTr_modidate());
//            list.add(detailTransaksi);
//        }
//        return list;
//    }
}
