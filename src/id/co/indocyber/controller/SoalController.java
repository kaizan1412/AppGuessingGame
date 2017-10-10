/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.co.indocyber.controller;

import id.co.indocyber.model.BankSoal;
import id.co.indocyber.model.Category;
import id.co.indocyber.model.WordGenerator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author user
 */
public class SoalController {
    
    private String soal;
    private String hintSoal;
    private String jawaban;
//    private Long id;
    private String categoryName;
    private WordGenerator word = new WordGenerator();;

    public SoalController() {
    }
    
    public SoalController(String category) {
        this.categoryName = category;
    }
    
    public String generateSoal(){
//        soal = soal.toUpperCase();
        
        List<BankSoal> wordgen = word.bankSoal(categoryName);
        Collections.shuffle(wordgen);
        
        StringBuilder sb = new StringBuilder();
        for (BankSoal bankSoal : wordgen) {
            soal = bankSoal.getSoal();
            hintSoal = bankSoal.getHint();
        }
        
        String[] huruf = soal.split("");
        List<String> hurufHuruf = Arrays.asList(huruf);
        Collections.shuffle(hurufHuruf);
        
        for (String hrf : hurufHuruf) {
            sb.append(hrf);
        }
        //wordgen.get(1).getSoal();
        
        return sb.toString();
    }
    
    public List<Category> getCategory(){
        List<Category> cat = new ArrayList<>();
        cat = word.getAllCategory();
        return cat;
    }
    
    public Boolean cekJawaban(){
        Boolean res = false;
        if(getJawaban().equalsIgnoreCase(soal))
            res = true;

        return res;
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
    public String getJawaban() {
        return jawaban;
    }

    /**
     * @param jawaban the jawaban to set
     */
    public void setJawaban(String jawaban) {
        this.jawaban = jawaban;
    }

    /**
     * @return the id
     */
    public String getCategoryName() {
        return categoryName;
    }
    
}
