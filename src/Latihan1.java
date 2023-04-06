import java.util.Stack;

public class Latihan1 {
    public static void main(String[] args) {
        Stack s = new Stack<>();

        //Mengecek apakah kosong atau tidak
        System.out.println(s.empty());

        s.push("Aku");
        s.push("Anak");
        s.push("Indonesia");

        System.out.println(s);

        System.out.println(s.empty());

        System.out.println("Next :" + s.peek());
        s.push("Raya");
        System.out.println(s.pop());
        s.push("!");

        System.out.println(s);

        int count = s.search("Aku");
        while (count != -1 && count > 1) {
            s.pop();
            count--;
        }

        System.out.println(s.pop());
        System.out.println(s.empty());
    }
}
