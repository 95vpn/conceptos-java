# Conceptos Java
## variables y valores
Utiliza variables para almacenar valores. Una variable almacena un unico valor. Una varibla se define por un nombre, un tipo y un rango de valores que puede almacenar.
El nombre de una variable permite hacer referencia a ella.

## Primitivos

Las variables pueden ser de un tipo primitivos de datos o una referencia a un objeto, los tipos primitivos permiten representar valores básicos.
### Números enteros 
Representa números enteros positivos y negativos.
### Numeros reales
Existen el float y double
### Caracters
Existe el char que permiter repesentar cualquier caracter unicode
### Booleano
Representa valores lógiccos verdadero o falso 

la siguiente tabla resume los tipos ´rimitivos de java
| Tipo |   Descripción | Valor mínimo y máximo |
|----|---------------|----------------------|
|byte | entero con signo | -127 a 128 |
|short | entero con signo | -32768 a 32767 |
| int | entero con signo | -2167483648 a2167483647 |
|long | entero con signo | -922117036854775808 a 9221170036854775807 |
| float | real de posición simple | &plusmn; 3.4028234747e+38 a &plusmn; 1.40239846e-45 |
| double | real de presición doble | &plusmn; 1.7976931348623157e+309 a &plusmn; 4.94065645841246544e-324 |
| char | caracteres unicode | \u0000 a \uFFFF |
| boolean | valores lógicos | true, false |
 ## Literales 
 Se denomina literal en la manera en que se escriben sus valores para cada uno de sus tipos primitivos.

### Numeros enteros
Se puede escribir en decimal, octal o en hexadecimal.
### Números reales
debe tener un punto decimal o un exponente.
### Booleanos
los valores oógicos puden ser true y false.
### Caracteres
los valores de tipo caracter representan un caracter unicode, se escriben siempre entre comillas simples.

### Textos
pertenece a la clase string y se expresa el texto entre comillas dobles.
Un texto siempre debe aparecer en una sola linea.
Para dividir el texto en varias lineas se debe utilizar el operador + para concarenar textos.

## Operadores
### Números enteros 
al realizar una operación entre dos números enteros, el resultado siempre es un número entero.
Se puede realizar operaciones unarias, aditivas, multiplicativas, de incremento y decremento, relacionales, de igualdad y de asignación.
 
#### la operación unaria permite poner un signi delante

#### la operación aditiva se refiere a la suma y a la resta

#### una operación es multiplicativa al multiplicar o dividir dos valores, el resto % calcula la división entera

#### Un incremento o decremento aumenta o decrementa en 1 el valor de una variable. Si el operador va antes de la variable ++variable, primero se realiza la operación y se modifica el valor de la variable. si el operador va después de la variable variable++, su valor se modifica al final.

#### Un operador relacional permite comparar dos valores, el resultado de la comparación es un calor boleano que undica si la relación es verdadera o falsa

#### Un operador de igualdad compara si dos valores son iguales

#### Un operador de asignación permite asignar un valor o el resultado de una operación a una variable

### Booleanos 
#### los operadores que se aplican a los operadores lógicos son negación, Y lógico O lógico.

La negación devuelve true si el operador es false 
El Y lógico devuelve false si uno de los operadores es false 
El O logico devuelve true di los dos operadores son true.

## Clases y Objetos
Los elementos abstractos de la programación orientada a objetos se denomina clases.
Un programa orientado a objetos es una colección de objetos que se crean, interaccionan entre si y dejan de existir cuando ya no son útiles durante la ejecución del programa.
Una clase es una representación abstracta de un conjunto de objetos que compartes los mismos atributos y comportamiento, una clase describe un tipo de objetos.
Un objeto es una instancia de una clase, tiene una identidad propia y un estado.
La identidad de un objeto se define por su identificador.
El estado de un objeto se define por el valor de sus atributos.
El comportamiento de un objeto queda determinado por el comportamiento la clase a la que pertenece.
Los objetos son unidades indivisibles y disponen de mecanismos de interacción llamados métodos.
Para identificar los elementos de una aplicación, debemos fijarnos en los sustantivos que utilizamos para describir los objetos reales del sistema.

### Preguntas para diseñar una aplicación orientada a objetos
¿Cuáles son los elementos tangibles de un sistema?
¿Cuáles son los atributos?
¿Cuales son sus responsabilidades?
¿Cómo se relacionan los elementos del sistema?
¿Qué objeto debe saber?
¿Que objeto debe hacer?

## Clases
Una clase se define por la palabra reservada class seguida del nombre de la clase. El nombre de la clase debe empezar en mayuscula.

<?public class Circulo 
  {
    int x;
    int y;
    int radio;
    //Se define con tres atributos, el radio y las coordenadas x,y. 
  }
?>

Una vez que se ha declarado la clase, se pueden crear objetos a partir de ella. A la creación de un objeto se le denomina instanciación. Un objeto es una instancia de una clase y el termino instancia y objeto se utilizan indistintamente.


Para crear objetos, basta con declarar una variable de alguno de los tipos de figuras geométricas.

Para crear el objeto y asignar un esácio de memoria es necesario realizar la instanciación con el operador new.

<?
  Circulo circulo1 = new Circulo();
  Circulo circulo2 = new Circulo();
?>

Los nombres circulo1 y circulo2 son las referencias válidas para utilizar ambos objetos.

