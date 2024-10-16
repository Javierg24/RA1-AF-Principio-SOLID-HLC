# Proyecto Principios SOLID

Este proyecto tiene como objetivo mostrar ejemplos prácticos de la correcta e incorrecta implementación de los principios SOLID. El código está organizado en diferentes paquetes para cada uno de los principios, con ejemplos que demuestran tanto la violación como la adherencia a los mismos.

## Estructura del Proyecto

### 1. SRP (Single Responsibility Principle)
- **SRPInocorrecta**: Ejemplo donde se viola el principio de responsabilidad única, mezclando varias responsabilidades en una única clase.
- **SRPCorrecta**: Ejemplo donde se aplica correctamente el principio, asegurando que cada clase tenga una única responsabilidad.

### 2. OCP (Open/Closed Principle)
- **OCPInocorrecta**: Ejemplo donde se viola el principio abierto/cerrado, haciendo modificaciones directas al código existente para añadir nuevas funcionalidades.
- **OCPCorrecta**: Ejemplo donde se aplica correctamente el principio, utilizando abstracciones y extensiones para evitar la modificación del código base.

### 3. LSP (Liskov Substitution Principle)
- **LSPInocorrecta**: Ejemplo donde se viola el principio de sustitución de Liskov, con subclases que no respetan el comportamiento esperado de la clase base.
- **LSPCorrecta**: Ejemplo donde se aplica correctamente el principio, asegurando que las subclases puedan reemplazar a la clase base sin romper la funcionalidad.

### 4. ISP (Interface Segregation Principle)
- **ISPInocorrecta**: Ejemplo donde se viola el principio de segregación de interfaces, con interfaces que obligan a las clases a implementar métodos que no necesitan.
- **ISPCorrecta**: Ejemplo donde se aplica correctamente el principio, utilizando interfaces específicas para cada tipo de funcionalidad.

### 5. DIP (Dependency Inversion Principle)
- **DIPInocorrecta**: Ejemplo donde se viola el principio de inversión de dependencias, con clases de alto nivel dependiendo de clases de bajo nivel directamente.
- **DIPCorrecta**: Ejemplo donde se aplica correctamente el principio, utilizando abstracciones para que las clases de alto nivel no dependan directamente de las implementaciones de bajo nivel.

---

Este proyecto está diseñado para demostrar la importancia de los principios SOLID y cómo su correcta aplicación puede mejorar la calidad del código, haciéndolo más mantenible y flexible.

