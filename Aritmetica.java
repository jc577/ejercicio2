public class Aritmetica {
    //Nombre: Jose Carlos Rojas Leon
    public int sumar(int a, int b) {
        return a + b;
    }

    //Nombre: Ureña Vizcarra Melani Vanesa
    public int restar(int a, int b) {
        return a - b;
    }

    // Nombre: Franz Orellana
    public int multiplicar(int a, int b) {
        return a * b;
    }

    // Nombre: Mishel Stefani Ticona Chura
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    // Torrico Copali Jorge David - Función: Raíz Cuadrada
    public static double raizCuadrada(double numero) {
        if (numero < 0) {
            throw new IllegalArgumentException("No se puede calcular raíz cuadrada de un número negativo");
        }

        if (numero == 0) {
            return 0;
        }

        return Math.sqrt(numero);
    }

    // Santos Marca Maria Clara - Función: POTENCIA
    public static double potencia(double base, double exponente) {
        return Math.pow(base, exponente);
    }

    //Nombre: Quispe Rocha Oliver Cristian
    public static int Logaritmo10(int numero) {
        int resultado = 0;

        while (numero >= 10) {
            numero = numero / 10;
            resultado++;
        }

        return resultado;
    }

    // Herlan Ibañez Condori - Función: DIVISIÓN
    public static int division(int x, int y) {
        if (y == 0) {
            System.out.println("No se puede dividir entre 0");
            return 0;
        }

        return x / y;
    }

    //Ramiro Mamani Ramos
    public static long calcular(int numero) {
        long resultado = 1;

        for (int i = 1; i <= numero; i++) {
            resultado = resultado * i;
        }

        return resultado;
    }

    // Método main para probar
    public static void main(String[] args) {

        System.out.println("Suma de 5 + 3: " + new Aritmetica().sumar(5, 3));

        System.out.println("Resta de 5 - 3: " + new Aritmetica().restar(5, 3));

        System.out.println("Multiplicación de 5 * 3: " + new Aritmetica().multiplicar(5, 3));

        System.out.println("Fibonacci de 6: " + fibonacci(6));

        System.out.println("Raíz cuadrada de 25: " + raizCuadrada(25));

        System.out.println("Potencia de 2^3: " + potencia(2, 3));

        System.out.println("Logaritmo base 10 de 1000: " + Logaritmo10(1000));

        System.out.println("División de 10/2: " + division(10, 2));

        System.out.println("Factorial de 5: " + calcular(5));
    }
}