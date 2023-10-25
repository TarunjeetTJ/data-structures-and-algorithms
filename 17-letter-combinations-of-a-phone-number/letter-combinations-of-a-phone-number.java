class Solution {
    String[] codes={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public List<String> letterCombinations(String digits) {
        if(digits.length()==0){
            List<String> base=new ArrayList<>();
            return base;
        }
        int ch=digits.charAt(0)-'0';
        String rofdig=digits.substring(1);
        List<String> rofal=letterCombinations(rofdig);
        if(rofal.size()==0)
        rofal.add("");
        List<String> finalal=new ArrayList<>();
        int i=0;
        while(i<codes[ch].length()){
            for(String rofstr:rofal)
            finalal.add(codes[ch].charAt(i)+rofstr);
            i++;
        }
        return finalal;
    }
}