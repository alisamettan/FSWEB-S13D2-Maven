package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public static boolean isPalindrome(int number){
        number=Math.abs(number);//---->Mutlak değer alır.
        char[] digits=String.valueOf(number).toCharArray();
        String reversed="";
        for(int i=digits.length-1;i>=0;i--){
            reversed += digits[i];
        }
        return reversed.equals(String.valueOf(number));
    }

    //ikinci yöntem..
    public static boolean isPalindrome2(int number){
        number=Math.abs(number);
        int originalNumber=number;
        int reversedNumber=0;

        while(number>0){
            int digit=number%10;
            reversedNumber=reversedNumber*10+digit;
            number/=10;
        }

        return originalNumber==reversedNumber;
    }

    public static boolean isPerfectNumber(int num){
        if(num<0){
            return false;
        }

        int total=0;

        for(int i=1;i<=num/2;i++){
            if(num%i==0) total+=i;
        }
        return  num==total;
    }


    public static String numberToWords(int num){
        if(num<0){
            return "Invalid Value";
        }
        char[] digits=String.valueOf(num).toCharArray();
        String numToText="";

        for(char digit:digits){
            switch (digit){
                case '0':
                    numToText+="Zero ";
                    break;
                case '1':
                    numToText+="One ";
                    break;
                case '2':
                    numToText+="Two ";
                    break;
                case '3':
                    numToText+="Three ";
                    break;
                case '4':
                    numToText+="Four ";
                    break;
                case '5':
                    numToText+="Five ";
                    break;
                case '6':
                    numToText+="Six ";
                    break;
                case '7':
                    numToText+="Seven ";
                    break;
                case '8':
                    numToText+="Eight ";
                    break;
                case '9':
                    numToText+="Nine ";
                    break;

            }
        }
        return numToText.trim();
    }
}
