package com.example.PRE_PRG7_068.repository;

import com.example.PRE_PRG7_068.model.DetailTranasaksiPK;
import com.example.PRE_PRG7_068.model.DetailTransaksi;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;

import java.util.List;

import static com.example.PRE_PRG7_068.Constant.DetailTransaksiConstant.*;

public interface DetailTransaksiRepository extends JpaRepository<DetailTransaksi, DetailTranasaksiPK> {
    @Query(value = getAllDataByPK, nativeQuery = true)
    List<DetailTransaksi> getAllByDetailTranasaksiPK();
    @Procedure(name = "get_all_detail")
    List<DetailTransaksi> findAllDetail();
    @Query(value = "SELECT * FROM dt_transaksi WHERE tr_id = :trId", nativeQuery = true)
    List<DetailTransaksi> findByTrId(@Param("trId") int trId);
}
