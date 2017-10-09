/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.co.indocyber.controller;

import id.co.indocyber.model.BankSoal;
import id.co.indocyber.model.WordGenerator;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author user
 */
public class SoalController {
    
    private String soal;
    private String hintSoal;
    private Boolean jawaban;
    private Long id;
    private WordGenerator word;
    
    public SoalController(Long id) {
        word = new WordGenerator();
        this.id = id;
    }
    
    public String generateSoal(){
        soal = soal.toUpperCase();
        
        List<BankSoal> wordgen = word.bankSoal(id);
        Collections.shuffle(wordgen);
        
        for (BankSoal bankSoal : wordgen) {
            soal = bankSoal.getSoal();
            hintSoal = bankSoal.getHint();
        }
        
        //wordgen.get(1).getSoal();
        
        return soal;
    }

    /**
     * @return the soal
     */
    public String getSoal() {
        return soal;
    }

    /**
     * @param soal the soal to set
     */
    public void setSoal(String soal) {
        this.soal = soal;
    }

    /**
     * @return the hint
     */
    public String getHintSoal() {
        return hintSoal;
    }

    /**
     * @param hint the hint to set
     */
    public void setHintSoal(String hint) {
        this.hintSoal = hint;
    }

    /**
     * @return the jawaban
     */
    public Boolean getJawaban() {
        return jawaban;
    }

    /**
     * @param jawaban the jawaban to set
     */
    public void setJawaban(Boolean jawaban) {
        this.jawaban = jawaban;
    }

    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }
    
}
