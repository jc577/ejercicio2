public class Aritmetica {
    public int sumar(int a, int b) {
        return a + b;
    }

//Nombre: Melani Vanesa Ureña Vizcarra
    public int restar(int a, int b) {
        return a - b;
    }

//Ramiro Mamani Ramos
    public static long calcular(int numero) {
        long resultado = 1;
        for (int i = 1; i <= numero; i++) {
            resultado = resultado * i;
        }
        return resultado;
    }
}