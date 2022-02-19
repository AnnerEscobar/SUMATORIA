/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Anner
 */
public class Sumatoria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] numeros = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        int contador = 0;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                contador++;
            } else if (numeros[i] == 5) {
                contador = contador + 5;
            } else if (numeros[i] % 2 != 0 && numeros[i] != 5) {
                contador = contador + 3;
            }
        }
        System.out.println("lA SUMATORIA ES " + contador);

    }

}
