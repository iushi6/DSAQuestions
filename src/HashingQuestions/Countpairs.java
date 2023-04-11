package HashingQuestions;

import java.util.HashMap;

public class Countpairs {

   static int getPairsCount(int[] arr, int n, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int count = 0;
        
        for(int num : arr){
            if(map.containsKey(k-num)){
                count += map.get(k-num);
            }
            map.put(num,map.getOrDefault(num,0)+1);
        }
        return count;
    }
    
    public static void main(String args[]) {
    	int N = 4, K = 6;
        int[] arr = {1, 5, 7, 1};
        int ans = getPairsCount(arr,N,K);
        System.out.println("Number of Pairs : "+ans);
        
    }
}

