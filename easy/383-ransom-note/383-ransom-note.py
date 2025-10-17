class Solution(object):
    def canConstruct(self, ransomNote, magazine):
        magazine_dict = {}
        # counting letters in magazine & appending the dictionary
        for letter in magazine:
            if letter in magazine_dict:
                magazine_dict[letter] +=1
            else:
                magazine_dict[letter] = 1 
        
        # looking trough ransomNote and for each letter looking for it in dictionary
        # if it is there and its value != 0  -> decrement value for that letter
        # if it isn't -> returning false 
        for letter in ransomNote:
            if letter in magazine_dict and magazine_dict[letter] > 0:
                magazine_dict[letter] -=1
            else:
                return False
        
        return True