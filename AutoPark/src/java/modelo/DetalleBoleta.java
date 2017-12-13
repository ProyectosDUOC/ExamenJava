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
    , @NamedQuery(name = "DetalleBoleta.findByIdDetalleBoleta", query = "SELECT d FROM DetalleBoleta d WHERE d.idDetalleBoleta = :idDetalleBoleta")
    , @NamedQuery(name = "DetalleBoleta.findByIdBoleta", query = "SELECT d FROM DetalleBoleta d WHERE d.idBoleta = :idBoleta")
    , @NamedQuery(name = "DetalleBoleta.findByIdTicket", query = "SELECT d FROM DetalleBoleta d WHERE d.idTicket = :idTicket")})
public class DetalleBoleta implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_detalle_boleta")
    private Integer idDetalleBoleta;
    @Column(name = "id_boleta")
    private Integer idBoleta;
    @Column(name = "id_ticket")
    private Integer idTicket;

    public DetalleBoleta() {
    }

    public DetalleBoleta(Integer idDetalleBoleta) {
        this.idDetalleBoleta = idDetalleBoleta;
    }

    public Integer getIdDetalleBoleta() {
        return idDetalleBoleta;
    }

    public void setIdDetalleBoleta(Integer idDetalleBoleta) {
        this.idDetalleBoleta = idDetalleBoleta;
    }

    public Integer getIdBoleta() {
        return idBoleta;
    }

    public void setIdBoleta(Integer idBoleta) {
        this.idBoleta = idBoleta;
    }

    public Integer getIdTicket() {
        return idTicket;
    }

    public void setIdTicket(Integer idTicket) {
        this.idTicket = idTicket;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idDetalleBoleta != null ? idDetalleBoleta.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DetalleBoleta)) {
            return false;
        }
        DetalleBoleta other = (DetalleBoleta) object;
        if ((this.idDetalleBoleta == null && other.idDetalleBoleta != null) || (this.idDetalleBoleta != null && !this.idDetalleBoleta.equals(other.idDetalleBoleta))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.DetalleBoleta[ idDetalleBoleta=" + idDetalleBoleta + " ]";
    }
    
}
