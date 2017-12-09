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
import modelo.Boleta;

/**
 *
 * @author benja
 */
public class BoletaDAO {
     private Boleta p;
    private EntityManager em;

    EntityManagerFactory factory = Persistence.createEntityManagerFactory("boleta", System.getProperties());

    public  boolean Crear(Boleta boleta) {
        em = factory.createEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(boleta);
            em.flush();
            em.getTransaction().commit();
            return true;
        } catch (Exception ex) {
            em.getTransaction().rollback();
            return false;
        }
    }

    public boolean Leer(int id) {
        p = em.find(Boleta.class, id);

        if (p.getIdBoleta()== null) {
            return false;
        } else {
            return true;
        }
    }

    public boolean Eliminar(int id) {
        try{
            p = em.find(Boleta.class, id);
            em.remove(p);
            em.flush();
            em.getTransaction().commit();
            return true;
        }
        catch(Exception ex){
            return false;
        }        
    }
    
    public List<Boleta> Listar(){
        
        List<Boleta> boletas;
        javax.persistence.Query q = em.createQuery("SELECT c FROM boleta c");
        boletas = q.getResultList();
        
        return boletas;
    }
 }
