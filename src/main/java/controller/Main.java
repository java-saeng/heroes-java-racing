package controller;

import model.Car;
import model.RacingGameResult;
import view.InputView;
import model.RacingGame;
import view.ResultView;

import javax.naming.InvalidNameException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws InvalidNameException {
        String carNames = InputView.getCarNames();
        int attemptTimes = InputView.getAttemptTimes();
        RacingGame racingGame = new RacingGame();
        List<Car> cars = racingGame.createCars(carNames);

        for (int i = 0; i < attemptTimes; i++) {
            ResultView.printRacing(racingGame.startRacing(cars,
                    RandomNumberGenerator.createRandomNumbers(carNames.length())));
        }
        RacingGameResult result = new RacingGameResult(cars);
        ResultView.printWinner(result.getWinners());
    }
}
