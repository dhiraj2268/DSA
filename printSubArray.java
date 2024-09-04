public class printSubArray {
    public static void subAraay(int numbers[]){
        int t=0;
        for(int i=0;i<numbers.length;i++){
            int start=i;
            for(int j=i;j<numbers.length;j++){
                int end=j;
                for(int k=start;k<=end;k++){
                    System.out.print(numbers[k]+ " ");
                }
                t++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("total subArray is "+ t);
    }

    public static void main(String[] args) {
        int numbers[]={45,67,89,34,67,99};
        subAraay(numbers);
    }
}
