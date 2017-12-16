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
import modelo.Ticket;

/**
 *
 * @author benja
 */
public class TicketDAO {
    private Ticket p;
    private EntityManager em;
    
    EntityManagerFactory factory;
    
    public boolean Crear(Ticket t) {
        factory = Persistence.createEntityManagerFactory("ExamenDEJPU", System.getProperties());
        em = factory.createEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(t);
            em.flush();
            em.getTransaction().commit();
            return true;
        } catch (Exception ex) {
            em.getTransaction().rollback();
            return false;
        }
    }

    public boolean Leer(int id) {
        factory = Persistence.createEntityManagerFactory("ExamenDEJPU", System.getProperties());
         em = factory.createEntityManager();
        p = em.find(Ticket.class, id);

        if (p.getIdTicket()== null) {
            return false;
        } else {
            return true;
        }
    }
    
    public boolean Eliminar(int id) {
        factory = Persistence.createEntityManagerFactory("ExamenDEJPU", System.getProperties());
        try{
             em = factory.createEntityManager();
            p = em.find(Ticket.class, id);
            em.remove(p);
            em.flush();
            em.getTransaction().commit();
            return true;
        }
        catch(Exception ex){
            return false;
        }        
    }
    
    public List<Ticket> Listar(){
        factory = Persistence.createEntityManagerFactory("ExamenDEJPU", System.getProperties());
        em = factory.createEntityManager();
        List<Ticket> tickets;
        javax.persistence.Query q = em.createQuery("SELECT c FROM Ticket c");
        tickets = q.getResultList();        
        return tickets;
    } 
}
