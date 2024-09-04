import java.util.Scanner;

public class BinarySrs {
    public static int BinarySearch(int numbers[], int k){
        int start=0,end=numbers.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(numbers[mid] == k){
                return  mid;
            } else if (numbers[mid]<k) {
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int numbers[]={3,4,6,8,9,11,23,43,45,46};
        int k=23;
        System.out.println("the key is "+ BinarySearch(numbers,k));

    }
}
