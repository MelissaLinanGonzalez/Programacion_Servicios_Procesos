# Tarea 2

---
## Ejercicio 1 - Hilos 🪡
Crear un programa que sea capaz de contar cuántas vocales hay en un fichero.
El programa padre debe lanzar cinco hilos hijos, donde cada uno de ellos se ocupará de contar una vocal concreta (que puede ser mayúscula o minúscula).
Cada subproceso que cuenta las vocales deberá dejar el resultado en un fichero.
El programa padre se ocupará de recuperar los resultados de los ficheros, sumar todos los subtotales y mostrar el resultado final en pantalla.

---
## Ejercicio 2 - Productor y Consumidor con Buffer 🏭 Productor – 📦 Buffer – 🍴 Consumidor
Crea un programa en Java que simule el problema Productor - Consimidor, pero con un buffer de tamaño limitado (por ejemplo, 3 posiciones):
- El Productor 🏭 debe ir generando números 🔢 y guardarlos en el buffer 📦📦📦.
- El Consumidor 🍴 debe ir sacando esos números 🔢 del buffer 📦 y mostrándolos por pantalla.
- Si el buffer está lleno, el Productor debe esperar hasta que el Consumidor libere espacio.
- Si el buffer está vacía, el Consumidor debe esperar hasta que el Productor produzca algo.
- Usa wait() ⏳ y notifyAll() 🔔 para coordinar la comunicación entre hilos

Inicialmente, hacer el ejercicio con un 1 Productor y 1 Consumidor. Posteriormente, ampliar a 2 y 2.