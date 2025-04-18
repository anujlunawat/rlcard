class Solution {
    public int[] twoSum(int[] nums, int target) {

        for(int i = 0; i < nums.length - 1; i++){
            // if(nums[i] > target)
            //     continue;
            for(int j = i+1; j < nums.length; j++){
                if(nums[i] + nums[j] == target)
                    return new int[]{i, j};
            }
        }
        return new int[]{-1, -1};
    }


    }

















        // int start=0, end=nums.length-1;

        // while(start <= end){
        //     int mid1 = start + (end-start)/2;

        //     if(nums[mid1]<=target){
        //         int s1 = 0, s2 = mid1-1;
        //         while(s1 <= s2){
        //             int mid2 = s1 + (s2-s1)/2;
        //             if(nums[mid1] + nums[mid2] == target)
        //                 return new int[]{mid1, mid2};
        //         }
        //     }
        //     else if(nums[mid1] > target)
        //         end = mid1-1;

        // }return new int[]{-1, -1};



        // for(int i=0;i<nums.length;i++){
        //     for (int j = 0; j < nums.length; j++) {
        //         if (j==i) continue;
        //         if (nums[i] + nums[j] == target)
        //             return new int[]{i, j};
        //     }
        // }
        // return new int[]{-1, -1};
//     }
// }