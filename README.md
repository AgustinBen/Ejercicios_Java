# Ruta de ejercicios en Java, desde nivel básico hasta intermedio.

La propuesta está enfocada en fortalecer fundamentos, buenas prácticas y pensamiento lógico.  
Los ejercicios estan pensados para que cada persona los **resuelva por su cuenta**.  
La **IA** se utiliza únicamente como tutor, para corrección técnica y retroalimentación.  
Se recomienda solicitarle a la **IA** nuevos ejercicios variados en cada nivel y no conformarse únicamente con estos.
<br>
<br>
<br>
🟢 NIVEL 1 – Fundamentos básicos   
Objetivo: Dominar la sintaxis básica de Java y desarrollar el hábito de escribir código correcto, legible y comprensible.

1. Variables, tipos primitivos y operadores

2. Control de flujo (if, switch)

3. Bucles (for, while, do-while)

4. Métodos y paso de parámetros

5. Arrays y recorridos

6. Strings (inmutabilidad, métodos clave)
<br>   
🟡 NIVEL 2 – Programación estructurada correcta   
Objetivo: Aprender a organizar la lógica del programa de forma correcta y reutilizable.

7. Validaciones de entrada

8. Separación de lógica en métodos

9. Uso correcto de static

10. Manejo básico de errores (try-catch)

11. Algoritmos simples (búsqueda, conteo, máximos/mínimos)
<br>
🔵 NIVEL 3 – Programación Orientada a Objetos (POO real)   
Objetivo: Modelar correctamente un dominio usando clases, objetos y relaciones entre ellos.

12. Clases y objetos

13. Encapsulamiento

14. Constructores

15. Composición vs herencia

16. Polimorfismo

17. Clases abstractas e interfaces

18. equals, hashCode, toString
<br>  
🟠 NIVEL 4 – Colecciones y diseño   
Objetivo: Elegir estructuras de datos adecuadas y escribir código mantenible.

19. List, Set, Map

20. Comparators y ordenamiento

21. Manejo de estados

22. Principios SOLID (aplicados, no teóricos)

23. Diseño de un pequeño sistema
<br>   
🔴 NIVEL 5 - Java – Nivel Intermedio (Fundamentos Modernos)  
Objetivo: Simular problemas reales y preparar la transición a futuros proyectos.

24. Manejo avanzado de excepciones

25. Archivos (File, Scanner, BufferedReader)

26. Streams y lambdas

27. Tests básicos (JUnit)

28. Mini proyecto integrador
<br>
<br>

<details>
<summary><h2> 🟢 VER EJERCICIOS NIVEL 1 </h2> </summary>

<h3> Ejercicio 1 </h3>

**Conceptos necesarios**    
Tipos de datos primitivos (int)    
Variables y asignación    
Operadores aritméticos (+, -, *, /, %)    
Expresiones aritméticas    
Salida por consola (System.out.println)    
Concatenación de strings con +    

**Consigna**  
Escribir un programa en Java que declare dos variables enteras y calcule la suma, la resta, la multiplicación, la división entera y el resto de la división entre ellas.  
Mostrar cada resultado por consola con un mensaje descriptivo.  

**Reglas**  
No usar Scanner.  
No usar estructuras de control.  
No crear métodos propios.  
Todo el código debe estar dentro del método main.  
<br>

<h3> Ejercicio 2 </h3>

**Conceptos necesarios**  
Tipo de dato primitivo int  
Tipo de dato primitivo boolean  
Operadores de comparación (>, <, >=, <=, ==, !=)  
Estructura condicional if  
Bloques de código { }  
Salida por consola (System.out.println)  

**Consigna**  
Escribir un programa en Java que declare una variable entera y determine si su valor es positivo, negativo o cero.  
El resultado debe mostrarse por consola con un mensaje descriptivo.  

**Reglas**  
No usar Scanner.    
No usar switch.  
No usar bucles.  
Todo el código debe estar dentro del método main.  
<br>


<h3> Ejercicio 3 </h3> 

**Conceptos necesarios**  
Operador módulo (%): permite obtener el resto de una división entera. Un número es par si el resto de dividirlo por 2 es 0.  
Es impar si el resto es distinto de 0.  
Estructuras condicionales (if / else): tomar decisiones según una condición booleana.   
Comparaciones (==): comparar valores primitivos.  

