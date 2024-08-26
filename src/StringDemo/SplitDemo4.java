package StringDemo;

public class SplitDemo4 {

    public static void main(String[] args) {

       String str = "Hey Baby you are so lovely";
       String[] stArr = str.split(" ");

       // print only the words that ends with y

        for(int i=0;i<stArr.length ;i++ ) {

            // --> check if the individual word ends with y
            if(stArr[i].endsWith("y"))
               System.out.println(stArr[i]);
        }







    }
}
