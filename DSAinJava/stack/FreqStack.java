/**
 * leetcode problem no := 895
 * leetcode solution link (https://leetcode.com/problems/maximum-frequency-stack/)
 * 
 */
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Stack;

public class FreqStack {
    private HashMap<Integer, Integer> freqMap;
    private HashMap<Integer, Stack<Integer>> elementMap;
    private int maxFreq;

    public FreqStack() {
        freqMap = new HashMap<>();
        elementMap = new HashMap<>();
        maxFreq = 0;
    }

    public void push(int x) {
        int freq = freqMap.getOrDefault(x, 0) + 1;
        freqMap.put(x, freq);
        if (freq > maxFreq) {
            maxFreq = freq;
        }
        elementMap.computeIfAbsent(freq, k -> new Stack<>()).push(x);
    }

    public int pop() {
        Stack<Integer> maxFreqStack = elementMap.get(maxFreq);
        int result = maxFreqStack.pop();

        if (maxFreqStack.isEmpty()) {
            elementMap.remove(maxFreq);
            maxFreq--;
        }

        freqMap.put(result, freqMap.get(result) - 1);
        if (freqMap.get(result) == 0) {
            freqMap.remove(result);
        }

        return result;
    }
}
