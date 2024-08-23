package Arrays.TwoDimentional;

public class IntTwoDArray2 {

    public static void main(String[] args) {
        int[][] a = {

                {12,23,45},
                {22,33,44},
                {34,45,67},
                {78,89,90}

        };



        int row = a.length;
        int col = a[0].length; 

        System.out.println("row="+row);
        System.out.println("col="+col);


        for(int i=0;i<a.length;i++) {

            for (int j = 0; j < a[0].length; j++) {
                System.out.print(a[i][j]+"\t");
            }

            System.out.println();
        }


    }
}
