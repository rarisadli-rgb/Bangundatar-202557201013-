/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package latihanmethod2.pkg202557201013;
import javax.swing.JOptionPane;

public class LatihanMethod2202557201013 {

    void kalkulator(String operasi, double bil1, double bil2){
        double hasil;

        switch (operasi) {
            case "penjumlahan":
                hasil = bil1 + bil2;
                break;

            default:
                hasil = 0;
        }

        String txtMessage = "Hasil operasi " + operasi + " " + bil1 + " dan " + bil2 + " adalah " + hasil;
        JOptionPane.showMessageDialog(null, txtMessage, "Hasil Operasi", JOptionPane.PLAIN_MESSAGE);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LatihanMethod2202557201013 lm = new LatihanMethod2202557201013();
        lm.kalkulator("penjumlahan", 3, 5);  
        lm.kalkulator("pengurangan", 3, 5);    
        lm.kalkulator("perkalian", 3, 5);   
        lm.kalkulator("pembagian", 3, 5);   
    }
}