class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> c = new HashMap<>();
        List<Integer>[] f = new List[nums.length+1];

        for( int i =0; i<f.length ; i++){ f[i] = new ArrayList<>();}
         for(int n: nums){ c.put(n,c.getOrDefault(n,0)+1); }
for(Map.Entry<Integer, Integer> entry: c.entrySet()){
    f[entry.getValue()].add(entry.getKey());}
    int[] res = new int[k];
    int index =0;
    for(int i=f.length-1; i>0 && index <k; i--){
        for(int n : f[i]){
            res[index++] =n ;
            if(index == k) {
                return res;
            }
        }
    }
    return res;
}        
}
