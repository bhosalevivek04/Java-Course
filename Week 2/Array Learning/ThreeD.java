public class ThreeD {
    public static void main(String[] a)
    {
        int nums[][][]=new int[3][4][2];

        for(int i=0;i<3;i++)
       {
        for(int j=0;j<4;j++ )
        {
            for(int k=0;k<2;k++)
            {
                nums[i][j][k] = (int)(Math.random()*10);
            }
        }
       }

       for(int i=0;i<3;i++)
       {
        for(int j=0;j<4;j++ )
        {
            for(int k=0;k<2;k++)
            {
                System.out.print(nums[i][j][k]);
            }
            System.out.println();
        }
        System.out.println();
       }
    }
}
