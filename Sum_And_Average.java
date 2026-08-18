import java.util.Scanner;

public class Sum_And_Average {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("Enter the count: ");
        int count = scr.nextInt();
        int elem, sum = 0;
        for(int i =0; i<count; i++){
            elem = scr.nextInt();
            sum+= elem;
        }
        // Both sum and count are int, so Java performs integer division first.
        //sum = 10
        //count = 3
        //10 / 3 = 3
        //Only after getting 3 does Java convert it to float, so avg becomes 3.0.
        //Make either operand a float: (float) sum or (float) count

        float avg = (float) sum/count;
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + avg);
    }
}