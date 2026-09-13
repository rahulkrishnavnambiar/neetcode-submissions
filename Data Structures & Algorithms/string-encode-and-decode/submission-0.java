class Solution {

    public String encode(List<String> strs) {
        String encodedString = "";
        for(String str:strs){
            encodedString = encodedString+str.length() + "#" + str;
        }
    return encodedString;
    }

    public List<String> decode(String str) {
        List<String> decodedList = new ArrayList<>();
        char ch[] = str.toCharArray();
        int index = 0;
        int length = str.length();
        String count="";
        String word;
        while(index<length){
            while(ch[index]!='#'){
                count=count+ch[index];
                index++;
            }
            index++;
            StringBuilder sb=new StringBuilder();
            for(int i = index;i<index+Integer.parseInt(count);i++){
                sb.append(ch[i]);
            }
            decodedList.add(sb.toString());
            index=index+Integer.parseInt(count);
            count="";
        }

        return decodedList;
    }
}
