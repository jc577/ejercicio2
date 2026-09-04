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
}
