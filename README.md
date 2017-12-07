(ExamenJava)
# Trabajo Examen Asignatura Desarrollo en Java

## REQUISITOS ESPECÍFICOS: 
 
El examen constara de la implementación de una aplicación **web dinámica en Java** que permita actualizar y responder a requerimientos de búsqueda de registros almacenados en un modelo de datos de a lo más **dos tablas**. 
 
El examen **constará de un documento** en donde aparezca la descripción de los requerimientos de actualización y búsqueda de registros. 

 
## Formatos de entrega 
 
La entrega formal del examen debe ser acompañada por las siguientes evidencias:  Informe del sistema, documento Word con portada, índice, introducción, descripción del proyecto, código fuente documentado, conclusión, bibliografía.  Presentación del sistema, Presentación en vivo del sistema en computador personal o bien instalado en PC de sala.  Código fuente del proyecto, proyecto comprimido completo con base de datos físico en MYSQL. 

***

 # CASO A DESARROLLAR  
 
1. La entrega del documento y proyecto deberá ser vía electrónica, utilizando algún disco virtual compartido o vía Blackboard, según el docente lo indique. 
 
2. El encargo debe ser entregado en la fecha y horario establecido por la escuela (día examen transversal). Ud dispone desde la semana 16 para desarrollar el proyecto. Entregas atrasadas o de compilación no serán revisadas y se calificará con nota 1.0 
 
## Caso 
La empresa concesionada *Auto Park* ha solicitado la construcción de un sistema que permita agilizar el proceso de pago de ticket de sus estacionamientos a nivel nacional. 
 
* En la primera reunión que sostiene el CEO de “Auto Park”, plantea que la primera versión de este sistema permitirá ser más transparente y ágil el pago de tickets de sus estacionamientos por parte de sus clientes, ya que evitará el tiempo de demora y molestias que se producen actualmente en las boleterías. Ya que podrán pagar en línea el uso de estos. 
 
* El CEO indica que es importante que la plataforma sea intuitiva y con diseño simple y elegante, que refleje el sello de la empresa, donde siempre el cliente es lo primordial dando como reflejo de eso a su satisfacción, dando todo lo necesario para poder comprar en línea, sin problema de entendimiento de cómo usar la aplicación. 
 
* El cliente debe poder seleccionar un listado de estacionamientos, y seleccionar el que desea pagar, uno o todos los que desee (existen 6 estacionamientos), esta opción podrá realizarla siempre y cuando ingrese sus datos personales previamente, como es Nombre, Rut, número telefónico y correo electrónico. Además, deberá ingresar la opción de medios de pago y la opción de envío de boleta. El sistema mostrará el total a cancelar de todos los estacionamientos que haya escogido. Para ingresar los montos a cancelar el cliente previamente debió ingresar a la aplicación móvil de la empresa quien le entregará el valor total a cancelar por su estadía. 
 
* Una vez presionado el botón Pagar, lo enviará a una página indicando sus datos y el total cancelado. Finalmente, el sistema tendrá la opción poder buscar las últimas compras realizadas y revisar el historial de compra e imprimir el informe. 

*** 
 # PROTOTIPO DEL PROYECTO. 
 
Luego de varias reuniones realizando la toma de requerimientos con el CEO de la empresa y algunos futuros usuarios del sistema se llegó al análisis y diseño bajo un esquema de prototipos. 
 
La siguiente figura representa la página principal del sistema de pago de estacionamientos de la empresa “Auto Park” y que se debe cumplir las siguientes condiciones. 

***

## REQUSITOS FUNCIONALES. 
 
**Los requerimientos revisados más importantes con CEO de empresa son los siguientes:** 

| N° | Requisito | Estado |
| -- | -- | -- |
| RF1 | Se debe ingresar todos los campos de la empresa, Rut, nombre, teléfono y correo electrónico  , también los medios de pago y envío.| - |
| RF2 | Se debe generar un Boucher con un número correlativo (rescatado desde la base de datos) y mostrar su total de pago y datos de compra | - |
| RF3 | Se debe permitir eliminar o editar estacionamientos dentro de la grilla central de pagos | - |
| RF4 | Realice un menú que redirija a la página principal y de compras o pagos anteriores según lo sugerido en las figuras de prototipos. | - |
| RF5 | Se debe buscar por Rut los pagos o compras registradas anteriormente que serán buscado en la página de Ver compras.| - | 
| RF6 | Se debe registrar un Log con las actividades que se realizan en forma exitosa como también de errores.| - | 
| RF7 | El usuario podrá ver los estacionamientos y su ubicación ingresando a la opción Ver Estacionamientos en donde aparecerá las coordenadas de ubicación de estas para poder re direccionar a alguna opción de mapas disponible en la internet. | - | 


 ## Requisitos Funcionales

N° | Requisito | Estado
-- | -- | --
RNF1  | La interfaz debe ser intuitiva y fácil de usar.  | - 
RNF2  | La interfaz debe reflejar la imagen de la empresa| - 
RNF3  | La interfaz debe contar con toda la información necesaria para realizar la compra sin problemas. | -
 
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



