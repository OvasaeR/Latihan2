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
public class Hewan {

    String mata, mulut, telinga, ekor;
    Integer kaki;

    public void setMata(String mata) {
        this.mata = mata;
    }

    public String getMata() {
        return mata;
    }

    public String getMulut() {
        return this.mulut;
    }

    public void setMulut(String mulut) {
        this.mulut = mulut;
    }

    public String getTelinga() {
        return this.telinga;
    }

    public void setTelinga(String telinga) {
        this.telinga = telinga;
    }

    public String getEkor() {
        return this.ekor;
    }

    public void setEkor(String ekor) {
        this.ekor = ekor;
    }

    public Integer getKaki() {
        return this.kaki;
    }

    public void setKaki(Integer kaki) {
        this.kaki = kaki;
    }

    String bermain(String m) {
        return m;

    }

    String makan(String mkn) {
        return mkn;
    }

    String tidur(String t) {
        return t;
    }

}
