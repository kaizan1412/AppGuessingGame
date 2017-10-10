/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.co.indocyber.view;

import id.co.indocyber.controller.SoalController;
import id.co.indocyber.model.BankSoal;
import id.co.indocyber.model.Category;
import id.co.indocyber.model.UserAdmin;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author user
 */
public class MainApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("SwingGames");
        EntityManager em = emf.createEntityManager();
//        
        em.getTransaction().begin();
//
        UserAdmin admin = new UserAdmin();
        admin.setUserName("admin");
        admin.setPassword("indocyber");
        
        em.persist(admin);
        
        em.getTransaction().commit();
//        
        em.close();
        emf.close();

    }
    
}
