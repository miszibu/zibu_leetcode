// https://leetcode-cn.com/problems/string-to-integer-atoi/

import java.math.BigInteger;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class string_to_integer {
    public static void main(String[] args) {

        String testCase = "w011110";

        System.out.println(myAtoi(testCase));
    }

    public static int myAtoi(String str) {
        Pattern pattern = Pattern.compile("(\\+|\\-|[1-9])\\d*");
        Matcher matcher = pattern.matcher(str);
        if (matcher.find())
            str = matcher.group();
        

        return Integer.parseInt(str);
    }

    // public static int myAtoi(String str) {
    // String output = "";
    // // Fisrt Step: Remove the space in thr front of string
    // str=str.trim();
    // // Judge the number is negative or positive

    // if(str.length()<=0){
    // return 0;
    // }
    // if(str.startsWith("-")){
    // output+="-";
    // str=str.substring(1, str.length());
    // }else if(str.startsWith("+")){
    // str=str.substring(1, str.length());
    // output+="+";
    // }else{
    // if(!Character.isDigit(str.charAt(0))){
    // return 0;
    // }else{
    // output+="+";
    // }
    // }

    // //
    // for (int i = 0; i < str.length(); i++) {
    // if(Character.isDigit(str.charAt(i))){
    // output+=Integer.parseInt(str.charAt(i)+"");
    // }else{
    // break;
    // }
    // }

    // output =
    // output.charAt(0)+output.substring(1,output.length()).replaceFirst("^0*", "");

    // if(output.length()>12){
    // if(output.startsWith("-")){
    // return Integer.MIN_VALUE;
    // }else{
    // return Integer.MAX_VALUE;
    // }
    // }else if(output.length()<=1){
    // return 0;
    // }else{
    // BigInteger aaa = new BigInteger(output);
    // if(aaa.abs().compareTo(new BigInteger("2147483647"))>0){
    // if(output.startsWith("-")){
    // return Integer.MIN_VALUE;
    // }else{
    // return Integer.MAX_VALUE;
    // }
    // }else{
    // return Integer.parseInt(output);
    // }
    // }

    // }
}
