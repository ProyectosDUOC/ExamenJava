
INSERT INTO pais VALUES (1,'Chile');

INSERT INTO region VALUES (1,'Metropolitana',1);
INSERT INTO region VALUES (2,'región de Valparaíso',1); 
INSERT INTO region VALUES (3,'región del Biobío',1);

INSERT INTO provincia VALUES (1,'Santiago',1);
INSERT INTO provincia VALUES (2,'Chacabuco',1);
INSERT INTO provincia VALUES (3,'Cordillera',1);
INSERT INTO provincia VALUES (4,'Maipo',1);
INSERT INTO provincia VALUES (5,'Melipilla',1);
INSERT INTO provincia VALUES (6,'Talagante',1);
INSERT INTO provincia VALUES (7,'Valparaíso',2);
INSERT INTO provincia VALUES (8,'Concepción',3);

INSERT INTO comuna VALUES (1,'Santiago',1);
INSERT INTO comuna VALUES (2,'Independecia',1);
INSERT INTO comuna VALUES (3,'Conchalí',1);
INSERT INTO comuna VALUES (4,'Huachuraba',1);
INSERT INTO comuna VALUES (5,'Recoleta',1);
INSERT INTO comuna VALUES (6,'Providencia',1);
INSERT INTO comuna VALUES (7,'Vitacura',1);
INSERT INTO comuna VALUES (8,'Lo Barnechea',1);
INSERT INTO comuna VALUES (9,'Las Condes',1);
INSERT INTO comuna VALUES (10,'Ñuñoa',1);
INSERT INTO comuna VALUES (11,'La Reina',1);
INSERT INTO comuna VALUES (12,'Macul',1);
INSERT INTO comuna VALUES (13,'Peñalolén',1);
INSERT INTO comuna VALUES (14,'La Florida',1);
INSERT INTO comuna VALUES (15,'San Joaquín',1);
INSERT INTO comuna VALUES (16,'La Granja',1);
INSERT INTO comuna VALUES (17,'La Pintana',1);
INSERT INTO comuna VALUES (18,'San Ramón',1);
INSERT INTO comuna VALUES (19,'San Miguel',1);
INSERT INTO comuna VALUES (20,'La Cisterna',1);
INSERT INTO comuna VALUES (21,'El Bosque',1);
INSERT INTO comuna VALUES (22,'Pedro Aguirre Cerda',1);
INSERT INTO comuna VALUES (23,'Lo Espejo',1);
INSERT INTO comuna VALUES (24,'Estacion Central',1);
INSERT INTO comuna VALUES (25,'Cerrillos',1);
INSERT INTO comuna VALUES (26,'Maipú',1);
INSERT INTO comuna VALUES (27,'Quinta Normal',1);
INSERT INTO comuna VALUES (28,'Lo Prado',1);
INSERT INTO comuna VALUES (29,'Pudahuel',1);
INSERT INTO comuna VALUES (30,'Cerro Navía',1);
INSERT INTO comuna VALUES (31,'Renca',1);
INSERT INTO comuna VALUES (32,'Quilicura',1);
INSERT INTO comuna VALUES (33,'Colina',2);
INSERT INTO comuna VALUES (34,'Lampa',2);
INSERT INTO comuna VALUES (35,'Tiltil',2);
INSERT INTO comuna VALUES (36,'Puente Alto',3);
INSERT INTO comuna VALUES (37,'San Jose de Maipo',3);
INSERT INTO comuna VALUES (38,'Pirque',3);
INSERT INTO comuna VALUES (39,'San Bernardo',4);
INSERT INTO comuna VALUES (40,'Buin',4);
INSERT INTO comuna VALUES (41,'Paine',4);
INSERT INTO comuna VALUES (42,'Calera de Tango',4);
INSERT INTO comuna VALUES (43,'Melipilla',5);
INSERT INTO comuna VALUES (44,'María Pinto',5);
INSERT INTO comuna VALUES (45,'Curacaví',5);
INSERT INTO comuna VALUES (46,'Alhué',5);
INSERT INTO comuna VALUES (47,'San Pedro',5);
INSERT INTO comuna VALUES (48,'Talagante',6);
INSERT INTO comuna VALUES (49,'Peñaflor',6);
INSERT INTO comuna VALUES (50,'Isla de Maipo',6);
INSERT INTO comuna VALUES (51,'El Monte',4);
INSERT INTO comuna VALUES (52,'Padre Hurtado',4);

INSERT INTO comuna VALUES (53,'Vina del Mar',7);
INSERT INTO comuna VALUES (54,'Concepción',8);
INSERT INTO comuna VALUES (55,'Valparaíso',7);

