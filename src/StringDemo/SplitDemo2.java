package StringDemo;

public class SplitDemo2 {

    public static void main(String[] args) {


        String str = "this is to inform that tom is not coming today";
       // String[] stArr = str.split(" ");
        String[] stArr = str.split("to");

        for(int i=0;i<stArr.length ;i++ )
            System.out.println(stArr[i]);







    }
}
