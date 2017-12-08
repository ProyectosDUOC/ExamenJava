DROP DATABASE IF EXISTS autoPark;


CREATE Database autoPark;


use autoPark;

CREATE TABLE boleta (
    id_boleta      INT NOT NULL,
    rut_cliente    VARCHAR(9) NOT NULL,
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



INSERT INTO comuna VALUES (1, 'San Bernardo');
INSERT INTO comuna VALUES (2, 'Calera de tango');
INSERT INTO comuna VALUES (3, 'Santiago');
INSERT INTO comuna VALUES (4, 'Vina del mar');
INSERT INTO comuna VALUES (5, 'Mapocho');
INSERT INTO comuna VALUES (6, 'Concepción');
INSERT INTO comuna VALUES (7, 'Valparaíso');

INSERT INTO cliente VALUES ('189761104','Carlos','+56998299855', 'car.orrella@gmail.com', 'san martin 185',1);
INSERT INTO cliente VALUES ('111111111','Christian','+56998299855', 'car.orrella@gmail.com', 'san martin 185',1);
INSERT INTO cliente VALUES ('222222222','Benjamin','+56998299855', 'b.morat@gmail.com', 'san martin 185',2);
INSERT INTO cliente VALUES ('333333333','Sebastian','+56998299855', 'seba.orrego@gmail.com', 'san martin 185',1);

INSERT INTO estacionamiento VALUES (1, 'AutoPark System Chile', 500);
INSERT INTO estacionamiento VALUES (2, 'AutoPark Centro Cultural Palacio de la Moneda', 2500);
INSERT INTO estacionamiento VALUES (3, 'AutoPark Saba', 3500);
INSERT INTO estacionamiento VALUES (4, 'AutoPark Plaza Sucre', 4500);
INSERT INTO estacionamiento VALUES (5, 'AutoPark Saba Plaza Tribunales de Justicia', 5500);
INSERT INTO estacionamiento VALUES (6, 'AutoPark Central Parking System ', 6500);

INSERT INTO estacionamiento_localidad VALUES (1, 'Barcelona 2077, P 1 Todo, Providencia, Santiago' , 3);
INSERT INTO estacionamiento_localidad VALUES (2, 'Teatinos 10, Santiago, Región Metropolitana' , 3);
INSERT INTO estacionamiento_localidad VALUES (3, 'Plaza Bellavista, Valparaíso' , 7);
INSERT INTO estacionamiento_localidad VALUES (4, ' Sucre 30 - Plaza Sucre - Subterráneo, Vina del Mar, Región de Valparaíso' , 4);
INSERT INTO estacionamiento_localidad VALUES (5, 'Dirección: Plaza Tribunales de Justicia:, Concepción' , 6);
INSERT INTO estacionamiento_localidad VALUES (6, 'Ismael Valdés Vergara Nº 838 - Diagonal Cervantes' , 5);

INSERT INTO estacionamiento_ticket VALUES(1, 10);
INSERT INTO estacionamiento_ticket VALUES(2, 3000);
INSERT INTO estacionamiento_ticket VALUES(3, 200);
INSERT INTO estacionamiento_ticket VALUES(4, 4000);
INSERT INTO estacionamiento_ticket VALUES(5, 10000);
INSERT INTO estacionamiento_ticket VALUES(6, 320);

INSERT INTO forma_pago VALUES (1,'Transferencia');
INSERT INTO forma_pago VALUES (2,'Pago en Linea');
INSERT INTO forma_pago VALUES (3,'Orden de Compra');

INSERT INTO forma_envio VALUES (1,'Correo Electrónico');
INSERT INTO forma_envio VALUES (2,'Dirección Particular');


