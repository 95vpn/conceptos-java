# Conceptos Java
## Variables y valores
Utiliza variables para almacenar valores. Una variable almacena un unico valor. Una varibla se define por un nombre, un tipo y un rango de valores que puede almacenar.
El nombre de una variable permite hacer referencia a ella

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
Para acceder aa un metodo, además de su nombre hay que indicar la lista de argumentos requeridos por el método. Cuando la declaración del método no incluye parametros no es necesario pasar argumentos.

```
Vehiculo vehiculo1 = new Vehiculo("4050 ABJ", "VW", "GTI", "Blanco", 100.0);
System.out.println("Matricula: " + vehiculo1.getMatriculaa());
System.out.println("Tarifa: " + vehiculo1.getTarifa());
vehiculo.setTarifa(90.0);
System.out.println("Matricula: " + vehiculo1.getMatricula());
System.out.println("Tarifa: " + vehiculo1.getTarifa());
```
Para mostrar la tarifa del onjeto vehiculo1 se puede acceder directamente al atributo tarifa del objeto o se puede ejecutar el método getTarifa(). Esto se debe a que los atributos de clase vehiculo son de acceso publico (se han declarado public en vez de privte). Los atributos de la clase se deben declarar private y para acceder a ellos se debe utilzar un metodo get.

### La referencia null

Una referencia a un objeto puede no tener asignada una instancia. Esto puede ocurrir porque se ha declarado el objeto pero no se ha instanciado, no se ha creado un objeto con el operador new. Existe un valor especial llamado null que indica que un objeto no se ha instanciado.

```
Vehiculo vehiculo2;
```

Miesntras no se instancie el objeto vehiculo2 su referencia vale null.
En un programa Java no se deben dejar referencias de objetos sin instanciar. Es necesario asegurarse que los objetos existen para evitar referencias null.

El objeto se puede instanciar en la misma declarión o mas adelante.

Vehiculo vehiculo2 = new Vehiculo("2345 JVM", "SEAT", "Leon", "Negro", 80.0);

Para saber su una referencia está instanciada o no, se puede comparar con null.

```
if (vehiculo2 == null)
{
  System.out.print("vehiculo2 es una referencia null");
}

if (vehiculo2 != null)
{
  System.out.print("vehiculo2 está instanciado");
}
```
### Referencias compartidas por varios objetos
Un objeto puede tener varias referencias o nombres. Un alias es otro nombre que se referecia al mismo objetoUn alias es una referencia más al mismo espacio de memoria del objeto original.

```
Vehiculo vehiculo1;
Vehiculo vehiculo3;

vehiculo1 = new Vehiculo("4050 ABJ", "VW", "GTI", "Blanco", 100.0);

// el objeto vehiculo1 se instancia, vehiculo3 solo está declarado y es una referencia null.

vehiculo3 = vehiculo1;

// vehiculo3 se convierte en alias de vehiculo1 y referencia el mismo espacio de memoria.

System.out.println("Matricula: " + vehiculo1.getMatricula());
System.out.println("Tarifa: " + vehiculo1.getTarifa());

// Muestra la información de la matricula y tarifa de vehiculo1

System.our.println(Matricula: " vehiculo3.getMatricula());
System.out.println(Tarifa: " vehiculo3.getTarifa());

// El alias de vehiculo1, muestra de nuevo la misma información.
```
Un alias se puede utilizar para mostrar el estado de un objeto y tambien para modificarlo.

```
  vehiculo3.setTarifa(90.0);
  // al modificar la tarifa de vehiculo3w en realidad se modifica la tarifa de vehiculo1
```

El objeto vehiculo3 es un alias de vehiculo1 y no tiene un espacio de memoria propio, utiliza el mismo espacio de memoria que vehiculo1, vehiculo1 comparte con sus alias el mismo espacio de memoria.

### Ciclo de vida de un objeto

El ciclo de vida de un objeto empieza por su declaracion, su instanciación y su uso en un programa java hasta que finalmente desaparece. Cuando el objeto deja de ser utilizado, Java libera la memoria asignada al objeto y la reutilza.

El entorno de ejecuacion de java decide cuando puede reutilizar la memopria de un objeto que ha dejado de ser util en un programa, a este proceso se le conoce como recolección de basura.

### Atributos

```
public class Vehiculo
{
  private String matricula;
  private String marca;
  private String modelo;
  private String color;
  private double tarifa = 0.0;
  private boolean disponible = false; 
}
```

Los atributos son los elementos que almacenan el estado de un objeto, se definen de la misma forma que las variables, pero dentro del bloque de la clase.

Existen dos tipos de atributos: los atributos de clase y los atributos de objeto.

Los atributos de clase existen siempre, son independientes de que existan objetos instanciados se declaranutilizando static.
Los atributos de objeto existen durante el ciclo de vida de un objeto, se crean cuando se instancia el objeto y se pueden utilizar mientras el objeto exista.

El tipo de acceso puede ser private, protected o public. Los atributos de acceso private solo se pueden acceder desde la propia clase que los define, miestras que los atributos public se pueden acceder libremente desde otras clases. Los atributos protected se pueden acceder desde la clase que los define y desde sus subclases.

La inicialización del objeto es opcional, se puede declarar un objeto que será instanciado despues o se puede instanciar al momento de su declaración.

En el ejemplo anterior cuando se instancia un objeto de tipo Vehiculo se inicializan los valores de los atributos tarifa y disponible.

La clase Vehiculo se debe declarar con atreibutos privados. Se utiliza el tipo de acceso private para que solo los metodos get y set de la clase pruedan acceder a ellos.

### Métodos
Los métodos son funciones que determinan el comportamiento de los objetos. Un objeto se comporta de una u otra forma dependiendo de los métodos de la clase a la que pertence. Todos los objetos de una misma clase tienen los mismos métodos y el mismo comportamiento.

Existen tres tipos de métodos: métodos de consulta, métodos modificadores y operaciones.

Los métodos de consulta sirven para extraer información de los objetos. los métodos modificadores sirven para modificar el valor de los atributos del objeto y las operaciones definen el comportamiento de un objeto.

Los métodos get son métodos de consulta, mientras que los métodos set son metodos modificadores

Los métodos get se utilizan para extraer el valor de un atributo del objeto y los métodos set para modificarlo.

```
  public double getTarifa()
  {
    return this.tarifa;
  }
  // el metodo get se declara public
  // es valor de retorno es double, igual que el atributo tarifa
  // la lista de parametros de un método get queda vacía
  // un método get utiliza return para devolver el valor del atributo. En este caso el identificador del atributo es tarifa y se refiere a él como this.tarifa.
```

```
  public class Vehiculo
  {
    private String matricula;
    private String marca;
    private String modelo;
    private String color;
    private double tarifa = 0.0;
    private boolean disponible = false;

    public String getAtributos()
    {
      return "Matricula: " + this.matricula + "Modelo: " + this.marca        + " " + this.modelo + " Color:  " + this.color + " Tarifa: " +         this.tarifa + " Disponible: " + this.disponible; 
    }  
  }
```

