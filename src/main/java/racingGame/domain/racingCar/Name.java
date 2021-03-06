package racingGame.domain.racingCar;

import racingGame.domain.validator.NameValidator;

public class Name {
    private final String name;

    private Name(final String name) {
        NameValidator.checkIsValid(name);
        this.name = name;
    }

    public static Name create(final String name) {
        return new Name(name);
    }

    @Override
    public boolean equals(final Object o) {
        if (o instanceof Name) {
            return this.name.equals(((Name) o).name);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }

    @Override
    public String toString() {
        return name;
    }
}
