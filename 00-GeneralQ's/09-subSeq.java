import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        String up = "abc";
        subseq("", up, 0);
    }

    static void subseq(String p, String up, int index) {
        if (index == up.length()) {
            System.out.println(p);
            return;
        }
        
        char ch = up.charAt(index);
        subseq(p + ch, up, index + 1);
        subseq(p, up, index + 1);
        subseq(p+(ch+0), up, index + 1);
    }
}
