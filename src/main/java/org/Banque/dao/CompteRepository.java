/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.Banque.dao;

import java.io.Serializable;
import org.Banque.entities.Compte;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Ayoub
 */
public interface CompteRepository extends JpaRepository<Compte, String>
{
    
}
