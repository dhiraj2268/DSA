public class asg2 {
    public static int binSearch( int[] nums,int target ,int left, int right){
        int l=left;
        int r=right;
        while(l <= r){
            int mid=l+(r-l)/2;
            if(nums[mid] == target){
                return mid;
            } else if (nums[mid]>target) {
                r=mid-1;
            }else{
                l=mid+1;
            }
        }
        return -1;
    }
//    public static int
    public static void main(String[] args) {
        int nums[]={4,5,6,7,0,1,2};
        System.out.println(binSearch(nums,0,nums[0],nums.length-1));
    }
}
