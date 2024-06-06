public class first {
    public static void main(String args[]){
        // insert tab space
        String str="Hello\tWorld";
        System.out.println(str);
        System.out.println("_____________________________________");

        //insert backspace
        String str1="Hello\bWorld";
        System.out.println(str1);
        System.out.println("_____________________________________");

        //insert new line
        String str2="Hello\nWorld";
        System.out.println(str2);
        System.out.println("_____________________________________");

        //insert carriage return
        String str3="Hello\rWorld";
        System.out.println(str3);
        System.out.println("_____________________________________");

        //insert form feed
        String str4="Hello \f World";
        System.out.println(str4);
        System.out.println("_____________________________________");

        //insert single quote
        String str5="\'Hello World\'";
        System.out.println(str5);
        System.out.println("_____________________________________");

        //insert double quote
        String str6="\"Hello World\"";
        System.out.println(str6);
        System.out.println("_____________________________________");

        //insert backslash
        String str7="Hello\\World";
        System.out.println(str7);
        System.out.println("_____________________________________");
    }
}