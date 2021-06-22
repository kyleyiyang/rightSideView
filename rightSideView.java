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
    Map<Integer,Integer> map;
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> lst=new ArrayList<>();
        map=new HashMap<>();
        dfs(root,0);
        for (int k:map.keySet()) {
            lst.add(map.get(k));
        }
        return lst;
    }
    public void dfs(TreeNode node, int depth) {
        if (node==null) return;
        if (!map.containsKey(depth)) map.put(depth,node.val);
        dfs(node.right,depth+1);
        dfs(node.left,depth+1);
    }
}
