public class Main{
    public static void main(String[] args){
        int[] arr = { 8, 4, 2, 1 };
        int count = 0;
        int[] bs = new int[1];
        bs[0] = 0;
        mergesort(arr,0,arr.length - 1,bs);
        
        System.out.println(bs[0]);
        
    }
    
    private static int[] mergesort(int[] arr,int lo,int hi,int[] bs){
        if(lo==hi){
            int[] ba = new int[1];
            ba[0] = arr[lo];
            return ba;
        }
        
        int mid = lo + (hi-lo)/2;
        int[] lh = mergesort(arr,lo,mid,bs);
        int[] rh = mergesort(arr,mid+1,hi,bs);
        int[] fm = merge(lh,rh,bs);
        
        return fm;
    }
    
    private static int[] merge(int[]a,int[] b,int[] bs){
        int i=0;
        int j= 0;
        int k = 0;
        int[] ans = new int[a.length + b.length];
        while(i<a.length && j<b.length){
            if(a[i]<=b[j]){
                ans[k] = a[i];
                i++;
            }
            else{
                bs[0] += (a.length - i);
                ans[k] = b[j];
                j++;
            }
            
            k++;
        }
        
        while(i<a.length){
            ans[k] = a[i];
            i++;
            k++;
        }
        
        while(j<b.length){
            ans[k] = b[j];
            j++;
            k++;
        }
        
        return ans;
    }
}
