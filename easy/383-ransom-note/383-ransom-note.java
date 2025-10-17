import java.util.HashMap;

class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> magazine_count = new HashMap<>();
        for(char c : magazine.toCharArray()){
            magazine_count.put(c, magazine_count.getOrDefault(c,0) +1);
        }

        for(char c : ransomNote.toCharArray()){
            if(magazine_count.containsKey(c) && magazine_count.get(c) > 0){
                magazine_count.put(c, magazine_count.getOrDefault(c,0) - 1);            
            }
            else{
                return false;
            }
        }

        return true;

        
    }
}