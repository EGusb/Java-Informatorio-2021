Ejercicio Propuesto #5:
Dado un archivo de texto (.txt) con el siguiente formato:
{nombre},{apellido},{fecha de nacimiento},{sueldo}

Donde:
Nombre, apellido: String
fecha de nacimiento: Fecha con formato (dia-mes-año, ejemplo: 23-05-2021)
Sueldo: es numérico con decimales.

Ejemplo:
Carlos,Sanchez,20-01-1980,45678.08


Resolución De Problema (Pasos):
Servicio Reader (ya sabemos por los ejercicios propuestos #2)
Necesitas una Clase Empleado (con los datos a guardar)
Cada línea es un --> Empleado → se almacena en una lista
Crear un método que trate cada línea (String), donde separa los campos y creará el objeto Empleado.
Necesitamos otro método que convierta la fecha String en tipo Fecha (LocalDate),
también una clase Date Formatter (leer expresiones de formatos de fechas) para convertir String en LocalDate
También necesitaremos un método que convierte el String (sueldo) en tipos posibles double/Double, float(muy potente para lo que necesitamos), BigDecimal.


Cálculos (sobre la lista final):
Método que devuelva todos los empleados que comienzan con una letra dada en el apellido
Método que devuelva el empleado más joven y el más viejo (necesito una funcion para calcular el año basado en una fecha)
El empleado que más gana y el que menos gana.
(Opcional): Imprimir todos los empleados en orden alfabético (por nombre y por apellido).


Ejemplos de Expresiones (Patrones) de Fechas y sus ejemplos:

Patron                      Ejemplo
MM/dd/yyyy                  01/02/2018
dd-M-yyyy hh:mm:ss          02-1-2018 06:07:59
dd MMMM yyyy                02 January 2018
dd MMMM yyyy zzzz           02 January 2018 India Standard Time
E, dd MMM yyyy HH:mm:ss z   Tue, 02 Jan 2018 18:07:59 IST


Links de lectura acerca de LocalDate y Formatters (ver los ejemplos de Java 8):
https://ukode.es/fechas-en-java-ii/
https://www.arquitecturajava.com/java-string-to-date-utilizando-java-8/
https://www.delftstack.com/es/howto/java/java-string-to-datetime/