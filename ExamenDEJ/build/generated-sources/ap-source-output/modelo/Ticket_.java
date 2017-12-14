package modelo;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-12-14T17:43:52")
@StaticMetamodel(Ticket.class)
public class Ticket_ { 

    public static volatile SingularAttribute<Ticket, Integer> idTicket;
    public static volatile SingularAttribute<Ticket, Integer> idEstadoT;
    public static volatile SingularAttribute<Ticket, String> patenteAuto;
    public static volatile SingularAttribute<Ticket, Integer> totalPago;
    public static volatile SingularAttribute<Ticket, Integer> idEstacionamiento;
    public static volatile SingularAttribute<Ticket, Integer> cantHoras;
    public static volatile SingularAttribute<Ticket, Date> fechaTicket;
    public static volatile SingularAttribute<Ticket, Integer> numeroTicket;
    public static volatile SingularAttribute<Ticket, String> rutCliente;

}