INSERT INTO cliente VALUES ('189761104','Carlos','+56998299855', 'car.orrella@gmail.com', 'san martin 185',1);
INSERT INTO cliente VALUES ('111111111','Christian','+56998299855', 'car.orrella@gmail.com', 'san martin 185',53);
INSERT INTO cliente VALUES ('222222222','Benjamin','+56998299855', 'b.morat@gmail.com', 'san martin 185',2);
INSERT INTO cliente VALUES ('333333333','Sebastian','+56998299855', 'seba.orrego@gmail.com', 'san martin 185',9);

INSERT INTO estacionamiento VALUES (1, 'AutoPark System Chile - Providencia', 500, 40, 3,'Barcelona 2077, P 1 Todo, Providencia, Santiago','-33.4251437','-70.6130836',6);
INSERT INTO estacionamiento VALUES (2, 'AutoPark Centro Cultural Palacio de la Moneda - Santiago', 250, 30 , 4,  'Teatinos 10, Santiago, Región Metropolitana','-33.4441289','-70.6567306' , 1);
INSERT INTO estacionamiento VALUES (3, 'AutoPark Saba - Valparaíso', 300, 40, 39,'Plaza Bellavista, Valparaíso','-33.0436597','-71.6253119' , 55 );
INSERT INTO estacionamiento VALUES (4, 'AutoPark Plaza Sucre - Vina del Mar', 100, 20, 6, 'Sucre 30 - Plaza Sucre - Subterráneo, Vina del Mar, Región de Valparaíso','-33.0254242','-71.5545642' , 53);
INSERT INTO estacionamiento VALUES (5, 'AutoPark Saba Plaza Tribunales de Justicia - Concepción', 520, 32, 31, 'Plaza Tribunales de Justicia:, Concepción','-36.825958','-73.049005',54);
INSERT INTO estacionamiento VALUES (6, 'AutoPark Central Parking System  - Mapocho', 600, 22, 10,'Ismael Valdés Vergara Nº 838 - Diagonal Cervantes','-33.4338413','-70.652074' ,  1 );

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

INSERT INTO estado_ticket VALUES (0,'No pago');
INSERT INTO estado_ticket VALUES (1,'Pagado');



INSERT INTO estacionamiento VALUES (1, $500); 10
INSERT INTO estacionamiento VALUES (2, $250); 3000
INSERT INTO estacionamiento VALUES (3, $300); 200
INSERT INTO estacionamiento VALUES (4, $100); 4000
INSERT INTO estacionamiento VALUES (5, $520); 10000
INSERT INTO estacionamiento VALUES (6, $600); 320

INSERT INTO cliente VALUES ('189761104','Carlos','+56998299855', 'car.orrella@gmail.com', 'san martin 185',1);
INSERT INTO cliente VALUES ('111111111','Christian','+56998299855', 'car.orrella@gmail.com', 'san martin 185',53);
INSERT INTO cliente VALUES ('222222222','Benjamin','+56998299855', 'b.morat@gmail.com', 'san martin 185',2);
INSERT INTO cliente VALUES ('333333333','Sebastian','+56998299855', 'seba.orrego@gmail.com', 'san martin 185',9);
                  id_ticket,n_ticket,EST,HRS,  rut          ,fecha     ,pate     ,total,PAGO, 
INSERT INTO ticket VALUES(1, 2000   , 2, 4  , '189761104', '2017-12-12', 'AAAAAA', 1000, 0);
INSERT INTO ticket VALUES(2, 2      , 1, 6  , '189761104', '2017-12-10', 'AAAAAA', 3000, 0);
INSERT INTO ticket VALUES(3, 99     , 5, 1  , '189761104', '2017-12-12', 'AAAAAA', 520, 0);
INSERT INTO ticket VALUES(4, 2000   , 4, 3  , '189761104', '2017-12-12', 'AAAAAA', 400, 0);
INSERT INTO ticket VALUES(5, 100    , 6, 10 , '189761104', '2017-12-12', 'AAAAAA', 6000, 0);

INSERT INTO ticket VALUES(6, 2 , 1, 6 , '189761104', '2017-12-10', 'AAAAAA', 3000, 0);
INSERT INTO ticket VALUES(7, 99 , 5, 1 , '189761104', '2017-12-12', 'AAAAAA', 520, 0);
INSERT INTO ticket VALUES(8, 2000 , 4, 3 , '189761104', '2017-12-12', 'AAAAAA', 400, 0);