**Consigna**
Declarar una variable entera llamada numero y determinar si el número es par o impar.
Mostrar el resultado por consola con un mensaje claro y correctamente redactado.

**Reglas**
Usar una sola estructura if / else.
No hardcodear el resultado (no escribir directamente “es par” sin evaluarlo).
El programa debe funcionar correctamente para cualquier número entero (positivo, negativo o cero).
<br>  


<h3> Ejercicio 4 – Contar del 1 al N  </h3>

**Conceptos necesarios**  
Bucles (while): Permiten repetir un bloque de código mientras una condición sea verdadera.  
Variables de control: Variables que cambian su valor en cada iteración y evitan bucles infinitos.  
Condiciones booleanas: Saber exactamente cuándo el bucle debe terminar.  

**Consigna**  
Declarar una variable entera n con un valor mayor que 0.  
Mostrar por consola todos los números desde 1 hasta n, inclusive, uno por línea.  

**Reglas**  
Usar exclusivamente un bucle while.  
No usar for.  
No imprimir todos los números en una sola línea.  
El bucle debe finalizar correctamente (sin bucles infinitos).  
El código debe ser claro y legible.  
<br>

<h3> Ejercicio 5 – Números pares hasta N  </h3>

**Conceptos necesarios**  
Bucles (while): Repetición controlada mediante una condición lógica.  
Condiciones dentro de un bucle: Tomar decisiones en cada iteración.  
Operador módulo (%): Determinar si un número es par.  
Control del flujo: Saber qué instrucciones se ejecutan y cuándo.  

**Consigna**  
Declarar una variable entera limite mayor que 0.  
Mostrar por consola todos los números pares comprendidos entre 1 y limite, inclusive, uno por línea.  

**Reglas**  
Usar un único bucle while.  
No usar for.  
No usar break ni continue.  
Usar una condición para determinar si un número es par.  
Validar que limite sea mayor que 0 antes de ejecutar el bucle.  
El código debe ser claro y legible.  
<br>

<h3> Ejercicio 6 – Tabla de multiplicar </h3>

**Conceptos que necesitás dominar**  
Bucle for: Estructura de repetición con inicialización, condición y actualización claras.  
Contadores: Uso correcto de variables de control dentro del for.  
Operadores aritméticos: Multiplicación y uso de expresiones.  
Control del flujo: Entender cuántas veces se ejecuta el bucle y por qué.  

**Consigna**     
Declarar una variable entera numero mayor que 0.  
Mostrar por consola la tabla de multiplicar de numero, desde 1 hasta 10, inclusive.  
Ejemplo (si numero = 3):  
3 x 1 = 3  
3 x 2 = 6  
...  
3 x 10 = 30   
  
**Reglas de la consigna**  
Usar exclusivamente un bucle for.  
No usar while.  
Validar que numero sea mayor que 0 antes de ejecutar el bucle.  
No hardcodear resultados.  
El formato de salida debe ser claro y consistente.  
No agregar mensajes innecesarios.  
<br>

<h3> Ejercicio 7 – Suma de números del 1 al N </h3>

**Conceptos que necesitás dominar**  
Bucle for: Repetición controlada cuando se conoce la cantidad de iteraciones.  
Acumuladores: Variables que almacenan un resultado parcial y se actualizan en cada iteración.  
Contadores: Uso correcto de una variable que avanza de forma controlada.  
Operadores aritméticos: Suma y asignación.  
Control del flujo: Entender el orden de ejecución y el alcance de las variables.  

**Consigna**  
Declarar una variable entera limite mayor que 0.  
Calcular la suma de todos los números desde 1 hasta limite, inclusive.  
Mostrar por consola únicamente el resultado final de la suma.  

Ejemplo (si limite = 5):  
1 + 2 + 3 + 4 + 5 = 15  
Salida esperada:  
15  

**Reglas de la consigna**  
Usar exclusivamente un bucle for.  
No usar while.  
Validar que limite sea mayor que 0 antes de ejecutar el bucle.  
Usar una variable acumuladora para la suma.  
No imprimir resultados intermedios.  
No hardcodear el resultado.  
No agregar mensajes innecesarios.  
<br>