El método set se declara public y devuelve void. La lista de parametros de un método set incluye el tipo y el valor a modificar.

El método setTarifa(double tarifa) debe modificar el valoe de la tarifa del alquiler almacenado en el objeto. El cuerpo de una método set asigna al atributo del objeto el parametro de la declaración.

```
public void setAtributo(double tarifa)
{
  this.tarifa = tarifa;
}
// un método set se declara public.
// el valor de retorno es void.
// la lista de parametros de un método set incluye el tipo y el nombre del parametro
// un método sset modifica el valor de un atributo del objeto. En este caso el identificador del atributo es tarifa y se refiere a él como this.tarifa para asignarle el valor del parametro.
```
Un método de tipo operación es aquel que realiza un cáculo o modifica el estado de un objeto.Este tipo de métodospueden incluir una lista de parametros y puede devolver un valor o no. Si el método no devuelve un valor, se declara void. 

```
  public class Circulo
  {
    public static final double PI = 3.1415926536;
    private double radio;

    public Circulo(double radio)
    {
      this.radio = radio;
    }

    public double getRadio()
    {
      return this.radio;
    }

    public double calcularPerimetro()
    {
      return 2 * PI * this.radio;
    }

    public double calcularArea()
    {
      return PI * this.radio * this.radio; 
    }
  }
```

### Declaración de métodos
La declaración de un método indica si el método necesita o no argumentos.

Los metodos get ni tienen argumentos y devuelven un valor, los metodos set necesitan un argumento para identificar el valor del atributo que van a modificar.

El método setTarifa (double tarifa) tiene un argumento. El nombre de este paramtro es tarifa  y su tipo es double.

Un método se declara con la siguiente sintaxis:

```
tipo-de-acceso tipo nombre (lista de métodos);
public void setTarifa(double tarifa)

// La lista de parametros puede declarar una mas variables separadas por coma.
```

### Invocación de métodos
Un método se puede invocar dentro o fuera de la clase donde se ha declarado. 
Si el método se invoca dentro de la clase, basta con indicar su nombre.
Si el método se invoca fuera de la clase entonces se debe indicar el nombre del objeto y el nombre del método.

```
public class Vehiculo
{
  private String matricula;
  private String marca;
  private String modelo;
  private String color;
  private double tarifa = 0.0;
  private boolean disponible = false;

  public String getAtributos()
  {
    return "Matricula: " + getMatricula() + " " +
           " Modelo: " + getMarca() + " " + getModelo() +
           " Color: " + getColor() +
           " Tarifa: " + getTarifa() +
           " Disponible: " + getDisponible;
  }
}
```
Si el método getAtributos() se va a incvocar desde fuera de la clase, es necesario indicar el nombre del objeto y el nombre del método.

Si el método es estático, es necesario indicar el nombre de la clase y el nombre del método.

Cunado se invica al método, en la linea de código del programa donde se invoca al métod se calculan los valores de los argumentos.
Los parametros se inicializan con los valores de los argumentos.
Se ejecuta el bloque de codigo del método hasta que se alcanza el return o se llega al final del bloque.
Si el método devuelve un valor, se sustituye la invocación por el valor devuelto.
L a ejecución del programa continua en la siguiente instruccion donde se invocó al método.

### El método main()

Todo programa Java debe tener un clase con un método main(), este método se debe declarar public static void, es un método estático, público y no deuelve valor de retorno, los parametros String[] args se refieren a la linea de comandos de la aplicacion.

Cuando la máquina virtual de Java (JVM) ejecuta un programa Java, llama al método main. Este método que a su vez que a su vez ejecuta los métodos de la aplicación.

### Parámetros y argumentos
Los parámetros de un método definen la cantidad y el tipo de dato de los valores que recibe un método para su ejecución.
Los argumentos son los valores que se pasan a un método durante su invocación.
El método recibe los argumentos correspondientes a los parametros con los que ha sido declarado.
El método puede tener tantos métodos como sea necesario.
El método constructor de la clase  vehiculo tienen cinco parématros.

```
public Vehiculo(String matricula, String marca, String modelo, String color, double tarifa)
{
}
```
El método setTarifa de la clase Vehiculo tiene un parametro tarifa de tipo double.

```
public void setTarifa(double tarifa)
{
}
```
Durante la invocación del método es necesario que el número y el tipo de argumentos coincidan con el número y el tipo de parametros declarados en la cabecera del método.

```
Vehiculo vehiculo1 = new Vehiculo();
// es correcto invocar al método setTarifa(double tarifa) del objeto vehiculo1 pasando un argumento de tipo double.
vehiculo1.setTarifa(100.0);
vehiculo1.setTarifa(90.0);

// La invocación del método no es coorecta si se pasan dos argumentos de tipo double o un argumento de tipo String porque la cabecera del método solo incluye un parametro de tipo double.
vahiculo1.setTarifa(100.0, 20.0);
vehiculo1.setTarifa("100.0");
```

### Paso de parámetros
Cunado se invoca un método se hace una copia de los valores de los argumentos en los parámetros.
Esto quiere decir que si el método modifica el valor de un parámetro, numca se modifica el valor original del argumento.

Po ejemplo, el método recibirVehiculoAlquilado(Vehiculo v) recive el prametro v de tipo vehiculo. Si el método modifica el estado de objeto v, en realidad modifica el estado del objeto original vehiculo1 que recibe como argumento.

```
public void recibirVehiculoAlquilado(Vehiculo v) {
  v.setDisponible(true)
}
```
```
public static void main(String args())
{
  Vehiculo vehiculo1 = new Vehiculo("4050 ABJ",
                                     "VW",
                                      "GTI",
                                      "Blanco",
                                       100.0);

System.out.println("El objeto vehiculo1 está disponible: " + vehiculo1.getDispoible());

recibirVehiculoAlquilado (vehiculo1);

System.out.println("El objeto vehiculo1 está disponible: "+ vehiculo1.getDisponbile());
}

// Al instanciar el objeto, el método construtor asigna el valor false al atributo disponible, pero al invocar el método recibirVehiculoAlquilado(Vehiculo v)  con el objeto vehiculo1, se modifica su disponibilidad.
```

### El valor de retorno
Un método puede devolver un valor.
Los métodos que no devuelven un valor se declaran void.
Los métodos que devuelven un valor indican el tipo que devuelven: int, double, char, String o un tipo de objeto.

Los métodos set devuelven void, mientras que los métodos get devuelven el tipo correspondiente al atributo al que hacen referencia
Los métodos set devuelven void porque son metodos modificadores, realizan operaciones y cálculos para modificar el estado de los objetos.
Los métodos get son de consulta y devuelven los valores almacenados en los atributos de un objeto.

```
public void setTarifa(doble tarifa)
{
  this.tarifa = tarifa;
}
// el método setTarifa(double tarifa) recibe el parámetro tarifa de tipo double y devuelve void.

public double getTarifa()
{
  return this.tarifa;
}
El método getTarifa() devuelve el tipo double correspondiente al atributo tarifa, el valor del atributo se devuelve con return.
```

