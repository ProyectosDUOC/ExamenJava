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

    EntityManagerFactory factory;

    public boolean Crear(Boleta boleta) {
        factory = Persistence.createEntityManagerFactory("ExamenDEJPU", System.getProperties());
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
        factory = Persistence.createEntityManagerFactory("ExamenDEJPU", System.getProperties());
        em = factory.createEntityManager();
        p = em.find(Boleta.class, id);
        if (p.getIdBoleta() == null) {
            return false;
        } else {
            return true;
        }
    }

    public boolean Eliminar(int id) {
        factory = Persistence.createEntityManagerFactory("ExamenDEJPU", System.getProperties());
        try{
            em = factory.createEntityManager();
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
        factory = Persistence.createEntityManagerFactory("ExamenDEJPU", System.getProperties());
        em = factory.createEntityManager();
        List<Boleta> boletas;
        javax.persistence.Query q = em.createQuery("SELECT c FROM Boleta c");
        boletas = q.getResultList();        
        return boletas;
    }
    // =P Carlos y Seba
    public List<Boleta> ListarPorRut(String rutC){
        factory = Persistence.createEntityManagerFactory("ExamenDEJPU", System.getProperties());
        em = factory.createEntityManager();
        List<Boleta> boletas;
        javax.persistence.Query q = em.createQuery("SELECT c FROM Boleta c WHERE c.rutCliente = '" + rutC + "'");
        //SELECT b FROM Boleta b WHERE b.rutCliente = :rutCliente
        boletas = q.getResultList();        
        return boletas;
    }
}
