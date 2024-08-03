package com.company;

//Q1. write a java program to convert a string to lower case
public class cwp_ch3_ps1 {
    public static void main(String[] args) {

        String name = " Bihari Singh ";
        name = name.toLowerCase();
        System.out.println(name); // bihari singh

// Q2. write a java program to replace spaces with underscores.
      String text = "TO My Friend";
      text = text.replace(" ","_");
      System.out.println(text); // To_My_Friend

// Q3. write a java program to fill in a latter template which looks like below
//     latter = "dear<|name|>,Thanks a lot"
//      replace <|name>| with a string (some name)
       String letter = "Dear <|name|>, Thanks a lot";
       letter = letter.replace("<|name|>", "sachin");
        System.out.println(letter); // Dear sachin,Thanks a lot

// Q4. write a java program to detect double and triple spaces in a string

        String mystring = "This string contains double and  triple spaces";
        System.out.println(mystring.indexOf("  ")); // double space start in 31;
        System.out.println(mystring.indexOf("   ")); // there is no triple space so, Output is -1

// Q5. write a program to to format the following letter using escape sequence characters.
//      letter = " Dear Sachin, Hello. How are you?"
        String myLetter = "Dear Sachin,\n\tHello. \n\tHow are you?"; //Dear Sachin, (\n = new line, \t = tab space
        System.out.println(myLetter);                               //     Hello.
                                                                    //     How are you?
    }
}
