public class Main {
    public static void main(String[] args) {
        Matrix matrix = new Matrix();
        matrix.populate();
        System.out.println("The absolute difference between the primary and secondary diagonals is: " + matrix.diagdiff());
    }
}
