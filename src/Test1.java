public class Test1 {
    public static void main(String[] args) {
        String strg= "Leinux Hint" ;
        System.out.println("Actual String: " + strg);
        String newStrg= strg.substring(0, 4) + strg.substring(2);
        System.out.println("Resultant String: " + newStrg);
    }
}
