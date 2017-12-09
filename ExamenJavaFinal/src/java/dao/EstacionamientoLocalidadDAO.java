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
import modelo.EstacionamientoLocalidad;

/**
 *
 * @author benja
 */
public class EstacionamientoLocalidadDAO {
     private EstacionamientoLocalidad p;
    private EntityManager em;
    
    EntityManagerFactory factory = Persistence.createEntityManagerFactory("ExamenJavaFinalPU", System.getProperties());
    
    public boolean Crear(EstacionamientoLocalidad estacionamientoLocalidad) {
        em = factory.createEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(estacionamientoLocalidad);
            em.flush();
            em.getTransaction().commit();
            return true;
        } catch (Exception ex) {
            em.getTransaction().rollback();
            return false;
        }
    }
    
    public EstacionamientoLocalidad Leer(int idEstacionamiento) {
         em = factory.createEntityManager();
        p = em.find(EstacionamientoLocalidad.class, idEstacionamiento);

        if (p.getIdEstacionamiento() == null) {
            return null;
        } else {
            return p;
        }
    }
    
    public boolean Eliminar(String idEstacionamiento) {
        try{
             em = factory.createEntityManager();
            p = em.find(EstacionamientoLocalidad.class, idEstacionamiento);
            em.remove(p);
            em.flush();
            em.getTransaction().commit();
            return true;
        }
        catch(Exception ex){
            return false;
        }        
    }
    
    public List<EstacionamientoLocalidad> Listar(){
         em = factory.createEntityManager();
        List<EstacionamientoLocalidad> estacionamientosLocalidad;
        javax.persistence.Query q = em.createQuery("SELECT c FROM Estacionamiento_localidad c");
        estacionamientosLocalidad = q.getResultList();        
        return estacionamientosLocalidad;
    }
}
