/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prcbn.pkg2;

/**
 *
 * @author LENOVO
 */
public class Prcbn2 {
    public double luas_lingkaran(int diameter) {
        int jari2 = diameter / 2;
        double luas = Math.PI * Math.pow(jari2, 2);
        return luas;
    }
    public static void main(String[] args) {
        Prcbn2 mt = new Prcbn2();
        System.out.println(mt.luas_lingkaran(20));
        System.exit(0);
    }
    
}

