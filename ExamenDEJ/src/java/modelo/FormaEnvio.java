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
@Table(name = "forma_envio")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "FormaEnvio.findAll", query = "SELECT f FROM FormaEnvio f")
    , @NamedQuery(name = "FormaEnvio.findByIdEnvio", query = "SELECT f FROM FormaEnvio f WHERE f.idEnvio = :idEnvio")
    , @NamedQuery(name = "FormaEnvio.findByNombreEnvio", query = "SELECT f FROM FormaEnvio f WHERE f.nombreEnvio = :nombreEnvio")})
public class FormaEnvio implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_envio")
    private Integer idEnvio;
    @Size(max = 100)
    @Column(name = "nombre_envio")
    private String nombreEnvio;

    public FormaEnvio() {
    }

    public FormaEnvio(Integer idEnvio) {
        this.idEnvio = idEnvio;
    }

    public Integer getIdEnvio() {
        return idEnvio;
    }

    public void setIdEnvio(Integer idEnvio) {
        this.idEnvio = idEnvio;
    }

    public String getNombreEnvio() {
        return nombreEnvio;
    }

    public void setNombreEnvio(String nombreEnvio) {
        this.nombreEnvio = nombreEnvio;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idEnvio != null ? idEnvio.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FormaEnvio)) {
            return false;
        }
        FormaEnvio other = (FormaEnvio) object;
        if ((this.idEnvio == null && other.idEnvio != null) || (this.idEnvio != null && !this.idEnvio.equals(other.idEnvio))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.FormaEnvio[ idEnvio=" + idEnvio + " ]";
    }
    
}
