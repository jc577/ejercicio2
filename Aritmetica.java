public class Aritmetica {
    public int sumar(int a, int b) {
        return a + b;
    }

    // Nombre: Melani Vanesa Ureña Vizcarra
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

    // Herlan Ibañez Condori - Función: DIVISIÓN
    public static int division(int x, int y) {
        if (y == 0) {
            System.out.println("No se puede dividir entre 0");
            return 0;
        }
        return x / y;
    }

    // Método main para probar (opcional)
    public static void main(String[] args) {
        System.out.println("Raíz cuadrada de 25: " + raizCuadrada(25));
        System.out.println("Raíz cuadrada de 2: " + raizCuadrada(2));
        System.out.println("Raíz cuadrada de 0: " + raizCuadrada(0));
        System.out.println("Raíz cuadrada de 16: " + raizCuadrada(16));
        System.out.println("Potencia de 2^3: " + potencia(2, 3));
        System.out.println("Potencia de 5^2: " + potencia(5, 2));
        System.out.println("Potencia de 10^0: " + potencia(10, 0));
        System.out.println("Division de 2/2: " + division(2, 2));
        System.out.println("Division de 2/0: " + division(2, 0));
    }
}
