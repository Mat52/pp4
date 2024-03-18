package pl.hubers.creditcard;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
public class AssertJTest {

    @Test
    void moreExpressiveAssertopms() {
        var hello = "Hello World";

        assertThat(hello).contains("Hello");
    }
}
