package racingcar.domain;

import racingcar.ui.Input;
import racingcar.ui.Output;

public class RacingCarGame {

    private final Output output;
    private final Input input;
    private final MovingStrategy movingStrategy;
    private final NumberGenerator numberGenerator;
    private RacingCars racingCars;
    private TryCount tryCount;


    public RacingCarGame(Input input, Output output, NumberGenerator numberGenerator, MovingStrategy movingStrategy) {
        this.output = output;
        this.input = input;
        this.movingStrategy = movingStrategy;
        this.numberGenerator = numberGenerator;
    }

    public void init() {
        initRacingCars();
        initTryCounts();
    }

    private void initRacingCars() {
        this.racingCars = new RacingCars(input.insertCarNames(), numberGenerator, movingStrategy);
    }

    private void initTryCounts() {
        this.tryCount = new TryCount(input.insertTryCount());
    }


    public void run() {
        output.printResultNotice();
        while (tryCount.hasTryCount()) {
            racingCars.moveCars();
            output.printMovingResults(racingCars.toString());
            tryCount.tryOnce();
        }
    }

    public void findWinners() {
        output.printWinners(racingCars.findWinners());
    }

}
