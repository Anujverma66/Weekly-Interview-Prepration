
import java.util.*;

class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {

                    if (nums[i] + nums[j] + nums[k] == 0) {
                        List<Integer> result = Arrays.asList(
                            nums[i], nums[j], nums[k]
                        );

                        Collections.sort(result);
                        set.add(result);
                    }
                }
            }
        }

        return new ArrayList<>(set);
    }

 public static void main(String[] args) {
       
    
         try (Scanner sc = new Scanner(System.in)) {
               
                 System.out.print("Enter size of Array : ");
               int n = sc.nextInt();
            
            int[] nums = new int[n];
            
            System.out.println("Enter Elements:");
            for (int i = 0; i < n; i++) {
                nums[i] = sc.nextInt();
            }
            
            ThreeSum obj = new ThreeSum();
            System.out.println(obj.threeSum(nums));
        }
    }
}

