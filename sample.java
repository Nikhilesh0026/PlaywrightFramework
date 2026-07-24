public class sample {
    public static void main(String[] args) {
        System.out.println("Hello World Nikhilesh");
        sample obj = new sample();
        obj.display(5, 10);
       
    }

    public void display(int a, int b) {
        int sum = a + b;
        System.out.println("Sum: " + sum);
    }
}
