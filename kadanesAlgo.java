public class kadanesAlgo {
    public static void kadanes(int numbers[]){
        int m_sum=Integer.MIN_VALUE;
        int c_sum=0;
        for(int i=0;i<numbers.length;i++){
            c_sum=c_sum+numbers[i];
            if(c_sum < 0){
                c_sum=0;
            }
            m_sum=Math.max(c_sum,m_sum);
        }
        System.out.println("mas sum is "+ m_sum);
    }

    public static void main(String[] args) {
        int numbers[]={-2,-3,4,-1,-2,1,5,-3};
        kadanes(numbers);
    }
}
