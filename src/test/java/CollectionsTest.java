import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CollectionsTest {
    @Test
    void maxUniqueNumberZero() {
        assertEquals(3, Collections.maxUniqueNumber(3, new int[]{6, 2, 6, 8, 3, 7, 1, 4, 4}));
    }

    @Test
    void maxUniqueNumberOne() {
        assertEquals(1, Collections.maxUniqueNumber(4, new int[]{
                2, 2, 2, 2, 2, 2, 2, 2
        }));
    }

    @Test
    void maxUniqueNumberTwo() {
        assertEquals(2, Collections.maxUniqueNumber(3, new int[]{
                7, 5, 5, 7, 5, 5, 7, 5, 5, 6
        }));
    }


}