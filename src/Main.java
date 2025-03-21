//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner((System.in));
        String s = sc.next();
        LongestSubstringNoRepeat lsr = new LongestSubstringNoRepeat();
        System.out.println(lsr.substring(s));
    }
}