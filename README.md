(ExamenJava)
# Trabajo Examen Asignatura Desarrollo en Java

## REQUISITOS ESPECÍFICOS: 
 
El examen constara de la implementación de una aplicación web dinámica en Java que permita actualizar y responder a requerimientos de búsqueda de registros almacenados en un modelo de datos de a lo más dos tablas. 
 
El examen constará de un documento en donde aparezca la descripción de los requerimientos de actualización y búsqueda de registros.  
 
## Formatos de entrega 
 
La entrega formal del examen debe ser acompañada por las siguientes evidencias:  Informe del sistema, documento Word con portada, índice, introducción, descripción del proyecto, código fuente documentado, conclusión, bibliografía.  Presentación del sistema, Presentación en vivo del sistema en computador personal o bien instalado en PC de sala.  Código fuente del proyecto, proyecto comprimido completo con base de datos físico en MYSQL. 
 
 # CASO A DESARROLLAR 
 
 
La entrega del documento y proyecto deberá ser vía electrónica, utilizando algún disco virtual compartido o vía Blackboard, según el docente lo indique. 
 
El encargo debe ser entregado en la fecha y horario establecido por la escuela (día examen transversal). Ud dispone desde la semana 16 para desarrollar el proyecto. Entregas atrasadas o de compilación no serán revisadas y se calificará con nota 1.0 
 
La empresa concesionada “Auto Park” ha solicitado la construcción de un sistema que permita agilizar el proceso de pago de ticket de sus estacionamientos a nivel nacional. 
 
En la primera reunión que sostiene el CEO de “Auto Park”, plantea que la primera versión de este sistema permitirá ser más transparente y ágil el pago de tickets de sus estacionamientos por parte de sus clientes, ya que evitará el tiempo de demora y molestias que se producen actualmente en las boleterías. Ya que podrán pagar en línea el uso de estos. 
 
El CEO indica que es importante que la plataforma sea intuitiva y con diseño simple y elegante, que refleje el sello de la empresa, donde siempre el cliente es lo primordial dando como reflejo de eso a su satisfacción, dando todo lo necesario para poder comprar en línea, sin problema de entendimiento de cómo usar la aplicación. 
 
El cliente debe poder seleccionar un listado de estacionamientos, y seleccionar el que desea pagar, uno o todos los que desee (existen 6 estacionamientos), esta opción podrá realizarla siempre y cuando ingrese sus datos personales previamente, como es Nombre, Rut, número telefónico y correo electrónico. Además, deberá ingresar la opción de medios de pago y la opción de envío de boleta. El sistema mostrará el total a cancelar de todos los estacionamientos que haya escogido. Para ingresar los montos a cancelar el cliente previamente debió ingresar a la aplicación móvil de la empresa quien le entregará el valor total a cancelar por su estadía. 
 
Una vez presionado el botón Pagar, lo enviará a una página indicando sus datos y el total cancelado. Finalmente, el sistema tendrá la opción poder buscar las últimas compras realizadas y revisar el historial de compra e imprimir el informe. 
 
 # PROTOTIPO DEL PROYECTO. 
 
Luego de varias reuniones realizando la toma de requerimientos con el CEO de la empresa y algunos futuros usuarios del sistema se llegó al análisis y diseño bajo un esquema de prototipos. 
 
La siguiente figura representa la página principal del sistema de pago de estacionamientos de la empresa “Auto Park” y que se debe cumplir las siguientes condiciones. 
 
 # MODELO DE DATOS 
 
Basado en los requisitos planteados, elabore un modelo de datos para generar la persistencia de los datos. 
 
## CONSIDERACIONES DE ARQUITECTURA 
 
Tenga las siguientes consideraciones en la implementación de su Proyecto 
 
* utilizar patrón de arquitectura MVC. 
* utilizar JSP o XHTML como presentación. 
* utilizar Framework 
* JSTL+EL para el despliegue de información 
* utilizar Servlets/EJB o Framework  como Controladores. 
* utilizar Clases Java para el Modelo. 
* utilizar Control de Excepciones. 
* utilizar API de Logging para registrar la actividad del usuario y excepciones ocurridas en el sistema.
