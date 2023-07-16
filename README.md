# Conversor de Divisas y Unidades

Este proyecto tiene como objetivo desarrollar un conversor de divisas y unidades utilizando el lenguaje Java. El programa permitirá a los usuarios convertir entre diferentes monedas y unidades de medida de manera sencilla. Además de las características básicas de conversión de divisas, se ha implementado la conversión de longitud, temperatura y masa como un desafío extra.

![](https://github.com/minaguevara/conversor/blob/main/conversor.gif)

## Características

El convertidor de divisas debe cumplir con los siguientes requisitos:
  - Convertir de Pesos Mexicanos a Dólar.
  - Convertir de Pesos Mexicanos a Euros.
  - Convertir de Pesos Mexicanos a Libras Esterlinas.
  - Convertir de Pesos Mexicanos a Yen Japonés.
  - Convertir de Pesos Mexicanos a Won surcoreano.

También, debe permitir la conversión inversa para todas las monedas mencionadas.

## Extras
Además de los requisitos mencionados anteriormente, se han agregado las siguientes funcionalidades adicionales:
  - Conversor de Masa.
  - Conversor de Temperatura.
  - Conversor de Longitud.

## Métodos y Bibliotecas

El proyecto utiliza las siguientes bibliotecas y métodos:
  - Biblioteca Javax: Se utiliza la biblioteca Javax para implementar cuadros de diálogo y la interfaz gráfica de usuario (GUI). En particular, se utiliza la clase JOptionPane para mostrar cuadros de diálogo al usuario y obtener su entrada.
  - Biblioteca Gson: Se utiliza la biblioteca Gson para implementar el API de obtención de valores de cambio. Gson facilita el manejo de datos en formato JSON y nos permite obtener los valores de cambio de divisas de manera eficiente.

#### Cuadro de Diálogo
  - El programa utiliza la clase `JOptionPane` de la biblioteca Javax para presentar un cuadro de diálogo al usuario. Este cuadro de diálogo permite al usuario seleccionar la opción de conversión deseada, como divisas, longitud, temperatura o masa. La clase `JOptionPane` proporciona métodos como `showInputDialog` para mostrar opciones al usuario y obtener su selección.
  - Utilizando el cuadro de diálogo, el usuario puede elegir la opción deseada y el programa procederá a realizar la conversión correspondiente según su elección.

## Estructura del Proyecto

El proyecto está organizado en dos paquetes Java: `aplicacion` y `conversiones`. A continuación se describen las clases en cada paquete:

<b>Paquete `aplicacion`</b>:
  - `IniciarAplicacion`: Esta clase es la entrada principal del programa y se encarga de iniciar la aplicación.
  - `MenuPrincipal`: Esta clase muestra el menú principal al usuario y gestiona las opciones seleccionadas.
  - `MensajeFinal`: Esta clase muestra el mensaje final al usuario cuando el programa finaliza.

<b>Paquete `conversiones`</b>:
  - `Divisas`: Esta clase maneja las conversiones de divisas utilizando una API externa para obtener los valores de cambio.
  - `DivisasAPI`: Esta clase se encarga de realizar la solicitud a la API de divisas y obtener los valores de cambio actualizados.
  - `DivisasCalculo`: Esta clase realiza los cálculos de conversión de divisas.
  - `Longuitud`: Esta clase maneja las conversiones de longitud.
  - `Masa`: Esta clase maneja las conversiones de masa.
  - `Temperatura`: Esta clase maneja las conversiones de temperatura.

## Uso

Para utilizar el Conversor de Divisas, sigue estos pasos:
 - Clona el repositorio en tu máquina local.
 - Abre el proyecto en tu entorno de desarrollo Java favorito.
 - Ejecuta el archivo principal CurrencyConverter.java.
 - Sigue las instrucciones proporcionadas por la interfaz de usuario para realizar las conversiones deseadas.
¡Disfruta de la versatilidad del Conversor de Divisas!

## Contribución

Si deseas contribuir a este proyecto, puedes seguir los pasos a continuación:
 - Realiza un fork de este repositorio.
 - Crea una rama con una nueva funcionalidad o corrección de errores: `git checkout -b nombre-de-la-rama`.
