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
    else {
      const lDepth = this.maxDepth(root.left);
      const rDepth = this.maxDepth(root.right);
      if (lDepth > rDepth) return lDepth + 1;
      else return rDepth + 1;
    }
  }
}

const tree = new BinaryTree();
tree.root = new Node(1);
tree.root.left = new Node(2);
tree.root.right = new Node(3);
tree.root.left.left = new Node(4);
tree.root.left.right = new Node(5);
tree.root.left.left.left = new Node(6);
tree.root.left.left.right = new Node(6);

console.log(tree.maxDepth(tree.root));
