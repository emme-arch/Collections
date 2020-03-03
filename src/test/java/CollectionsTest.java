import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CollectionsTest {
    @Test
    void maxUniqueNumber() {
        assertEquals(3, Collections.maxUniqueNumber(9, 3, new int[]{6, 2, 6, 8, 3, 7, 1, 4, 4}));
    }
}