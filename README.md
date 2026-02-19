# Patrón Builder: Aplicación al problema Fast Food

## 1. Descripción del problema

Se diseñó un programa usando el patrón/modelo de programación Builder para resolver un problema de cadena de comidas, en donde se quiere solucionar la creación de objetos complejos con múltiples configuraciones; en este caso una hamburgesa con múltiples opciones de ingredientes. La solución del problema se desarrolla en este proyecto.

## 2. Diagrama UML

Este diagrama UML permite ver las clases que componen al programa que se describirán posteriormente, además incluye los métodos usados para la construcción del programa.
<img width="1440" height="950" alt="Builder_Diagram" src="https://github.com/user-attachments/assets/30dce5ec-39dc-44dd-8172-103283423f0b" />

## 3. Descripción de elementos

### Director

Responsabilidad: Define el orden en el que se ejecutan los pasos de construcción, sin saber los detalles que componen al producto final.

**Métodos:**

`buildNormalHamburger` : Orden de instrucciones para una hamburguesa sin ingredientes extra.

`buildExtraIngredients` : Orden de instrucciones para hamburgesa con ingredientes extra.

### HamburgerBuilder

Define los pasos para construir una hamburguesa, es una interfaz que se implementa en cada hamburguesa.

**Métodos:**
Se describen los métodos que servirán para cada hamburguesa.

`reset()`

`buildBread()`

`buildMeat()`

`buildCheese()`

`buildExtraIngredients()`

`getFinishedBurger()`

### Hamburguesas específicas:

Se tienen clases para hamburgesas específicas, en donde implementan el builder de hamburgesa, agregando a cada una sus componentes espefíficos.

Entre estas hamburguesas se encuentran:

- `CheeseBurger` : Hamburguesa con queso y ingredientes extra.

- `PotatoBurger` : Hamburguesa sin queso vegetariana con papas.

- `ClassicBurger` : Hamburguesa clásica sin queso ni ingredientes extra.


### Producto

Clase: Hamburger

Responsabilidad: Representa la hamburguesa terminada.

**Método:**

- `finishHamburger`

## 4. Ventajas de aplicación

Gracias a la aplicación del patrón podemos ver que se tienen mejorías considerables.

- Fácil de agregar un nuevo tipo de hamburguesa con especificaciones congruentes.

- Es organizado y fácil de modificar.

- Estructuración que respeta el patrón, ayudando a la mejoría del mismo.
