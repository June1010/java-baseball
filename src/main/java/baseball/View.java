package baseball;

import camp.nextstep.edu.missionutils.Console;

public class View {

    public String getUserInput() {
        String input = Console.readLine();
        Boolean isValid = validateUserInput(input);

        if (!isValid) {
            throw new IllegalArgumentException();
        }
        return input;
    }

    public String getUserResponse() {
        String input = Console.readLine();
        Boolean isValid = validateUserResponse(input);

        if (!isValid) {
            throw new IllegalArgumentException();
        }
        return input;
    }

    public void printInitMsg() {
        String msg = "숫자 야구 게임을 시작합니다.";
        System.out.println(msg);
    }

    public void printInputMsg() {
        String msg = "숫자를 입력해주세요 : ";
        System.out.print(msg);
    }

    public void printSuccessMsg() {
        String msg = "3개의 숫자를 모두 맞히셨습니다! 게임 종료";
        System.out.println(msg);
    }

    public void printRestartMsg() {
        String msg = "게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.";
        System.out.println(msg);
    }

    private boolean validateUserResponse(String number) {
        if (number == null) {
            return false;
        }
        return number.matches("^[1-2]$");
    }

    private boolean validateUserInput(String number) {
        if (number == null) {
            return false;
        }
        return number.matches("^[1-9]{3}$");
    }
}
