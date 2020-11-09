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

class Node {
  constructor(item) {
    this.data = item;
    this.left = this.right = null;
  }
}

// Approach 01 --> using max_depth
class SumOfNodes {
  constructor() {
    this.root = null;
  }
  maxDepth(node) {
    if (node === null) return 0;
    return 1 + Math.max(this.maxDepth(node.left), this.maxDepth(node.right));
  }
  sum(node, max_level) {
    if (node == null) return 0;
    if (max_level === 1) return node.data;
    return (
      this.sum(node.left, max_level - 1) + this.sum(node.right, max_level - 1)
    );
  }
}

const tree = new SumOfNodes();
tree.root = new Node(1);
tree.root.left = new Node(2);
tree.root.right = new Node(3);
tree.root.left.left = new Node(4);
tree.root.left.right = new Node(5);
tree.root.right.left = new Node(6);
tree.root.right.right = new Node(7);
console.log(tree.sum(tree.root, tree.maxDepth(tree.root)));

// Approach 02
class SumOfNodes {
  static sum = 0;
  static max_level = Number.MIN_VALUE;
  static sumOfNodes(node, level) {
    if (node == null) return;
    if (level > SumOfNodes.max_level) {
      SumOfNodes.sum = node.data;
      SumOfNodes.max_level = level;
    } else if (level === SumOfNodes.max_level) {
      SumOfNodes.sum += node.data;
    }
    this.sumOfNodes(node.left, level + 1);
    this.sumOfNodes(node.right, level + 1);
  }
  static createNode(val) {
    const n = new Node();
    n.data = val;
    n.left = n.right = null;
    return n;
  }
}

const root = SumOfNodes.createNode(1);
root.left = SumOfNodes.createNode(2);
root.right = SumOfNodes.createNode(3);
root.left.left = SumOfNodes.createNode(4);
root.left.right = SumOfNodes.createNode(5);
root.right.left = SumOfNodes.createNode(6);
root.right.right = SumOfNodes.createNode(7);

SumOfNodes.sumOfNodes(root, 0);
console.log(SumOfNodes.sum);
