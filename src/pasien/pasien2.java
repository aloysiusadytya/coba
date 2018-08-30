/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pasien;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Hewlett-Packard
 */
public class pasien2 {

    private String nama;
    private String alamat;
    private String tempatLahir;
    private int tanggalLahir;
    private int bulanLahir;
    private int tahunLahir;
    private String noRekamMedis;

    public pasien2() {

    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getTempatLahir() {
        return tempatLahir;
    }

    public void setTempatLahir(String tempatLahir) {
        
        this.tempatLahir = tempatLahir;
    }

    public int getTanggalLahir() {
        return tanggalLahir;
    }

    public void setTanggalLahir(int tanggalLahir) throws Exception {
        if(tanggalLahir>0&&tanggalLahir<32){
            this.tanggalLahir=tanggalLahir;
        }else{
            throw new Exception("salah tanggal/bulan/tahun");
        }
        
    }

    public int getBulanLahir() {
        return bulanLahir;
    }

    public void setBulanLahir(int bulanLahir) throws Exception{
        if(bulanLahir>0&&bulanLahir<13){
            this.bulanLahir = bulanLahir;
        }else{
            throw new Exception("salah tanggal/bulan/tahun");
        }
        
    }

    public int getTahunLahir() {
        return tahunLahir;
    }

    public void setTahunLahir(int tahunLahir) throws Exception {
        if(tahunLahir>0){
            this.tahunLahir = tahunLahir;
        }else{
            throw new Exception("salah tanggal/bulan/tahun");
        }
        
    }

    public String getNoRekamMedis() {
        return noRekamMedis;
    }

    public void setNoRekamMedis(String noRekamMedis) {
        this.noRekamMedis = noRekamMedis;
    }

    public void getKodePasien() {
        Date date = new Date();
        SimpleDateFormat ft = new SimpleDateFormat("ddMMyyyy");
        System.out.print(ft.format(date));
    }
    public void getKelahiran() {
        Date date = new Date(getTahunLahir() - 1900, getBulanLahir() - 1, getTanggalLahir());
        SimpleDateFormat ft = new SimpleDateFormat("dd-MM-yyyy");
        System.out.print(ft.format(date));
    }
    
}
