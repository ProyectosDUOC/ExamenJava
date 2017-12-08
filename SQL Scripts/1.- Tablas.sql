DROP DATABASE IF EXISTS autoPark;


CREATE Database autoPark;

CREATE TABLE boleta (
    id_boleta      INT NOT NULL,
    rut_cliente    VARCHAR2(9) NOT NULL,
    fecha_boleta   DATE,
    total_boleta   INT,
    id_envio       INT NOT NULL,
    id_pago        INT NOT NULL
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
    nombre_comuna   VARCHAR(100)
);

ALTER TABLE comuna ADD CONSTRAINT comuna_pk PRIMARY KEY ( id_comuna );

CREATE TABLE detalle_boleta (
    id_boleta            INT NOT NULL,
    id_estacionamiento   INT NOT NULL,
    numero_ticket        INT
);

CREATE TABLE estacionamiento (
    id_estacionamiento       INT NOT NULL,
    nombre_estacionamiento   VARCHAR(100),
    precio_estacionamiento   INT
);

ALTER TABLE estacionamiento ADD CONSTRAINT estacionamiento_pk PRIMARY KEY ( id_estacionamiento );

CREATE TABLE estacionamiento_localidad (
    id_estacionamiento   INT NOT NULL,
    mapa_localidad       VARCHAR(300),
    id_comuna            INT NOT NULL
);

CREATE TABLE estacionamiento_ticket (
    id_estacionamiento   INT NOT NULL,
    numero_ticket        INT
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

ALTER TABLE detalle_boleta
    ADD CONSTRAINT deta_boleta_esta_fk FOREIGN KEY ( id_estacionamiento )
        REFERENCES estacionamiento ( id_estacionamiento );

ALTER TABLE detalle_boleta
    ADD CONSTRAINT detalle_boleta_fk FOREIGN KEY ( id_boleta )
        REFERENCES boleta ( id_boleta );

ALTER TABLE estacionamiento_localidad
    ADD CONSTRAINT esta_loca_coumna_fk FOREIGN KEY ( id_comuna )
        REFERENCES comuna ( id_comuna );

ALTER TABLE estacionamiento_localidad
    ADD CONSTRAINT esta_loca_estacio_fk FOREIGN KEY ( id_estacionamiento )
        REFERENCES estacionamiento ( id_estacionamiento );

ALTER TABLE estacionamiento_ticket
    ADD CONSTRAINT ticket_esta_fk FOREIGN KEY ( id_estacionamiento )
        REFERENCES estacionamiento ( id_estacionamiento );