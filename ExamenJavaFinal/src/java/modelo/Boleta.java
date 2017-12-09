/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author benja
 */
@Entity
@Table(name = "boleta")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Boleta.findAll", query = "SELECT b FROM Boleta b")
    , @NamedQuery(name = "Boleta.findByIdBoleta", query = "SELECT b FROM Boleta b WHERE b.idBoleta = :idBoleta")
    , @NamedQuery(name = "Boleta.findByRutCliente", query = "SELECT b FROM Boleta b WHERE b.rutCliente = :rutCliente")
    , @NamedQuery(name = "Boleta.findByFechaBoleta", query = "SELECT b FROM Boleta b WHERE b.fechaBoleta = :fechaBoleta")
    , @NamedQuery(name = "Boleta.findByTotalBoleta", query = "SELECT b FROM Boleta b WHERE b.totalBoleta = :totalBoleta")
    , @NamedQuery(name = "Boleta.findByIdEnvio", query = "SELECT b FROM Boleta b WHERE b.idEnvio = :idEnvio")
    , @NamedQuery(name = "Boleta.findByIdPago", query = "SELECT b FROM Boleta b WHERE b.idPago = :idPago")})
public class Boleta implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_boleta")
    private Integer idBoleta;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 9)
    @Column(name = "rut_cliente")
    private String rutCliente;
    @Column(name = "fecha_boleta")
    @Temporal(TemporalType.DATE)
    private Date fechaBoleta;
    @Column(name = "total_boleta")
    private Integer totalBoleta;
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_envio")
    private int idEnvio;
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_pago")
    private int idPago;

    public Boleta() {
    }

    public Boleta(Integer idBoleta) {
        this.idBoleta = idBoleta;
    }

    public Boleta(Integer idBoleta, String rutCliente, int idEnvio, int idPago) {
        this.idBoleta = idBoleta;
        this.rutCliente = rutCliente;
        this.idEnvio = idEnvio;
        this.idPago = idPago;
    }

    public Integer getIdBoleta() {
        return idBoleta;
    }

    public void setIdBoleta(Integer idBoleta) {
        this.idBoleta = idBoleta;
    }

    public String getRutCliente() {
        return rutCliente;
    }

    public void setRutCliente(String rutCliente) {
        this.rutCliente = rutCliente;
    }

    public Date getFechaBoleta() {
        return fechaBoleta;
    }

    public void setFechaBoleta(Date fechaBoleta) {
        this.fechaBoleta = fechaBoleta;
    }

    public Integer getTotalBoleta() {
        return totalBoleta;
    }

    public void setTotalBoleta(Integer totalBoleta) {
        this.totalBoleta = totalBoleta;
    }

    public int getIdEnvio() {
        return idEnvio;
    }

    public void setIdEnvio(int idEnvio) {
        this.idEnvio = idEnvio;
    }

    public int getIdPago() {
        return idPago;
    }

    public void setIdPago(int idPago) {
        this.idPago = idPago;
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
        if (!(object instanceof Boleta)) {
            return false;
        }
        Boleta other = (Boleta) object;
        if ((this.idBoleta == null && other.idBoleta != null) || (this.idBoleta != null && !this.idBoleta.equals(other.idBoleta))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.Boleta[ idBoleta=" + idBoleta + " ]";
    }
    
}