<h3> Ejercicio 8 – Contar números positivos, negativos y ceros </h3>  

**Conceptos que necesitás dominar**  
Bucle for: Repetición controlada sobre un rango definido.  
Condiciones compuestas: Uso de if / else if / else para evaluar múltiples casos excluyentes.  
Operadores relacionales: Comparaciones (>, <, ==).  
Contadores múltiples: Uso de varias variables para llevar conteos independientes.  
Control del flujo: Garantizar que cada valor sea contado una sola vez.  

**Consigna**  
Declarar una variable entera limite mayor que 0.  
Recorrer los números desde -limite hasta limite, inclusive.  
Contar cuántos números son:  
positivos  
negativos  
iguales a cero  
Al finalizar el recorrido, mostrar por consola únicamente la cantidad de positivos, negativos y ceros.  

Ejemplo (si limite = 2):  
Números recorridos: -2, -1, 0, 1, 2  
Positivos: 2  
Negativos: 2  
Ceros: 1  

**Reglas de la consigna**  
Usar exclusivamente un bucle for.  
No usar while.  
Validar que limite sea mayor que 0 antes de ejecutar el bucle.  
Usar tres contadores separados (positivos, negativos, ceros).  
Cada número debe contabilizarse en un solo caso.  
No imprimir resultados intermedios.  
No hardcodear valores.  
No agregar mensajes innecesarios.  
<br>

<h3>Ejercicio 9 – Uso de métodos void</h3>  

**Conceptos que necesitás dominar**  
Declaración de métodos: firma, nombre, parámetros.  
Métodos void: ejecutan lógica pero no retornan valores.  
Paso de parámetros por valor.  
Separación de responsabilidades.  
Llamada a métodos desde main.  

**Consigna**  
Crear un método llamado mostrarNumerosDel1AlN.  
El método debe:  
Recibir un número entero n  
Validar que n sea mayor que 0  
Mostrar por consola los números del 1 hasta n inclusive  
Desde el main:  
Declarar una variable limite  
Llamar al método pasando esa variable como argumento  

Ejemplo (si limite = 5):  
1  
2  
3  
4  
5  

**Reglas de la consigna**  
Usar un método aparte del main  
El método debe ser static  
El método debe ser void  
Usar un bucle for o while  
No escribir toda la lógica dentro del main  
No usar return  
No usar arrays  
No imprimir mensajes innecesarios  
<br>

<h3> Ejercicio 10 – Número mayor </h3>  

**Conceptos necesarios**  
Métodos con retorno (return):  
Entender la diferencia entre un método void (no devuelve nada) y un método que devuelve un valor.  
Saber declarar el tipo de retorno correctamente.  
Paso de parámetros:  
Cómo enviar múltiples argumentos a un método.  
Comprender que el método trabaja con copias de los valores primitivos.  
Operadores de comparación:  
 <, >, >=, <=, ==  
Estructura condicional if / else:  
Tomar decisiones basadas en comparaciones.  
Separación de responsabilidades:  
El método calcula.  
El main muestra el resultado.  

**Consigna**    
Crear un método llamado obtenerMayor que reciba dos números enteros como parámetros y devuelva el mayor de ellos.  
En el main:   
Declarar dos variables enteras.  
Llamar al método.  
Guardar el resultado en una variable.  
Mostrar el resultado por consola.  
Si ambos números son iguales, el método debe devolver cualquiera de los dos (no hace falta mensaje especial).  

**Reglas**  
El método debe devolver un int.  
No imprimir nada dentro del método.  
Toda la impresión debe hacerse en main.  
Usar únicamente if / else (no usar Math.max).  
No hardcodear el resultado.  
No repetir lógica en main.  
<br>

<h3>Ejercicio 11 – Sumar elementos de un array </h3>  

***Conceptos necesarios**

Arrays (arreglos):  
Declaración: int[] numeros;  
Inicialización: int[] numeros = {1, 2, 3};  
Acceso por índice: numeros[i]  
Índices comienzan en 0  
Longitud del array: numeros.length  
Bucle for tradicional:  
Recorrido usando índice  
Condición correcta: i < array.length  
Evitar ArrayIndexOutOfBoundsException  
Acumuladores:  
Variable que empieza en 0  
Se actualiza en cada iteración  
Patrón clásico: acumulador += array[i];  
Separación de responsabilidades:  
El método calcula la suma  
main imprime el resultado  

