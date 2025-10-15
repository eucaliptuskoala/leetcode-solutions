class Solution(object):
    def numberOfSteps(self, num):
        steps = 0
        current = num
        while current!=0:
            if current%2 == 0:
                current = current/2
            else:
                current = current-1
            steps +=1
        return steps    

# # example solution using bit manipulation from ChatGPT
# class Solution:
#     def numberOfSteps(self, num: int) -> int:
#         steps = 0
#         while num > 0:
#             # If the number is odd, subtract 1, else shift right
#             num = num - 1 if num & 1 else num >> 1
#             steps += 1
#         return steps

# # another example solution from ChatGPT
# class Solution:
#     def numberOfSteps(self, num: int) -> int:
#         if num == 0:
#             return 0
#         # bin(num) -> '0b1101', count('1') counting the number of 1's in binary representation
#         return len(bin(num)) - 3 + bin(num).count('1')
