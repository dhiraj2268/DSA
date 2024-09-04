public class RecursionFun2 {
    public static int tilingProblem(int n){
        if(n==0 || n==1){
            return 1;
        }
//        int fnm1=tilingProblem(n-1);
//        int fnm2=tilingProblem(n-2);
//        int totalWays=fnm1+fnm2;
//        return totalWays;
        return tilingProblem(n-1)+tilingProblem(n-2);
    }
    public static void removeDuplicates(String str,int idx,StringBuilder newStr,boolean map[]){
        if(idx == str.length()){
            System.out.println(newStr);
            return;
        }
        char currChar=str.charAt(idx);
        if(map[currChar-'a']==true){
            removeDuplicates(str,idx+1,newStr,map);
        }
        else {
            map[currChar-'a']=true;
            removeDuplicates(str,idx+1,newStr.append(currChar),map);
        }
    }
    public static int friendsPairing(int n){
        if(n ==1 || n==2){
            return n;
        }
//        int fnm1=friendsPairing(n-1);
//        int fnm2=friendsPairing(n-2);
//        int ways= (n-1) * friendsPairing(n-2);
//        int totalWays= fnm1*ways;
        return friendsPairing(n-1) + (n-1) * friendsPairing(n-2);
    }
    public static void printBinString(int n, int lastPlace,String str){
        if(n == 0){
            System.out.println(str);
            return;
        }
        printBinString(n-1,0,str+"0");
        if(lastPlace==0){
            printBinString(n-1,1,str+"1");
        }
    }
    public static void main(String[] args) {

       printBinString(3,0,"");
    }
}
