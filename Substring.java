package com.company;

public class Substring {
    public static void subseq(String s,String ans){

        if(s.length()==0){
            System.out.println(ans);
            return ;

        }
        char ch=s.charAt(0);
        String r=s.substring(1);
        subseq(r,ans);
        subseq(r,ans+ch);

    }

    public static void subascii(String s,String ans){
        if(s.length()==0){
            System.out.println(ans);
            return;
        }
        char ch=s.charAt(0);
        int code=ch;
        String ros=s.substring(1);
        subseq(ros,ans);
        subseq(ros,ans+ch);
        subseq(ros,ans+ch+code);

    }


    public static String []arr={"","abc","def","ghi","jkl","mno"};

    public static void keypad(String s,String ans){
        if(s.length()==0){
            System.out.println(ans);
            return;
        }
        char ch=s.charAt(0);
        String h=arr[ch-'0'];
        String ros=s.substring(1);
        for(int i=0;i<h.length();i++){
            keypad(ros,ans+h.charAt(i));
        }
    }
    public static void main(String[] args){
        String s="ABCD";
        subseq(s,"");
        subascii("abc","");
        keypad("23"," ");
    }
}