**Consigna**  
Declarar un array de enteros con al menos 5 números.  
Crear un método llamado sumarArray que reciba un array de enteros como parámetro.  
El método debe recorrer el array y devolver la suma total de sus elementos.  
En main, llamar al método, guardar el resultado y mostrarlo por consola.  

**Reglas de la consigna**  
El método debe devolver un int.  
No imprimir nada dentro del método.  
Usar un for tradicional (no for-each todavía).  
No usar clases auxiliares ni Streams.  
No hardcodear la suma.  
No asumir un tamaño fijo del array (usar .length).  
<br>

<h3>Ejercicio 12 – Número mayor en un array</h3>  

**Conceptos necesarios**  
Arrays:  
Declaración e inicialización de arreglos de tipo int.  
Acceso a elementos mediante índices (recordar que comienzan en 0).  
Uso de la propiedad length para recorrer el array correctamente.  
Bucle for tradicional:  
Recorrer el array utilizando un índice.  
Condición correcta: i < array.length.  
Evitar errores como ArrayIndexOutOfBoundsException.  
Comparaciones y condicional if:  
Uso del operador > para comparar valores.   
Inicialización correcta de variable auxiliar:  
Comprender por qué el valor inicial del “mayor” debe tomarse desde el propio array y no inicializarse arbitrariamente en 0.  
Métodos con retorno:  
Declarar correctamente el tipo de retorno int.  
Separar cálculo y presentación (el método calcula, el main imprime).  

**Consigna**  
Declarar un array de enteros con al menos 5 valores (pueden incluir números negativos).  
Crear un método llamado obtenerMayorArray que reciba un array de enteros como parámetro y devuelva el número más grande encontrado dentro del array.  
En el main:  
Llamar al método.  
Guardar el resultado en una variable.  
Mostrar el resultado por consola.  

**Reglas**  
El método debe devolver un int.  
No imprimir nada dentro del método.  
Usar exclusivamente un for tradicional (no usar for-each todavía).  
No usar Math.max.  
No ordenar el array.  
No hardcodear valores.  
No asumir que todos los números son positivos.   
No inicializar la variable “mayor” en 0 sin justificación.  
<br>

<h3> Ejercicio 13 – Buscar un elemento en un array </h3>

**Conceptos necesarios**  
Arrays:  
Recorrido mediante índice.  
Uso correcto de array.length.  
Acceso a elementos con array[i].  
Métodos con retorno boolean:  
Comprender qué significa devolver true o false.  
Entender que un método puede terminar antes usando return.    
Corte anticipado del bucle:  
Entender que si ya encontraste el valor buscado, no tiene sentido seguir recorriendo el array.  
Uso de return dentro del for para mejorar eficiencia.  
Separación de responsabilidades:  
El método realiza la búsqueda.  
El main decide qué hacer con el resultado.  

**Consigna**  
Declarar un array de enteros con al menos 6 valores.  
Crear un método llamado contieneNumero que reciba:  
Un array de enteros.  
Un número a buscar.  
El método debe recorrer el array y devolver true si el número se encuentra dentro del array, o false si no está.  
En el main:  
Llamar al método.    
Guardar el resultado en una variable booleana.  
Mostrar por consola si el número fue encontrado o no.  

**Reglas**  
El método debe devolver boolean.   
No imprimir nada dentro del método.  
Usar exclusivamente un for tradicional.  
No usar estructuras auxiliares ni colecciones.  
No usar break (usar return para cortar la ejecución).  
No recorrer el array completo si ya encontraste el número.  
Validar que el array no sea null antes de recorrerlo.  
<br>

<h3>Ejercicio 14 – Contar caracteres en un String</h3>  

**Conceptos necesarios**  
String:  
Tipo de dato inmutable.  
Uso del método length().  
Acceso a caracteres con charAt(i).  
Bucle for:  
Recorrido desde índice 0 hasta length() - 1.  
Condicional if:  
Comparación de caracteres usando ==.  
Métodos con retorno:  
Devolver un int como resultado del conteo.  
Separar lógica de impresión.  

