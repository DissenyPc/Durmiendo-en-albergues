# Durmiendo en albergues (Problema 400 - ¡Acepta el Reto!)

Esta aplicación proporciona una solución en Java para el **Problema 400: Durmiendo en albergues**, un conocido reto de programación competitiva de la plataforma española [¡Acepta el Reto!](https://aceptaelreto.com/), originalmente propuesto en la III Edición de AdaByron (2017).

---

## 📋 Descripción del Problema

En el Camino de Santiago, al llegar a un albergue, los peregrinos desean elegir una cama que maximice la distancia física con respecto a las demás personas que ya están durmiendo, con el fin de minimizar ruidos y molestias (como los ronquidos).

Las camas del albergue se representan en una sola fila mediante una cadena de caracteres:
- El caracter `.` representa una **cama libre**.
- El caracter `X` representa una **cama ocupada**.

El objetivo es determinar la **máxima distancia de seguridad** (medida como el número de camas libres consecutivas entre el peregrino y su vecino más cercano) que se puede conseguir al elegir la mejor cama posible.

### Ejemplos de Funcionamiento:
* **Entrada**: `...X` $\rightarrow$ **Salida**: `2`
  * Si te colocas en la primera cama (`Y..X`), hay 2 camas libres de separación con el vecino de la derecha.
* **Entrada**: `X...X` $\rightarrow$ **Salida**: `1`
  * Al colocarte en el medio (`X.Y.X`), la distancia al vecino más cercano (tanto a izquierda como a derecha) es de 1 cama libre.
* **Entrada**: `...X.X...` $\rightarrow$ **Salida**: `2`
  * La mejor opción es colocarse en el extremo izquierdo o el extremo derecho, dejando 2 camas libres de separación.

---

## 🛠️ Estructura del Proyecto

El espacio de trabajo contiene la estructura estándar de un proyecto Java en VS Code:

* **[src/controlador/inicio.java](file:///d:/designer%20app%20web/JAVA%20VISUAL%20CODE/Durmiendo%20en%20albergues/DurmiendoEnAlbergues/src/controlador/inicio.java)**: Contiene el código fuente de la solución.
* **bin/**: Directorio destinado a los archivos compilados (`.class`). Excluido del control de versiones mediante el archivo [.gitignore](file:///d:/designer%20app%20web/JAVA%20VISUAL%20CODE/Durmiendo%20en%20albergues/DurmiendoEnAlbergues/.gitignore).
* **.vscode/**: Configuraciones del espacio de trabajo para Visual Studio Code.

---

## 🚀 Cómo Ejecutar la Aplicación

### Requisitos Previos
* Tener instalado el **Java Development Kit (JDK)** (versión 8 o superior).

### Compilación
Desde la raíz del proyecto, ejecuta el siguiente comando en tu terminal para compilar el código fuente:

```bash
javac -d bin src/controlador/inicio.java
```

### Ejecución
Para ejecutar la aplicación interactiva (que leerá de la entrada estándar `System.in` línea por línea), ejecuta:

```bash
java -cp bin controlador.inicio
```

También puedes redirigir un archivo de prueba a la entrada de la aplicación:

```bash
java -cp bin controlador.inicio < ruta/a/tu/archivo_de_pruebas.txt
```
