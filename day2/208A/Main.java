package day2.208A;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();     // input is a single word (no spaces)
        
        // Replace one or more consecutive "WUB" with a single space
        String res = s.replaceAll("(WUB)+", " ");
        
        // Trim leading/trailing spaces and print
        System.out.println(res.trim());
    }
}

