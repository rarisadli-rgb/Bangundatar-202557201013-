/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prcbn3;
import javax.swing.JOptionPane;

/**
 *
 * @author LENOVO
 */
public class Prcbn3 {

    public static double luaspersegipanjang(double p, double I) {
        return p * I; 
    }
    
    public static double luassegitiga(double alas, double tinggi) {
        return 0.5 * alas * tinggi;
    }
    
    public static double luaslingkaran(double r) {
        return Math.PI * r * r;
    }
    
    public static void main(String[] argh) {
        
        double p =
                Double.parseDouble(JOptionPane.showInputDialog("Masukkan panjang:"));
        double I =
                Double.parseDouble(JOptionPane.showInputDialog("Masukkan lebar:"));
                double luasPP = luaspersegipanjang(p, I);
                
        double alas =
                Double.parseDouble(JOptionPane.showInputDialog("Masukkan alas:"));
        double tinggi =
                Double.parseDouble(JOptionPane.showInputDialog("Masukkan tinggi"));
                double luasS = luassegitiga(alas, tinggi);
                
        double r =
                Double.parseDouble(JOptionPane.showInputDialog("Masukkan jari-jari:"));
                double luasL = luaslingkaran(r);
                
                JOptionPane.showMessageDialog(null,
                        "luas persegi panjang = " + luasPP +
                        "\nluas segitiga = " + luasS +
                        "\nluas linkaran = " + luasL);
     
                
    }

}