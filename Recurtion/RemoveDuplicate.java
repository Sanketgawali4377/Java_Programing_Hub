package Recurtion;

public class RemoveDuplicate {

    public static boolean[] map = new boolean[26];

    public static void stringcheacker(String str,String newstr,int index){

          

        if(str.length()==index){
            System.out.println(newstr);
            return;
        }

        char currchar = str.charAt(index);
        if (map[currchar - 'a']) {
            stringcheacker(str, newstr, index+1);
        }
        else{
            newstr = newstr + currchar;
            map[currchar-'a'] = true;
            stringcheacker(str, newstr, index+1);
        }

    }
    
    public static void main(String[] args) {

        String str = "abbccda";
        String newstr = "";
        int index = 0;


        stringcheacker(str,newstr,index);
    }
    
}
