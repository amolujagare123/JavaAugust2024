package Arrays.TwoDimentional;

public class DobleTwoDArray {

    public static void main(String[] args) {
        double[][] d = new double[4][3];

        d[0][0] = 23.45;
        d[0][1] = 33.45;
        d[0][2] = 43.45;

        d[1][0] = 21.45;
        d[1][1] = 32.45;
        d[1][2] = 44.45;

        d[2][0] = 63.45;
        d[2][1] = 73.45;
        d[2][2] = 83.45;

        d[3][0] = 61.45;
        d[3][1] = 62.45;
        d[3][2] = 83.45;


        for(int i=0;i<4;i++) {

            for (int j = 0; j < 3; j++) {
                System.out.print(d[i][j]+"\t");
            }

            System.out.println();
        }


    }
}
