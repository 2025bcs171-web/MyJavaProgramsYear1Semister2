import java.util.ArrayList;
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        this.left = this.right = null;
    }
}
public class CompleteBinaryTree{
    Node root;
    //Method to print the tree.
    void printTree(Node root,int space){
        if(root == null)
            return;
        space += 10; 
        printTree(root.right,space);
        System.out.println();
        for(int i = 10; i < space; i++)
            System.out.print(" ");
        System.out.println(root.data);
        printTree(root.left,space);
    }
    //Height of the tree.
    int height(Node root){
        if(root == null)
            return -1;
        return Math.max(height(root.left), height(root.right)) + 1;
    }
    //Sum of all nodes.
    int SumOfNodes(Node root){
        if(root == null)
            return 0;
        return root.data + SumOfNodes(root.left) + SumOfNodes(root.right);
    }
    //Number of nodes in the tree
    int totalNodes(Node root){
        if(root == null)
            return 0;
        return 1 + totalNodes(root.left) + totalNodes(root.right);
    }

    public static void main(String[] args){
    CompleteBinaryTree tree = new CompleteBinaryTree();
    //Root node.
    tree.root = new Node(5);
    //Left subtree
    tree.root.left = new Node(12);
    //Right subtree.
    tree.root.right = new Node(13);
    //Descendants.
    tree.root.left.left = new Node(7);
    tree.root.left.right = new Node(14);
    tree.root.left.left.left = new Node(17);
    tree.root.left.left.right = new Node(23);
    tree.root.left.right.left = new Node(27);
    tree.root.left.right.right = new Node(3);
    tree.root.right.right = new Node(2);
    tree.root.right.right.right = new Node(11);
    tree.root.right.right.left = new Node(8);

    //Visualization of the tree but turned 90 degrees anticlockwise.
    System.out.println("Visualization of the tree but turned 90 degrees anticlockwise");
    tree.printTree(tree.root, 0);
    System.out.println();
    System.out.println("Height of the tree = "+tree.height(tree.root));
    System.out.println("Number of nodes in the tree = "+ tree.totalNodes(tree.root));
    System.out.println("Sum of nodes in the tree = "+ tree.SumOfNodes(tree.root));
    // INORDER TRAVERSAL
    System.out.println("INORDER TRAVERSAL");
    InOrderTraverse Order = new InOrderTraverse(tree);
    ArrayList<Integer> res = new ArrayList<>();
    Order.inOrder(tree.root, res);
    for(int node : res)
        System.out.print(node + " "); 
    System.out.println();
    //LEVEL ORDER TRAVERSAL
    System.out.println("LEVELORDER TRAVERSAL"); 
    LevelTraverse LevelOrder = new LevelTraverse(tree);
    ArrayList<ArrayList<Integer>>  result = LevelOrder.levelOrder(tree.root);
    for(ArrayList<Integer> level : result) 
         System.out.print(level+ " ");
    System.out.println();
    // PREORDER TRAVERSAL
    System.out.println("PREORDER TRAVERSAL");
    PreOrderTraverse preOrder = new PreOrderTraverse(tree);
    var re = new ArrayList<Integer>();
    preOrder.PreOrder(tree.root, re);
    for(int node : re)
       System.out.print(node+ " ");
    System.out.println();
    System.out.println("POSTORDER TRAVERSE");
    PostOrderTraverse PostOrder = new PostOrderTraverse(tree);
    var r = new ArrayList<Integer>();
    PostOrder.postOrder(tree.root, r);
    for(int node : r)
       System.out.print(node+ " ");
    System.out.println();
    }
}
