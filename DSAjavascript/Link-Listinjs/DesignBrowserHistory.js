/**
 * leetcode problem no : = 1472
 * 
 * leetcode solution link (https://leetcode.com/problems/design-browser-history/)
 */

/**
 * @param {string} homepage
 */
var BrowserHistory = function(homepage) {

    this.curr = homepage;
      this.past = []; // back 
      this.future = []; // forward
  
};

/** 
* @param {string} url
* @return {void}
*/
BrowserHistory.prototype.visit = function(url) {
 this. past.push(this.curr);
      this.curr = url;
      this.future = [];
  
};

/** 
* @param {number} steps
* @return {string}
*/
BrowserHistory.prototype.back = function(steps) {
    while (steps > 0 && this.past.length > 0) {
          this.future.push(this.curr);
          this.curr = this.past.pop();
          steps--;
      }
      return this.curr;
  
  
};

/** 
* @param {number} steps
* @return {string}
*/
BrowserHistory.prototype.forward = function(steps) {
     while (steps > 0 && this.future.length > 0) {
          this.past.push(this.curr);
          this.curr = this.future.pop();
          steps--;
      }
      return this.curr;
  
};

/** 
* Your BrowserHistory object will be instantiated and called as such:
* var obj = new BrowserHistory(homepage)
* obj.visit(url)
* var param_2 = obj.back(steps)
* var param_3 = obj.forward(steps)
*/