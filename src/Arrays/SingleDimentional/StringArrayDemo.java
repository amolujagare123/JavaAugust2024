package Arrays.SingleDimentional;

public class StringArrayDemo {
    public static void main(String[] args) {

        String[] stArr = new String[5];
        stArr[0] = "Aarav";
        stArr[1] = "Lakshmi";
        stArr[2] = "Vikram";
        stArr[3] = "Priya";
        stArr[4] = "Rohan";

        System.out.println("===== Using for loop =======");

        for (int i=0;i<stArr.length;i++)
            System.out.println(stArr[i]);

        System.out.println("===== Using for each loop =======");

    }
}
