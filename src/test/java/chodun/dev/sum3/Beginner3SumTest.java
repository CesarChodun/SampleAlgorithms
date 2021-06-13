package chodun.dev.sum3;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

import java.util.List;

public class Beginner3SumTest {

    Beginner3Sum solution = new Beginner3Sum();

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
