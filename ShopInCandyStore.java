
class Solution {
    static ArrayList<Integer> candyStore(int candies[], int N, int K) {
        ArrayList<Integer> ans = new ArrayList<>();
        
        Arrays.sort(candies);
        
        int i = 0;
        int j = candies.length-1;
        int min = 0;
        int max = 0;
        
        while(i <= j) {
            min += candies[i];
            i++;
            j -= K;
        }
        ans.add(min);
        
        i = 0;
        j = candies.length-1;
        
        while(i <= j) {
            max += candies[j];
            j--;
            i += K;
        }
        ans.add(max);
        
        return ans;
    }
}