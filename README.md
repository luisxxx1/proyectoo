           Taller de nivelación PI a PII
            Luis Jimenez Quiñones 
              Programación 1 y 2 

 # 1)	 ¿Cuáles son los tipos de datos primitivos en Java?
R// En java, Hay 8 tipos de datos primitivos 
-	Byte 8 bits 
-	Short 16 bits 
-	Int 32 bits 
-	Long 64 bits 
Decimales 
-	Float 32 bits, 7 decimales 
-	Doublé 64 bits, 15 -16 decimales 
Otros 
-	Char 16 bits 
-	Boolean true o false 

 # 2)	¿Cómo funcionan las estructuras de control de flujo como if, else, switch y bucles en Java?
R // 
Condicionales 
If – else : Ejecuta un bloque si la condición es verdadera, si no, otro.

Switch: Evalúa una variable y ejecuta un caso especifico 

Bucles 
For : Repite un numero fijo de veces 
While : repite mientras la condición sea verdadera
Do-while : igual a While, pero siempre ejecuta al menos una vez 

 # 3)	¿Por qué es importante usar nombres significativos para variables y métodos?
R//
Usar nombres significativos mejora la legibilidad, facilita el mantenimiento, reduce errores y hace el código mas profesional 
4)	¿Qué es la Programación Orientada a Objetos (POO)?
R//
Organiza el código en objetos con atributos datos y métodos acciones. 
Sus principios clave son encapsulamiento, herencia, polimorfismo y abstracción 

 # 5)	¿Cuáles son los cuatro pilares de la Programación Orientada a Objetos?
R//
Los cuatro pilares de la POO son:

-Encapsulamiento: Protege los datos dentro de un objeto, evitando acceso no autorizado
- Herencia: Permite que una clase herede atributos y métodos de otra, reutilizando código 
- Polimorfismo Un mismo método puede comportarse de diferentes formas según el contexto   
- Abstracción: Oculta detalles innecesarios y muestra solo lo esencial del objeto 

 # 6)	¿Qué es la herencia en POO y cómo se utiliza en Java?
R// 
La herencia es un mecanismo que permite que una clase adquiera los atributos y métodos de otra clase facilita la reutilización de código y la extensibilidad 

EJEMPLO : 

class Animal {
 void hacerSonido()
 { System.out.println("Sonido de animal"); 
         }
 }

# 7)	 ¿Qué son los modificadores de acceso y cuáles son los más comunes en Java?
R//  
Los modificadores de acceso controlan la visibilidad en java son:
PUBLIC: Accesible desde cualquier parte 
PRIVATE: Solo dentro de la misma clase 
PROTECTED : Accesible en la misma clase, paquete y subclases.
DEFAULT : Solo dentro del mismo paquete sirven para proteger datos y controlar el acceso.

#  8)	Qué es una variable de entorno y por qué son importantes para Java o la programación en general?
R//
Una variable de entorno es un valor del sistema usado por programas. En java, son clave para 
Configurar el entorno (JAVA_HOME)
Facilitar la ejecución (PATH)
Seguridad (almacenar claves sin exponerlas)
Flexibilidad (Ajustar configuración sin cambiar código)

