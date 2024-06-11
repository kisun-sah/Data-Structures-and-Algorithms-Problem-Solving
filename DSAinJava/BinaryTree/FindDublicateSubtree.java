/*
 * leetcode problem : 625
 * 
 * leetcode solution link(https://leetcode.com/problems/find-duplicate-subtrees/)
 */

import java.util.*;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {

    private Map<String, Integer> mp;

    private List<TreeNode> result;


    private String f(TreeNode root) {
     
     if (root == null) return "#";

     String left = f(root.left);
     String right = f(root.right);

     String s = root.val + "," + left + "," + right;

     mp.put(s, mp.getOrDefault(s, 0) + 1);
     if (mp.get(s) == 2) {
         // this is the first time we detected a duplicate
         result.add(root);
     }

     return s;
 }
 public List<TreeNode> findDuplicateSubtrees(TreeNode root) {

      mp = new HashMap<>();
     result = new ArrayList<>();
     f(root);
     return result;
     
 }
}