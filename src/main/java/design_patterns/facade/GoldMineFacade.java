package design_patterns.facade;

import java.util.Collection;
import java.util.List;

/**
 * GoldmineFacade provides a single interface through which users can operate the
 * subsystems.
 *
 * <p>This makes the goldmine easier to operate and cuts the dependencies from the goldmine user to
 * the subsystems.
 */
public class GoldMineFacade {

    private final List<MineWorker> workers;

    public GoldMineFacade() {
        workers = List.of(
                new CartOperator(),
                new GoldDigger(),
                new TunnelDigger());
    }

    private static void makeActions(Collection<MineWorker> workers, MineWorker.Action... actions) {
        workers.forEach(mineWorker -> mineWorker.action(actions));
    }


    public void startNewDay() {
        makeActions(workers, MineWorker.Action.WAKE_UP, MineWorker.Action.GO_TO_MINE);
    }

    public void digOutGold() {
        makeActions(workers, MineWorker.Action.WORK);
    }

    public void endDay() {
        makeActions(workers, MineWorker.Action.GO_HOME, MineWorker.Action.GO_TO_SLEEP);
    }


}
