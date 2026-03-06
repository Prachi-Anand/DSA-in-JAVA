class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap <Character,Integer> hm = new HashMap<>();
        for(int i=0;i<ransomNote.length();i++){
            char ch =  ransomNote.charAt(i);
            if(hm.containsKey(ch))
            {
                hm.put(ch,hm.get(ch)+1);
            }
            else{
                hm.put(ch,1);
            }
        }
        for(int j=0;j<magazine.length();j++){
            char ch2=magazine.charAt(j);
            if(hm.containsKey(ch2)){
                hm.put(ch2,hm.get(ch2)-1);
                if(hm.get(ch2)==0){
                    hm.remove(ch2);
                }
            }
            
            if(hm.isEmpty()){
                return true;
            }
        }
        return false;
        
    
        
    }
}