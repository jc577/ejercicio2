public class Aritmetica {

    // Función: Raíz Cuadrada
    // Torrico Copali Jorge David

    public static double raizCuadrada(double numero) {
        if (numero < 0) {
            throw new IllegalArgumentException("No se puede calcular raíz cuadrada de un número negativo");
        }

        // Caso especial: raíz de 0 es 0
        if (numero == 0) {
            return 0;
        }

        // Calcular y retornar la raíz cuadrada
        return Math.sqrt(numero); 
    }

    // Método main para probar
    public static void main(String[] args) {
        System.out.println("Raíz cuadrada de 25: " + raizCuadrada(25));
        System.out.println("Raíz cuadrada de 2: " + raizCuadrada(2));
        System.out.println("Raíz cuadrada de 0: " + raizCuadrada(0));
        System.out.println("Raíz cuadrada de 16: " + raizCuadrada(16));
    }
}
