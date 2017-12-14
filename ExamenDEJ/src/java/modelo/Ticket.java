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
@Table(name = "ticket")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Ticket.findAll", query = "SELECT t FROM Ticket t")
    , @NamedQuery(name = "Ticket.findByIdTicket", query = "SELECT t FROM Ticket t WHERE t.idTicket = :idTicket")
    , @NamedQuery(name = "Ticket.findByNumeroTicket", query = "SELECT t FROM Ticket t WHERE t.numeroTicket = :numeroTicket")
    , @NamedQuery(name = "Ticket.findByIdEstacionamiento", query = "SELECT t FROM Ticket t WHERE t.idEstacionamiento = :idEstacionamiento")
    , @NamedQuery(name = "Ticket.findByCantHoras", query = "SELECT t FROM Ticket t WHERE t.cantHoras = :cantHoras")
    , @NamedQuery(name = "Ticket.findByRutCliente", query = "SELECT t FROM Ticket t WHERE t.rutCliente = :rutCliente")
    , @NamedQuery(name = "Ticket.findByFechaTicket", query = "SELECT t FROM Ticket t WHERE t.fechaTicket = :fechaTicket")
    , @NamedQuery(name = "Ticket.findByPatenteAuto", query = "SELECT t FROM Ticket t WHERE t.patenteAuto = :patenteAuto")
    , @NamedQuery(name = "Ticket.findByTotalPago", query = "SELECT t FROM Ticket t WHERE t.totalPago = :totalPago")
    , @NamedQuery(name = "Ticket.findByIdEstadoT", query = "SELECT t FROM Ticket t WHERE t.idEstadoT = :idEstadoT")})
public class Ticket implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_ticket")
    private Integer idTicket;
    @Column(name = "numero_ticket")
    private Integer numeroTicket;
    @Column(name = "id_estacionamiento")
    private Integer idEstacionamiento;
    @Column(name = "cant_horas")
    private Integer cantHoras;
    @Size(max = 9)
    @Column(name = "rut_cliente")
    private String rutCliente;
    @Column(name = "fecha_ticket")
    @Temporal(TemporalType.DATE)
    private Date fechaTicket;
    @Size(max = 6)
    @Column(name = "patente_auto")
    private String patenteAuto;
    @Column(name = "total_pago")
    private Integer totalPago;
    @Column(name = "id_estado_t")
    private Integer idEstadoT;

    public Ticket() {
    }

    public Ticket(Integer idTicket) {
        this.idTicket = idTicket;
    }

    public Integer getIdTicket() {
        return idTicket;
    }

    public void setIdTicket(Integer idTicket) {
        this.idTicket = idTicket;
    }

    public Integer getNumeroTicket() {
        return numeroTicket;
    }

    public void setNumeroTicket(Integer numeroTicket) {
        this.numeroTicket = numeroTicket;
    }

    public Integer getIdEstacionamiento() {
        return idEstacionamiento;
    }

    public void setIdEstacionamiento(Integer idEstacionamiento) {
        this.idEstacionamiento = idEstacionamiento;
    }

    public Integer getCantHoras() {
        return cantHoras;
    }

    public void setCantHoras(Integer cantHoras) {
        this.cantHoras = cantHoras;
    }

    public String getRutCliente() {
        return rutCliente;
    }

    public void setRutCliente(String rutCliente) {
        this.rutCliente = rutCliente;
    }

    public Date getFechaTicket() {
        return fechaTicket;
    }

    public void setFechaTicket(Date fechaTicket) {
        this.fechaTicket = fechaTicket;
    }

    public String getPatenteAuto() {
        return patenteAuto;
    }

    public void setPatenteAuto(String patenteAuto) {
        this.patenteAuto = patenteAuto;
    }

    public Integer getTotalPago() {
        return totalPago;
    }

    public void setTotalPago(Integer totalPago) {
        this.totalPago = totalPago;
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
        hash += (idTicket != null ? idTicket.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Ticket)) {
            return false;
        }
        Ticket other = (Ticket) object;
        if ((this.idTicket == null && other.idTicket != null) || (this.idTicket != null && !this.idTicket.equals(other.idTicket))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.Ticket[ idTicket=" + idTicket + " ]";
    }
    
}
