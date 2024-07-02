package com.example.PRE_PRG7_068.rest;

import com.example.PRE_PRG7_068.DtoResponse;
import com.example.PRE_PRG7_068.service.DetailTransaksiService;
import com.example.PRE_PRG7_068.vo.DetailTransaksiVoForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/detail")
public class DetailTransaksiRest {
    @Autowired
    private DetailTransaksiService detailTransaksiService;

    public DetailTransaksiRest(DetailTransaksiService detailTransaksiService) {
        this.detailTransaksiService = detailTransaksiService;
    }

    @GetMapping("/getDetail")
    public DtoResponse getDetail(){
        return detailTransaksiService.getAllDetailTransaksi();
    }

    @PostMapping("/saveTransaksi")
    public DtoResponse createTransaksi(@RequestBody DetailTransaksiVoForm detailTransaksiVoForm){
        return detailTransaksiService.saveDetailTransaksi(detailTransaksiVoForm);
    }

    @GetMapping("/getDetailId/{id}")
    public DtoResponse getKueById(@PathVariable int id) {
        return detailTransaksiService.getDetailId(id);
    }
}
