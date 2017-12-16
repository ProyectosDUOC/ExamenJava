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
import modelo.Cliente;

/**
 *
 * @author Seba
 */
public class ClienteDAO {
    private Cliente p;
    private EntityManager em;

    EntityManagerFactory factory;

    public boolean Crear(Cliente cliente) {
        factory = Persistence.createEntityManagerFactory("ExamenDEJPU", System.getProperties());
        em = factory.createEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(cliente);
            em.flush();
            em.getTransaction().commit();
            return true;
        } catch (Exception ex) {
            em.getTransaction().rollback();
            return false;
        }
    }

    public Cliente Leer(String rut) {
        factory = Persistence.createEntityManagerFactory("ExamenDEJPU", System.getProperties());
        em = factory.createEntityManager();
        p = em.find(Cliente.class, rut);
        if (p.getRutCliente().isEmpty()) {
            return p;
        } else {
            return p;
        }
    }

    public boolean Eliminar(String rut) {
        factory = Persistence.createEntityManagerFactory("ExamenDEJPU", System.getProperties());
        try{
            em = factory.createEntityManager();
            p = em.find(Cliente.class, rut);
            em.remove(p);
            em.flush();
            em.getTransaction().commit();
            return true;
        }
        catch(Exception ex){
            return false;
        }        
    }
    
    public List<Cliente> Listar(){
        factory = Persistence.createEntityManagerFactory("ExamenDEJPU", System.getProperties());
        em = factory.createEntityManager();
        List<Cliente> clientes;
        javax.persistence.Query q = em.createQuery("SELECT c FROM Cliente c");
        clientes = q.getResultList();        
        return clientes;
    }
}
