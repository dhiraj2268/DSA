public class Backtracking {
    //backtracking with array
    public static void changeArr(int arr[],int i,int val){
        if(i==arr.length){
            printArr(arr);
            return;
        }
        arr[i]=val;
        changeArr(arr,i+1,val+1);
        arr[i]=arr[i]-2;
    }
    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    //find subset
    public static void findSubSet(String str,String ans,int i){
        if(i==str.length()){
           if(ans.length()==0){
               System.out.println("null");
           }else {
               System.out.println(ans);
           }
           return;
        }
        findSubSet(str,ans+str.charAt(i),i+1);
        findSubSet(str,ans,i+1);
    }
    //find permutation
    public static void findPermutation(String str,String ans){
        if(str.length()==0){
            System.out.println(ans);
            return;
        }
        for(int i=0;i<str.length();i++){
            char curr=str.charAt(i);
            String newStr=str.substring(0,i) + str.substring(i+1);
            findPermutation(newStr,ans+curr);
        }
    }
    public static void main(String[] args) {
        String str="abc";
        findPermutation(str,"");

    }
}
