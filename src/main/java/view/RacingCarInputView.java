package view;

import camp.nextstep.edu.missionutils.Console;
import input.InputData;

public class RacingCarInputView implements InputView{

    private static final String INPUT_GUIDELINE_NAME = "경주할 자동차 이름을 입력해주세요 (이름은 쉼표(,) 기준으로 구분)";
    private static final String INPUT_GUIDELINE_TRY_COUNT = "시도할 횟수를 입력해주세요";

    @Override
    public InputData run(){
        return new InputData(receiveName(), receiveTryCount());
    }

    public String receiveName(){
        System.out.println(INPUT_GUIDELINE_NAME);
        return Console.readLine();
    }

    public String receiveTryCount(){
        System.out.println(INPUT_GUIDELINE_TRY_COUNT);
        return Console.readLine();
    }
}