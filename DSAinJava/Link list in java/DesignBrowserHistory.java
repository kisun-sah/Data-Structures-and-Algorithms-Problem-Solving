import java.util.Stack;

/**
 * leetcode problem no : = 1472
 * 
 * leetcode solution link (https://leetcode.com/problems/design-browser-history/)
 */

class BrowserHistory {
    private Stack<String> past; // back 
    private Stack<String> future ;//forward
    private String curr;

    public BrowserHistory(String homepage) {

        curr = homepage;
        past = new Stack <>();
        future = new Stack<>();
        
    }
    
    public void visit(String url) {
        past.push(curr);
        curr = url;
        future.clear();
        
    }
    
    public String back(int steps) {
        while(steps>0 && !past.empty()){
            future.push(curr);
            curr = past.pop();
            steps --;
        }
        return curr;
    }
    
    public String forward(int steps) {
        while(steps > 0 && ! future . empty()){
            past.push(curr);
            curr = future.pop();
            steps --;
        }
        return curr;
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */