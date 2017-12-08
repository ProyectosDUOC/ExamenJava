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
@Table(name = "estacionamiento_localidad")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EstacionamientoLocalidad.findAll", query = "SELECT e FROM EstacionamientoLocalidad e")
    , @NamedQuery(name = "EstacionamientoLocalidad.findByIdEstacionamiento", query = "SELECT e FROM EstacionamientoLocalidad e WHERE e.idEstacionamiento = :idEstacionamiento")
    , @NamedQuery(name = "EstacionamientoLocalidad.findByMapaLocalidad", query = "SELECT e FROM EstacionamientoLocalidad e WHERE e.mapaLocalidad = :mapaLocalidad")
    , @NamedQuery(name = "EstacionamientoLocalidad.findByIdComuna", query = "SELECT e FROM EstacionamientoLocalidad e WHERE e.idComuna = :idComuna")})
public class EstacionamientoLocalidad implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_estacionamiento")
    private Integer idEstacionamiento;
    @Size(max = 300)
    @Column(name = "mapa_localidad")
    private String mapaLocalidad;
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_comuna")
    private int idComuna;

    public EstacionamientoLocalidad() {
    }

    public EstacionamientoLocalidad(Integer idEstacionamiento) {
        this.idEstacionamiento = idEstacionamiento;
    }

    public EstacionamientoLocalidad(Integer idEstacionamiento, String mapaLocalidad, int idComuna) {
        this.idEstacionamiento = idEstacionamiento;
        this.mapaLocalidad = mapaLocalidad;
        this.idComuna = idComuna;
    }

    public EstacionamientoLocalidad(Integer idEstacionamiento, int idComuna) {
        this.idEstacionamiento = idEstacionamiento;
        this.idComuna = idComuna;
    }

    public Integer getIdEstacionamiento() {
        return idEstacionamiento;
    }

    public void setIdEstacionamiento(Integer idEstacionamiento) {
        this.idEstacionamiento = idEstacionamiento;
    }

    public String getMapaLocalidad() {
        return mapaLocalidad;
    }

    public void setMapaLocalidad(String mapaLocalidad) {
        this.mapaLocalidad = mapaLocalidad;
    }

    public int getIdComuna() {
        return idComuna;
    }

    public void setIdComuna(int idComuna) {
        this.idComuna = idComuna;
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
        if (!(object instanceof EstacionamientoLocalidad)) {
            return false;
        }
        EstacionamientoLocalidad other = (EstacionamientoLocalidad) object;
        if ((this.idEstacionamiento == null && other.idEstacionamiento != null) || (this.idEstacionamiento != null && !this.idEstacionamiento.equals(other.idEstacionamiento))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.EstacionamientoLocalidad[ idEstacionamiento=" + idEstacionamiento + " ]";
    }
    
}
