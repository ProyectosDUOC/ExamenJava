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

    EntityManagerFactory factory = Persistence.createEntityManagerFactory("ExamenJavaFinalPU", System.getProperties());

    public boolean Crear(FormaPago formaPago) {
        em = factory.createEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(formaPago);
            em.flush();
            em.getTransaction().commit();
            return true;
        } catch (Exception ex) {
            em.getTransaction().rollback();
            return false;
        }
    }

    public boolean Leer(int id) {
        p = em.find(FormaPago.class, id);

        if (p.getIdPago() == null) {
            return false;
        } else {
            return true;
        }
    }

    public boolean Eliminar(int id) {
        try{
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
        
        List<FormaPago> formaPagos;
        javax.persistence.Query q = em.createQuery("SELECT c FROM Forma_pago c");
        formaPagos = q.getResultList();
        
        return formaPagos;
    }
}
