package StringDemo;

public class SplitDemo1 {

    public static void main(String[] args) {


        String str = "This is java program";
       // String[] stArr = str.split(" ");
        String[] stArr = str.split("r");

        for(int i=0;i<stArr.length ;i++ )
            System.out.println(stArr[i]);







    }
}
