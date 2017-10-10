/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.co.indocyber.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author user
 */
@Entity
public class UserAdmin implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String username;
    private String password;
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UserAdmin)) {
            return false;
        }
        UserAdmin other = (UserAdmin) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "id.co.indocyber.model.UserAdmin[ id=" + id + " ]";
    }

    /**
     * @return the user
     */
    public String getUserName() {
        return username;
    }

    /**
     * @param user the user to set
     */
    public void setUserName(String user) {
        this.username = user;
    }

    /**
     * @return the pass
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param pass the pass to set
     */
    public void setPassword(String pass) {
        this.password = pass;
    }
    
}
