/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package findemesrendimiento1;

import java.io.IOException;

/**
 *
 * @author isma
 */


                public class Main {
                /**
                * @param args the command line arguments
                */
                public static void main(String[] args) {
                java.io.BufferedReader in = new java.io.BufferedReader(
                new java.io.InputStreamReader(System.in));
                try {
                int numeroCasos = Integer.parseInt(in.readLine());
                for (int x = 1; x <= numeroCasos; x++) {
                String[] partes=in.readLine().split(" ");
                System.out.println(casoDePrueba(Integer.parseInt(partes[0]), Integer.parseInt(partes[1])));
                }

                } catch (IOException iOException) {
                }
                }

                public static String casoDePrueba(int n1, int n2) {
                return n1 + n2 < 0 ? "NO" : "SI";
                }
                }


    