**Consigna**  
Crear un método llamado contarCaracter que reciba:  
Un String  
Un carácter (char)  
El método debe devolver cuántas veces aparece ese carácter dentro del String.  
En main:  
Declarar un String.  
Declarar un carácter a buscar.  
Llamar al método y mostrar el resultado.  

**Reglas**  
El método debe devolver int.  
No imprimir dentro del método.  
Usar for tradicional.  
No usar métodos avanzados como replace o split.  
Validar que el String no sea null antes de recorrerlo.  
<br>

<h3>Ejercicio 15 – Comparar Strings correctamente</h3>  

**Conceptos necesarios**  
String:  
Es un objeto, no un tipo primitivo.  
No se compara con == para verificar contenido.  
Método equals():  
Se usa para comparar el contenido de dos Strings.  
Diferencia entre == (referencia) y equals (contenido).  
Métodos booleanos:  
Devolver true o false según el resultado de la comparación.  
Validación básica:  
Verificar que los Strings no sean null antes de compararlos.  

**Consigna**  
Crear un método llamado sonIguales que reciba dos Strings como parámetros y devuelva true si ambos textos son iguales, o false en caso contrario.  
En main:  
Declarar dos Strings.  
Llamar al método.  
Mostrar el resultado por consola.  

**Reglas**  
El método debe devolver boolean.  
No usar == para comparar Strings.  
Usar equals() para la comparación.  
No imprimir dentro del método.  
Validar que ninguno de los Strings sea null antes de comparar.  
<br>

<h3>Ejercicio 16 – Contar ocurrencias de un carácter en un array de Strings </h3>

**Conceptos necesarios**  
Arrays:  
Recorrido de arrays de Strings con for tradicional.  
Acceso a cada String mediante índices.  
Strings:  
Uso de charAt() y length().  
Comparación de caracteres con ==.  
Métodos con retorno:  
Devolver int con la cantidad total de ocurrencias.  
Separar cálculo de impresión.  
Bucles anidados:  
Recorrer cada String dentro del array.  
Recorrer cada carácter dentro de cada String.  
Validación:  
Proteger contra null en el array o en cualquier String del mismo.  

**Consigna**  
Declarar un array de Strings con al menos 5 elementos.  
Crear un método llamado contarCaracterEnArray que reciba:  
El array de Strings  
Un carácter a buscar  
El método debe devolver la cantidad total de veces que aparece ese carácter en todos los Strings del array.  
En main:  
Llamar al método.  
Mostrar el resultado por consola.  

**Reglas**  
Usar únicamente for tradicional.  
No usar métodos avanzados de String como replace o split.  
Validar que el array y los Strings no sean null.  
El método debe devolver int.  
No imprimir nada dentro del método.  
</details>

<br>

<details>
<summary><h2> 🟡 VER EJERCICIOS NIVEL 2 </h2></summary>

<h3>Ejercicio 17 – Promedio de un array</h3>  

**Conceptos necesarios**  
Arrays: Recorrido completo usando .length.  
Acumuladores: Sumar valores progresivamente.  
Métodos con retorno: Devolver un valor calculado.  
Validación: Manejar array null o vacío.  
Conversión de tipos: Entender división entre enteros y decimales.  

**Consigna**  
Crear un método llamado calcularPromedio que:  
Reciba un array de enteros.  
Devuelva el promedio de los valores como double.  
En el main:  
Declarar un array con al menos 5 números.  
Llamar al método.  
Mostrar el resultado.  

**Reglas**  
El método debe devolver double.  
Validar que el array no sea null ni vacío.  
No imprimir nada dentro del método.  
No hardcodear resultados.  
No usar librerías externas.  
Cuidar la división (no debe ser entera).  
<br>

<h3>Ejercicio 18 – Validación robusta de entrada </h3>  

**Conceptos necesarios**    
Validaciones de entrada:    
No confiar en los datos recibidos. Siempre verificar antes de procesar.   
Cláusulas de guarda (guard clauses):   
Validar al inicio del método y cortar la ejecución si algo es inválido.  
IllegalArgumentException:  
Usar excepciones cuando el parámetro recibido no cumple el contrato.  
Separación de responsabilidades:  
El método valida y procesa.  
El main maneja la ejecución.  

