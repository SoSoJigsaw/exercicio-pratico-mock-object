package br.edu.fatec.sjc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class NumberAscOrder {
    private CustomStack<Number> stack;

    public NumberAscOrder(CustomStack<Number> stack) {
        this.stack = stack;
    }

    public List<Number> sort() throws StackEmptyException {
        if (stack.isEmpty()) {
            throw new StackEmptyException("The stack is empty");
        }
        
        List<Number> numbers = new ArrayList<>();
        while (!stack.isEmpty()) {
            numbers.add(stack.pop());
        }
        
        // Convert the Number objects to their corresponding wrapper classes
        List<Integer> intNumbers = numbers.stream()
                                        .map(n -> (Integer) n.intValue())
                                        .collect(Collectors.toList());
        
        Collections.sort(intNumbers);
        
        // Convert the sorted list back to Number objects
        List<Number> sortedNumbers = intNumbers.stream()
                                            .map(Integer::valueOf)
                                            .collect(Collectors.toList());
        
        return sortedNumbers;
    }
}