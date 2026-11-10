package com.pbo.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@Controller
public class OperasiAritmatikaController {

    @Autowired
    private OperasiAritmatikaRepository repository;

    // Menampilkan halaman
    @GetMapping("/operasi")
    public String tampilkanHalaman(Model model) {

        model.addAttribute("listOperasi", repository.findAll());
        model.addAttribute("operasi", new OperasiAritmatika());

        return "OperasiAritmatika";
    }

    // Menyimpan operasi melalui AJAX
    @PostMapping("/operasi/simpan")
    @ResponseBody
    public Map<String, Object> simpanOperasi(
            @RequestBody OperasiAritmatika operasi) {

        Map<String, Object> response = new HashMap<>();

        // Validasi input
        if (operasi.getBil1() == null
                || operasi.getBil2() == null
                || operasi.getOpt() == null) {

            response.put("success", false);
            response.put("message", "Semua input harus diisi!");

            return response;
        }

        // Validasi pembagian nol
        if ("/".equals(operasi.getOpt())
                && operasi.getBil2() == 0) {

            response.put("success", false);
            response.put("message",
                    "Pembagian dengan nol tidak diperbolehkan!");

            return response;
        }

        // Simpan ke database
        OperasiAritmatika saved = repository.save(operasi);

        response.put("success", true);
        response.put("id", saved.getIdOperasi());
        response.put("bil1", saved.getBil1());
        response.put("opt", saved.getOpt());
        response.put("bil2", saved.getBil2());
        response.put("result", saved.getResult());

        return response;
    }

    // Edit operasi
    @GetMapping("/operasi/edit/{id}")
    public String editOperasi(
            @PathVariable Integer id,
            Model model) {

        OperasiAritmatika operasi = repository.findById(id)
                .orElseThrow(() ->
                        new IllegalArgumentException("Data tidak ditemukan"));

        model.addAttribute("operasi", operasi);
        model.addAttribute("listOperasi", repository.findAll());

        return "OperasiAritmatika";
    }

    // Hapus operasi
    @PostMapping("/operasi/hapus/{id}")
    @ResponseBody
    public Map<String, Object> hapusOperasi(
            @PathVariable Integer id) {

        repository.deleteById(id);

        Map<String, Object> response = new HashMap<>();

        response.put("success", true);

        return response;
    }
}