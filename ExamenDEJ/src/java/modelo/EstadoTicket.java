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
 * @author Seba
 */
@Entity
@Table(name = "estado_ticket")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EstadoTicket.findAll", query = "SELECT e FROM EstadoTicket e")
    , @NamedQuery(name = "EstadoTicket.findByIdEstadoT", query = "SELECT e FROM EstadoTicket e WHERE e.idEstadoT = :idEstadoT")
    , @NamedQuery(name = "EstadoTicket.findByNombreEstado", query = "SELECT e FROM EstadoTicket e WHERE e.nombreEstado = :nombreEstado")})
public class EstadoTicket implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_estado_t")
    private Integer idEstadoT;
    @Size(max = 30)
    @Column(name = "nombre_estado")
    private String nombreEstado;

    public EstadoTicket() {
    }

    public EstadoTicket(Integer idEstadoT) {
        this.idEstadoT = idEstadoT;
    }

    public Integer getIdEstadoT() {
        return idEstadoT;
    }

    public void setIdEstadoT(Integer idEstadoT) {
        this.idEstadoT = idEstadoT;
    }

    public String getNombreEstado() {
        return nombreEstado;
    }

    public void setNombreEstado(String nombreEstado) {
        this.nombreEstado = nombreEstado;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idEstadoT != null ? idEstadoT.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EstadoTicket)) {
            return false;
        }
        EstadoTicket other = (EstadoTicket) object;
        if ((this.idEstadoT == null && other.idEstadoT != null) || (this.idEstadoT != null && !this.idEstadoT.equals(other.idEstadoT))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.EstadoTicket[ idEstadoT=" + idEstadoT + " ]";
    }
    
}
