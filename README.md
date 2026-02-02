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
<br>

<h2> 🟢 EJERCICIOS NIVEL 1 </h2>

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
✔ Usar un método aparte del main  
✔ El método debe ser static  
✔ El método debe ser void  
✔ Usar un bucle for o while  
❌ No escribir toda la lógica dentro del main  
❌ No usar return  
❌ No usar arrays  
❌ No imprimir mensajes innecesarios  
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
 >, <, >=, <=, ==  
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


