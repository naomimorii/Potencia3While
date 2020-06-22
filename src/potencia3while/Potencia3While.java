/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package potencia3while;


public class Potencia3While {

    public static void main(String[] args) {
        double x;
        int i;
        i=0;
        
        while (i<=15)
        {
          x=Math.pow(3,i);
          System.out.print(x +" \n ");
          i++;
        }
    }
    
}
