# Ruta de ejercicios en Java, desde nivel básico hasta intermedio/avanzado.

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

🟢 **EJERCICIOS NIVEL 1** 

**Ejercicio 1**

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

**Ejercicio 2**

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


**Ejercicio 3**  

**Conceptos necesarios**  
Operador módulo (%)   
permite obtener el resto de una división entera.  
Un número es par si el resto de dividirlo por 2 es 0.  
Es impar si el resto es distinto de 0.  
Estructuras condicionales (if / else)  
tomar decisiones según una condición booleana.  
Comparaciones (==)  
comparar valores primitivos.  

**Consigna**
Declarar una variable entera llamada numero y determinar si el número es par o impar.
Mostrar el resultado por consola con un mensaje claro y correctamente redactado.

**Reglas**
Usar una sola estructura if / else.
No hardcodear el resultado (no escribir directamente “es par” sin evaluarlo).
El programa debe funcionar correctamente para cualquier número entero (positivo, negativo o cero).
<br>

**Ejercicio 4** – Contar del 1 al N  

**Conceptos necesarios**  
Bucles (while)  
Permiten repetir un bloque de código mientras una condición sea verdadera.  
Variables de control  
Variables que cambian su valor en cada iteración y evitan bucles infinitos.  
Condiciones booleanas  
Saber exactamente cuándo el bucle debe terminar.  

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
