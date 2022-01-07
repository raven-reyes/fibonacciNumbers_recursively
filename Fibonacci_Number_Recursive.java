
public class Fibonacci_Number_Recursive {
public static int Rec_Fibonacci_Number(int n) {
	// if n is equals to 1 or less than 1 , return n
	if(n <= 1) {
		return n;
	}
	// recursive call 
	return Rec_Fibonacci_Number(n-1)  + Rec_Fibonacci_Number(n-2);
}
    // driver code
	public static void main(String[] args) {
		int n = -4;
		System.out.println(Rec_Fibonacci_Number(n));

	}

}



