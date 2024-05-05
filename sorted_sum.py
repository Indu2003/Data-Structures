#sum of 2 numbers in sorted array should b equal to the given k value

def two_sum_sorted(nums, target):
    left, right = 0, len(nums) - 2
    while left < right:
        curr_sum = nums[left] + nums[right]
        if curr_sum == target:
            return [nums[left], nums[right]]
        elif curr_sum < target:
            left += 1
        else:
            right -= 1
    return []

# Example usage:
sorted_array = [1,2,4,5,8,10,12]
target_value = 15
result = two_sum_sorted(sorted_array, target_value)
print(result)  # Output: [3, 6]

