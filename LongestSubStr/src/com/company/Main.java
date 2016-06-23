package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        System.out.println(lengthoflongestsubstr("au"));
    }

    public static int lengthOfLongestSubstring(String s) {
        List<Character> list = new ArrayList<Character>();
        int listOldSize = 0;
        for (int i = 0; i < s.length(); i++) {
            list.clear();
            boolean bool[] = new boolean[256];
            for (int j = i; j < s.length(); j++) {
                if (!bool[s.charAt(j)]) {
                    list.add(s.charAt(j));
                    bool[s.charAt(j)] = true;
                }
                if (list.size() > listOldSize) {
                    listOldSize = list.size();
                }
            }
        }
        return listOldSize;
    }

    public static int lengthoflongestsubstr(String s) {
        int vist[] = new int[256];
        for(int i = 0; i < 256; i++) {
            vist[i] = -1;
        }
        int dp[] = new int[s.length()];
        if(s.length() >= 1) {
            dp[0] = 1;
            vist[s.charAt(0)] = 0;
        }
        int last = 0;
        int max = 0;


        for(int i = 1; i < s.length(); i++) {
            if(vist[s.charAt(i)] == -1) {
                dp[i] = dp[i-1]+1;
                vist[s.charAt(i)] = i;
            }
            else {
                if(last <= vist[s.charAt(i)]) {
                    dp[i] = i - vist[s.charAt(i)];
                    last = vist[s.charAt(i)] + 1;
                    vist[s.charAt(i)] = i;
                }
                else {
                    vist[s.charAt(i)] = i;
                    dp[i] = dp[i-1]+1;
                }
            }
            if(dp[i] > max) {
                max = dp[i];
            }
        }
        if(s.length() == 1) {
            max = 1;
        }
        return max;
    }
}


