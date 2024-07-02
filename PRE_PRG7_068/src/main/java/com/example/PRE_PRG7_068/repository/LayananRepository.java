package com.example.PRE_PRG7_068.repository;

import com.example.PRE_PRG7_068.model.Layanan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import static com.example.PRE_PRG7_068.Constant.LayananConstant.*;
import java.util.List;

@Repository
public interface LayananRepository extends JpaRepository<Layanan, Integer> {
    @Query(value = qAllDataActive, nativeQuery = true)
    List<Layanan> findByStokTersediaGreaterThan(int stok);

    @Query("SELECT l FROM Layanan l WHERE l.IdLayanan = :idLayanan")
    Layanan findByIdLayanan(Integer idLayanan);
}
