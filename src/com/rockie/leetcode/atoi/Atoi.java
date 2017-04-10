package com.rockie.leetcode.atoi;

/**
 * Created by rockie on 2017/4/6.
 */
public class Atoi {
    public int myAtoi(String str) {
        //deal with blanks
        str = str.trim();
        if(str.indexOf('.') >= 0) {
            str = str.substring(0,str.indexOf('.'));
        }

        int sign = 1;
        if(str.startsWith("-")) {
            sign = -1;
            str = str.substring(1);
        }
        if(str.startsWith("+")) {
            str = str.substring(1);
        }

        int value = 0;
        char[] chars = str.toCharArray();
        for(int i = 0;i<chars.length;i++) {
            char c = chars[i];
            if(c >= '0' && c<= '9') {
                value = value *10 + c - '0';
            } else {
                return value * sign;
            }
        }

        return value * sign;
    }
}
