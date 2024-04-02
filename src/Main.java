public class Main {
    public static void main(String[] args) throws Exception {
        Rocket rocket1 = new Rocket(1, 8);
        Thread thread1 = new Thread(rocket1);
        thread1.start();

        Rocket rocket2 = new Rocket(2, 4);
        Thread thread2 = new Thread(rocket2);
        thread2.start();

        Rocket rocket3 = new Rocket(3, 2);
        Thread thread3 = new Thread(rocket3);
        thread3.start();

        System.out.println("All rocket launches STARTED!!!");
    }
}