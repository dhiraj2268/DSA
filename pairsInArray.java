public class pairsInArray {
    public  static void pairArray(int numbers[]){
        int p=0;
        for(int i=0;i<numbers.length;i++){
            int curr=numbers[i];
            for(int j=i+1;j<numbers.length;j++){
                System.out.print("(" + curr + "," + numbers[j] + ") ");
                p++;
            }
            System.out.println();
        }
        System.out.println("total pairs is "+ p);
    }

    public static void main(String[] args) {
        int numbers[]={45,67,89,34,67,99};
        pairArray(numbers);
    }
}
