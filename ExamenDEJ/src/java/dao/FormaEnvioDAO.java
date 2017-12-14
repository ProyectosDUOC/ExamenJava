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
import modelo.FormaEnvio;

/**
 *
 * @author benja
 */
public class FormaEnvioDAO {
    private FormaEnvio p;
    private EntityManager em;
    
    EntityManagerFactory factory = Persistence.createEntityManagerFactory("ExamenDEJPU", System.getProperties());
    
    public boolean Crear(FormaEnvio forma) {
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
         em = factory.createEntityManager();
        p = em.find(FormaEnvio.class, id);

        if (p.getIdEnvio()== null) {
            return false;
        } else {
            return true;
        }
    }
    
    public boolean Eliminar(int id) {
        try{
             em = factory.createEntityManager();
            p = em.find(FormaEnvio.class, id);
            em.remove(p);
            em.flush();
            em.getTransaction().commit();
            return true;
        }
        catch(Exception ex){
            return false;
        }        
    }
    
    public List<FormaEnvio> Listar(){
        em = factory.createEntityManager();
        List<FormaEnvio> estados;
        javax.persistence.Query q = em.createQuery("SELECT c FROM Forma_envio c");
        estados = q.getResultList();        
        return estados;
    }
}