**Consigna**  
Crear un método llamado calcularDivision que:  
Reciba dos números enteros.  
Devuelva el resultado de la división como double.  
Debe validar:  
Que el divisor no sea 0.  
Que ambos números estén dentro del rango -1000 a 1000 (inclusive).  
Si alguna validación falla, debe lanzar IllegalArgumentException.  
En el main:  
Declarar dos variables.  
Llamar al método.  
Mostrar el resultado.  

**Reglas**  
El método debe devolver double.  
No imprimir nada dentro del método.  
Todas las validaciones deben hacerse dentro del método.  
No usar try-catch todavía.  
No usar Scanner.  
No hardcodear el resultado.  
No dividir antes de validar.  
<br>

<h3>Ejercicio 19 – Separación real de responsabilidades</h3>

**Conceptos necesarios**  
Separación de lógica en métodos:  
Cada método debe tener una única responsabilidad clara.  
Un método no debe hacer varias cosas mezcladas (calcular + imprimir + validar + decidir).  
Reutilización:  
Si una lógica puede usarse en otro contexto, debe estar aislada en un método.  
Métodos que colaboran entre sí:  
Un método puede llamar a otro para cumplir su tarea.  
Código limpio:  
Evitar duplicación.  
Evitar lógica repetida en main.  

**Consigna**  
Crear un programa que:  
Declare un array de enteros.  
Tenga un método obtenerMayor(int[] array)  
Tenga un método obtenerMenor(int[] array)  
Tenga un método calcularPromedio(int[] array)  
Luego, crear un método adicional llamado:  
mostrarEstadisticas(int[] array)  
Ese método debe:  
Llamar a los tres métodos anteriores.  
Mostrar por consola:  
El mayor  
El menor  
El promedio  
En main, solo debe existir:  
La declaración del array.  
La llamada a mostrarEstadisticas.  

**Reglas**  
Validar que el array no sea null ni vacío (una sola vez, no repetir validaciones innecesarias).  
No imprimir dentro de los métodos de cálculo (obtenerMayor, obtenerMenor, calcularPromedio).  
La impresión debe hacerse únicamente en mostrarEstadisticas.  
No duplicar lógica.  
No usar clases externas.  
No usar streams.  
No usar librerías matemáticas.  
<br>

<h3> Ejercicio 20 – Conteo y clasificación de datos</h3>  

**Conceptos necesarios**      
Separación de lógica en métodos:  
Cada método debe realizar una única tarea específica.  
Reutilización:  
Si una lógica puede utilizarse en otros contextos, debe estar aislada en un método.  
Conteo de elementos:  
Es común recorrer una colección para contar cuántos elementos cumplen una determinada condición.  
Colaboración entre métodos:  
Un método principal puede llamar a otros métodos que realizan tareas específicas.  
  
Código limpio:  
Evitar duplicar lógica.  
Evitar realizar cálculos directamente dentro de main.  

**Consigna**  
Crear un programa que:  
Declare un array de números enteros.  
Crear los siguientes métodos:  
contarPares(int[] array)  
contarImpares(int[] array)  
contarCeros(int[] array)  
Cada método debe recorrer el array y devolver la cantidad de elementos que cumplen la condición correspondiente.  
Luego, crear un método adicional llamado:  
mostrarConteos(int[] array)  
Ese método debe:  
Llamar a los tres métodos anteriores.  
Mostrar por consola:  
Cantidad de números pares  
Cantidad de números impares  
Cantidad de ceros    
En main, solo debe existir:  
La declaración del array.  
La llamada a mostrarConteos.  

**Reglas**  
Validar que el array no sea null ni esté vacío una sola vez.  
No imprimir dentro de los métodos de cálculo (contarPares, contarImpares, contarCeros).  
La impresión debe realizarse únicamente en mostrarConteos.  
No duplicar lógica.  
No usar clases externas.  
No usar streams.  
No usar librerías matemáticas.  
<br>  

<h3>Ejercicio 21 – Búsqueda de un elemento</h3>

**Conceptos necesarios**  
Para resolver este ejercicio deberías saber usar:  
Bucle for para recorrer un array.  
Comparaciones con if.  
Retornar valores desde métodos.  
Devolver -1 cuando un elemento no existe.  

