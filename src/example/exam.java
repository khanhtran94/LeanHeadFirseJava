package example;

import java.util.regex.Pattern;

public class exam {
    public static boolean checkDumpNumber(int a, int b , int c, int d){
        int[] arr = {a,b,c,d};
        for (int i = 0; i< arr.length; i++){
            for (int j = i+1; j< arr.length; j++){
                if (arr[i] == arr[j]){
                    return true;
                }
            }
        }
        return false;
    }
    public static String upCaseString(String s){
        if (s.isEmpty()) {
            return null;
        }
        String first = s.substring(0,1).toUpperCase();
        String inner = s.substring(1).toLowerCase();
        String resut = first + inner;
        return resut;

    }
    public static int countaZ(String s){
        int number = 0;
        for (int i = 0; i< s.length(); i++){
            if ((s.charAt(i) >= 'a' && s.charAt(i) <= 'z') || (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')){
                number++;
            }
        }
        return number;
    }
    public static void main(String[] args) {
        System.out.println(checkDumpNumber(1,2,3,1));
        System.out.println(upCaseString("kpLLLPpppd"));
        System.out.println(countaZ("aaa111bbb"));
    }
}
