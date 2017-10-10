/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.co.indocyber.model;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author user
 */
public class AdminModel {
    private EntityManagerFactory emf;
    private EntityManager em;
    private UserAdmin user;

    public AdminModel() {
        //
        emf = Persistence.createEntityManagerFactory("SwingGames");
    }
    
    public Boolean cekUser(String useradm, String pass){
        Boolean isTrue = false;
        
        em = emf.createEntityManager();
        em.getTransaction().begin();
        
        Query query = em.createQuery("select u from UserAdmin u where u.username = :userName and u.password = :passWord");
        query.setParameter("userName", useradm);
        query.setParameter("passWord", pass);

        
        try {
        user = (UserAdmin) query.getSingleResult();            
        isTrue = true;
        } catch (NoResultException e) {
            isTrue = false;
        }
        
        em.getTransaction().commit();
        em.close();
        emf.close();
        return isTrue;
    }
    
}
