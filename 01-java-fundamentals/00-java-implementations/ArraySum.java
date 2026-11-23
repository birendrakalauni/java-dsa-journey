public class ArraySum{
    public static int calculateSum(int[] numbers){
        int sum =0;
        for(int i = 0; i < numbers.length; i++){
            sum += numbers[i];
        }
        return sum;
    }

    public static void main(String[] args){
int[] numbers = { 10, 20, 30, 40, 50, 77};
int result = calculateSum(numbers);
System.out.println("Sum: "+ result);
}
}

/** Complexity analysis
Let n represent the number of array elements.

Complexity:  	    Result:	      Reason:
Time:-   	        O(n)	      Every element is visited once.
Auxiliary space:-	O(1)	      Only one additional variable is used. */