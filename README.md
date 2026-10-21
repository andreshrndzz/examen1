\# Examen 1 - Programacion 3



Este repositorio contiene la solución al Examen 1, estructurado en tres partes principales correspondientes a los requerimientos de la evaluación.



\## Clases Principales (Main)

El proyecto contiene tres clases ejecutables (`main`) para demostrar el funcionamiento de cada módulo:



1\. \*\*`examen1.entidades.PruebaDocumentos`\*\*: Demuestra la aplicación de herencia y polimorfismo calculando el cierre de caja sin el uso de condicionales.

2\. \*\*`examen1.estructuras.PruebaHistorial`\*\*: Demuestra la implementación manual de una lista enlazada simple mediante nodos autorreferenciados (`NodoEstado`) para registrar y manipular el historial de un documento.

3\. \*\*`examen1.colecciones.PruebaIndice`\*\*: Demuestra el uso de la biblioteca de colecciones nativa (`ArrayList` y `Collections`) para ordenar con `Comparable` y buscar con `binarySearch`.



\## Cómo ejecutar las pruebas (JUnit 5)

El proyecto incluye pruebas unitarias para validar las reglas de negocio, los cálculos de impuestos/descuentos y el comportamiento polimórfico\[cite: 3, 7].



Para ejecutarlas en Apache NetBeans:

1\. Expanda la carpeta \*\*Test Packages\*\* en el panel de \*Projects\*.

2\. Ubique el archivo de pruebas `DocumentoTest.java` (o `ServicioFacturacionTest.java` si se consolidó la lógica).

3\. Haga clic derecho sobre el archivo y seleccione \*\*Test File\*\*.

4\. NetBeans ejecutará JUnit y mostrará los resultados (la barra en verde) en la ventana de consola inferior (Test Results).

