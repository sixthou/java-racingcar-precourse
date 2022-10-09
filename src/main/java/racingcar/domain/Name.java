package racingcar.domain;

public class Name {

    private static final int MAX_NAME_LENGTH = 5;
    private final String name;

    public Name(String name) {
        validName(name);
        this.name = name;
    }

    private void validName(String name) {
        if (name.isEmpty()) {
            throw new IllegalArgumentException("[ERROR] 이름이 비어 있습니다.");
        }

        if (name.length() > MAX_NAME_LENGTH) {
            throw new IllegalArgumentException("[ERROR] 이름은 길이는 5자 이하만 가능합니다.");
        }
    }


    @Override
    public String toString() {
        return name;
    }
}
