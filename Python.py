def twoSum(arr, target):
    s = set()
    
    for i in range(len(arr)):
        complement = target - arr[i]
        
        if(complement in s):
            # return [arr.index(complement), i]
            return True
        
        s.add(arr[i])
        
    return False

arr = [1, 2, 3, 4, 5]
target = 9
print(twoSum(arr, target))