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
 * @author benja
 */
@Entity
@Table(name = "detalle_boleta")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DetalleBoleta.findAll", query = "SELECT d FROM DetalleBoleta d")
    , @NamedQuery(name = "DetalleBoleta.findByIdBoleta", query = "SELECT d FROM DetalleBoleta d WHERE d.idBoleta = :idBoleta")
    , @NamedQuery(name = "DetalleBoleta.findByIdEstacionamiento", query = "SELECT d FROM DetalleBoleta d WHERE d.idEstacionamiento = :idEstacionamiento")
    , @NamedQuery(name = "DetalleBoleta.findByNumeroTicket", query = "SELECT d FROM DetalleBoleta d WHERE d.numeroTicket = :numeroTicket")})
public class DetalleBoleta implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_boleta")
    private Integer idBoleta;
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_estacionamiento")
    private int idEstacionamiento;
    @Column(name = "numero_ticket")
    private Integer numeroTicket;

    public DetalleBoleta() {
    }

    public DetalleBoleta(Integer idBoleta) {
        this.idBoleta = idBoleta;
    }

    public DetalleBoleta(Integer idBoleta, int idEstacionamiento) {
        this.idBoleta = idBoleta;
        this.idEstacionamiento = idEstacionamiento;
    }

    public DetalleBoleta(Integer idBoleta, int idEstacionamiento, Integer numeroTicket) {
        this.idBoleta = idBoleta;
        this.idEstacionamiento = idEstacionamiento;
        this.numeroTicket = numeroTicket;
    }

    public Integer getIdBoleta() {
        return idBoleta;
    }

    public void setIdBoleta(Integer idBoleta) {
        this.idBoleta = idBoleta;
    }

    public int getIdEstacionamiento() {
        return idEstacionamiento;
    }

    public void setIdEstacionamiento(int idEstacionamiento) {
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
        hash += (idBoleta != null ? idBoleta.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DetalleBoleta)) {
            return false;
        }
        DetalleBoleta other = (DetalleBoleta) object;
        if ((this.idBoleta == null && other.idBoleta != null) || (this.idBoleta != null && !this.idBoleta.equals(other.idBoleta))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.DetalleBoleta[ idBoleta=" + idBoleta + " ]";
    }
    
}
