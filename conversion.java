package com.company;



import java.util.Stack;

public class conversion {
    public  int BinarytoDec(int b){
        int d=0;
        int n=0;
        while(b>0){
            int t=b%10;
            d+=t*Math.pow(2,n);
            b=b/10;
            n++;
        }
        return d;

    }

    public int octalToDec(int b){
        int d=0;
        int n=0;
        while(b>0){
            int t=b%10;
            d+=t*Math.pow(8,n);
            b=b/10;
            n++;
        }
        return d;
    }
    public int hexToDec(String b){
        int len=b.length();
        int base=1;
        int d=0;
        for (int i = len - 1; i >= 0; i--) {

            if (b.charAt(i) >= '0'
                    && b.charAt(i) <= '9') {
                d += (b.charAt(i) - 48) * base;


                base = base * 16;
            }


            else if (b.charAt(i) >= 'A'
                    && b.charAt(i) <= 'F') {
                d+= (b.charAt(i) - 55) * base;


                base = base * 16;
            }
        }
        return d;

    }
    public void decimaltoBinary(int n){
        Stack<Integer>s=new Stack<Integer>();
        while(n!=0){
            int d=n%2;
            s.push(d);
            n/=2;
        }
        while(!s.isEmpty()){
            s.pop();
        }

    }
    public void decimalToOctal(int n){
        Stack<Integer>s=new Stack<Integer>();
        while(n!=0){
            int d=n%8;
            s.push(d);
            n/=8;
        }
        while(!s.isEmpty()){
            s.pop();
        }

    }
    public void decimalToHex(int n){
        int rem;
        String hex="";
        char hexchars[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        while(n>0)
        {
            rem=n%16;
            hex=hexchars[rem]+hex;
            n=n/16;
        }
        System.out.println(hex);//string form hexadecimal character
    }

    public static void main(String [] args){
        conversion c=new conversion();
        int z=c.BinarytoDec(1011);
        System.out.println(z);

    }
}
