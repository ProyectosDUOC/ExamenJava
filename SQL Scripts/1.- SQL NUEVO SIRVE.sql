DROP DATABASE IF EXISTS autoPark;

CREATE Database autoPark;

use autoPark;

CREATE TABLE boleta (
    id_boleta      INT NOT NULL,
    rut_cliente    VARCHAR(9),
    nombre_boleta      VARCHAR(200),
    telefono_boleta    VARCHAR(12),
    correo_boleta      VARCHAR(100),
    fecha_boleta   DATE,
    total_boleta   INT,
    id_envio       INT,
    id_pago        INT,
    id_estado_t    INT
);

ALTER TABLE boleta ADD CONSTRAINT boleta_pk PRIMARY KEY ( id_boleta );

CREATE TABLE cliente (
    rut_cliente         VARCHAR(9) NOT NULL,
    nombre_cliente      VARCHAR(200),
    telefono_cliente    VARCHAR(12),
    correo_cliente      VARCHAR(100),
    direccion_cliente   VARCHAR(200),
    id_comuna           INT NOT NULL
);

ALTER TABLE cliente ADD CONSTRAINT cliente_pk PRIMARY KEY ( rut_cliente );

CREATE TABLE comuna (
    id_comuna       INT NOT NULL,
    nombre_comuna   VARCHAR(100),
    id_provincia    INT
);
ALTER TABLE comuna ADD CONSTRAINT comuna_pk PRIMARY KEY ( id_comuna );

CREATE TABLE provincia(
    id_provincia INT NOT NULL,
    nombre_provincia VARCHAR(100),
    id_region INT,
    PRIMARY KEY (id_provincia)
);

CREATE TABLE region(
    id_region INT NOT NULL,
    nombre_region VARCHAR(100),
    id_pais INT,
    PRIMARY KEY (id_region)
);

CREATE TABLE pais(
    id_pais INT NOT NULL,
    nombre_pais VARCHAR(100),
    PRIMARY KEY (id_pais)
);

CREATE TABLE detalle_boleta (
    id_detalle_boleta    INT NOT NULL,
    id_boleta            INT,
    id_ticket             INT,
    PRIMARY KEY(id_detalle_boleta)
);

CREATE TABLE ticket(
    id_ticket           INT NOT NULL, 
    numero_ticket       INT, 
    id_estacionamiento  INT, 
    cant_horas          INT,
    rut_cliente         VARCHAR(9),
    fecha_ticket        DATE,
    patente_auto        VARCHAR(6), 
    total_pago          INT,    
    id_estado_t         INT,
    PRIMARY KEY(id_ticket)
);


CREATE TABLE estacionamiento (
    id_estacionamiento   INT NOT NULL,
    nombre_esta          VARCHAR(100),
    precio_esta          INT,
    cant_maxima          INT, 
    cant_disponible      INT,
    glosa                VARCHAR(300),
    mapa_longitud        VARCHAR(30),       
    mapa_latitud         VARCHAR(30),  
    id_comuna            INT NOT NULL
);

ALTER TABLE estacionamiento ADD CONSTRAINT estacionamiento_pk PRIMARY KEY ( id_estacionamiento );


CREATE TABLE estacionamiento_ticket (
    id_estacionamiento   INT NOT NULL,
    numero_ticket        INT,
    PRIMARY KEY(id_estacionamiento)
);

CREATE TABLE forma_envio (
    id_envio       INT NOT NULL,
    nombre_envio   VARCHAR(100)
);

ALTER TABLE forma_envio ADD CONSTRAINT forma_envio_pk PRIMARY KEY ( id_envio );

CREATE TABLE forma_pago (
    id_pago       INT NOT NULL,
    nombre_pago   VARCHAR(100)
);

ALTER TABLE forma_pago ADD CONSTRAINT forma_pago_pk PRIMARY KEY ( id_pago );

CREATE TABLE estado_ticket(
    id_estado_t INT NOT NULL,
    nombre_estado VARCHAR(30),
    PRIMARY KEY(id_estado_t)
);


ALTER TABLE boleta
    ADD CONSTRAINT boleta_cliente_fk FOREIGN KEY ( rut_cliente )
        REFERENCES cliente ( rut_cliente );

ALTER TABLE boleta
    ADD CONSTRAINT boleta_forma_envio_fk FOREIGN KEY ( id_envio )
        REFERENCES forma_envio ( id_envio );

ALTER TABLE boleta
    ADD CONSTRAINT boleta_forma_pago_fk FOREIGN KEY ( id_pago )
        REFERENCES forma_pago ( id_pago );

ALTER TABLE cliente
    ADD CONSTRAINT cliente_comuna_fk FOREIGN KEY ( id_comuna )
        REFERENCES comuna ( id_comuna );

ALTER TABLE comuna
    ADD CONSTRAINT comuna_provi_fk FOREIGN KEY ( id_provincia )
        REFERENCES provincia ( id_provincia );

ALTER TABLE provincia
    ADD CONSTRAINT provi_region_fk FOREIGN KEY ( id_region )
        REFERENCES region ( id_region );      

ALTER TABLE region
    ADD CONSTRAINT region_pais_fk FOREIGN KEY ( id_pais )
        REFERENCES pais ( id_pais );   

ALTER TABLE detalle_boleta
    ADD CONSTRAINT detalle_boleta_fk FOREIGN KEY ( id_boleta )
        REFERENCES boleta ( id_boleta );

ALTER TABLE detalle_boleta
    ADD CONSTRAINT detalle_bol_t_fk FOREIGN KEY ( id_ticket )
        REFERENCES ticket ( id_ticket );

ALTER TABLE estacionamiento
    ADD CONSTRAINT esta_comu_fk FOREIGN KEY ( id_comuna )
        REFERENCES comuna ( id_comuna );

ALTER TABLE ticket
    ADD CONSTRAINT tiket_esta_fk FOREIGN KEY ( id_estacionamiento )
        REFERENCES estacionamiento ( id_estacionamiento );

ALTER TABLE ticket
    ADD CONSTRAINT ticket_cli_fk FOREIGN KEY ( rut_cliente )
        REFERENCES cliente ( rut_cliente );


