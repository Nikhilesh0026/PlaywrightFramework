public class sample {
    public static void main(String[] args) {

        System.out.println("Hello World Nikhilesh");
        sample obj = new sample();
        obj.display(5, 10);
       
    }

    public void display(int a, int b) {
        int sum = a + b;
        System.out.println("Sum: " + sum);

        System.out.println("Hello World nikhilesh");
        sample obj = new sample();
        obj.multiply(5, 10);
    }


    public void multiply(int a, int b) {
        System.out.println("The multiplication of two numbers is: " + (a * b));

    }

    public void run() {
        System.out.println("This is a sample method.");


}
}