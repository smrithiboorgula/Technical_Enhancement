public class Methods {
    public static void main(String[] args) {
        /* String s1 = new String("JAVA");
        String s2 = new String("JAVA");
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
        */

        /* String s1 = new String("java");
        String s2 = new String("JAVA");
        System.out.println(s1.equalsIgnoreCase(s2));
        */

       /* String s1 = "Java";
        System.out.println(s1.toUpperCase());
        System.out.println(s1.toLowerCase());
        */

        /* String s1 ="  Hello World  ";
        System.out.println(s1.trim());
        */

        /* String s1 = "Automation Testing";
        System.out.println(s1.contains("Testing"));
        */

        /*
       String s1 = "Computer Science And Engineering";
        System.out.println(s1.contains("Engineering"));
        */

        /*
        String s1 = "Java Programming";
        System.out.println(s1.startsWith("Java"));
        System.out.println(s1.endsWith("ing"));
        */

        String s1 = "Java,Python,C++";
        String[] arr = s1.split(",");
        for(String lang : arr){
            System.out.println(lang);
        }
    }
}