/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author benja
 */
@Entity
@Table(name = "estacionamiento")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Estacionamiento.findAll", query = "SELECT e FROM Estacionamiento e")
    , @NamedQuery(name = "Estacionamiento.findByIdEstacionamiento", query = "SELECT e FROM Estacionamiento e WHERE e.idEstacionamiento = :idEstacionamiento")
    , @NamedQuery(name = "Estacionamiento.findByNombreEstacionamiento", query = "SELECT e FROM Estacionamiento e WHERE e.nombreEstacionamiento = :nombreEstacionamiento")
    , @NamedQuery(name = "Estacionamiento.findByPrecioEstacionamiento", query = "SELECT e FROM Estacionamiento e WHERE e.precioEstacionamiento = :precioEstacionamiento")})
public class Estacionamiento implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_estacionamiento")
    private Integer idEstacionamiento;
    @Size(max = 100)
    @Column(name = "nombre_estacionamiento")
    private String nombreEstacionamiento;
    @Column(name = "precio_estacionamiento")
    private Integer precioEstacionamiento;

    public Estacionamiento() {
    }

    public Estacionamiento(Integer idEstacionamiento) {
        this.idEstacionamiento = idEstacionamiento;
    }

    public Estacionamiento(Integer idEstacionamiento, String nombreEstacionamiento, Integer precioEstacionamiento) {
        this.idEstacionamiento = idEstacionamiento;
        this.nombreEstacionamiento = nombreEstacionamiento;
        this.precioEstacionamiento = precioEstacionamiento;
    }

    public Integer getIdEstacionamiento() {
        return idEstacionamiento;
    }

    public void setIdEstacionamiento(Integer idEstacionamiento) {
        this.idEstacionamiento = idEstacionamiento;
    }

    public String getNombreEstacionamiento() {
        return nombreEstacionamiento;
    }

    public void setNombreEstacionamiento(String nombreEstacionamiento) {
        this.nombreEstacionamiento = nombreEstacionamiento;
    }

    public Integer getPrecioEstacionamiento() {
        return precioEstacionamiento;
    }

    public void setPrecioEstacionamiento(Integer precioEstacionamiento) {
        this.precioEstacionamiento = precioEstacionamiento;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idEstacionamiento != null ? idEstacionamiento.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Estacionamiento)) {
            return false;
        }
        Estacionamiento other = (Estacionamiento) object;
        if ((this.idEstacionamiento == null && other.idEstacionamiento != null) || (this.idEstacionamiento != null && !this.idEstacionamiento.equals(other.idEstacionamiento))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.Estacionamiento[ idEstacionamiento=" + idEstacionamiento + " ]";
    }
    
}