### Las variable locales de un método
Las variables locales de un mpetodo son útiles para almacenar valores temporales cuyo tiempo de vida coincide con el método.

El método getAtributos() no utiliza variables locales. El valor re retorno se calcula al momento de hacer return.

```
public String getAtributos()
{
  return = "Matricula: " + getMatricula() + " " +
         " Modelo: " + getMarca() + " " + getModelo() +
         " Color: " + getColor() +
         " Tarifa: " + getTarifa() +
         " Disponible: " + getDisponible();
}

//Este atributo se podría codificar declarando la variable local atributos de tipo String para almacenar el valor de retorno. Esta variable se declara dentro del método.

public String getAtributos()
{
  String atributos
  atributos = "Matrivula: " + getMatricula() + " " +
              "Modelo: " + getMarca() + " " + getModelo() +
              " Color: " + getColor() +
              " Rarifa: " + getTarifa() +
              " Disponible: " + getDisponible();

  return atributos;
}

//Los dos métodos son equivalentes, pero el primero es más claro porque evita el uso de una variable local que no es necesaria.
```

### Sobrecarga de métodos
La sobrecarga de métodos es útil para que el mismo método opere con parametros de distinto tipo o que un mismo métod reciba una lista de parametros diferente.
Puede haber dos métodos con el mismo nombre que realicen don funciones distintas.
La diferencia entre los métodos sobrecargados está en su declaración.

```
public String getAtributos()
{
  return "Matricula: " + getMatricula() + " " +
         " Modelo: " + getMarca() + " " + getModelo() +
         " Color: " + getColor() +
         " Tarifa: " + getTarifa() +
         " Disponible: " + getDisponible();
}

public String getAtributos(double porcentajeDescuento)
{
  return "Matricula: " + getMatricula() + " " +
         " Modelo: " + getMarca() + " " + getModelo() +
         " Color: " + getColor() +
         " Tarifa: " + (100.0 - porcentajeDescuento/100*tarifa) +
         " Disponible: " + getDisponible();
}

// el método getAtributos() se puede sobrecargar para devolver los atributos de un vehiculo y para mostrar la tarifa reducida al aplicar el porcentaje de descuento recibido como argumento.
```
Los dos métodos se diferencian por la declaración de sus parametros y ambos métodos realizan operaciones distintas.

### Constructores

Para crear un objeto se utiliza el operador new.
Si no se ha definido un método contructor para la clase, entonces el objeto se instancia indicando el nombre de la clase y a continuación un parentesis abierto y otro cerrado.
Si ya se ha definido un método constructor, entonces no es posible instanciar un objeto utilizando un contructor por defecto.
Cuando se invoca al constructor por defectose asigna un espacio de memoria para el nuevo objeto y sus atributos se inicializan a los valores por defecto correspondientes a su tipo. Los numeros enteros se inicializan a cero, los números reales a 0.0, los valores lógicos a false, los caracteres a \u0000 y las referencias a null.

En una clase se pueden definir uno o más métodos constructores para inicializar los atributos de un objeto con valores distintos de los valores por defecto de Java.
Para instanciar un objeto es necesario indicar los valores iniciales de sus atributos cuando se ejecuta el método contructor.
En la clase Vehiculo se ha definido un método constructor que inicializa los atributos matricula, marca, modelo, color y tarifa.

```
public class Vehiculo
{
  String matricula;
  String marca;
  String modelo;
  String color;
  double tarifa;
  boolean disponible;

  // El método constructor de la clase vehiculo
  public Vehiculo(String matricula,
                  String marca,
                  String modelo,
                  String color,
                  double tarifa)
  {
    this.matricula = matricula;
    this.marca = marca;
    this.modelo = modelo;
    this.color = color;
    this.tarifa = tarifa;
    this.disponible = false;
  }
}

// this.matricula se refiere al atributo del objeto.
// matricula se refiere al parametro del método.


```

A veces es necesario contar con diferentes métodos constructores con distintos parametros. 
Se podría crear un objeto de la clase vehículo sin conocer la tarifa de alquiler. El método constructor debería inicializar la tarifa a cero.

```
public Vehiculo(String matricula,
                String marca,
                String modelo,
                String color)
{
  this.matricula = matricula;
  this.marca = marca;
  thiis.modelo = modelo;
  this.color = color;
  this.tarifa = 0.0;
  this.disponible = false;
}
```

Cuando se definen dos o más métodos constructores para la clase vehículo, se dice que le método constructor de la clase está sobrecargado.
La diferencia entre los dos métodos es que el primero recibe cinco parametros e inicializa la tarifa a cero, el segundo recibe cinco parametros, uno de ellos para inicializar la tarifa del vehículo.

```
public Vehiculo(String matricula,
                String marca,
                String modelo,
                String color)
{
}

public Vehiculo(String matricula,
                String marca,
                String modelo,
                String color,
                double tarifa)
{
}
```

```
public class Vehiculo
{
  private String matricula;
  private String marca;
  private String modelo;
  private String color;
  private double tarifa;
  private boolean disponible;

  public Vehiculo(String matricula,
                  String marca,
                  String modelo,
                  String color)
  {
    this.matricula = matricula;
    this.marca = marca;
    this.modelo = modelo;
    this.color = color;
    this.tarifa = 0.0;
    this.disponible = false;
    
  }

  public Vehiculo(String matricula,
                  String marca,
                  String modelo,
                  String color,
                  double tarifa)
  {
    this.matricula = matricula;
    this.marca = marca;
    this.modelo = modelo;
    this.color = color;
    this.tarifa = tarifa;
    this.disponible = false;
  }
}
```

Java diferencia los métodos sobrecargados por el número y el tipo de los argumentos que tiene el método. 
Cuando se invoca el método contructor de la clase con el operador new, Java selecciona el método que debe ejecutar por el número y el tipo de argumentos que recibe.

```
Vehiculo vehiculo1 = new Vehiculo("4050 ABJ",
                                  "VW",
                                  "GTI",
                                   "Blanco",
                                   100.0);

Vehiculo vehiculo2 = new Vehiculo("2345 JVM",
                                  "SEAT",
                                   "León",
                                   "Negro");
```
## Extensión de clases

### Composición

La composición consiste en crear una clase nueva agrupando objetos de clases que ya existen. 
Una composición agrupa uno o más objetos para construir una clase, de manera que las instancias de esta nueva clase contienen uno o mas objetos de otras clases.
Normalmente los objetos contenidos se declaran con acceso private y se inicializan en el constructor de la clase.

```
public class Vehiculo
{
  private String matricula;
  private String marca;
  private String modelo;
  private String color;
  private double tarifa;
  private boolean disponible;

  public Vehiculo(String matricula,
                  String marca,
                  String modelo,
                  String color,
                  double tarifa)
  {
    this.matricula = matricula;
    this.matricula = marca;
    this.modelo = modelo;
    this.color = color;
    this.tarifa = tarifa;
    this.disponible = falso;  
  } 
}
```

