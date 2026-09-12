class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> vmap = new HashMap<String,List<String>>();
        for(String str :strs){
            char[] ch = str.toCharArray();
            Arrays.sort(ch);
            String key = new String(ch);
            vmap.computeIfAbsent(key,k->new ArrayList<>()).add(str);
        }
        return new ArrayList<>(vmap.values());
    }
}
