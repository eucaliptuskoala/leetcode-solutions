/**
 * @param {string} ransomNote
 * @param {string} magazine
 * @return {boolean}
 */
var canConstruct = function(ransomNote, magazine) {
    count = {}
    for(let c of magazine){
        if(c in count){
            count[c] +=1
        }
        else{
            count[c] = 1
        }
    }
    for(let c of ransomNote){
        if(c in count && count[c]>0){
            count[c] -= 1
        }
        else{
            return false
        }
    }
    return true
};