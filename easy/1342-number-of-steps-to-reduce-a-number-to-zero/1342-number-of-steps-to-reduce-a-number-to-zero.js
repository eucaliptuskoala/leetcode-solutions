/**
 * @param {number} num
 * @return {number}
 */
var numberOfSteps = function(num) {
    let steps = 0
    let current = num
    while(current!=0){
        if(current % 2 == 0){
            current /= 2
        }
        else{
            current -= 1
        }
        steps +=1
    } 
    return steps
};