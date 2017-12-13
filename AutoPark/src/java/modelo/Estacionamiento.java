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
    , @NamedQuery(name = "Estacionamiento.findByNombreEsta", query = "SELECT e FROM Estacionamiento e WHERE e.nombreEsta = :nombreEsta")
    , @NamedQuery(name = "Estacionamiento.findByPrecioEsta", query = "SELECT e FROM Estacionamiento e WHERE e.precioEsta = :precioEsta")
    , @NamedQuery(name = "Estacionamiento.findByCantMaxima", query = "SELECT e FROM Estacionamiento e WHERE e.cantMaxima = :cantMaxima")
    , @NamedQuery(name = "Estacionamiento.findByCantDisponible", query = "SELECT e FROM Estacionamiento e WHERE e.cantDisponible = :cantDisponible")
    , @NamedQuery(name = "Estacionamiento.findByGlosa", query = "SELECT e FROM Estacionamiento e WHERE e.glosa = :glosa")
    , @NamedQuery(name = "Estacionamiento.findByMapaLongitud", query = "SELECT e FROM Estacionamiento e WHERE e.mapaLongitud = :mapaLongitud")
    , @NamedQuery(name = "Estacionamiento.findByMapaLatitud", query = "SELECT e FROM Estacionamiento e WHERE e.mapaLatitud = :mapaLatitud")
    , @NamedQuery(name = "Estacionamiento.findByIdComuna", query = "SELECT e FROM Estacionamiento e WHERE e.idComuna = :idComuna")})
public class Estacionamiento implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_estacionamiento")
    private Integer idEstacionamiento;
    @Size(max = 100)
    @Column(name = "nombre_esta")
    private String nombreEsta;
    @Column(name = "precio_esta")
    private Integer precioEsta;
    @Column(name = "cant_maxima")
    private Integer cantMaxima;
    @Column(name = "cant_disponible")
    private Integer cantDisponible;
    @Size(max = 300)
    @Column(name = "glosa")
    private String glosa;
    @Size(max = 30)
    @Column(name = "mapa_longitud")
    private String mapaLongitud;
    @Size(max = 30)
    @Column(name = "mapa_latitud")
    private String mapaLatitud;
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_comuna")
    private int idComuna;

    public Estacionamiento() {
    }

    public Estacionamiento(Integer idEstacionamiento) {
        this.idEstacionamiento = idEstacionamiento;
    }

    public Estacionamiento(Integer idEstacionamiento, int idComuna) {
        this.idEstacionamiento = idEstacionamiento;
        this.idComuna = idComuna;
    }

    public Integer getIdEstacionamiento() {
        return idEstacionamiento;
    }

    public void setIdEstacionamiento(Integer idEstacionamiento) {
        this.idEstacionamiento = idEstacionamiento;
    }

    public String getNombreEsta() {
        return nombreEsta;
    }

    public void setNombreEsta(String nombreEsta) {
        this.nombreEsta = nombreEsta;
    }

    public Integer getPrecioEsta() {
        return precioEsta;
    }

    public void setPrecioEsta(Integer precioEsta) {
        this.precioEsta = precioEsta;
    }

    public Integer getCantMaxima() {
        return cantMaxima;
    }

    public void setCantMaxima(Integer cantMaxima) {
        this.cantMaxima = cantMaxima;
    }

    public Integer getCantDisponible() {
        return cantDisponible;
    }

    public void setCantDisponible(Integer cantDisponible) {
        this.cantDisponible = cantDisponible;
    }

    public String getGlosa() {
        return glosa;
    }

    public void setGlosa(String glosa) {
        this.glosa = glosa;
    }

    public String getMapaLongitud() {
        return mapaLongitud;
    }

    public void setMapaLongitud(String mapaLongitud) {
        this.mapaLongitud = mapaLongitud;
    }

    public String getMapaLatitud() {
        return mapaLatitud;
    }

    public void setMapaLatitud(String mapaLatitud) {
        this.mapaLatitud = mapaLatitud;
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
