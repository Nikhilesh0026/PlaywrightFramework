public class sample {
    public static void main(String[] args) {


        System.out.println("Hello World Nikhilesh");
        sample obj = new sample();
        obj.display(5, 10);
        obj.multiply(5, 55);
       
    }

    public void display(int a, int b) {
        int sum = a + b;
        System.out.println("The sum of two numbers is: " + sum);




    }



    public void multiply(int a, int b) {
        System.out.println("The multiplication of two numbers is: " + (a * b));

    }
    

    public void run() {
        System.out.println("This is a sample method.");


}
}