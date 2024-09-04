import java.util.Scanner;

public class reversArray {
    public static void revers(int numbers[]){
        int start=0,end=numbers.length-1;
        while(start < end){
            int temp=numbers[end];
            numbers[end]=numbers[start];
            numbers[start]=temp;
            start++;
            end--;

        }
    }
    public static void main(String[] args) {
        int numbers[]={45,67,89,34,67,99};
        revers(numbers);
        for(int i=0;i< numbers.length;i++){
            System.out.print(numbers[i]+" ");
        }
        System.out.println();
    }
}
