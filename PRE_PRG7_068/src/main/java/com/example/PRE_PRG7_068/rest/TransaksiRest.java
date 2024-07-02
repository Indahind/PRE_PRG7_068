package com.example.PRE_PRG7_068.rest;

import com.example.PRE_PRG7_068.DtoResponse;
import com.example.PRE_PRG7_068.model.Transaksi;
import com.example.PRE_PRG7_068.service.DetailTransaksiService;
import com.example.PRE_PRG7_068.service.TransaksiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/transaksi")
public class TransaksiRest {
    @Autowired
    private TransaksiService transaksiService;
    @Autowired
    private DetailTransaksiService detailTransaksiService;

    public TransaksiRest(TransaksiService transaksiService) {
        this.transaksiService = transaksiService;
    }

    @GetMapping("/getTransaksi")
    public DtoResponse getTransaksi(){
        return transaksiService.getAllTransaksi();
    }

    @GetMapping("/getTransaksiByMonth")
    public DtoResponse getTransaksiByMonth(@RequestParam int month, @RequestParam int year) {
        return transaksiService.getTransaksiByMonth(month, year);
    }

    @PostMapping("/saveTransaksi")
    public DtoResponse createTransaksi(@RequestBody Transaksi transaksi){
        return transaksiService.saveTransaksi(transaksi);
    }

}
