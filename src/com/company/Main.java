package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String ip = scan.next();
        String ip2;
        for (int i=0;i<ip.length();i+=5){
            if (i+5<=ip.length()){
                ip2 = ip.substring(i,i+5);
            }
            else {
                ip2 = ip.substring(i,ip.length());
            }
            int t=0;
            for (int a=0;a<ip2.length();a++){
                int p = ip2.charAt(a);
                if (p==97||p==101||p==108||p==111||p==117){
                    t++;
                }
            }
            System.out.println(ip2+" "+t);
        }
    }
}
