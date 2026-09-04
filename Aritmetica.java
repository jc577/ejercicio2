public class Aritmetica {
    public int sumar(int a, int b) {
        return a + b;
    }

    //Nombre: Melani Vanesa Ureña Vizcarra
    public int restar(int a, int b) {
        return a - b;
    }
    
    //Nombre: Franz Orellana
    public int multiplicar(int a, int b) {
        return a * b;
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

    // Método main para probar (opcional)
    public static void main(String[] args) {
        System.out.println("Raíz cuadrada de 25: " + raizCuadrada(25));
        System.out.println("Raíz cuadrada de 2: " + raizCuadrada(2));
        System.out.println("Raíz cuadrada de 0: " + raizCuadrada(0));
        System.out.println("Raíz cuadrada de 16: " + raizCuadrada(16));
    }
}