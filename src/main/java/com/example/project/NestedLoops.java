package com.example.project;

/*
1.Manually test first in the Runner class.
2.Run ./gradlew test to run automated tests.
3.Once you have completed the challenges, push to your repository.
4.Submit at turninterminal.netlify.app
*/

public class NestedLoops {
               /*
return the string below for given height=5
*
**
***
****
*****  
           */
public static String starStaircase(int height) {
    String stairCase = "";
    for (int i = 1; i <= height; i++) {
        for (int j = 1; j <=i; j++) {
            stairCase+="*";
        }
        stairCase+="\n";
    }
    return stairCase.substring(0, stairCase.length()-1);
}
          /*
return the string below for given height=5
*****
****
***
**
*
           */

public static String starStaircaseReverse(int height){
    String stairCase = "";
    for (int i = height; i >= 1; i--) {
        for (int j = i; j >=1; j--) {
            stairCase+="*";
        }
        stairCase+="\n";
    }
    return stairCase.substring(0, stairCase.length()-1);
}
            /*

width=5 height=5
*****
*   *
*   *
*   *
*****
          */
    public static String emptyBox(int width, int height) {
        if (width == 0 || height == 0 || width == 1 || height == 1) {
            return "";
        }
        String box = "";
        String side = "";
        String top = "";
        for (int i = 1; i <= width; i++) {
            top += "*";
        }
        top += "\n";
        for (int j = 1; j <= width; j++) {
            if (j == 1 || j == width) {
                side+="*";
            }
            else {
                side+=" ";
            }
        }
        side+="\n";
        for (int layers = 1; layers <= height; layers++) {
            if (layers == 1 || layers == height) {
                box+=top;
            }
            else {
                box+=side;
            }
        }
        return box.substring(0, box.length()-1);
    }
                    /*
return the string below for word="HELLO" rows=5                    
HELLO
ELLOH
LLOHE
LOHEL
OHELL

  i will provide a hint for this one if you get stuck.. use modulo
                */
    public static String repeatRectangle(String word, int rows) {
        String output = "";
        for (int i = 0; i < rows; i++) {
            output+=word.substring(i%word.length()) + word.substring(0, i%word.length());
            output+="\n";
        }
        return output.substring(0, output.length()-1);
    }

}