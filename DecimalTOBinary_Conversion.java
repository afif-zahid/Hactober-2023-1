public class DecimalTOBinary_Conversion { 

	// Main driver method 
	public static void main(String[] args) 
	{ 
    //----------------------------------------------------------
    //For user input (add the import java.util.*; ) at the top
    // Scanner sc = new Scanner(System.in);
    // int decimal = sc.nextInt();
    //----------------------------------------------------------
		int decimal = 10; 
		String binary = decimalToBinary(decimal); 
		System.out.println("Decimal: " + decimal); 
		System.out.println("Binary: " + binary); 
	} 

	public static String decimalToBinary(int n) 
	{ 
		int remainder, quotient = n; 
		String binaryNum = ""; 
		while (quotient > 0) { 
			remainder = quotient % 2; 
			binaryNum 
				= Integer.toString(remainder) + binaryNum; 
			quotient = quotient / 2; 
		} 
		return binaryNum; 
	} 
}
