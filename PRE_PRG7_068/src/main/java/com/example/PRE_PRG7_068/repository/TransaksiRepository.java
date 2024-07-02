package com.example.PRE_PRG7_068.repository;

import com.example.PRE_PRG7_068.model.Transaksi;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import static com.example.PRE_PRG7_068.Constant.TransaksiKueConstant.*;
import java.util.List;

@Repository
public interface TransaksiRepository extends JpaRepository<Transaksi, Integer> {
    @Query(value = qAllData, nativeQuery = true)
    List<Transaksi> findAllTransaksi();

    @Query(value = "SELECT TOP 1 IdTransaksi FROM TRPENJUALANSALON ORDER BY IdTransaksi DESC", nativeQuery = true)
    String findLatestId();
    @Query(value = "SELECT * FROM transaksi_kue WHERE MONTH(tr_creadate) = :month AND YEAR(tr_creadate) = :year", nativeQuery = true)
    List<Transaksi> findByMonthAndYear(@Param("month") int month, @Param("year") int year);
}
