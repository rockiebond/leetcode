package com.rockie.leetcode.repeated_string_pattern;

/**
 * Created by rockie on 2017/4/5.
 */
public class RepeatedStringPattern {
    public boolean repeatedSubstringPattern(String s) {
        for(int i=s.length()/2; i>0;i--) {
            if(s.length()%i == 0) {
                String substr = s.substring(0, i);
                StringBuilder sb = new StringBuilder();
                for(int j =0;j<s.length()/i;j++) {
                    sb.append(substr);
                }
                if(sb.toString().equals(s)) {
                    return true;
                }
            }
        }

        return false;
    }
}
