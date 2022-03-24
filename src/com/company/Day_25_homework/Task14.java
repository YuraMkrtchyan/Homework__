package com.company.Day_25_homework;
//14.Given a string containing only English letters (uppercase and lowercase).
// Add ‘*’ between letters (you don’t need to add ‘*’ before the first letter and after the last).
//Example` LItBeoFLcSGBOFQxMHoIuDDWcqcVgkcRoAeocXO
//         L*I*t*B*e*o*F*L*c*S*G*B*O*F*Q*x*M*H*o*I*u*D*D*W*c*q*c*V*g*k*c*R*o*A*e*o*c*X*O

public class Task14 {
    public static String asterisk(String str) {
        StringBuilder sb = new StringBuilder();
        return helper(sb, str);
    }

    public static String helper(StringBuilder sb, String str) {
        sb.append(str.charAt(0));
        if (str.length() == 1) {
            return "";
        }
        sb.append("*");
        helper(sb, str.substring(1));
        return sb.toString();
    }
}
