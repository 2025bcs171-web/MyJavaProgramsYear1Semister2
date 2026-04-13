import java.util.ArrayList;
class LevelTraverse{
    CompleteBinaryTree tree;
    public  LevelTraverse(CompleteBinaryTree tree){
        this.tree = tree;
    }
    void levelTraverse(Node root, int level, ArrayList<ArrayList<Integer>> res){
        if(root == null)
            return;
        if(res.size() <= level)
            res.add(new ArrayList<>());
        res.get(level).add(root.data);
        levelTraverse(root.left, level + 1, res);
        levelTraverse(root.right, level + 1, res);
    }
    ArrayList<ArrayList<Integer>>  levelOrder(Node root){
        var result = new ArrayList<ArrayList<Integer>>();
        levelTraverse(root, 0, result);
        return result;
    }
}
