package racingcar.domain;

import camp.nextstep.edu.missionutils.Randoms;

public class RandomNumberGenerator implements NumberGenerator {

    @Override
    public int pickNumber() {
        return Randoms.pickNumberInRange(0, 9);
    }

}
