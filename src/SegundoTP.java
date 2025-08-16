import java.util.Scanner;

public class SegundoTP {
    /**
     * 
     * 1) Año Bisiesto
     * public static void main(String[] args) {
     * 
     * Scanner scanner = new Scanner(System.in);
     * 
     * System.out.print("Ingrese un año: ");
     * int year = scanner.nextInt();
     * 
     * if (esBisiesto(year)) {
     * System.out.println(year + " es un año bisiesto.");
     * } else {
     * System.out.println(year + " no es un año bisiesto.");
     * }
     * }
     * 
     * 
     * public static boolean esBisiesto(int año) {
     * if (año % 4 == 0) {
     * if (año % 100 == 0) {
     * if (año % 400 == 0) {
     * return true;
     * } else {
     * return false;
     * }
     * } else {
     * return true;
     * }
     * } else {
     * return false;
     * }
     * }
     * 
     * 2) Mayor de Tres Números
     * public static void main(String[] args) {
     * Scanner scanner = new Scanner(System.in);
     * 
     * System.out.print("Ingrese el primer número: ");
     * int num1 = scanner.nextInt();
     * 
     * System.out.print("Ingrese el segundo número: ");
     * int num2 = scanner.nextInt();
     * 
     * System.out.print("Ingrese el tercer número: ");
     * int num3 = scanner.nextInt();
     * 
     * int mayor;
     * 
     * if (num1 >= num2 && num1 >= num3) {
     * mayor = num1;
     * } else if (num2 >= num1 && num2 >= num3) {
     * mayor = num2;
     * } else {
     * mayor = num3;
     * }
     * 
     * System.out.println("El mayor es: " + mayor);
     * }
     * 
     * 3) Clasificación de Edad
     * public static void main(String[] args) {
     * Scanner scanner = new Scanner(System.in);
     * 
     * System.out.print("Ingrese su edad: ");
     * int edad = scanner.nextInt();
     * 
     * if (edad < 12) {
     * System.out.println("Eres un Niño.");
     * } else if (edad >= 12 && edad <= 17) {
     * System.out.println("Eres un Adolescente.");
     * } else if (edad >= 18 && edad <= 59) {
     * System.out.println("Eres un Adulto.");
     * } else {
     * System.out.println("Eres un Adulto mayor.");
     * }
     * }
     * 
     * 4) Cálculo de Descuentos
     * public static void main(String[] args) {
     * Scanner scanner = new Scanner(System.in);
     * 
     * 
     * System.out.print("Ingrese el precio del producto: ");
     * double precio = scanner.nextDouble();
     * 
     * System.out.print("Ingrese la categoría del producto (A, B o C): ");
     * char categoria = scanner.next().toUpperCase().charAt(0);
     * 
     * double descuento = 0;
     * 
     * switch (categoria) {
     * case 'A':
     * descuento = 0.10;
     * break;
     * case 'B':
     * descuento = 0.15;
     * break;
     * case 'C':
     * descuento = 0.20;
     * break;
     * default:
     * System.out.println("Categoría inválida.");
     * return;
     * }
     * 
     * double montoDescuento = precio * descuento;
     * double precioFinal = precio - montoDescuento;
     * 
     * System.out.println("Precio original: " + precio);
     * System.out.println("Descuento aplicado: " + (int)(descuento * 100) + "%");
     * System.out.println("Precio final: " + precioFinal);
     * }
     * 
     * 5) Suma de Números Pares
     * public static void main(String[] args) {
     * Scanner scanner = new Scanner(System.in);
     * 
     * int numero;
     * int sumaPares = 0;
     * 
     * System.out.print("Ingrese un número (0 para terminar): ");
     * numero = scanner.nextInt();
     * 
     * while (numero != 0) {
     * if (numero % 2 == 0) {
     * sumaPares += numero;
     * }
     * System.out.print("Ingrese un número (0 para terminar): ");
     * numero = scanner.nextInt();
     * }
     * 
     * System.out.println("La suma de los números pares es: " + sumaPares);
     * }
     * 
     * 6) Contador de Positivos, Negativos y Ceros
     * public static void main(String[] args) {
     * Scanner scanner = new Scanner(System.in);
     * 
     * int positivos = 0, negativos = 0, ceros = 0;
     * 
     * for (int i = 1; i <= 10; i++) {
     * System.out.print("Ingrese el número " + i + ": ");
     * int num = scanner.nextInt();
     * 
     * if (num > 0) {
     * positivos++;
     * } else if (num < 0) {
     * negativos++;
     * } else {
     * ceros++;
     * }
     * }
     * 
     * System.out.println("Resultados:");
     * System.out.println("Positivos: " + positivos);
     * System.out.println("Negativos: " + negativos);
     * System.out.println("Ceros: " + ceros);
     * }
     * 
     * 7) Validación de Nota entre 0 y 10
     * public static void main(String[] args) {
     * Scanner scanner = new Scanner(System.in);
     * int nota;
     * 
     * do {
     * System.out.print("Ingrese una nota (0-10): ");
     * nota = scanner.nextInt();
     * 
     * if (nota < 0 || nota > 10) {
     * System.out.println("Error: Nota inválida. Ingrese una nota entre 0 y 10.");
     * }
     * 
     * } while (nota < 0 || nota > 10);
     * 
     * System.out.println("Nota guardada correctamente.");
     * }
     * 
     * 8) Cálculo del Precio Final con impuesto y descuento
     * 
     * 
     * 
     * public static void main(String[] args) {
     * Scanner scanner = new Scanner(System.in);
     * 
     * // Entrada de datos
     * System.out.print("Ingrese el precio base del producto: ");
     * double precioBase = scanner.nextDouble();
     * 
     * System.out.print("Ingrese el impuesto en porcentaje (Ejemplo: 10 para 10%):
     * ");
     * double impuesto = scanner.nextDouble() / 100; // convertir a decimal
     * 
     * System.out.print("Ingrese el descuento en porcentaje (Ejemplo: 5 para 5%):
     * ");
     * double descuento = scanner.nextDouble() / 100; // convertir a decimal
     * 
     * // Llamada al método
     * double precioFinal = calcularPrecioFinal(precioBase, impuesto, descuento);
     * 
     * // Salida
     * System.out.println("El precio final del producto es: " + precioFinal);
     * }
     * public static double calcularPrecioFinal(double precioBase, double impuesto,
     * double descuento) {
     * double precioFinal = precioBase + (precioBase * impuesto) - (precioBase *
     * descuento);
     * return precioFinal;
     * }
     * 
     * 9) Composición de funciones para calcular costo de envío y total de compra
     * 
     * 
     * public static void main(String[] args) {
     * Scanner scanner = new Scanner(System.in);
     * 
     * System.out.print("Ingrese el precio del producto: ");
     * double precioProducto = scanner.nextDouble();
     * 
     * System.out.print("Ingrese el peso del paquete en kg: ");
     * double peso = scanner.nextDouble();
     * 
     * scanner.nextLine();
     * System.out.print("Ingrese la zona de envío (Nacional/Internacional): ");
     * String zona = scanner.nextLine();
     * 
     * double costoEnvio = calcularCostoEnvio(peso, zona);
     * double total = calcularTotalCompra(precioProducto, costoEnvio);
     * 
     * System.out.println("El costo de envío es: " + costoEnvio);
     * System.out.println("El total a pagar es: " + total);
     * }
     * 
     * public static double calcularCostoEnvio(double peso, String zona) {
     * if (zona.equalsIgnoreCase("Nacional")) {
     * return peso * 5.0;
     * } else if (zona.equalsIgnoreCase("Internacional")) {
     * return peso * 10.0;
     * } else {
     * System.out.println("Zona no conocida.Costo de envío 0.");
     * return 0;
     * }
     * }
     * public static double calcularTotalCompra(double precioProducto, double
     * costoEnvio) {
     * return precioProducto + costoEnvio;
     * }
     * 
     * 10) Composición de funciones para calcular costo de envío y total de compra
     * 
     * 
     * 
     * public static void main(String[] args) {
     * Scanner scanner = new Scanner(System.in);
     * 
     * System.out.print("Ingrese el stock actual del producto: ");
     * int stockActual = scanner.nextInt();
     * 
     * System.out.print("Ingrese la cantidad vendida: ");
     * int cantidadVendida = scanner.nextInt();
     * 
     * System.out.print("Ingrese la cantidad recibida: ");
     * int cantidadRecibida = scanner.nextInt();
     * 
     * int nuevoStock = actualizarStock(stockActual, cantidadVendida,
     * cantidadRecibida);
     * 
     * System.out.println("El nuevo stock del producto es: " + nuevoStock);
     * }
     * 
     * public static int actualizarStock(int stockActual, int cantidadVendida, int
     * cantidadRecibida) {
     * int nuevoStock = stockActual - cantidadVendida + cantidadRecibida;
     * return nuevoStock;
     * }
     * 
     * 11) Cálculo de descuento especial usando variable global
     * 
     * 
     * 
     * final static double DESCUENTO_ESPECIAL = 0.10;
     * 
     * 
     * public static void main(String[] args) {
     * Scanner scanner = new Scanner(System.in);
     * 
     * System.out.print("Ingrese el precio del producto: ");
     * double precio = scanner.nextDouble();
     * 
     * calcularDescuentoEspecial(precio);
     * }
     * 
     * public static void calcularDescuentoEspecial(double precio) {
     * double descuentoAplicado = precio * DESCUENTO_ESPECIAL;
     * double precioFinal = precio - descuentoAplicado;
     * 
     * System.out.println("El descuento especial aplicado es: " +
     * descuentoAplicado);
     * System.out.println("El precio final con descuento es: " + precioFinal);
     * }
     * 12) Modificación de un array de precios y visualización de resultados
     * 
     * 
     * public static void main(String[] args) {
     * double[] precios = {199.99, 299.5, 149.75, 399.0, 89.99};
     * 
     * 
     * System.out.println("Precios originales:");
     * for (double precio : precios) {
     * System.out.println("Precio: $" + precio);
     * }
     * precios[2] = 129.99;
     * 
     * System.out.println("Precios modificados:");
     * for (double precio : precios) {
     * System.out.println("Precio: $" + precio);
     * }
     * }
     * 
     * 12) Impresión recursiva de arrays antes y después de modificar un elemento
     * 
     */

    public static void main(String[] args) {
        double[] precios = { 199.99, 299.5, 149.75, 399.0, 89.99 };

        System.out.println("Precios originales:");
        mostrarPrecios(precios, 0);
        precios[2] = 129.99;

        System.out.println("Precios modificados:");
        mostrarPrecios(precios, 0);
    }

    public static void mostrarPrecios(double[] precios, int indice) {
        if (indice == precios.length) {
            return;
        }
        System.out.println("Precio: $" + precios[indice]);

        mostrarPrecios(precios, indice + 1);
    }

}
