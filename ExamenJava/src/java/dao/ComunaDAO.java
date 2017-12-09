/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import modelo.Comuna;

/**
 *
 * @author benja
 */
public class ComunaDAO {
    private Comuna p;
    private EntityManager em;

    EntityManagerFactory factory = Persistence.createEntityManagerFactory("comuna", System.getProperties());

    public boolean Crear(Comuna comuna) {
        em = factory.createEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(comuna);
            em.flush();
            em.getTransaction().commit();
            return true;
        } catch (Exception ex) {
            em.getTransaction().rollback();
            return false;
        }
    }

    public boolean Leer(int id) {
        p = em.find(Comuna.class, id);

        if (p.getIdComuna()== null) {
            return false;
        } else {
            return true;
        }
    }

    public boolean Eliminar(int id) {
        try{
            p = em.find(Comuna.class, id);
            em.remove(p);
            em.flush();
            em.getTransaction().commit();
            return true;
        }
        catch(Exception ex){
            return false;
        }        
    }
    
    public List<Comuna> Listar(){        
        List<Comuna> comunas;
        javax.persistence.Query q = em.createQuery("SELECT c FROM comuna c");
        comunas = q.getResultList();        
        return comunas;
    }
}
