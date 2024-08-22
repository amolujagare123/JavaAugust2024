package Arrays.TwoDimentional;

public class IntTwoDArray1 {

    public static void main(String[] args) {
        int[][] a = new int[4][3];

        a[0][0] = 23;
        a[0][1] = 33;
        a[0][2] = 43;

        a[1][0] = 21;
        a[1][1] = 32;
        a[1][2] = 44;

        a[2][0] = 63;
        a[2][1] = 73;
        a[2][2] = 83;

        a[3][0] = 61;
        a[3][1] = 62;
        a[3][2] = 83;


        for(int i=0;i<4;i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(a[i][j]+"\t");
            }
            System.out.println();
        }


    }
}
