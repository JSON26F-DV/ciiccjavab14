public class Task3 {
    public static void main(String[] args) {
      
        String a = new String("Wow");
        String b = a;
        String c = "Wow!";
        String d = c;
      
        boolean bl = a == b;
        boolean b2 = d.equals(b + "!");
        boolean b3 = !c.equals(a);
      
        if (bl && b2 && b3) {
            System.out.println("Success!");
        }
    }
}
