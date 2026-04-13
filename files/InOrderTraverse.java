import java.util.ArrayList;
class InOrderTraverse{
    CompleteBinaryTree tree;
    InOrderTraverse(CompleteBinaryTree tree){
        this.tree = tree;
    }
    public void inOrder(Node node, ArrayList<Integer> res){
        if(node == null)
            return;
        inOrder(node.left,res);
        res.add(node.data);
        inOrder(node.right,res); 
    }
}
