/**
 * leetcode problem no := 895
 * leetcode solution link (https://leetcode.com/problems/maximum-frequency-stack/)
 * 
 */


var FreqStack = function() {
    this.freqMap = {};
    this.Maxfreq = 0;
    this.elementMap = {};
    
};

/** 
 * @param {number} val
 * @return {void}
 */
FreqStack.prototype.push = function(val) {
    if(!this.freqMap[val]){
        // Value is not present in the map 
        this.freqMap[val]=1;


    } else{
       //value is present in the map 
       this.freqMap[val] += 1;

    }
    this.Maxfreq = Math.max(this.Maxfreq , this.freqMap[val]);
    // add the entry in the element map 

    const frequency = this.freqMap[val];
    if(! this.elementMap[frequency]){
        this . elementMap[frequency] = [val];

    }else{
        this. elementMap[frequency].push(val);
    }
    
};

/**
 * @return {number}
 */
FreqStack.prototype.pop = function() {
    const arr = this.elementMap[this.Maxfreq]
  const result = arr[arr.length - 1];
    this.elementMap[this.Maxfreq].pop();
    this.freqMap[result] --;
    if(this.elementMap[this.Maxfreq].length ==0){
        delete this.elementMap[this.Maxfreq];

        this.Maxfreq -= 1;
    }
    return result;
};

/** 
 * Your FreqStack object will be instantiated and called as such:
 * var obj = new FreqStack()
 * obj.push(val)
 * var param_2 = obj.pop()
 */