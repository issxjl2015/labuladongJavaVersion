package org.issxjl2015.algorithm.Lc_468_验证IP地址;

public class Solution {

    public String validIPAddress(String IP) {
        if (IP.contains(".")) {
            return IPv4(IP);
        } else if (IP.contains(":")) {
            return IPv6(IP);
        } else {
            return "Neither";
        }
    }

    private String IPv4(String IP) {
        String[] ipArr = IP.trim().split("\\.");
        if (ipArr.length != 4 || !judgeChar(IP, ipArr)) {
            return "Neither";
        }
        for (int i = 0; i < ipArr.length; i++) {
            if (ipArr[i].length() == 0 || ipArr[i].length() > 3 || (ipArr[i].length() != 1 && ipArr[i].startsWith("0")) || !judgeDigit(ipArr[i])) {
                return "Neither";
            }
            int tmp = Integer.parseInt(ipArr[i]);
            if (tmp < 0 || tmp > 255) {
                return "Neither";
            }
        }

        return "IPv4";
    }

    private String IPv6(String IP) {
        String[] ipArr = IP.trim().split("\\:");
        if (ipArr.length != 8 || !judgeChar(IP, ipArr)) {
            return "Neither";
        }
        for (int i = 0; i < ipArr.length; i++) {
            if (ipArr[i].length() > 4 || ipArr[i].length() == 0) {
                return "Neither";
            }
            String s = ipArr[i];
            for (int j = 0; j < s.length(); j++) {
                char ch = s.charAt(j);
                if (!Character.isDigit(ch) && (Character.toLowerCase(ch) > 'f' || Character.toLowerCase(ch) < 'a')) {
                    return "Neither";
                }
            }
        }

        return "IPv6";
    }

    // 判断是否存在多余的字符（. 或者 :）
    private boolean judgeChar(String IP, String[] ipArr) {
        int len = IP.length();
        int lenCnt = 0;
        for (int i = 0; i < ipArr.length; i++) {
            lenCnt += ipArr[i].length();
        }

        if (lenCnt + ipArr.length - 1 == len) {
            return true;
        }
        return false;
    }

    private boolean judgeDigit(String ip) {
        for (int i = 0; i < ip.length(); i++) {
            if (!Character.isDigit(ip.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}
