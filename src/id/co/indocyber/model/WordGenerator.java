/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.co.indocyber.model;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author user
 */
public class WordGenerator {
    
    private EntityManagerFactory emf;
    private EntityManager em;
    private Category cat;
    
    public List<BankSoal> bankSoal(Long id){
        List<BankSoal> bankSoal = new ArrayList<>();
        
        emf = Persistence.createEntityManagerFactory("SwingGames");
        em = emf.createEntityManager();
        cat = em.find(Category.class, id);
        bankSoal = cat.getBankSoals();
        
        return bankSoal;
    }
    
}
