package Task1;

import java.util.Arrays;

/**
 * Вычисление минимума
 */
public class MinimumCalculator {
    /**
        Получить минимальный элемент
     **/
    public int getMinimumNumber(int[] array) {
        return Arrays.stream(array)
                .map(Math::abs)
                .min().orElse(0);
    }
}
