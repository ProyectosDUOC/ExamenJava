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
import modelo.Estacionamiento;

/**
 *
 * @author benja
 */
public class EstacionamientoDAO {
     private Estacionamiento p;
    private EntityManager em;
    
    EntityManagerFactory factory = Persistence.createEntityManagerFactory("ExamenJavaFinalPU", System.getProperties());
    
    public boolean Crear(Estacionamiento estacionamiento) {
        em = factory.createEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(estacionamiento);
            em.flush();
            em.getTransaction().commit();
            return true;
        } catch (Exception ex) {
            em.getTransaction().rollback();
            return false;
        }
    }

    public boolean Leer(String idEstacionamiento) {
        p = em.find(Estacionamiento.class, idEstacionamiento);

        if (p.getIdEstacionamiento() == null) {
            return false;
        } else {
            return true;
        }
    }
    
    public boolean Eliminar(String idEstacionamiento) {
        try{
            p = em.find(Estacionamiento.class, idEstacionamiento);
            em.remove(p);
            em.flush();
            em.getTransaction().commit();
            return true;
        }
        catch(Exception ex){
            return false;
        }        
    }
    
    public List<Estacionamiento> Listar(){
        
        List<Estacionamiento> estacionamientos;
        javax.persistence.Query q = em.createQuery("SELECT c FROM Estacionamiento c");
        estacionamientos = q.getResultList();
        int num_clientes = estacionamientos.size();
        
        return estacionamientos;
    }
}