Para hacer una composición utilizando objetos de una clase diferente de String, lo primero es definir una nueva clase. La clase Cliente formará junto con Vehiculo la clase VehiculoAlquilado utilizando la composición.

```
public class Cliente
{
  private String nif;
  private String nombre;
  private String apellido:

  public Cliente(String nif,
                 String nombre,
                 String appellidos)
  {
    this.nif = nif;
    this.nombre = nombre;
    this.apellido = apellido;
  }
}


```

Ahora se define una composición que declara un objeto de la clase Vehiculo y un objeto de la clase cliente.
La nueva clase VehiculoAlquilado relaciona una instancia de la clase Vehiculo con una instancia de la clase cliente y crea objetos que almacenan relaciones entre clientes y vehículos de alquiler.

Esto significa que para instanciar un objeto de la clase VehiculoAlquilado es necesario tener referencias a objetos de las clases Cliente y Vehiculo.


```
public class VehiculoAlquilado
{
  private Cliente cliente;
  private Vehiculo vehiculo;
  private int diaAlquiler;
  private int mesAlquiler;
  private int añoAlquiler;
  private int totalDiasAlquiler;

  public VehiculoAlquilado(Cliente cliente,
                           Vehiculo vehiculo,
                           int diasAlquiler,
                           int mesAlquiler,
                           int añoAlquiler,
                           int totalDiasAlquiler)
  {
    this.cliente = cliente;
    this.vehiculo = vehiculo;
    this.diaAlquiler = diaAlquiler;
    this.mesAlquiler = mesAlquiler;
    this.añoAlquiler = añoAlquiler;
    this.totalDiasAlquiler = totalDiasAlquiler;
  }

  public Cliente getCliente()
  {
    return this.Cliente;
  }

  public Vehiculo getVehiculo()
  {
    return this.vehiculo;
  }
}
```

La clase VehiculoAlqulado contiene un objeto de la clase Cliente, un objeto de la clase Vehiculo y atributos de tipo int para almacenar el día, el mes y el año de la fecha del alquler del vehiculo y el total de días de alquiler.
La clase contenedora es VehiculoAlquilado y las clases contenidas son Cliente y Vehiculo.

```
public static void main(String args[])
{
  Vehiculo vehiculo1 = new Vehiculo("4050 ABJ",
                                    "VW",
                                    "GTI",
                                    "Blanco",
                                    100.0):

  Vehiculo vehiculo2 = new Vehiculo("2145 JVM",
                                    "SEAT",
                                    "León",
                                    "Negro",
                                    80.0);    

  Cliente cliente1 = new Cliente("30435624x", "Juan", "Perez");

  VehiculoAlquilado alquiler1 = new VehiculoAlquilado(cliente1,
                                                    vehiculo1,
                                                    11,
                                                    11,
                                                    2011,
                                                    2);
}


```

En una relación de composición, hay atributos de la clase contenedora que son objetos que pertenecen a la clase contenida.
Un objeto de la clase contenedora puede acceder a los métodos públicos de las clases contenidas.
En la declaración de la clase VehiculoAlquilado se han definido dos métodos get para los atributos de tipo objeto.
El método getCliente() devuelve un objeto de tipo Cliente y el método getVehiculo() devuelve un objeto de tipo Vehiculo.


El objeto alquiler1 de la clase VehiculoAlquilado puede acceder a los métodos públicos de su propia clase y de las clases Cliente y Vehiculo.
Un objeto de la clase VehiculoAlquilado puede ejecutar métodos get para mostrar la información de los objetos que contiene.

```
alquiler1.getCliente().getNIF();
alquiler1.getVehiculo().getMatricula();
```

## Herencia

La herencia es la capacidad que tienen los lenguajes orientados a objetos para extender clases. 
Esto produce una nueva clase que hereda el comportamiento y los atributos de la clase que ha sido extendida.
La clase original se denomina clase base o superclase, la nueva clase se denomina clase derivada o subclase.

### Extensión de clases

La capacidad para extender clases se llama herencia porque la nueva clase hereda todos los atributos y los métodos de la superclase a la que extiende.
Una subclase es una especialización de la superclase.
Normalmente una subclase añade nuevos atributos y métodos que le dan un comportamiento diferente a l de la superclase.
La herencia es un mecanismo muy importante porque permite la reutilización de código.

Suponga que se desea diseñar una aplicación para gestionar una empresa de alquiler de vehículos de tipo turismo, deportivo y furgonetas.
La clase vehículo define los atributos y los métodos de todos los vehículos de la empresa de alquiler.
Esto no es suficiente porque hay distintos tipos de vehiculos, de manera que es necesario definir subclases para cada tipo de vehiculo: turismo, deportivo y furgoneta.
Todas las subclases son vehículos, un turismo, un deportivo y una furgoneta, pero cada uno de ellos tiene caracteristicas propias que le hacen diferente al resto. 
Para un turismo interesa saber el número de puertas y el tipo de cambio de marchas.
Para un turismo interesa saber su cilindrada.
Para una furgoneta su capacidad de carga en kilos y el volumen en metros cúbicos.
 
La extensión de una clase tiene la siguiente sintaxis
```
public class nombre-subclase extends nombre-superclase
{
}
```
Las subclases Turismo, Deportivo y Furgoneta son especializaciones de la clase Vehiculo.
En una relación de herencia, las subclases heredan los atributos y los métodos de la superclase.
En la declaración de las subclases se indica la clase a la que extienden, en este caso Vehículo.

```
public class Turismo extends Vehiculo
{
}

public class Deportivo extends Vehiculo
{
}

public class Furgoneta extends Vehiculo
{
}
```

```
public class Vehiculo
{
  private String matricula;
  private String marca;
  private String modelo;
  private String color;
  private String tarifa = 0.0;
  private boolean disponible;

  public Vehiculo(String matricula,
                  String marca,
                  String modelo,
                  String color,
                  double tarifa)
  {
    this.matricula = matricula;
    this.marca = marca;
    this.modelo = modelo;
    this.color = color;
    this.tarifa = tarrifa;
    this.disponible = false;
  }

  public String getAtributos()
  {
    return "Matricula: " + this.matricula +
           " Modelo: " + this.marca + " " + this.modelo +
           " Color: " + this.color +
           " Tarifa: " + this.tarifa +
           " Disponible: " + this.disponible;
  }

}
```

```
public class Turismo extends Vehiculo
{
  private int puertas;
  private boolean marchaAutomatica;

  public Turismo(String matricula,
                 String marca,
                 String modelo,
                 String color,
                 double tarifa,
                 int puertas,
                 boolean marchaAutomatica)
  {
    super(matricula, marca, modelo, color, tarifa);
    this.puertas = puertas;
    this.marchaAutomatica = marchaAutomatica;
  }

  public int getPuertas()
  {
    return this.puertas;
  }

  public boolean getMarchaAutomatica()
  {
    return this.marchaAutomatica;
  }

  public String getAtributos()
  {
    return super.getAtributos() +
           " Puertas: " + this.puertas +
           " Marcha Automática: " + this.marchaAutomatica;
  }
}
```

