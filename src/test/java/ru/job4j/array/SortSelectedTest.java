package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class SortSelectedTest {
    @Test
    public void whenSort() {
        int[] data = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSort3() {
        int[] data = new int[] {17, 10, 16};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {10, 16, 17};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSort5() {
        int[] data = new int[] {34, 18, 1, -86, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {-86, 1, 5, 18, 34};
        assertThat(result).containsExactly(expected);
    }
}