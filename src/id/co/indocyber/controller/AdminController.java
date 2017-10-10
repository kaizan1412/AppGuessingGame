/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.co.indocyber.controller;

import id.co.indocyber.model.AdminModel;

/**
 *
 * @author user
 */
public class AdminController {
    
    AdminModel modelAdmin = new AdminModel();
    
    public Boolean cekUser(String user, String pass){
        
        return modelAdmin.cekUser(user, pass);
        
    }
    
}
