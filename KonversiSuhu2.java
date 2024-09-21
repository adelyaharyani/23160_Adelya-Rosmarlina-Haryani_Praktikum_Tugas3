
package Tugas3;

// Class KonversiSuhu2 yang mewarisi KonversiSuhu
public class KonversiSuhu2 extends KonversiSuhu {
    
    // Method untuk mengonversi Fahrenheit ke Reamur
    public double fahrenheitToReamur(double fahrenheit) {
        double celcius = (fahrenheit - 32) * 5/9;  // Konversi Fahrenheit ke Celcius terlebih dahulu
        return celcius * 4/5;  // Lalu konversi Celcius ke Reamur
    }
}

