/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bhaskara;

/**
 *
 * @author Admin
 */
public class Bhaskara {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double a=1,b=-5,c=6,delta=0,x1=0,x2=0;
        delta=(b)*(b)-4*a*c; 
        x1 = (-b + Math.sqrt(delta)) / 2;
        x2 = (-b - Math.sqrt(delta)) / 2;
        System.out.println("X1 e igual a: "+x1);
        System.out.println("X2 e igual a: "+x2);
    }   
}