**Consigna**  
Crear un programa que:  
Declare un array de enteros.  
Crear un método llamado:  
buscarIndice(int[] array, int numeroBuscado)  
Este método debe:  
Recorrer el array.  
Si encuentra el número, devolver su índice.  
Si no lo encuentra, devolver -1.  
Luego crear un método:  
mostrarResultadoBusqueda(int[] array, int numeroBuscado)  
Este método debe:  
Llamar a buscarIndice.  
Mostrar por consola:  
Si el número fue encontrado:  
El número X se encuentra en el índice Y  
Si no fue encontrado:  
El número X no se encuentra en el array  
En main  
Solo debe existir:  
Declaración del array.  
Declaración del número a buscar.  
Llamada a mostrarResultadoBusqueda.  

**Reglas**  
Validar que el array no sea null ni esté vacío una sola vez.  
El método buscarIndice no debe imprimir nada, solo devolver el resultado.  
La impresión debe realizarse únicamente en mostrarResultadoBusqueda.  
No usar streams.  
No usar librerías externas.  
<br>

<h3>Ejercicio 22 – Invertir un array</h3>

**Conceptos necesarios**  
Para resolver este ejercicio deberías saber usar:  
Bucle for.  
Crear un nuevo array.  
Acceder a posiciones de un array mediante índices.  
Usar array.length.  
  
**Consigna**  
Crear un programa que:  
Declare un array de enteros.  

Crear un método llamado:  
invertirArray(int[] array)  
Este método debe:   
Crear un nuevo array del mismo tamaño.    
Copiar los elementos del array original en orden inverso.  
Devolver el nuevo array invertido.  
  
Ejemplo:  
Array original:  
{5, 8, 2, 9}  
Array invertido:  
{9, 2, 8, 5}  
  
Luego crear un método:  
mostrarArray(int[] array)  
Este método debe:  
Recorrer el array.  
Mostrar todos los números en una sola línea.  
  
Finalmente crear un método:  
mostrarResultado(int[] array)  
Este método debe:  
Llamar a invertirArray.  
Mostrar:  
El array original.  
El array invertido.
  
En main  
Solo debe existir:  
La declaración del array.  
La llamada a mostrarResultado.  
  
**Reglas**  
Validar que el array no sea null ni esté vacío una sola vez.  
El método invertirArray no debe imprimir nada, solo devolver el nuevo array.  
La impresión debe realizarse únicamente en mostrarArray o mostrarResultado.  
No usar streams.  
No usar colecciones (ArrayList, etc).  
<br>

<h3>Ejercicio 23 – Detectar números duplicados</h3>

**Conceptos necesarios**  
Para resolver este ejercicio deberías saber usar:  
Bucle for.  
Comparar elementos del array usando índices distintos.  
Usar dos bucles anidados.  
Evitar comparar un elemento consigo mismo.  
  
**Consigna**  
Crear un programa que:  
Declare un array de números enteros.  
Crear un método llamado:  
tieneDuplicados(int[] array)  
Este método debe:  
Recorrer el array.  
Detectar si existe al menos un número repetido.  
Devolver:  
true si hay duplicados.  
false si todos los números son distintos.  
  
Ejemplo:  
Array:  
{3, 7, 2, 9, 7}  
Resultado:  
true  
Porque el número 7 aparece dos veces. 
  
Luego crear un método:  
mostrarResultado(int[] array)  
Este método debe:  
Llamar a tieneDuplicados.  
Mostrar por consola:  
Si existen duplicados:   
El array contiene números duplicados  
Si no existen:  
Todos los números del array son únicos  
  
En main  
Solo debe existir:  
La declaración del array.  
La llamada a mostrarResultado.  
  
**Reglas**  
Validar que el array no sea null ni esté vacío una sola vez.  
El método tieneDuplicados no debe imprimir nada, solo devolver el resultado.  
No usar streams.  
No usar colecciones (ArrayList, Set, etc.).  
No usar estructuras auxiliares adicionales.  
<br>

<h3>Ejercicio 24 – Búsqueda con entrada de usuario y manejo de errores</h3>

**Conceptos necesarios**  
Uso de Scanner  
try-catch para manejar errores de entrada (InputMismatchException)  
Búsqueda en arrays  
Separación de lógica en métodos  
  
