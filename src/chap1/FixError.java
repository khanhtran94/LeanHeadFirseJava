package chap1;

public class FixError {
    public static void main(String[] args) {
        int x = 5;
        while (x > 0){
            x = x -1;
            if (x < 3){
                System.out.println("small x");
            }
        }
    }
}
