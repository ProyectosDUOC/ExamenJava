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
 * @author benja
 */
public class DetalleBoletaDAO {
      private modelo.DetalleBoleta p;
    private EntityManager em;

    EntityManagerFactory factory = Persistence.createEntityManagerFactory("ExamenJavaFinalPU", System.getProperties());

    public boolean Crear(DetalleBoleta de) {
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

    public boolean Leer(int id) {
        p = em.find(DetalleBoleta.class, id);

        if (p.getIdBoleta()== null) {
            return false;
        } else {
            return true;
        }
    }

    public boolean Eliminar(int id) {
        try{
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
        
        List<DetalleBoleta> detalles;
        javax.persistence.Query q = em.createQuery("SELECT c FROM Detalle_boleta c");
        detalles = q.getResultList();
        
        return detalles;
    }
}
