// Given a root node to a tree, find the sum of all the leaf nodes which are at maximum depth from root node.

//       1
//     /   \
//    2     3
//   / \   / \
//  4   5 6   7

// Input : root(of above tree)
// Output : 22

// Explanation:
// Nodes at maximum depth are: 4, 5, 6, 7.
// So, sum of these nodes = 22

// Approach 01 --> using max_depth
class Node {
  int data;
  Node left, right;

  public Node(int item) {
    data = item;
    left = right = null;
  }
}

class SumOfNodes {
  Node root;

  static int sum(Node node, int max_level) {
    if (node == null)
      return 0;
    if (max_level == 1)
      return node.data;
    return sum(node.left, max_level - 1) + sum(node.right, max_level - 1);
  }

  static int max_depth(Node node) {
    if (node == null)
      return 0;
    return 1 + Math.max(max_depth(node.left), max_depth(node.right));
  }

  public static void main(String[] args) {
    SumOfNodes tree = new SumOfNodes();
    tree.root = new Node(1);
    tree.root.left = new Node(2);
    tree.root.right = new Node(3);
    tree.root.left.left = new Node(4);
    tree.root.left.right = new Node(5);
    tree.root.right.left = new Node(6);
    tree.root.right.right = new Node(7);
    System.out.println(SumOfNodes.sum(tree.root, SumOfNodes.max_depth(tree.root)));
  }
}

// approach 2

class SumOfNodes {
  static int sum = 0, max_level = Integer.MIN_VALUE;

  static class Node {
    int data;
    Node left, right;
  }

  static Node createNode(int data) {
    Node d;
    d = new Node();
    d.data = data;
    d.left = d.right = null;
    return d;
  }

  static void sumOfNodes(Node node, int level) {
    if (node == null)
      return;
    if (level > max_level) {
      sum = node.data;
      max_level = level;
    } else if (level == max_level) {
      sum += node.data;
    }
    sumOfNodes(node.left, level + 1);
    sumOfNodes(node.right, level + 1);
  }

  public static void main(String[] args) {
    Node root = null;
    root = createNode(1);
    root.left = createNode(2);
    root.right = createNode(3);
    root.left.left = createNode(4);
    root.left.right = createNode(5);
    root.right.left = createNode(6);
    root.right.right = createNode(7);
    sumOfNodes(root, 0);
    System.out.println(sum);
    ;
  }
}