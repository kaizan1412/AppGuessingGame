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
import javax.persistence.Query;

/**
 *
 * @author user
 */
public class WordGenerator {
    
    private EntityManagerFactory emf;
    private EntityManager em;
    private Category cat;
    
    public List<BankSoal> bankSoal(String category){
        List<BankSoal> bankSoal = new ArrayList<>();
        
        emf = Persistence.createEntityManagerFactory("SwingGames");
        em = emf.createEntityManager();
        Query query = em.createQuery("Select c from Category c where c.categoryName = :categoryName");
        query.setParameter("categoryName", category);
        cat = (Category) query.getSingleResult();
//        cat = em.find(Category.class, category);
        bankSoal = cat.getBankSoals();
        
        em.close();
        emf.close();
        return bankSoal;
    }
    
    public List<Category> getAllCategory(){
        List<Category> category = new ArrayList();
        emf = Persistence.createEntityManagerFactory("SwingGames");
        em = emf.createEntityManager();
        
        category = em.createQuery("Select c from Category c").getResultList();
        
        em.close();
        emf.close();
        
        return category;
    }
    
}
