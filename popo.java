Aquí tienes un código básico en Java, completo y listo para compilar y ejecutar.
Incluye entrada de datos, procesamiento y salida, con validación de errores.
Javaimport java.util.Scanner;

public class HolaMundo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Solicitar nombre al usuario
            System.out.print("Ingrese su nombre: ");
            String nombre = scanner.nextLine().trim();

            // Validar que no esté vacío
            if (nombre.isEmpty()) {
                System.out.println("Error: El nombre no puede estar vacío.");
                return;
            }

            // Solicitar edad
            System.out.print("Ingrese su edad: ");
            if (!scanner.hasNextInt()) {
                System.out.println("Error: Debe ingresar un número entero para la edad.");
                return;
            }
            int edad = scanner.nextInt();

            // Validar edad
            if (edad < 0) {
                System.out.println("Error: La edad no puede ser negativa.");
                return;
            }

            // Salida
            System.out.println("Hola, " + nombre + ". Tienes " + edad + " años.");

        } catch (Exception e) {
            System.out.println("Ocurrió un error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}

Cómo ejecutar este programa

Guarda el archivo como HolaMundo.java.
Compila en la terminal:Bashjavac HolaMundo.java


Ejecuta:Bashjava HolaMundo



Características

Entrada de texto y números usando Scanner.
Validación de datos para evitar errores.
Manejo de excepciones con try-catch.
Código claro y comentado.


Si quieres, puedo prepararte otro ejemplo básico en Java que incluya operaciones matemáticas y estructuras de control (if, for, while).
¿Quieres que te lo haga?
