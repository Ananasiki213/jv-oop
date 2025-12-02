package core.basesyntax;

public class Bulldozer extends Machine {
    @Override
    public void doWork() {
        System.out.println("Bulldozer Is Working");
    }
    @Override
    public void stopWork() {
        System.out.println("Bulldozer Stopped Working");
    }
}


