import java.util.*;
public class Array1 {
    public static void arg(int marks[]){
        for(int i=0;i<marks.length;i++){
            marks[i]=marks[i]+2;
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int marks[]= {89,90,97};
        arg(marks);
        for(int i=0;i<marks.length;i++){
            System.out.println(marks[i]);
        }
    }
}
