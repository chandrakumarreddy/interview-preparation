class Node {
  int data;
  Node left, right;

  Node(int item) {
    data = item;
    left = right = null;
  }
}

class BinaryTree {
  Node root;

  int maxDepth(Node node) {
    if (node == null)
      return 0;
    return 1+ Math.max(maxDepth(node.left),maxDepth(node.right));
  }

  public static void main(String[] args) {
    BinaryTree tree = new BinaryTree();
    tree.root = new Node(1);
    tree.root.left = new Node(2);
    tree.root.right = new Node(3);
    tree.root.left.left = new Node(4);
    tree.root.left.right = new Node(5);
    tree.root.left.left.left = new Node(6);
    tree.root.left.left.right = new Node(7);
    System.out.println(tree.maxDepth(tree.root));
  }
}
