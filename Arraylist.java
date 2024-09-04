import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
public class Arraylist {
   public static int storeWater(ArrayList<Integer> height){
       int maxWater=0;
       int lp=0;
       int rp=height.size()-1;
       while(lp < rp){
           //calculate water
           int ht=Math.min(height.get(lp),height.get(rp));
           int width=rp-lp;
           int currwater=ht*width;
           maxWater=Math.max(maxWater,currwater);
           //update pointers
           if(height.get(lp) < height.get(rp)){
               lp++;
           }else {
               rp--;
           }
       }
       return maxWater;
   }
    public static boolean pairSum(ArrayList<Integer> list,int target){
       int lp=0;
       int rp=list.size()-1;
       while(lp != rp){
           if(list.get(lp)+list.get(rp)==target){
               return true;
           }
           if(list.get(lp)+list.get(rp) < target){
               lp++;
           }else {
               rp--;
           }
       }
       return false;
    }
    public static boolean pairSum2(ArrayList<Integer> list,int target){
       int bp=-1;
       int n=list.size();
       for(int i=0;i<list.size();i++){
           if(list.get(i) < list.get(i+1)){
               bp=i;
               break;
           }
       }
       int lp=bp+1;
       int rp=bp;
       while(lp != rp){
           if(list.get(lp)+list.get(rp)==target){
               return true;
           }
           if(list.get(lp)+list.get(rp) < target){
               lp=(lp+1)%n;
           }
           else {
               rp=(n+rp-1)%n;
           }
       }
       return false;
    }
    public static void main(String[] args) {
        ArrayList <Integer> list= new ArrayList <> ();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);
        int target=100;
        System.out.println(pairSum(list,target));
    }
}
