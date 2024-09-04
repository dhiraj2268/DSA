public class bitManipulation {
    public static void evenOdd(int n){
        int bitMask=1;
        if(((n & bitMask)==0)){
            System.out.println("even");
        }else{
            System.out.println("odd");
        }
    }
    public static int getIthBit(int n,int i){
        int bitMask=1<<i;
        if(((n & bitMask)==0)){
            return 0;
        }else{
            return 1;
        }

    }
    public static int seiIthBit(int n,int i){
        int bitMask=1<<i;
        return n|bitMask;
    }
    public static int clearIthBit(int n,int i){
        int bitMask=~(1<<i);
        return n & bitMask;
    }
    public static int updateIthBit(int n,int i,int newBit){
        n=clearIthBit(n,i);
        int bitMask=newBit<<i;
        return n|bitMask;
    }
    public static boolean isPowerOfTwo(int n){
        return (n&(n-1))==0;
    }
    public static int countSetBit(int n){
        int count=0;
        while(n>0){
            if((n&1)!=0){
                count++;
            }
            n=n>>1;
        }
        return count;
    }
    public static int fastExpo(int n,int a){
        int ans=1;
        while(n>0){
            if((n&1)!=0){
                ans=ans*a;
            }
            a=a*a;
            n=n>>1;
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(fastExpo(5,3));
    }
}
