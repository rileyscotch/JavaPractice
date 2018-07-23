public class Application {
    public static void main(String[] args) {

        //Allocates enough memory, 32 bits to create 1 integer
        int value = 7;

        //Names an array of integers called values
        int[] values;

        //Allocates enough memory for 5 integers to be stored in the array called values
        values = new int[5];

        //Prints default value of 0
        System.out.println(values[0]);

        //Declare value
        values[0] = 13;
        values[1] = 23;
        values[2] = 33;
        values[3] = 43;
        values[4] = 53;


        //Now prints value
        System.out.println(values[0]);

        //Iterating for loop
        for(int i=0; i < values.length; i++) {
            System.out.println(values[i]);
        }

        int[] numbers = {5,6,7};

        for(int i=0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

    }
}
