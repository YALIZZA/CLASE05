package funciones;

import java.lang.Math;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        exampleMath();
        exampleRamdon();
        exampleString();

    }

    private static void exampleString() {
        var name = "Yalizza elayne Torres Caballero";
        System.out.println(name.length());
        System.out.println(name.toUpperCase());// mayusculas
        System.out.println(name.toLowerCase());// minisculas
        System.out.println(name.substring(0, 7));// imprimir desde un caracter a otro
        System.out.printf("el caracter de la posicion 5 es %c %n", name.charAt(5));// caracter especifico

        var lastSpaceIndex = name.lastIndexOf(" ");// buscar el ultimo espacio
        System.out.println(name.substring(lastSpaceIndex + 1));// imprimir desde el ultimo espacio + 1

        var input = "    asfgdf    12121244245";
        System.out.println(input.trim());// quitar espacios de cadena a los lados
        System.out.println(input.contains("12"));// verificar si existe algo
        System.out.println(input.indexOf("12"));// imprimir si existe la primera
        System.out.println(input.lastIndexOf("12"));// imprimir la ultima coincidencia
    }

    private static void exampleRamdon() {
        var random = new Random();

        for (int i = 0; i < 10; i++) {
            System.out.println(random.nextInt(10) + 1);// 0 - n-1
        }
    }

    private static void exampleMath() {
        System.out.println(Math.min(5, 7));
        System.out.println(Math.sqrt(125));
        System.out.println(Math.pow(2, 3));
    }
}
