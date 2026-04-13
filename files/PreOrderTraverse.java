import java.util.ArrayList;
class PreOrderTraverse{
    CompleteBinaryTree tree;
    public PreOrderTraverse(CompleteBinaryTree tree){
        this.tree = tree;
    }
    public void PreOrder(Node node, ArrayList<Integer> res){
        if(node == null)
            return;
        res.add(node.data);
        PreOrder(node.left, res);
        PreOrder(node.right, res);
    }
}
