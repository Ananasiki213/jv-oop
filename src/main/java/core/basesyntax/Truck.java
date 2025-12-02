package core.basesyntax;

public class Truck extends Machine {
    @Override
    public void doWork() {
        System.out.println("Truck Is Working");
    }

    @Override
    public void stopWork() {
        System.out.println("Truck Stopped Working");
    }
}