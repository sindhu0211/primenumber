public class PrimeExample{
  public static void main(String[] args) {
    int num = 20;  // Define the upper limit
    int count;  // Initialize counter for divisibility checks

    
    for (int i = 1; i <= num; i++) {
      count = 0;  // Reset counter for each 'i'

      
      for (int j = 2; j <= i / 2; j++) {
        if (i % j == 0) {
          count++;  // Increment if 'i' is divisible by 'j'
          break;  // Exit loop if a divisor is found
        }
      }

     
      if (count == 0) {
        System.out.println(i);  // Output the prime number
      }
    }
  }
}