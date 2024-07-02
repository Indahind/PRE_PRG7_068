package com.example.PRE_PRG7_068.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "MSLAYANAN")
public class Layanan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "IdLayanan")
    private Integer IdLayanan;

    @Column(name = "NamaLayanan")
    private String NamaLayanan;

    @Column(name = "DeskripsiLayanan")
    private String DeskripsiLayanan;

    @Column(name = "HargaLayanan")
    private Integer HargaLayanan;

    @Column(name = "StatusLayanan")
    private Integer StatusLayanan;

    public Layanan() {
    }

    public Layanan(Integer idLayanan, String namaLayanan, String deskripsiLayanan, Integer hargaLayanan, Integer statusLayanan) {
        IdLayanan = idLayanan;
        NamaLayanan = namaLayanan;
        DeskripsiLayanan = deskripsiLayanan;
        HargaLayanan = hargaLayanan;
        StatusLayanan = statusLayanan;
    }
}