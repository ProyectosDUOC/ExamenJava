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
import modelo.DetalleBoleta;
/**
 *
 * @author Seba
 */
public class DetalleBoletaDAO {
    private DetalleBoleta p;
    private EntityManager em;

    EntityManagerFactory factory;

    public boolean Crear(DetalleBoleta de) {
        factory = Persistence.createEntityManagerFactory("ExamenDEJPU", System.getProperties());
        em = factory.createEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(de);
            em.flush();
            em.getTransaction().commit();
            return true;
        } catch (Exception ex) {
            em.getTransaction().rollback();
            return false;
        }
    }

    public DetalleBoleta Leer(int id) {
        factory = Persistence.createEntityManagerFactory("ExamenDEJPU", System.getProperties());
        p = em.find(DetalleBoleta.class, id);

        if (p.getIdBoleta()== null) {
            return null;
        } else {
            return p;
        }
    }

    public boolean Eliminar(int id) {
        factory = Persistence.createEntityManagerFactory("ExamenDEJPU", System.getProperties());
        try{
             em = factory.createEntityManager();
            p = em.find(DetalleBoleta.class, id);
            em.remove(p);
            em.flush();
            em.getTransaction().commit();
            return true;
        }
        catch(Exception ex){
            return false;
        }        
    }
    
    public List<DetalleBoleta> Listar(){
        factory = Persistence.createEntityManagerFactory("ExamenDEJPU", System.getProperties());
         em = factory.createEntityManager();
        List<DetalleBoleta> detalles;
        javax.persistence.Query q = em.createQuery("SELECT c FROM DetalleBoleta c");
        detalles = q.getResultList();
        
        return detalles;
    }
}
