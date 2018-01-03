c class SolutionremoveElement {

    public int removeElement(int[] nums, int val) {

        if(nums == null){

            return -1;

        }

        int len = nums.length;

        if(len <1){

            return len;

        }

        int count = 0;

        for(int i = 0; i < len; i++){

            if(nums[i] != val){

                nums[count++] = nums[i];

            }

        }

       return count;

    }
}
