class Node {
  constructor(item) {
    this.data = item;
    this.left = this.right = null;
  }
}

class BinaryTree {
  constructor() {
    this.root = null;
  }
  maxDepth(root) {
    if (root === null) return 0;
    return 1 + Math.max(this.maxDepth(root.left), this.maxDepth(root.right));
  }
}

const tree = new BinaryTree();
tree.root = new Node(1);
tree.root.left = new Node(2);
tree.root.right = new Node(3);
tree.root.left.left = new Node(4);
tree.root.left.right = new Node(5);
tree.root.left.left.left = new Node(6);
tree.root.left.left.right = new Node(7);

console.log(tree.maxDepth(tree.root));
