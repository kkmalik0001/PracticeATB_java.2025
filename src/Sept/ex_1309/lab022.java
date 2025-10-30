package Sept.ex_1309;

public class lab022 {
    public static void main(String[] args) {
        String name = "Pramod";
        String last_name = "dutta";
        String profile = "teacher";

        // System.out.println("your name is %s and you are awesome", name);  // not print
        System.out.println("your name is %s and you are awesome");   // output: your name is %s and you are awesome
        System.out.printf("your name is %s and you are awesome", name);   // output: your name is Pramod and you are awesome
        System.out.printf("your name is %s %s and you are %s", name, last_name,profile);   // output: your name is Pramod dutta and you are teacher
    }
}
