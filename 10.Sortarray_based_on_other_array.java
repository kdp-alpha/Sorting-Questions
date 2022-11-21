
import java.util.*;
public class Main{
    public static void main(String[] args){
        int[] f = {5, 8, 9, 3, 5, 7, 1, 3, 4, 9, 3, 5, 1, 8, 4};
        int[] s = {3, 5, 7, 2};
        Map<Integer,Integer> hm = new TreeMap<>();
        int idx = 0;
        
        for(int i:f){
            hm.put(i,hm.getOrDefault(i,0)+1);
        }
        
        for(int i:s){
            int n = hm.getOrDefault(i,0);
            while(n-->0){
                f[idx++] = i;
            }
            hm.remove(i);
        }
        
        for(int val : hm.keySet()){
            int n = hm.getOrDefault(val,0);
            while(n-->0){
                f[idx++] = val;
            }
        }
        
        for(int i=0;i<f.length;i++){
            System.out.println(f[i]);
        }
    }
}
