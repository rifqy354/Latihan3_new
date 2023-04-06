public class MainStack {
    public static void main(String[] args) {
        Stack s = new Stack(10);
        //Mengecek apakah kosong atau tidak
        System.out.println(s.isEmpty());

        s.push("Aku");
        s.push("Anak");
        s.push("Indonesia");

        System.out.println(s);

        System.out.println(s.isEmpty());

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
        System.out.println(s.isEmpty());

    }
}