```
public class Deportivo extends Vehiculo
{
  private int cilindrada;

  public Deportivo(String matricula,
                   String modelo,
                   String modelo,
                   String color,
                   double tarifa
                   int cilidrada)
  {
    super(matricula, marca, modelo, color, tarifa));
    this.cilindrada = cilindrada
  }

  public String getAtributos()
  {
    return super.getAtributos() +
           " Cilindrada (cm3) : " + this.cilindrada;
  }
}
```

```
public class Furgoneta extends Vehiculo
{
  private int carga;
  private int volumen;

  public Furgoneta(String matricula,
                   String marca,
                   String modelo,
                   String color,
                   double tarifa,
                   int carga,
                   int volumen;)
  {
    super (matricula, marca, modelo, color, tarifa);
    this.carga;
    this.volumen

  }

  public int getCarga()
  {
    return this.carga
  }

  public int getVolumen()
  {
    return this.volumen
  }

  public String getAtributos()
  {
    return super.getAtributos()
           + " Carga(kg): " + this.carga +
             " Volumen (m3): " + this.volumen;
  }
```
### Polimorfismo
Las clases Turismo, Deportivo y Furgoneta extienden a la clase vehículo.
Estas clases heredan los atributos del Vehículo y cada clase añade atributos y métodos propios.
La clase Turismo añade los atributos puertas, marchaAutomática y los métodos getPuertas() y getMarchaAutomatica().
La clase Deportivo añade el atributo cilindrada y el método getCilindrada().
La clase Furgoneta añade atributos carga, volumen y los métodos getCarga y getVolumen().
Además cada subclase declara un método getAtributos(). Este método también se ha declarado en la superclase.
Esto significa que el método getAtributos() de las subclases sobreescribe al método de la superclase.
Dependiendo del tipo de objeto que invoque el método, se ejecuta el método correspondiente a la clase del objeto. Por ejemplo, si el método es invocado por un objeto de la clase Turismo, entonces se ejecuta el código del método getAtributos() de la clase Turismo.
Los métodos getAtributos() de las subclases modifican el comportamiento del método getAtributos() de la superclase.
En cada método se invoca a super.getAtributos() para que muestre los atributos de un vehículo y después se muestran los atributos propios de la subclase.
Los métodos getAtributos() de las subclases sobreescriben el método getAtributos() de la superclase.
Esta caracteristica de los lenguajes de programación orientados a objetos se conoce como polimorfismo.
Un objeto de las subclases Turismo, Deportivo o Furgoneta puede invocar los métodos getMatricula(), getMarca(), getModelo(), getColor(), getTarifa(), getDisponible(), setTarifa() y setDisponible() de la superclase Vehiculo().

```
Vehiculo miVehiculo = new Vehiculo("4050 ABJ",
                                   "VM", "GTI",
                                    "Blanco",
                                     100.0);

Turismo miTurismo = new Turismo("4060 TUR",
                                "Skoda", "Fabia",
                                 "Blanco",
                                 90.0,
                                 2,
                                 false);

Deportivo miDeportivo = new Deportivo("4070 DEF",
                                       "Ford", "Mustang",
                                        "Rojo",
                                        150.0,
                                        2000);

Furgoneta miFurgoneta = new Furgoneta("4080 FUR",
                                      "Fiat", "Ducato",
                                      "Azul",
                                      80.0,
                                      1200,
                                      8);
```

### Compatibilidad de tipos
En una relación de tipo herencia, un objeto de la superclase puede almacenar un objeto de cualquiera de sus subclases.
Un objeto de la clase vehículo puede almacenar un objeto de la clase Turismo, Deportivo o Furgoneta.
Cualquier referencia de la clase Vehiculo puede contener una instancia de la clase Vehiculo o bien una instancia de las subclases Turismo, Deportivo o Furgoneta.
La base o superclase es compatible con los tipos que derivan de ella, pero no al revés. Una referencia de la clase Turismosolo puede almacenar una istancia de Turismo, nunca una instancia de la supercla Vehículo.

#### Conversión ascendente de tipos

Cuando un objeto se asigna una referencia distinta de la clase a la que pertenece, se hace una conversión de tipos. Java permite asignar un objeto a una referencia de la clase base.
Si un objeto de la clase Turismo se asigna una referencia de la clase Vehiculo, se hace uan conversión ascendente de tipos, denominada upcasting. La conversión ascendente de tipos siempre se puede realizar.

```
Vehiculo miVehiculo = new Turismo("5090 TUR",
                                  "Skoda", "Fabia",
                                   "Negro",
                                    90.0,
                                    2,
                                    true);
System.out.println("Vehiculo " + miVehiculo.getAtributos);

//Se crea un objeto de la clase Vehiculo utilizando el contructor de la clase derivada Turismo.

//Dado que la instancia es de tipo Turismo, al invocar al método, al invocar al método getAtributos() muestra los atributos de un Turismo.
```

### Conversión descendente de tipo
Si una instancia de la clase base Vehiculo almacena una referencia de un objeto de una de sus clases derivadas, entonces es posible hacer una conversi´n descendente de tipos, denominada downcasting.
El objeto miVehiculo de la clase base Vehiculo almacena una referencia a un objeto de la clase derivada turismo. En este caso, está permitido hacer una conversión descendente de tipos. 
La conversión se debe hacer de forma explicita, indicando el nombre de la clase a la que se desea covertir.

```
Vehiculo miVehiculo = new Turismo("4090 TUR",
                                   "sKODA", "Fabia",
                                   "Negro",
                                    90.0,
                                    2,
                                    true);

Turismo miNuevoTurismo = (Turismo) miVehiculo;

```
El objeto de la clase Vehiculo almacena un objeto de la clase derivada Turismo.
El objeto miVehiculo se convierte de forma explicita a un objeto de tipo Turismo utilizando el casting (Turismo).
Solo así es posible realizar la asignación a una referencia que ha sido declarada de tipo Turismo
Es importante señalar que el downcasting no siempre es legal y puede producir un error durante la ejecución del programa Java.

## Jerarquía de herencia
Cualquier clase de Java puede ser utilizada como una clase base para extender sus atributos y comportamiento.
La clase derivada que se obtenga, puede a su vez ser extendida de nuevo.
La relación de herencia es transitiva y define una jerarquía.
En java todas las clases está relacionadas en una única jerarquía de herencia puesto que toda clase hereda explicitamente de otra o bien implicitamente de object.
La clase Vehiculo no extiende explicitamenteotra clase, por lo que se puede decir que es una extensión de la clase object de Java.
Esto quiere decir que cualquier objeto de un programa Java se puede ver como una instancia de la clase Object.

# Ampliación de clases

