public class TryCatch {
    public static void main(String[] args) {
        try {
            float n = 1/0;
            System.out.println(n);
        } catch (Exception e) {
            System.out.println("Division By Zero Exception : Number Cannot be Divided By Zero");
        }
    }
}
