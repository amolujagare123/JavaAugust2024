package Arrays.SingleDimentional;

public class DoubleArrayDemo {
    public static void main(String[] args) {

        double[] d = new double[5];

        d[0] = 67.13;
        d[1] = 77.13;
        d[2] = 68.13;
        d[3] = 69.13;
        d[4] = 67.03;

        System.out.println("===== Using for loop =======");

        for (int i=0;i<d.length;i++)
            System.out.println(d[i]);

        System.out.println("===== Using for each loop =======");

    }
}
