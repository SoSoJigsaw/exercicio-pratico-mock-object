package main.test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class NumberAscOrderTest {

    @Mock
    private CustomStack<Number> stack;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testSortWithNumbers() throws StackEmptyException {
        when(stack.isEmpty()).thenReturn(false, false, false, false, false, false, true);
        when(stack.pop()).thenReturn(34, 12, 45, 23, 1, 89);

        NumberAscOrder numberAscOrder = new NumberAscOrder(stack);
        List<Number> sortedNumbers = numberAscOrder.sort();

        assertNotNull(sortedNumbers);
        assertEquals(6, sortedNumbers.size());
        assertEquals(List.of(1, 12, 23, 34, 45, 89), sortedNumbers);
    }

    @Test
    public void testSortWithEmptyStack() {
        when(stack.isEmpty()).thenReturn(true);

        NumberAscOrder numberAscOrder = new NumberAscOrder(stack);

        assertThrows(StackEmptyException.class, numberAscOrder::sort);
    }
}
