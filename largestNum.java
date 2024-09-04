import java.util.*;

public class largestNum {
    public static int largestNum(int nums[]){
        int l= Integer.MIN_VALUE;
        int s=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            if(l < nums[i]){
                l=nums[i];
            }
            if(s>nums[i]){
                s=nums[i];
            }
        }
        System.out.println("small number is "+ s);
        return l;
    }
    public static void main(String[] args) {
        int nums[]={20,10,78,89,45,67,23};
        System.out.println(largestNum(nums));
    }
}
