public class Main{
    public static void main(String[] args){
        int[] arr = {3, 2, 1, 5, 6, 4};
        quicksort(arr,0,arr.length - 1);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    
    private static void quicksort(int[] arr,int lo,int hi){
        if(lo>hi){
            return;
        }
        int pivot = arr[hi];
        int idx = partition(arr,pivot);
        quicksort(arr,lo,idx-1);
        quicksort(arr,idx+1,hi);
    }
    
    private static void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp; 
    }
    
    private static int partition(int[] arr,int pivot){
        int i = 0;
        int j = 0;
        
        while(i<arr.length){
            if(arr[i]>pivot){
                i++;
            }
            else{
                swap(arr,i,j);
                i++;
                j++;
            }
        }
        
        return j-1;
    }
}