**Consigna**  
Crear un programa que:  
Declare un array de enteros.  
Pida al usuario que ingrese un número por teclado.  
Crear un método:  
buscarIndice(int[] array, int numero)  
Devuelve el índice si lo encuentra  
Devuelve -1 si no existe  
Crear un método:  
pedirNumero()  
Debe leer un número usando Scanner  
Debe usar try-catch para evitar que el programa se rompa si el usuario ingresa algo inválido  
Si ocurre un error, mostrar un mensaje y volver a pedir el número  
Crear un método:  
mostrarResultado(int[] array)  
Llama a pedirNumero  
Llama a buscarIndice  
Muestra el resultado  
*En main*  
Solo debe existir:  
Declaración del array  
Llamada a mostrarResultado  
  
**Reglas**  
Validar array una sola vez.  
No imprimir dentro de buscarIndice.  
El try-catch debe estar únicamente en pedirNumero.  
<br>

<h3>Ejercicio 25 – Sumar hasta número válido (con control de errores)</h3>

**Conceptos necesarios**  
Scanner  
try-catch  
Bucles (while)  
Acumulador  
  
**Consigna**  
Crear un programa que:  
Pida al usuario ingresar números enteros.  
El programa debe:  
Seguir pidiendo números hasta que el usuario ingrese 0  
Sumar todos los números ingresados (excepto el 0)  
Mostrar el resultado final  
Crear los siguientes métodos:  
pedirNumero()  
Lee un número con Scanner  
Usa try-catch para validar entrada  
Si hay error, vuelve a pedir  
calcularSuma()  
Usa un bucle para pedir números hasta que se ingrese 0  
Va acumulando la suma  
Devuelve el resultado  
mostrarResultado()  
Llama a calcularSuma  
Muestra la suma total  
*En main*  
Solo debe existir:   
Llamada a mostrarResultado  
  
**Reglas**  
No usar variables globales.  
El try-catch solo debe estar en pedirNumero.  
No imprimir dentro de calcularSuma.  
</details>

<br>

<details>
  <summary><h2>🔵 VER EJERCICIOS NIVEL 3 </h2></summary>

<h3>Ejercicio 26 – Primera clase y uso de objetos</h3>

**Conceptos necesarios**  
Crear una clase  
Definir atributos  
Crear un constructor  
Usar métodos no static  
Crear objetos con new  
  
**Consigna**  
Crear una clase llamada:  
Persona  
La clase debe tener:  
Atributos:  
String nombre  
int edad  
Métodos:  
esMayorDeEdad()  
Devuelve true si la edad es mayor o igual a 18  
Devuelve false en caso contrario  
*Constructor*:  
Debe recibir:  
nombre y edad  
y asignarlos a los atributos.  
Programa principal  
*En tu main*:  
Crear un objeto Persona  
Mostrar:  
El nombre  
La edad  
Si es mayor de edad o no  
Ejemplo esperado  
Nombre: Juan  
Edad: 20  
Es mayor de edad: true  
  
**Reglas**  
No usar static en los métodos de la clase Persona.  
No imprimir dentro de esMayorDeEdad.  
La lógica debe estar dentro de la clase, no en main.  
<br>


<h3>Ejercicio 27 – Trabajar con múltiples objetos</h3>

**Conceptos necesarios**  
Crear varios objetos  
Usar arrays de objetos  
Llamar métodos sobre objetos  
Comparar datos entre objetos  
  
**Consigna**  
Utilizando la clase Persona del ejercicio anterior:  
Crear un programa que:  
Declare un array de objetos Persona.  
Crear un método:  
obtenerPersonaMayor(Persona[] personas)  
Este método debe:  
Recorrer el array  
Encontrar la persona con mayor edad  
Devolver esa persona  
Crear un método:  
mostrarResultado(Persona[] personas)   
Este método debe:  
Llamar a obtenerPersonaMayor  
Mostrar:  
La persona con mayor edad es: X (edad Y)  
*En main*  
Solo debe existir:  
La creación del array de personas  
La llamada a mostrarResultado  
  
**Reglas**  
Validar que el array no sea null ni esté vacío.  
No usar streams.  
No imprimir dentro de obtenerPersonaMayor.  
Usar los métodos de la clase Persona (no acceder directamente a atributos si los hiciste private).  
<br>








  
</details>



