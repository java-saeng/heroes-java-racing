package racingcar;

import java.util.Scanner;

public class InputView{
    static Scanner scanner = new Scanner(System.in);

    public static String getInputNameOfCars(){
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
        return scanner.nextLine();
    }

    public static int getInputRunNumber(){
        System.out.println("시도할 횟수는 몇 회인가요?");
        return scanner.nextInt();
    }

}
