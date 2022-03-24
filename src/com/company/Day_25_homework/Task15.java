package com.company.Day_25_homework;

// "(e (x (a (m) p) l) e)"
// "(c (ar) d)"
public class Task15 {
    public static String parentheses(String str) {
        StringBuilder sb = new StringBuilder();
        int length = str.length() / 2;
        if (str.length() % 2 == 0) {
            evenLength(sb, str, length);
        } else {
            oddLength(sb, str, length);
        }

        return sb.toString();
    }

    public static String oddLength(StringBuilder sb, String str, int length) {
        if (str.length() == 0) {
            sb.append(")");
            return "";
        }
        if (str.length() > length) {
            sb.append("(");
            sb.append(str.charAt(0));
        } else {
            sb.append(")");
            sb.append(str.charAt(0));
        }
        oddLength(sb, str.substring(1), length);
        return sb.toString();
    }

    public static String evenLength(StringBuilder sb, String str, int length) {
        if (str.length() == 0) {
            return "";
        }
        if (str.length() > length) {
            sb.append("(");
            sb.append(str.charAt(0));
        } else if (str.length() == length) {
            sb.append(str.charAt(0));
            sb.append(")");
        } else {
            sb.append(str.charAt(0));
            sb.append(")");
        }
        evenLength(sb, str.substring(1), length);
        return sb.toString();
    }
}
