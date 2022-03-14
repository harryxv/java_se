package datastructure;

/**
 * Concept: Tree -subTree.
 * Root> left_subTree nodes & Root < right_subtree nodes
 * @param <Key>
 * @param <Value>
 */
public class BinarySearchTree<Key extends Comparable<Key>, Value> {
    private Node root;

    private class Node {
        private Key key;
        private Value value;
        private Node left, right;

        public Node(Key key, Value value) {
            this.key = key;
            this.value = value;
        }
    }

    public void put(Key key, Value value) {
        Node node = new Node(key, value);
        root = put(root, node);
    }

    private Node put(Node root, Node node) {
        if (root == null) return node;

        int cmp = node.key.compareTo(root.key);
        if (cmp < 0)
            root.left = put(root.left, node);
        else if (cmp > 0)
            root.right = put(root.right, node);
        else root.value = node.value;

        return root;
    }

}