### Los elementos de una clase

Una clase describe un tipo de objetos con caracteristicas comunes.

### Atributos
La información de un objeto se almacena en atributos. Los atributos pueden ser de tipos primitivos de Java o de tipo objeto.

<?
  public class Vehiculo
  {
    String matricula;
    String marca;
    String modelo;
    String color;
    double tarifa;
    boolean disponible;
  }
  // los atributos matricula, marca, modelo y color son cadenas de caracteres, tarifa es un número real y disponible es un valor lógico.
  
?>

### Métodos y constructores

Además de definir los atributos de un objeto, es necesario definir los métodos que determinan su comportamiento.

Toda clase debe definir un método especial denominado constructor para instanciar los objetos de la clase.

Para la clase vehículo, el identificador del método constructor es Vehículo. EL método constructor se ejecuta cada vez que se instancia ub objeto de la clase. Este método se utiliza para inicializar los atributos del objeto que se instancia.

Para diferenciar entre los atributos del objeto y los identificadores de los parametros del método constructor, se utiliza la palabra this. De esta forma, los parámetros del método pueden tener el mismo nombre que los atributos de la clase.
this.marca se refiere al atributo del objeto y marca al parámetro del método.

<?
  public class Vehiculo
  {
    String matricula;
    String marca;
    String modelo;
    String color;
    double tarifa;
    booblean disponible;

    // el método constructor de la clase Vehículo

    public Vehiculo(String matricula, String marca, String modelo, String color, double tarifa)
    {
      this.matricula = matricula;
      this.marca = marca;
      this.modelo = modelo;
      this.color = color;
      this.tarifa = tarifa;
      this.disponible = false;
    }
  }
?>

La instanciación de un objeto se realiza ejecutando el método constructor de la clase.



<?


  Vehículo vehículo1 = new Vehículo("4050 ABJ", "VW", "GTI", "Blanco", 100.0);
  Vehículo vehículo2 = new Vehículo("2345 JVM", "SEAT", "León", "Negro", 80.0);
?>

La instanciacion de un objeto consiste en asignar un espacio de memoria al que se hace referencia con el nombre del objeto.

Los identificadores de los objetos permiten acceder a los valores almacenados en cada objeto.
En los objetos vehiculo1, vehiculo2 almacenan valores diferentes y ocupan espacios de memoria distintos.

Para acceder a los atributos de los objetos de la clase vehículo se utilizan los métodos get y set.

Los métodos get se utilizan para consultar el estado del objeto, los métodos set para modificar su estado, puden ser modificados despues de crear el objeto. 
<?
public class Vehiculo
{
  String matricula;
  String marca;
  String modelo;
  String color;
  double tarifa;
  boolean disponible;


  public Vehícula(String matricula, String marca, String modelo, String color, double tarifa)
    {
      this.matricula = matricula;
      this.marca = marca;
      this.modelo = modelo;
      this.color = color;
      this.tarifa = tarifa;
      this.disponible = false;
    }
?>
    public String getMatricula()
    {
      return this.matricula;
    }

    public String getMarca()
    {
      return this.marca;
    }

    public String getModelo()
    {
      return this.modelo;
    }

    public String getColor()
    {
      return this.color;
    }

    public double getTarifa()
    {
      return this.tarifa;
    }

    public boolean getDisponible()
    {
      return this.disponible;
    }

    public void setTarifa(double tarifa)
    {
      this.tarifa = tarifa;
    }

    public void setDisponible(booblean disponible)
    {
      this.disponible = disponeble;
    }
}

### Representación de clases y objetos
Una clase se representa como un recuadro dividido en tres partes: el nombre de clase en la parte superior, la declaración de atributos y la declaracion de métodos.

El código java de una clase se divide en dos partes, la declaración y su definición. La declaración comienza por la palabra class y a continuación de indica el nombre de la clase; la definición de una clase queda delimitada por la llave de inicio y la llave de fin; en el bloque de definición de la clase se declaran los atributos de los objetos y los métodos que definen su comportamiento.

Los objetos se representan como cajas que indican el nombre del objeto, la clase a la que pertenecen y el estado del objeto.

En los objetos vehiculo1 y vehiculo2 son instancias de la clase vehículo, ambosa objetos comparten los mismos atributos, pero almacenan distintos valores; los valores almacenados en un objeto representan su estado.


```
Vehiculo vehiculo1 = new Vehiculo("4050 ABJ", "VW", "GTI", "Blanco",  100, true);
Vehiculo vehiculo2 = new Vehiculo("2345 JVM", "SEAT", "León", "Negro", 80.0, false);
```
El estado de un objeto puede cambiar durante la ejecución de un programa Java. En este ejemplo solo se podría modificar la tarifa del alquiler y la disponibilidad de los objetos de la clase Vehículo.

### Objetos
Un objeto se compone de atributos y métodos. Para cacceder a los elementos de un objeto se escribe el nombre del objeto, un punto y el nombre del elemento al que se desea acceder.

```
System.out.println("Matricula: " + vehiculo1.matricula);
System.out.println("Marca y modelo: " + vehiculo1.marca + " " + vehiculo1.modelo);
System.out.println("Color: " +  vehiculo.color);
Systeem.out.println("Tarifa: " + vehiculo1.tarifa);
```
