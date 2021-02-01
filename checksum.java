import java.io.PrintStream;
import java.util.Scanner;

class checksum  
{  

  private static PrintStream printf;

public static void main(String args[]) {

    final int max_int = 255;  // The maximum size for the input
    int firstSum = 0; 
    int secondSum= 0;
    int sum = 0;
              // Note that the "sum" might exceed max_int
    int checksum = 0;  
    int afterChecksum = 4;
    int input;
    int moreInput = 0;
      // The value of the 6th input integer
    int quotient;
             // The result of evaluating the assignment:  quotient   = sum / (max_int + 1);
    int remainder;            // The result of evaluating the assignment:  remainder  = sum % (max_int + 1 );
    int complement;     
    int beforeChecksum = 5;
     // The result of evaluationg the assignment: complement = max_int - sum;

    Scanner stdin = new Scanner(System.in);


 for (int i = 0; i < beforeChecksum; i++)
 {
  input = stdin.nextInt();
   firstSum = firstSum + input;
 }
 
 checksum = stdin.nextInt();

for (int count = 0; count < afterChecksum; count++)
 {
  moreInput = stdin.nextInt();
  secondSum = secondSum + moreInput;
 }
 sum = firstSum + secondSum;
 
  quotient = sum/ (max_int + 1);
  remainder = sum% (max_int + 1);
  sum = quotient + remainder;
 complement = max_int - sum;
 System.out.println(complement);
 System.out.printf("Stored Checksum: %d, Computed Checksum: %d\n", checksum, complement);
 if (checksum != complement ) {
   System.err.printf("Error Detected!\n");  



stdin.close();
}
}}

 


