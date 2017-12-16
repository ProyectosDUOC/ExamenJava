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
import modelo.EstacionamientoTicket;

/**
 *
 * @author benja
 */
public class EstacionamientoTicketDAO {
    private EstacionamientoTicket p;
    private EntityManager em;
    
    EntityManagerFactory factory ;
    
    public boolean Crear(EstacionamientoTicket esta) {
        factory = Persistence.createEntityManagerFactory("ExamenDEJPU", System.getProperties());
        em = factory.createEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(esta);
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
        p = em.find(EstacionamientoTicket.class, idEstacionamiento);

        if (p.getIdEstacionamiento() == null) {
            return false;
        } else {
            return true;
        }
    }
    
    public boolean Eliminar(String idEstacionamiento) {
        factory = Persistence.createEntityManagerFactory("ExamenDEJPU", System.getProperties());
        try{
             em = factory.createEntityManager();
            p = em.find(EstacionamientoTicket.class, idEstacionamiento);
            em.remove(p);
            em.flush();
            em.getTransaction().commit();
            return true;
        }
        catch(Exception ex){
            return false;
        }        
    }
    
    public List<EstacionamientoTicket> Listar(){
        factory = Persistence.createEntityManagerFactory("ExamenDEJPU", System.getProperties());
        em = factory.createEntityManager();
        List<EstacionamientoTicket> estacionamientos;
        javax.persistence.Query q = em.createQuery("SELECT c FROM Estacionamiento_ticket c");
        estacionamientos = q.getResultList();        
        return estacionamientos;
    }
}
