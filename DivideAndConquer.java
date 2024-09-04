public class DivideAndConquer {
    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    //merge sort using recursion
    public static void mergeSort(int arr[],int sIndex,int eIndex){
        if(sIndex>=eIndex){
            return;
        }
        int mid = sIndex + (eIndex-sIndex)/2;
        mergeSort(arr,sIndex,mid);
        mergeSort(arr,mid+1,eIndex);
        merge(arr,sIndex,eIndex,mid);
    }
    public static void merge(int arr[],int sIndex,int eIndex,int mid){
        int temp[]=new int[eIndex-sIndex+1];
        int i=sIndex;
        int j=mid+1;
        int k=0;
        while(i<=mid && j<=eIndex){
            if(arr[i]<arr[j]){
                temp[k]=arr[i];
                i++;
            }
            else {
                temp[k]=arr[j];
                j++;
            }
            k++;
        }
        //left part
        while(i<=mid){
            temp[k++]=arr[i++];
        }
        //right
        while(j<=eIndex){
            temp[k++]=arr[j++];
        }
        for(k=0,i=sIndex;k<temp.length;k++,i++){
            arr[i]=temp[k];
        }
    }

    //quick sort using recursion
    public static void quickSort(int arr[],int si,int ei){
        if(si>=ei){
            return;
        }
        int pIdx=partition(arr,si,ei);
        quickSort(arr,si,pIdx-1);
        quickSort(arr,pIdx+1,ei);
    }
    public static int partition(int arr[],int si,int ei){
        int pivot=arr[ei];
        int i=si-1;
        for(int j=si;j<ei;j++) {
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;
        int temp=pivot;
        arr[ei]=arr[i];
        arr[i]=temp;
        return i;
    }

    //sorted and roted array
    public static int search(int arr[],int tar,int si,int ei) {
        if (si > ei) {
            return -1;
        }
        int mid = si + (ei - si) / 2;
        //if target found at mid
        if (arr[mid] == tar) {
            return mid;
        }
            //left
            if (arr[si] <= arr[mid]) {
                if (arr[si] <= tar && tar <= arr[mid]) {
                    return search(arr, tar, si, mid - 1);
                } else {
                    return search(arr, tar, mid + 1, ei);
                }
            } else {
                if (arr[mid] <= tar && tar <= arr[ei]) {
                    return search(arr, tar, mid + 1, ei);
                } else {
                    return search(arr, tar, si, mid - 1);
                }
            }
        }
    public static void main(String[] args) {
        int arr[]={4,5,6,7,0,1,2};
        int targate=2;
        int tarIdx=search(arr,targate,0,arr.length-1);
        System.out.println(tarIdx);
    }
}
