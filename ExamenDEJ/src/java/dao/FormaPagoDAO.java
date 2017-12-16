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
import modelo.FormaPago;

/**
 *
 * @author benja
 */
public class FormaPagoDAO {
    private FormaPago p;
    private EntityManager em;
    
    EntityManagerFactory factory;
    
    public boolean Crear(FormaPago forma) {
        factory = Persistence.createEntityManagerFactory("ExamenDEJPU", System.getProperties());
        em = factory.createEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(forma);
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
        p = em.find(FormaPago.class, id);

        if (p.getIdPago()== null) {
            return false;
        } else {
            return true;
        }
    }
    
    public boolean Eliminar(int id) {
        factory = Persistence.createEntityManagerFactory("ExamenDEJPU", System.getProperties());
        try{
             em = factory.createEntityManager();
            p = em.find(FormaPago.class, id);
            em.remove(p);
            em.flush();
            em.getTransaction().commit();
            return true;
        }
        catch(Exception ex){
            return false;
        }        
    }
    
    public List<FormaPago> Listar(){
        factory = Persistence.createEntityManagerFactory("ExamenDEJPU", System.getProperties());
        em = factory.createEntityManager();
        List<FormaPago> estados;
        javax.persistence.Query q = em.createQuery("SELECT c FROM Forma_pago c");
        estados = q.getResultList();        
        return estados;
    }
}
