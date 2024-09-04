public class maxSubArraySum {
    public static void maxSubarraySum(int numbers[]){
        int c_sum=0;
        int m_sum=Integer.MIN_VALUE;
        for(int i=0;i<numbers.length;i++){
            int start=i;
            for(int j=i;j<numbers.length;j++){
                int end=j;
                c_sum=0;
                for(int k=start;k<=end;k++){
                    c_sum+=numbers[k];
                }
                System.out.println(c_sum);
                if(m_sum<c_sum){
                    m_sum=c_sum;
                }
            }
        }
        System.out.println("max sum is "+ m_sum);
    }

    public static void main(String[] args) {
        int numbers[]={1,-2,6,-1,3};
        maxSubarraySum(numbers);
    }
}
