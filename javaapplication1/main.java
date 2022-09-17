/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author ovasae
 */
public class main {
    public static void main(String[] args) {
        Hewan h = new Hewan();
        h.setMata("Tajam");
        h.setEkor("Panjang");
        System.out.println("Hewan : " + "Mata: " + h.getMata() + " | " + "Ekor: " + h.getEkor());

        Manusia m = new Manusia();
        m.setRambut("Hitam");
        m.setMata("Biru");
        System.out.println("Manusia : " + "Rambut: " + m.getRambut() + " | " + "Mata: " + h.getMata());

        PesawatTelpon pT = new PesawatTelpon();
        pT.setGagang_telepon(true);
        pT.setBentuk("Persegi Panjang");
        pT.setWarna("Merah");
        System.out.println("Pesawat Telpon : " + pT.getGagang_telepon() + " | " + "Bentuk: " + pT.getBentuk() + " | " + "Warna: " + pT.getWarna());
    }
}
