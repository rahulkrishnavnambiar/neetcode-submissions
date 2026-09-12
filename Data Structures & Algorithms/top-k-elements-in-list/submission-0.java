class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> valuemap = new HashMap<>();
        for(int num:nums){
            valuemap.put(num, valuemap.getOrDefault(num, 0) + 1);
        }
        List<Integer>[] bucket = new List[nums.length+1];

        for(Map.Entry<Integer,Integer> entry:valuemap.entrySet()){
            int key= entry.getKey();
            int value= entry.getValue();
            if(bucket[value]==null){
                bucket[value]=new ArrayList<>();
            }
            bucket[value].add(key);
        }

        int result[] = new int[k];
        int counter =0;

        for(int i=bucket.length-1;i>0;i--){
            if(bucket[i]!= null){
                for(int n:bucket[i]){
                    result[counter] = n;
                    counter++;

                    if(counter==k){
                        return result;
                    }
                }

            }

        }
        return result;
    }
}
