package chodun.dev.sum3;

import org.junit.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class Intermediate3SumTest {

    Intermediate3Sum solution = new Intermediate3Sum();

    @Test
    public void example1() {
        // given
        var input = new int[]{-1, 0, 1, 2, -1, -4};
        var expected = List.of(List.of(-1, -1, 2), List.of(-1, 0, 1));

        // when
        var output = solution.threeSum(input);

        // then
        assertThat(output).hasSameElementsAs(expected);
    }

}
