import java.util.*;
public class asg1 {
    public static boolean trueFalseArray(int nums[]){
        int n= nums.length;
        for(int i=1;i<n-1;i++) {
            for(int j=i+1;j<n;j++){
                if(nums[i] == nums[j]){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int nums[]={1,2,3,4,4};
        System.out.println(trueFalseArray(nums));

    }
}
