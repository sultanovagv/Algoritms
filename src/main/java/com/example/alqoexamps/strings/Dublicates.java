package com.example.alqoexamps.strings;

public class Dublicates {

    public static String countStr(String s) {
        //input  3[ab]1[cd]2[ef]  example
        //output  abababcdefef

        StringBuilder str = new StringBuilder(s);
        StringBuilder res = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '[') {
                var end = str.indexOf("]");
                var numb = Integer.valueOf(str.substring(0, i));
                res.append(str.substring(i + 1, end).repeat(numb));
                var newStr = str.substring(end + 1); //every time string cut
                str.setLength(0);
                str.append(newStr);
                i = 0;
            }
        }
        return res.toString();
    }


}
