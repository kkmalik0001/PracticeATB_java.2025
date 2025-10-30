package Sept.ex_1309;

public class lab023 {
    public static void main(String[] args) {
        //Literals

        // 1. boolean literals: true and false value
        //2. integer type literal : decimal system
        int binary_num = 0b1010; // binary literal, base of 2
        // other are hexadecimal, decimal, octal
        // 3. Character literal

        // sINGLE CHARACETER
        char c1 = 'A';
        char c2 = 'B';

        // Escape char
        char new_line = '\n';
        char tab_line = '\t';
        char back_space  = '\b';
        char car_r  = '\r';    // carage return return
        System.out.println("kapil" + new_line + "Malik");
       System.out.println("kapil" + '\n'  + "Malik");             // you can write as this also
        System.out.println("kapil" + tab_line + "Malik");
        System.out.println("kapil" + back_space + "Malik");
        System.out.println("kapil" + car_r + "Malik");
    }
}
