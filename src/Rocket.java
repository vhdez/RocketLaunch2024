public class Rocket implements Runnable {
    int number;
    int launchTime;

    public Rocket(int number, int launchTime) {
        this.number = number;
        this.launchTime = launchTime;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getLaunchTime() {
        return launchTime;
    }

    public void setLaunchTime(int launchTime) {
        this.launchTime = launchTime;
    }

    public void launch()  {
        try {
            for (int i = launchTime; i > 0; i = i - 1) {
                System.out.println("Rocket #" + number + " will launch in " + i + " seconds...");
                Thread.sleep(1000); // delay for 1000 milliseconds = 1 second
            }
            System.out.println("Rocket #" + +number + " has launched!");
        } catch (Exception ex) {

        }
    }

    public void run() {
        launch();
    }
}
