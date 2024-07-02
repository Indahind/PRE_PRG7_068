package com.example.PRE_PRG7_068.model;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@Embeddable
public class DetailTranasaksiPK implements Serializable {
    @JoinColumn(name = "ms_id", referencedColumnName = "ms_id")
    private Integer ms_id;

    @JoinColumn(name = "tr_id", referencedColumnName = "tr_id")
    private Integer tr_id;

    public DetailTranasaksiPK() {
    }

    public DetailTranasaksiPK(Integer ms_id, Integer tr_id) {
        this.ms_id = ms_id;
        this.tr_id = tr_id;
    }
}
