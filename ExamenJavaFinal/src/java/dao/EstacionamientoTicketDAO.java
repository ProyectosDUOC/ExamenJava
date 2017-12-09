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

    EntityManagerFactory factory = Persistence.createEntityManagerFactory("ExamenJavaFinalPUExamenJavaFinalPU", System.getProperties());

    public boolean Crear(EstacionamientoTicket es) {
        em = factory.createEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(es);
            em.flush();
            em.getTransaction().commit();
            return true;
        } catch (Exception ex) {
            em.getTransaction().rollback();
            return false;
        }
    }

    public boolean Leer(int id) {
        p = em.find(EstacionamientoTicket.class, id);

        if (p.getIdEstacionamiento()== null) {
            return false;
        } else {
            return true;
        }
    }

    public boolean Eliminar(int id) {
        try{
            p = em.find(EstacionamientoTicket.class, id);
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
        
        List<EstacionamientoTicket> tickets;
        javax.persistence.Query q = em.createQuery("SELECT c FROM estacionamiento_ticket c");
        tickets = q.getResultList();
        
        return tickets;
    }
}
