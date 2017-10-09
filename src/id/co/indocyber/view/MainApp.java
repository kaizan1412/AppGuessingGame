/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.co.indocyber.view;

import id.co.indocyber.model.BankSoal;
import id.co.indocyber.model.Category;
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
        
        em.getTransaction().begin();
        
        Category kat1 = new Category();
        kat1.setCategoryName("Provinsi");
        Category kat2 = new Category();
        kat2.setCategoryName("Kota");
        em.persist(kat1);
        em.persist(kat2);
        
        BankSoal soal1 = new BankSoal("Lampung", "Tempat asal pempek");
        soal1.setCategory(kat1);
        BankSoal soal2 = new BankSoal("Jakarta", "Ibukota Negara Indonesia");
        soal2.setCategory(kat1);
        BankSoal soal3 = new BankSoal("Depok", "Tempat Universitas Indonesia");
        soal3.setCategory(kat2);
        BankSoal soal4 = new BankSoal("Bogor", "Dikenal sebagai kota hujan");
        soal4.setCategory(kat2);
        em.persist(soal1);
        em.persist(soal2);
        em.persist(soal3);
        em.persist(soal4);
        
        em.getTransaction().commit();
        
        em.close();
        emf.close();
    }
    
}
