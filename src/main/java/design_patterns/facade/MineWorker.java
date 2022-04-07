package design_patterns.facade;

import java.util.Arrays;

public abstract class MineWorker {

    public void goToSleep() {
        System.out.printf("%s goes to sleep.\n", name());
    }

    public void wakeUp() {
        System.out.printf("%s wakes up.\n", name());
    }

    public void goHome() {
        System.out.printf("%s goes home.\n", name());
    }

    public void goToMine() {
        System.out.printf("%s goes to the mine.\n", name());
    }

    public abstract void work();

    public abstract String name();

    private void action(Action action) {
        switch (action) {
            case GO_TO_SLEEP:
                goToSleep();
                break;
            case WAKE_UP:
                wakeUp();
                break;
            case GO_HOME:
                goHome();
                break;
            case GO_TO_MINE:
                goToMine();
                break;
            case WORK:
                work();
                break;
            default:
                System.out.print("Undefined action\n");
                break;
        }
    }

    public void action(Action... actions) {
        Arrays.stream(actions).forEach(this::action);
    }


    enum Action {
        GO_TO_SLEEP, WAKE_UP, GO_HOME, GO_TO_MINE, WORK
    }


}
