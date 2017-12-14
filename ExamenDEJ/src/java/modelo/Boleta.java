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
 * @author Seba
 */
@Entity
@Table(name = "boleta")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Boleta.findAll", query = "SELECT b FROM Boleta b")
    , @NamedQuery(name = "Boleta.findByIdBoleta", query = "SELECT b FROM Boleta b WHERE b.idBoleta = :idBoleta")
    , @NamedQuery(name = "Boleta.findByRutCliente", query = "SELECT b FROM Boleta b WHERE b.rutCliente = :rutCliente")
    , @NamedQuery(name = "Boleta.findByNombreBoleta", query = "SELECT b FROM Boleta b WHERE b.nombreBoleta = :nombreBoleta")
    , @NamedQuery(name = "Boleta.findByTelefonoBoleta", query = "SELECT b FROM Boleta b WHERE b.telefonoBoleta = :telefonoBoleta")
    , @NamedQuery(name = "Boleta.findByCorreoBoleta", query = "SELECT b FROM Boleta b WHERE b.correoBoleta = :correoBoleta")
    , @NamedQuery(name = "Boleta.findByFechaBoleta", query = "SELECT b FROM Boleta b WHERE b.fechaBoleta = :fechaBoleta")
    , @NamedQuery(name = "Boleta.findByTotalBoleta", query = "SELECT b FROM Boleta b WHERE b.totalBoleta = :totalBoleta")
    , @NamedQuery(name = "Boleta.findByIdEnvio", query = "SELECT b FROM Boleta b WHERE b.idEnvio = :idEnvio")
    , @NamedQuery(name = "Boleta.findByIdPago", query = "SELECT b FROM Boleta b WHERE b.idPago = :idPago")
    , @NamedQuery(name = "Boleta.findByIdEstadoT", query = "SELECT b FROM Boleta b WHERE b.idEstadoT = :idEstadoT")})
public class Boleta implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_boleta")
    private Integer idBoleta;
    @Size(max = 9)
    @Column(name = "rut_cliente")
    private String rutCliente;
    @Size(max = 200)
    @Column(name = "nombre_boleta")
    private String nombreBoleta;
    @Size(max = 12)
    @Column(name = "telefono_boleta")
    private String telefonoBoleta;
    @Size(max = 100)
    @Column(name = "correo_boleta")
    private String correoBoleta;
    @Column(name = "fecha_boleta")
    @Temporal(TemporalType.DATE)
    private Date fechaBoleta;
    @Column(name = "total_boleta")
    private Integer totalBoleta;
    @Column(name = "id_envio")
    private Integer idEnvio;
    @Column(name = "id_pago")
    private Integer idPago;
    @Column(name = "id_estado_t")
    private Integer idEstadoT;

    public Boleta() {
    }

    public Boleta(Integer idBoleta) {
        this.idBoleta = idBoleta;
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

    public String getNombreBoleta() {
        return nombreBoleta;
    }

    public void setNombreBoleta(String nombreBoleta) {
        this.nombreBoleta = nombreBoleta;
    }

    public String getTelefonoBoleta() {
        return telefonoBoleta;
    }

    public void setTelefonoBoleta(String telefonoBoleta) {
        this.telefonoBoleta = telefonoBoleta;
    }

    public String getCorreoBoleta() {
        return correoBoleta;
    }

    public void setCorreoBoleta(String correoBoleta) {
        this.correoBoleta = correoBoleta;
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

    public Integer getIdEnvio() {
        return idEnvio;
    }

    public void setIdEnvio(Integer idEnvio) {
        this.idEnvio = idEnvio;
    }

    public Integer getIdPago() {
        return idPago;
    }

    public void setIdPago(Integer idPago) {
        this.idPago = idPago;
    }

    public Integer getIdEstadoT() {
        return idEstadoT;
    }

    public void setIdEstadoT(Integer idEstadoT) {
        this.idEstadoT = idEstadoT;
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
