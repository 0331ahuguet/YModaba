/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ymodaba;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class YModaba {

    public static void main(String[] args) {
        Scanner numero = new Scanner(System.in);
        int n = numero.nextInt();
        String ymodaba = "y modaba";
        
        for(int i=0;i<=n;i++){
            String resultado = ymodaba + "a";
            System.out.println(resultado);
        }
    }
}
