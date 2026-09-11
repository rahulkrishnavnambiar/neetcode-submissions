class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        Map<Character,Integer> smap = new HashMap<Character,Integer>();
        Map<Character,Integer> tmap = new HashMap<Character,Integer>();
        for(char c : s.toCharArray()){
            smap.compute(c, (k, v) -> v == null ? 1:v+1);
        }
        for(char c : t.toCharArray()){
            tmap.compute(c, (k, v) -> v == null ? 1:v+1);
        }
        return smap.equals(tmap);
    }
}
