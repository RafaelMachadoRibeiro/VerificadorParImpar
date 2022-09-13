/*
 Desenvolver um programa que diz qual número é impar e qual número é par, 
através do resto. 
 */
package detector.numero.par.e.impar;
import java.util.Scanner;
public class DetectorNumeroParEImpar {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    
    String f1 = "Programa desenvolvido para descobrir se o número é par ou impar.";
    String f2 = "Digite aqui um número e verifique se ele é par ou não:";
    String r1 = "Seu número é par!";
    String r2 = "Seu número é impar!";
    String epc = " ";
    
    int nmr = 0;
    int div = 2;
      
    int par = 0;
    int imp = 1;
            
    System.out.println(f1);
    System.out.println(f2);

    nmr = in.nextInt (); 
    
    int resto = nmr % div; // Calculo para verificar se o numero e par ou nao.
    
    if(resto<imp){  // Verificador, se for 0 é par
    System.out.println(epc);
    System.out.println(r1); 
    } else {
    System.out.println(epc);
    System.out.println(r2);  // Verificador, se não for par é impar
    }
    }
}
