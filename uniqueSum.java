import java.util.Arrays;

int num[]=new int[nums.length];
        // Set<Integer> s = new HashSet<Integer>();
        int sum=0;
        // Arrays.sort(nums);
        System.out.println(nums);
        for(int i=0;i<nums.length;i++){
            num[i]=nums[i];
            }
            for(int i=0;i<nums.length;i++){
                for(int j=0;j<nums.length;j++){
                    if(i!=j){
                        if(nums[i]==nums[j])
                        {
                            num[i]=0;
                            break;
                        }
                        }
                        }
                        }
                for(int i=0;i<nums.length;i++){
                    sum=sum+num[i];
                }

        
        return sum;
        
}

    

