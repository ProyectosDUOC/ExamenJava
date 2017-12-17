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
 * @author Seba
 */
public class EstacionamientoDAO {
    private Estacionamiento p;
    private EntityManager em;
    
    EntityManagerFactory factory;
    
    public boolean Crear(Estacionamiento estacionamiento) {
        factory = Persistence.createEntityManagerFactory("ExamenDEJPU", System.getProperties());
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

    public boolean Leer(int idEstacionamiento) {
        factory = Persistence.createEntityManagerFactory("ExamenDEJPU", System.getProperties());
         em = factory.createEntityManager();
        p = em.find(Estacionamiento.class, idEstacionamiento);

        if (p.getIdEstacionamiento() == null) {
            return false;
        } else {
            return true;
        }
    }
    
    public boolean Eliminar(int idEstacionamiento) {
        factory = Persistence.createEntityManagerFactory("ExamenDEJPU", System.getProperties());
        try{
             em = factory.createEntityManager();
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
        factory = Persistence.createEntityManagerFactory("ExamenDEJPU", System.getProperties());
        em = factory.createEntityManager();
        List<Estacionamiento> estacionamientos;
        javax.persistence.Query q = em.createQuery("SELECT c FROM Estacionamiento c");
        estacionamientos = q.getResultList();        
        return estacionamientos;
    }
    
      public Estacionamiento BuscarId(int id){
        factory = Persistence.createEntityManagerFactory("ExamenDEJPU", System.getProperties());
        em = factory.createEntityManager();
        Estacionamiento esta;
        javax.persistence.Query q = em.createQuery("SELECT c FROM Estacionamiento c WHERE c.idEstacionamiento = " + id);
       // javax.persistence.Query q = em.createNamedQuery("Estacionamiento.findByIdEstacionamiento", Estacionamiento.class);
        esta = (Estacionamiento)q.getSingleResult();        
        return esta;
    }
}
