package Recurtion;

public class SubString {

    public static void substr(String str,int index,String newString) {

        if (index == str.length()) {
            System.out.println(newString);
            return;
        }

        char currString = str.charAt(index);


        substr(str, index+1, newString+currString);
        
        substr(str, index+1, newString);
    }

    public static void main(String[] args) {

        String str = "abc";

        substr(str, 0, "");


        
    }


    
}