## Elementos de clase (Static)
Los atributos y métodos de una clase precedidos con la palabra static se denominan elementos de clase.
Solo existe un elemento estático para todos los objetos de una misma clase.
Esto significa que los elementos de clase son compartidos por todas las instancias de la clase.
Cuando se modifica un elemento de clase todas las instancias de la clase ven dicha modificación.
Los atributos de clase deben tener un valor inicial aunque no exista ninguna minstancia en la clase.
Si el elemento de clase es un valor constante, entonces se debe indicar la palabra final.

```
public class Circulo
{
  public static final double PI = 3.1415926536;
  private double radio;

  public Circulo(double radio)
  {
    this.radio = radio;
  }

  public double getRadio()
  {
    return this.radio;
  }

  public double calcularPerimetro()
  {
    return 2 * PI * this.radio;
  }

  public double calcularArea()
  {
    return PI * this.radio * this.radio;
  }
}
```

```
public class PerimetroAreaCircunferencia
{
  public static void main (string[] args)
  {
    System.out.printtn("El valor de PI es " + Circulo.PI);
    Circulo miCirculo = new Circulo(10.0);

    System.out.println("El radio del circulo es " +
                         miCirculo.getRadio() +
                         "su perimetro es " +
                          miCirculo.calcularPerimetro() +
                         " y su area es " + miCirculo.calcularArea());
  }
}
```

## Derechos de acceso

El estado de un objeto está dado por el conjunto de valores de sus atributos.
Una modificación arbitraria, intencionada o no, puede provocar inconsistencias  o comportamientos no deseados de un objeto.
Por este motivo se debe controlar el acceso a los atributos de los objetos.
Java proporciona mecanismos de acceso a los elementos de una clase de forma que se puede determinar el derecho de acceso a cada elemento según las necesidades de los objetos.

### Acceso privado 
Los elementos privados solo se pueden utilizar dentro de la clase que los define. Para indicar el acceso privado se utiliza private.

### Acceso de paquete
El acceso a estos componentes es libre dentro del paquete en que se define la clase. El acceso de paquete no se indica expresamente.

### Acceso protegido 
Los elementos protegidos solo se puede utilizar dentro de la clase que los define, aquellas clases que la extiendan y cualquier clase definida en el mismo paquete. Para indicar el acceso protegido se utiliza protected.

### Acceso publico
Los elementos públicos se pueden utilizar libremente. Para indicar expresamente el acceso público se utiliza public.
No es necesario, el acceso publico se utiliza como valor por defecto mientras no se indique private o protected.

Para limitar el acceso a los atributos de la clase Vehiculo se utiliza private.
Al utilizar este tipo de acceso, solo los métodos get y set de la clase pueden acceder a ellos.

```
public class Vehículo
{
  private String matricula;
  private String marca;
  private String midelo;
  private String color;
  private double tarifa;
  private boolean disponible;
}
```
Con esta declaración, todos los atributos de la clase tienen acceso private, y el diagrama de clases muestra un signo menos delante del udentificador del atributo para indicar que es privado.


La clase vehículo con sus métodos get y set.

```
public class Vehículo
{
  private String matricula;
  private String marca;
  private String modelo;
  private String color;
  private double tarifa;
  private boolean disponible;

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
    return this.disponibke;
  }

  public void setTarifa(double   tarifa)
  {
    this.tarifa = tarifa;
  }

  public void set.Disponible(boolean disponible)
  {
    this.disponible = disponible;
  }
}
```

la clase Vehiculo define métodos get para los atributos matricula, marca, modelo, color, tarifa y disponible.
Los métodos set solo son aplicables a los atributos tarifa y disponible porque se considera que el resto de atributos de la clase no pueden midificar su valor una vez que se ha creado el objeto.

La responsabilidad de modificar los atributos de los objetos es de los métodos set.
Estos métodos deben verificar que el valor que se desea asignar a un atributo es valido y cumple con las condiciones del diseño de la clase.

### Paquetes
Los paquetes son grupos de clases, interfaces y otros paquetes que están relacionados entre sí. Los paquetes aportan una forma de encapsulación a un nivel de un nivel superior al de las clases.
Permiten unificar un conjunto de clases e interfaces que se relacionan funcionalmente.
El oaquete java engliba un conjunto de paquetes con utilidades de soporte para desarrollo y ejecución de aplicaciones como util o lang.


Un paquete se declara con la siguiente sintaxis.

```
package nombre-del-paquete 
```

Se podría definir el paquete vehiculos para la aplicación de la empresa de alquiler de vehículos.

```
package vehiculos;
```

### Uso

Para utilizar componentes que están en otro paquete diferente se debe añadir la declaración de importación

El uso de un paquete se declara con la sguiente sintaxis:

```
import nombre-del-paquete;
```

Se puede importar un paquete entero o un componente del paquete.
Si se declara importar las librerías para cálculos matemáticos de Java.

```
import java.math.*;
```

Si solo se desea importar una librería, entonces se debe indicar el nombre del paquete y del componente.
Se importa el componente Calendar de la librería de utilidades de Java.

```
import java.util.Calendar;
```

La declaración de importación se incluye antes de la declaración de la clase.

Se incluye el componente Calendar de util y se utiliza el método getInstance() para obtener el día, el mes y el año de la fecha actual.

```
import java.util.Calendar;

public class CalcularFechaHoy
{
  public static void main (String[] args)
  {
    int edad, diaHoy, mesHoy, añoHoy;
    diaHoy = Calendar.getInstance().get(Calendar.DAY_OF_MONDAY);
    mesHoy = Calendar.getInstance().get(Calendar.MONTH) + 1;
    añoHoy = Calendar.getInstance().get(Calendar.YEAR);

    System.out.println("La fecha de hoy es " + diaHoy + "/" +
                        mesHoy + "/" +
                        añoHoy);

  }
}
```
### Nombres
El nombre de un paquete debe ser representativo de su contenido.
El nombre puede contener la declaración de subpaquete.
Se puede incluir el nombre de la empresa que ha desarrollado el paquete para facilitar su identificación.

```
package nombre-de-la-empresa.nombre-del-paquete;
```
El paquete vehiculos de la empresa "Mi Empresa" se podría identificar:

```
package miEmpresa.vehiculos;
```

## Clases predefinidas

Una caracteristica importante de Java es que apota gran cantidad de clases predefinidas.
Estas clases están especializadas en comunicaciones, web, interfaz de usuario, matemáticas y muchas otras aplicaciones.

### Las clases asociadas a los tipos primitivos

Los tipos predefinidos boolean, char, int, float y double son tipos dimples, no son clases.
Para facilitar la programación en Java se han creado clases asociadas  a los tipos predefinidos.
Estas  clases proporcionan métodos útilies  para convertir cadenas de texto a otros tipos, para imprimir los números con diversos formatos y para describir los tipos simples.
Estas clases generan automaticamente una instancia cuando se usan tipos simples en contextosen los que se espera un objeto.
Pueden utilizarce en expreciones donde se espera un tipo simple. 

