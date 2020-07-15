def twosum(nums,target):
    for i in range(len(nums)):
        for j in range(len(nums)):
            if(nums[j]==target-nums[i]):
                return [i,j]




if __name__ == "__main__":
    nums=[2,7,11,15]
    target=9
    result=twosum(nums,target)
    print(result)