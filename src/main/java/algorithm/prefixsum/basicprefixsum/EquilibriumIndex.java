package algorithm.prefixsum.basicprefixsum;

public class EquilibriumIndex
{
           public static int findEquilibrium(int arr[])
           {
            int totalsum = 0, leftsum =0, rightsum = 0;
            for(int i=0;i<arr.length;i++)
            {
                totalsum = totalsum + arr[i];
            }

            for(int i=0;i<arr.length;i++)
            {

                rightsum = totalsum - leftsum-arr[i];
                if(leftsum == rightsum)
                {
                    return i;
                }
                leftsum = leftsum+arr[i];
            }
            return -1;
          }
          public static void main(String[] args)
          {
              int[] arr = {1, 1, 1, 1, 1};
              int num = findEquilibrium(arr);
              System.out.println("Equilibrium position is"+num);
          }


}
