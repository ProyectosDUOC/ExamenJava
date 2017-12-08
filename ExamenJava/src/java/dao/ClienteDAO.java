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
 * @author benja
 */
public class ClienteDAO {

    private Cliente p;
    private EntityManager em;

    EntityManagerFactory factory = Persistence.createEntityManagerFactory("cliente", System.getProperties());

    public boolean Crear(Cliente cliente) {
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

    public boolean Leer(String rut) {
        p = em.find(Cliente.class, rut);

        if (p.getRutCliente().isEmpty()) {
            return false;
        } else {
            return true;
        }
    }

    public boolean Eliminar(String rut) {
        try{
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
        
        List<Cliente> clientes;
        javax.persistence.Query q = em.createQuery("SELECT c FROM Cliente c");
        clientes = q.getResultList();
        int num_clientes = clientes.size();
        
        return clientes;
    }
    /*
         if (opcion.equals("Listar")) {
                for (Persona obj : personas) {
                    out.println("<h2>" + obj.toString() + "<h2>");
                }
            }
    
    */
}