/**
 * leetcode problem no :893
 * leetcode solution link(https://leetcode.com/problems/minimum-cost-for-tickets/)
 */
/**
 * @param {number[]} days
 * @param {number[]} costs
 * @return {number}
 */
let c;
let s;
let lastday;
let dp;
function f(day){
   if(day > lastday )return 0;

   if(!s.has(day)) return f(day+1);

   if(dp[day] != -1) return dp[day]
let ans = Math.min(c[0] +f(day +1) , c[1]+ f(day +7) , c[2] + f(day+30));

return dp[day] = ans;


}
var mincostTickets = function(days, costs) {
   dp =Array(400).fill(-1);
   s= new Set(days);
   c = costs;
   lastday=days[days.length -1];
   return f(1);
   
};