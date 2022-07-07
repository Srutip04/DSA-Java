package com.company;

public class Recurse {
    public  static int firstocc(int arr[],int n,int i,int key){
        if(arr[i]==key){
            return i;
        }
        if(i==n){
            return -1;
        }
        return firstocc(arr,n,i+1,key);
    }
    public static int lastocc(int arr[],int n,int i,int key){
        if(i==n){
            return -1;
        }
        int restArray=lastocc(arr,n,i+1,key);
        if(restArray!=-1){
            return restArray;
        }
        if(arr[i]==key){
            return i;
        }
        return -1;

    }
    public static String reverse(String str){
        if (str.isEmpty())
            return str;
        //Calling Function Recursively
        return reverse(str.substring(1)) + str.charAt(0);
    }
    public static String replacePi(String s){
        if(s.length()<=1){
            return s;
        }
        if(s.charAt(0)=='p' && s.charAt(1)=='i'){
            return "3.14" + replacePi(s.substring(2, s.length()));
        }else{
            return s.charAt(0) + replacePi(s.substring(1, s.length()));
        }
    }
    public static void towerofHanoi(int n,char src,char dest,char helper){
        if(n==1){
            System.out.println(src+" to "+dest);
            return;
        }
        towerofHanoi(n-1,src,helper,dest);
        System.out.println(src+" to "+dest);
        towerofHanoi(n-1,helper,dest,src);


    }

    public static String removeDup(String s){
        if(s.length()<=1){
            return s;
        }
        char ch=s.charAt(0);
        String ans=removeDup(s.substring(1));
        if(ch==ans.charAt(0)){
            return ans;
        }
        return (ch+ans);
    }
    public static String moveAtlast(String s){
        if(s.length()<=1){
            return s;
        }
        char ch=s.charAt(0);
        String ans=moveAtlast(s.substring(1));
        if(ch=='x'){
            return ans+ch;
        }
        else return ch+ans;


    }
    public static String allsame(String s){
        if(s.length()<=1){
            return s;
        }
        char ch=s.charAt(0);
        String str=s.substring(1);
        if(ch=='x'){
            return ch+allsame(str);
        }
        return allsame(str);
    }

    public static void main(String[] args){
        int []arr={4,2,1,2,5,2,7};
        System.out.println(firstocc(arr,7,0,2));
        System.out.println(lastocc(arr,7,0,2));
        String s="hello";
        System.out.println(reverse(s));
        System.out.println(replacePi("pipppppippp"));
        towerofHanoi(4,'A','B','C');
        System.out.println(removeDup("aaabbbcccedd"));
        System.out.println(moveAtlast("xxdfgh"));
        System.out.println(allsame("dfgxxx"));
    }
}
