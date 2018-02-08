package bindec1;

public class bindec1 {

	public static void main (String[] args) {  
		long num = 10110101;
        int decimal = convertBinaryToDecimal(num);
        System.out.printf("%d em bin�rio = %d em decimal", num, decimal);
    }

    public static int convertBinaryToDecimal(long num)
    {
        int decimalNumber = 0, i = 0;
        long remainder;
        while (num != 0)
        {
            remainder = num % 10;
            num /= 10;
            decimalNumber += remainder * Math.pow(2, i);
            ++i;
        }
        return decimalNumber;
    }
}