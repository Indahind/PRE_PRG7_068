package com.example.PRE_PRG7_068.rest;

import com.example.PRE_PRG7_068.DtoResponse;
import com.example.PRE_PRG7_068.model.Layanan;
import com.example.PRE_PRG7_068.service.LayananService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/Layanans")
public class LayananRest {
    @Autowired
    private LayananService layananService;

    public LayananRest(LayananService layananService) {
        this.layananService = layananService;
    }

    @GetMapping("/getLayanans")
    public DtoResponse getLayanans() {
        return layananService.getAllLayanan();
    }

    @GetMapping("/getLayanansId/{id}")
    public DtoResponse getLayanansById(@PathVariable int id) {
        return layananService.getLayananId(id);
    }

    @PostMapping("/saveLayanans")
    public DtoResponse saveLayanans(@RequestBody Layanan layanan) {
        return layananService.saveLayanan(layanan);
    }

    @PostMapping("/updateLayanans")
    public DtoResponse updateLayanans(@RequestBody Layanan layanan) {
        return layananService.updateLayanan(layanan);
    }

    @PostMapping("/deleteLayanans")
    public DtoResponse deleteLayanans(@RequestBody Layanan layanan) {
        return layananService.deleteLayanan(layanan);
    }
}