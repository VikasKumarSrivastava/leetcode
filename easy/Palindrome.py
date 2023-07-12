# Given an integer x, return true if x is a 
# palindrome
# , and false otherwise.
# Example 1:
# Input: x = 121
# Output: true
# Explanation: 121 reads as 121 from left to right and from right to left.
# Example 2:

# Input: x = -121
# Output: false
# Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
class Solution:
    def isPalindrome(self, x: int) -> bool:
        if x < 0:
            return False
        temp = x
        ans = 0
        while x!=0:
            digit = x%10
            ans = ans * 10 + digit
            x=x//10
        if temp == ans:
            return True
        return False
