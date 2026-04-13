import java.util.ArrayList;
class PostOrderTraverse{
    CompleteBinaryTree tree;
    public PostOrderTraverse(CompleteBinaryTree tree){
        this.tree = tree;
    }
    public void postOrder(Node node, ArrayList<Integer> res){
        if(node == null)
            return;
        postOrder(node.left, res);
        postOrder(node.right, res);
        res.add(node.data);
    }
}
