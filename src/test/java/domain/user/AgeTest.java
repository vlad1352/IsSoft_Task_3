package domain.user;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

class AgeTest {

    @Mock
    private Age age;

    @Test
    void intValueTest() {
        for (int age = 0; age <= 125; age++) {
            this.age = Age.of(age);
            Assertions.assertEquals(this.age.intValue(), age);
        }
    }

}