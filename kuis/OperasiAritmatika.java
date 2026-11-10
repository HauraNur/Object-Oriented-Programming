package com.pbo.demo;

import jakarta.persistence.*;

@Entity
@Table(name = "operasi_aritmatika")
public class OperasiAritmatika {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_operasi")
    private Integer idOperasi;

    private Integer bil1;

    private String opt;

    private Integer bil2;

    @Transient
    public Integer getResult() {

        if (bil1 == null || bil2 == null || opt == null) {
            return null;
        }

        switch (opt) {
            case "+":
                return bil1 + bil2;

            case "-":
                return bil1 - bil2;

            case "x":
                return bil1 * bil2;

            case "/":
                if (bil2 == 0) {
                    return null;
                }
                return bil1 / bil2;

            default:
                return null;
        }
    }

    public Integer getIdOperasi() {
        return idOperasi;
    }

    public void setIdOperasi(Integer idOperasi) {
        this.idOperasi = idOperasi;
    }

    public Integer getBil1() {
        return bil1;
    }

    public void setBil1(Integer bil1) {
        this.bil1 = bil1;
    }

    public String getOpt() {
        return opt;
    }

    public void setOpt(String opt) {
        this.opt = opt;
    }

    public Integer getBil2() {
        return bil2;
    }

    public void setBil2(Integer bil2) {
        this.bil2 = bil2;
    }
}