package racingcar.domain;

public class TryCount {

    public static final int MINIMUM_TRY_COUNT = 0;
    private int count;

    public TryCount(String count) {
        validTryCount(count);
        this.count = Integer.parseInt(count);
    }

    private void validTryCount(String numberString) {

        for (int i = 0; i < numberString.length(); i++) {
            isNumber(numberString.charAt(i));
        }

        if (Integer.parseInt(numberString) < MINIMUM_TRY_COUNT) {
            throw new IllegalArgumentException("[ERROR] 시도 횟수는 0회 이상만 가능하다.");
        }
    }

    private void isNumber(char c) {
        if (!Character.isDigit(c)) {
            throw new IllegalArgumentException("[ERROR] 시도 횟수는 숫자여야 한다.");
        }
    }

    public void tryOnce() {
        count--;
    }

    public boolean hasTryCount() {
        return count > MINIMUM_TRY_COUNT;
    }

}
