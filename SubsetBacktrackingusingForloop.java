//Time Complexity:2^n where n is the subset added to the list
//Space complexity:O(List of Subset)
//Facebook Interview
//Forloop Using BackTracking
//Given an array set [1,2,3] for this consider choose and not choose based on the index position value .Do not choose when I don't add anything to my path and choose when I add the current element added to the list path when I don't have any element that is the base case it return the empty arraylist as result.
class Solution {
    List<List<Integer>> result = new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        if(nums == null || nums.length == 0) return result;
        helper(nums,0,new ArrayList<>());
        return result;
    }
    private void helper(int[] nums,int index,List<Integer>path){
        //base
        // if(index == nums.length){
        //     result.add(new ArrayList<>(path));
        //     return;
        // }
        //logic -zero case or do not choose case
        result.add(new ArrayList<>(path));
        for(int i=index;i<nums.length;i++){//for loop taking care of base case so no need of base case
        //one case or choose case
            //action
            path.add(nums[i]);
                       //recurse
            helper(nums,i+1,path);
                       //backtracking
            path.remove(path.size()-1); 
        }
        
    }
}