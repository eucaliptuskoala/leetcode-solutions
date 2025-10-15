class Solution {
    public int numberOfSteps(int num) {
        int steps = 0;
        int current = num;
        while(current!=0){
            if(current % 2 == 0){
                current /= 2;
            }
            else{
                current -=1;
            }
            steps +=1;
        }
        return steps;
    }
}

// // example solution using bit manipulation from ChatGPT
// class Solution {
//     public int numberOfSteps(int num) {
//         int steps = 0;
//         while (num > 0) {
//             num = (num & 1) == 1 ? num - 1 : num >> 1;
//             steps++;
//         }
//         return steps;
//     }
// }

// // another example solution from ChatGPT
// class Solution {
//     public int numberOfSteps(int num) {
//         if (num == 0) return 0;
//         return Integer.toBinaryString(num).length() - 1 + 
//                Integer.bitCount(num);
//     }
// }