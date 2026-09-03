public static double restar(double... numeros) {
    if (numeros.length == 0) {
        throw new IllegalArgumentException("Debe ingresar al menos un número");
    }

    double resultado = numeros[0];

    for (int i = 1; i < numeros.length; i++) {
        resultado -= numeros[i];
    }

    return resultado;
}