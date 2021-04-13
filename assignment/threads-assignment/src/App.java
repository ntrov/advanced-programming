public class App {
    public static void main(String[] args) throws Exception {
        evenNumbers countEven = new evenNumbers();
        primeNumbers countPrime = new primeNumbers();

        countEven.setName("Thread for counting even numbers between 1 - 10000");
        countPrime.setName("Thread for counting prime numbers between 1 - 10000");

        countEven.start();
        countPrime.start();
    }
}
