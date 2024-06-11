/**
 * leetcode problem no : 515
 * 
 * leetcode solution link ()
 */
/**
 * @param {TreeNode} root
 * @return {number[]}
 */
var largestValues = function(root) {
    const result = [];
    if (root === null) {
        return result;
    }

    const queue = [];
    queue.push(root);

    while (queue.length > 0) {
        const size = queue.length;
        let maxVal = -Infinity; // Initialize max value for the current level

        for (let i = 0; i < size; i++) {
            const curr = queue.shift();
            maxVal = Math.max(maxVal, curr.val);

            if (curr.left !== null) {
                queue.push(curr.left);
            }

            if (curr.right !== null) {
                queue.push(curr.right);
            }
        }

        result.push(maxVal);
    }

    return result;
};