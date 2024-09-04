import java.util.Scanner;

public class linearSrs {
    public static int LinerSrs(int numbers[],int n){
        for(int i=1;i<numbers.length;i++){
            if(numbers[i]==n){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int numbers[]={1,7,10,30,50,69,90,45};
        int n=59;
        System.out.println(LinerSrs(numbers,n));
    }
}
