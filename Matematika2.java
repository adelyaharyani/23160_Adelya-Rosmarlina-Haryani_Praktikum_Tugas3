// Class Matematika2 yang mewarisi Matematika
public class Matematika2 extends Matematika {
    
    // Method untuk modulus
    public int modulus(int a, int b) {
        // Pastikan b bukan nol
        if (b != 0) {
            return a % b;
        } else {
            System.out.println("Error: Pembagi tidak boleh nol.");
            return 0;
        }
    }
}
 