| Clase  | Tipo ptimitivo asociado |
| ------------- |:-------------:|
| Boolean      | boolean     |
| Character      | Char     |
| Integer      | int     |
| Long      | long     |
| Float      | float     |
| Double      | double     |

Estas clases tienen los siguientes métodos:

#### Método constructor a partir de un valor de tipo simple
Character letra = new Character('A');
Integer numero = new Integer(10);

#### Método constructor que recibe una cadena de texto y la traduce al tipo simple
Integer numero = new Integer("120");

#### Método toString() que transforma el valor almacenado en una cadena
Integer numero = new Integer("100");
System.out.println(numero.toString());

#### Método equals() para comparar el valor almacenado
Integer numero1 = new Integer("100");
Integer numero2 = new Integer("101");
System.out.println(numero2.equals(numero1));

### La clase Math
La clase Math contiene constantes y metodos de uso comun en matemáticas. Todas las operaciones que se realizan  en esta clase utilizan el tipo dobule.
Contiene la constante pi (Math.PI) y el número de euler (Math.E).
En las funciones trigonométricas, los angulos se expresan en radianes y los métodos devuelven valores de tipo double.
La clase Math incluye funciones como potenciación, redondeo, cuadrado, raíz cuadrada y mucho más.

### La clase String
La clase String se usa para manejar cadenas de caracteres de cualquier longitud. 
Un objeto String se puede crear a parttir de una secuencia de caracteres delimitados por comillas dobles.

```
String nombre = "Juan";
String apellidos = "Gonzalez Lopez";
```

Un objeto String tambien se puede crear utilizando el contructor de la clase.

```
String mensaje = new String("Hola Mundo");
```

La clase String tiene un tratamiento particular en Java.
Además de la construcción de objetos a partir de literales entre comillas, se pueden aplicar los operadores + y += para concatenar objetos tipo String.

```
String hola = new String("Hola");
String espacio = new String(" ");
String mundo = new String("Mundo");
String holaMundo = hola + espacio + mundo;
System.out.println(holaMundo); 
```

Para conocer la longitud de un objeto String se utiliza el método length(). 
El objeto holaMundo tiene una longitud de 10 caracteres.

```
System.out.println("El texto " + holaMundo + " tiene " + holaMundo.length() + " letras");
```
Para comparar cada letra de dos objetos de tipo String se utiliza el método contentEquals().

```
String nombre1 = "Angel";
String nombre2 = "Carlos";
System.out.println(nombre1.contentEquals(nombre2));
```

El método String.valueOf() devuelve una cadena correspondiente al valor de su parámetro. 
Este método está sobrecargado y acepta tipos boolean, char, int, long, float y double.

```
String año = String.ValueOf(2011);
```

El método charAt(int posicion) de la clase String  devuelve el carácter almacenado en la posición indicada  de una cadena de caracteres.
El primer caracter de una cadena se almacena en la posición cero y el último en la posición correspondiente a la longitud de la cadena -1.

```
String holaMundo = "Hola Mundo";
System.out.println("La primera letra de 'Hola Mundo'" + " es " + holaMundo.charAt(0));
```

## Estructra de control

El cuerpo de un programa se compone de un conjunto de sentencias que especifican las acciones que se realizan durante su ejecucuón. 
Dentro de cualquier programa, se escriben sentencias que definen la secuencia de acciones a ejecutar.
Estas sentencias incluyen acciones de clculo, entrada y salida de datos, almacenamiento de datos, etc.
Las sentencias se ejecutan una a una  en el orden en que han sido escritas.
Se denomina flujo de un programa al orden de ejecución de las sentencias que forman parte del cuerpo de un programa.
Las estructuras de control son una caracteristica básica de los lenguajes que se utiliza para modificar el flujo del programa.

Hay casos en los que el flujo del programa debe ajustar determinadas instrucciones solo cuando se cumple una condición. 
En otras ocaciones, debe repetir un conjunto de sentencias un número determinado de veces.
Las estructuras de control permiten condicionar el flujo de ejecución dependiendo del estado de la variable de un programa.

Las estructuras de control básicas se pueden clasificar  en estructuras de selección, de repetición y de salto.

Selección. Permiten decidir si se ejecuta un bloque de sentencias o no.
Repetición. Permiten ejecutar un bloque de sentencias.
Salto. Permiten dar un salto y continuar la ejecución de un programa en un punto distinto de la siguiente sentencia en el orden natural de ejecución.

Las estructuras de control se pueden combinar sin ningún tipo de limitación. 
Cualquier nuevo bloque de sentencias puee incluir  estructuras de control a continuación de otras.
Cuando se incluyen varias estructuras seguidas unas de otras, se dice que son estructuras de control apiladas.

Por otras parte, dentro de un bloque de una estructura de control se puede incluir una estructura de control y dentro de este nuevo bloque se puede incluir otra estructura de control y asi sucesivamente.
Cuando una estructura  contiene otra estructura, se dice que son estructura de control anidadas.

Es importante destacar que no existe limitación  en cuanto al número  de estructuras de control apiladas o anidadas que se pueden utilizar en un programa Java.
La única restricción a tene en cuenta es la claridad y la legibilidad del programa.

### Estructura de Selección
Las estructura de selección permiten modificar el flujo de un programa.
La decisión de ejecutar un bloque de sentencias queda condicionada por el valor de una expresión lógica definida utilizandp variables del programa.

#### Estructura if
La estructura if se denomina estructura de selección única porque ejecuta un bloque de sentencias solo cuando se cumple la condición del if.
Si la condición es verdadera se ejecuta el bloque de sentencias.
Si la condición es falsa, el flujo del programa continua en la sentencia inmediatamente posterior al if.

La sentencia if tiene la siguiente sintaxis:

```
if (condicion)
{
  bloque de sentencias
}
```
La condición es una expresión que evalúa un valor logico, por lo que el resultado solo puede ser true o false.
La condición siempre se escribe entre parentesis.
La selección se produce sobre el bloque de sentencias delimitado por llaves.
Si el bloque de sentencias solo tienen una sentencia, entonces se puede escribir sin llaves, 
```
if (condicion)
  sentencia;
```

Cuando el flujo del programa llega auna estructura if, se evalúa la condición y el bloque de instrucciones se ejecuta si el valor de la condición es true.
Si la condición es false, entonces se ejecuta la sentencia inmediatamente posterior al if.

Si la calificación de un alumno es 10, entonces se debe mostrar por la consola un mensaje indicanco que tiene una matricula de honor.

La sentencia if considerando que calificación es una variable de tipo int:

```
if (calificacion == 10)
{
  System.out.println("Matricula de honor")
}
```
El mendaje "Matricula de honor" solo se muestra cuando el valor de la calificación es igual a 10.

### Estructura if else
La estructura if-else se denomina de selección doble porque selecciona entre dos bloques de sentencias mutuamente excluyentes.
Si se cumple la condición, se ejecuta el bloque de sentencias asociadas al if.
Si la condición no se cumple, entonces se ejecuta el bloque de sentencias asociadas al else.

