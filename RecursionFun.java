public class RecursionFun {
    public static void printDec(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        System.out.print(n+" ");
        printDec(n-1);
    }
    public static void printInc(int n){
        if(n==1){
            System.out.print(n+" ");
            return;
        }
        printInc(n-1);
        System.out.print(n+" ");
    }
    public static int factNum(int n){
        if(n==0){
            return 1;
        }
        int fnm1=factNum(n-1);
        int fn=n*factNum((n-1));
        return fn;
    }
    public static int calSum(int n){
        if(n==1){
            return 1;
        }
        int s1=calSum(n-1);
        int sn=n+s1;
        return sn;
    }
    public static int fibo(int n){
        if(n == 0 || n == 1){
            return n;
        }
        int f1=fibo(n-1);
        int f2=fibo(n-2);
        int result=f1+f2;
        return result;
    }
    public static boolean isSorted(int arr[],int i){
        if(i == arr.length-1){
            return true;
        }
        if(arr[i] > arr[i+1]){
            return false;
        }
        return isSorted(arr,i+1);
    }
    public static int firstOccurence(int arr[],int key,int i){
        if(i==arr.length){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        return firstOccurence(arr,key,i+1);
    }
    public static int lastOccurence(int arr[],int key,int i){
        if(i==arr.length){
            return -1;
        }
        int isFound=lastOccurence(arr,key,i+1);
        if(isFound == -1 && arr[i]==key){
            return i;
        }
        return isFound;
    }
    public static int optimizePower(int a, int n){
        if(n==0){
            return 1;
        }
        int halfPower=optimizePower(a,n/2);
        int halfPowerSqr=halfPower*halfPower;
        if(n%2!=0){
            halfPowerSqr=a*halfPowerSqr;
        }
        return halfPowerSqr;
    }
    public static void main(String[] args) {
        int a=2;
        int n=10;
        System.out.println(optimizePower(a,n));
    }
}
