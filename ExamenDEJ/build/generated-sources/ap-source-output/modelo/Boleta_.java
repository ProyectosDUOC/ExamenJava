package modelo;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-12-14T17:43:52")
@StaticMetamodel(Boleta.class)
public class Boleta_ { 

    public static volatile SingularAttribute<Boleta, Integer> idEstadoT;
    public static volatile SingularAttribute<Boleta, Date> fechaBoleta;
    public static volatile SingularAttribute<Boleta, Integer> idBoleta;
    public static volatile SingularAttribute<Boleta, String> telefonoBoleta;
    public static volatile SingularAttribute<Boleta, Integer> idPago;
    public static volatile SingularAttribute<Boleta, String> correoBoleta;
    public static volatile SingularAttribute<Boleta, Integer> totalBoleta;
    public static volatile SingularAttribute<Boleta, Integer> idEnvio;
    public static volatile SingularAttribute<Boleta, String> nombreBoleta;
    public static volatile SingularAttribute<Boleta, String> rutCliente;

}