# Tarea: Data Binding (Daniel Rivera / Adán Gavira)

Proyecto de ejemplo para la asignatura/tarea sobre Data Binding en Android. Implementa ejemplos básicos de Data Binding (y/o View Binding) para enlazar vistas con código Kotlin, reducir boilerplate y trabajar de forma más segura con layouts.

## Contenido
- Código de la aplicación Android (Kotlin)
- Layouts que usan `<layout>` para Data Binding
- Ejemplos de uso en Activities/Fragments
- Instrucciones para compilar y ejecutar

## Objetivos
- Mostrar cómo configurar Data Binding en un módulo Android.
- Enseñar el uso de las clases binding generadas para acceder a vistas sin `findViewById`.
- Demostrar binding de propiedades en layouts (ej. binds a variables y listeners).

## Requisitos
- Android Studio (recomendado: versión 4.1+ o más reciente)
- JDK 11 (o la versión compatible con tu Android Studio)
- Gradle (el wrapper incluido en el proyecto)

## Estructura recomendada del proyecto
- app/src/main/java/... → código Java (MainActivity, ViewModels, etc.)
- app/src/main/res/layout → layouts con `<layout>` para Data Binding
- app/build.gradle → configuración del módulo (buildFeatures.dataBinding)

## Testing
- Ejecuta pruebas unitarias y de instrumentación si las hay desde Android Studio.
- Verifica bindings en tiempo de ejecución: comprueba que las vistas muestren los valores esperados y que los listeners funcionen.

## Autor y contacto
Autor: Daniel Rivera y Adán Gavira   
