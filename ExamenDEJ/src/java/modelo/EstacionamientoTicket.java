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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Seba
 */
@Entity
@Table(name = "estacionamiento_ticket")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EstacionamientoTicket.findAll", query = "SELECT e FROM EstacionamientoTicket e")
    , @NamedQuery(name = "EstacionamientoTicket.findByIdEstacionamiento", query = "SELECT e FROM EstacionamientoTicket e WHERE e.idEstacionamiento = :idEstacionamiento")
    , @NamedQuery(name = "EstacionamientoTicket.findByNumeroTicket", query = "SELECT e FROM EstacionamientoTicket e WHERE e.numeroTicket = :numeroTicket")})
public class EstacionamientoTicket implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_estacionamiento")
    private Integer idEstacionamiento;
    @Column(name = "numero_ticket")
    private Integer numeroTicket;

    public EstacionamientoTicket() {
    }

    public EstacionamientoTicket(Integer idEstacionamiento) {
        this.idEstacionamiento = idEstacionamiento;
    }

    public Integer getIdEstacionamiento() {
        return idEstacionamiento;
    }

    public void setIdEstacionamiento(Integer idEstacionamiento) {
        this.idEstacionamiento = idEstacionamiento;
    }

    public Integer getNumeroTicket() {
        return numeroTicket;
    }

    public void setNumeroTicket(Integer numeroTicket) {
        this.numeroTicket = numeroTicket;
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
        if (!(object instanceof EstacionamientoTicket)) {
            return false;
        }
        EstacionamientoTicket other = (EstacionamientoTicket) object;
        if ((this.idEstacionamiento == null && other.idEstacionamiento != null) || (this.idEstacionamiento != null && !this.idEstacionamiento.equals(other.idEstacionamiento))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.EstacionamientoTicket[ idEstacionamiento=" + idEstacionamiento + " ]";
    }
    
}