Una sentencia if-else tiene la siguiente sintaxis.

```
if (condicion)
{
  bloque de sentencias if
}
else
{
  bloque de sentencias else
}
```

La condicion se debe inscribir en parentesis.
La seleción depende del resultado de evaluar la condición
Si el resultado es true, se ejecuta el bloque de sentencias if, en cualquier otro caso se ejecuta el bloque de instrucciones del else.
Despues de ejecutar el bloque de sentecias se ejecuta la sentecias inmediatamente posterior al if-else.

Si se desea mostrar un mensaje por la consola para indicar si un número es par o impar basta con calcular el resto de la división del número entre 2 con el operador %.
Si el resto es igual a cero, entonces el número es par, en caso contrario es impar.

```
if (numero % 2 == 0)
  System.out.println("El número es par");
else
  System.out.println("El número es impar");
```

Los bloques de sentencias son mutuamente excluyentes. 
Si se cumple la condición se ejecuta un bloque de sentencias.
Se podría escribir una sentencia if-else con la condición contraria y con los bloques de sentencias intercambiadas.

```
if (numero % 2 != 0)
  System.out.println("El número es impar");
else
  System.out.println("El número es par");
```

Si fuera necesario evaluar más de una condición, entonces se deben utilizar varias estructura  de selección anidadas.
Para mostrar la calificación de un alumno, es necesario evaluar las condiciones que se indican en la siguiente tabla.

| Calificación  | Descripción |
| ------------- |:-------------:|
| 10      | Matrícula de honor     |
| 9      | Sobresaliente     |
| 7, 8      | Notable     |
| 6      | Bien    |
| 5      | Aprobado     |
| 0, 1, 2, 3, 4      | Suspenso     |

Se puede ver que las condiciones son excluyentes entre sí. Si la calificación es 10 se muestra "Matrícula de honor". 
En caso contrario la calificación es menor de 10 y es necesario seleccionar entre "Sobresaliente", "Notable", "Bien", "Aprobado", y "Suspenso".
Si la calificación es 9 se muestra "Sobresaliente".
En caso contrario la calificación es menor de 9 y se debe seleccionar entre "Notable", "Bien", "Aprobado" y "Suspenso".
Si la calificación  es mayor o  igual a 7 se muestra "Notable".
En caso contrario la calificación es menor que 7 y se debe seleccionar entre "Bien", "Aprovado", y "Suspenso".
Si la calificación es 6 se muestra "Bien".
En caso contrario es menor o igual a 6 y se debe seleccionar entre entre "Aprobado" y "Suspenso".
Si la calificación es 5 se muestra "Aprobado", en caso contrario "Suspenso".

La sentencia if-else

```
int calificación = 7;

if (calificación == 10)
  System.out.println("Matricula de Honor");
else
  if(calificación == 9)
    System.out.println("Sobresaliente");
  else
    if(calificacion == 7)
      System.out.println("Notable");
    else
      if(matricula == 6)
        System.out.println("Bien");
      else
        if(calificacion == 5)
          System.out.println("Aprobado");
        else
          System.out.println("Suspenso");
```
### Estructura if else if
La estructura if-else-if se puede aplicar en los mismos casos en el que se utiliza un if.else anidado. 
Esta estructura  permite escribir  de forma abreviadalas condiciones de un if-else anidado.
Una sentencia if-else-if tiene la siguiente sintaxis:

```
if (condicion-1)
{
  bloque-de-sentencias-condicion-1
}
else-if (condicion-2)
{
  bloque de sentencias-condicion-2
}
else
{
  blque-de-sentencias-else
}
```
La sentencia if-else-if para el ejemplo de calificaciones

```
int calificacion = 7;

if (calificacion == 10)
{
  System.out.println("Matricula de Honor");
}
else if (calificacion == 9)
{
  System.out.println("Sobresaliente");
}
else if (calificacion >= 7)
{
  System.out.println("Notable");
}
else if (calificacion == 6)
{
  System.out.println("Bien");;
}
else if (calificacion == 5 )
{
  System.out.println("Aprobado");
}
else
{
  System.out.println("Suspenso");
}

```

### Estructura switch
La estructura switch es una estructura de selección múltiple que permite seleccionar un bloque de sentencias  entre varios casos.
En cierto modo, es parecido a una estructura if-else anidados.
La diferencia está en que la selección del bloquie de sentencias depende de la evaluación de uan expresión que se compara por igualdad con cada uno de los casos.
La estructura switch consta de una expresión  y una serie de etiquetas case y una opción default.
La sentencia break indica el final de la ejecucióndel switch.

Una sentencia switch tiene la siguiente sintaxis

```
switch (expresion)
{
  case valor-1:
    bloque-se-sentencias-1;
    break;

  case valor-2:
    bloquie-de-sentencias-2;
    breack;

  case valor-3
    bloque-de-sentencias-3;
    break;

  case valor-4:
    bloque-de-sentencias-4;
    break;

  case valor-5:
    bloque-de-sentencias-5;
    break;

  default:
    bloque-de-sentencias-default;
    break;

}
```
La expresión debe devolver un valor de tipo entero (int) o caracter (char) y es obligatorio que la expresión se escriba entre parentesis.
A continuación de cada case aparece valores constantes del mismo tipo de valor que devuelve la expresión del switch.
Para interrumpir la ejecución  de las sentencias del switch se utiliza la sentencia break que provoca la finalizxación del switch.
El flujo del programa continúa en la sentencia inmediatamente posterior al switch.
Una vez que se evalúa la expresión del switch  se comprueba si coincide  con el valor del primer case.
En caso contrario, se comprueba si coincide con el valor del segundo case y así sucesivamente.
Cuando el valor de la expresión conincide con el valor de uno de los case, se empieza a ejecutar el bloque de instrucciones correspondiente al casehasta encontrar una sentencia break o al llegar al final de la estructura switch donde se cierra la llave.
Si no encuentra un case que coincida con el valor de la expresión, se ejecuta el bloque de sentencias correspondiente a la etiqueta default.

Para asegurar el correcto flujo de ejecución de un programa durante la evaluación de una sentencia switch, es recomendable incluir una sentencia break al final del bloque de instrucciones de cada case, incluido el correspondiente a la etiqueta default.
Esto es importante, porqur si se omite la sentencia break, cuando finaliza la ejecución del bloque de sentencias de un case, el flujo del programa continua ejecutando los case siguietes y esto puede provocar un comportamiento erróneo del programa.
Suponga que una empresa de consultoría la categoría profesional de un empleado se calcula a partir de su tasa de coste. La tabla muestra los valores de las tasas y sus correspondientes categorias.

| Calificación | Descripción |
------------------------------
| Menr de 80 | La categoría es C de consultor junior |
| Mayor o igual a 80 y menor que 120 | La categoría es B de consultor senior |
| Mayor o igual a 120 | La categoria es A de socio |
