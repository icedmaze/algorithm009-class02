// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};

/**
 * 给定一个 N 叉树，返回其节点值的前序遍历。
 * 返回其前序遍历: [1,3,5,6,2,4]。
 */
class N-aryTreePreorderTraversal {
    List<Integer> result = new ArrayList();

    public List<Integer> preorder(Node root) {
        if(root == null){
            return result;
        }

        result.add(root.val);
        for(Node node : root.children){
            preorder(node);
        }
        return result;
    }
}