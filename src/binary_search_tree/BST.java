package binary_search_tree;

/**
 * Created With IntelliJ IDEA.
 * Description:
 *
 * User:ZouSS
 * Date:2020-10-25
 * Time:10:57
 **/
public class BST {
    private Node root;

    public BST() {
        this.root = null;
    }

    public boolean search(Integer key){
        Node cur = root;
        while(cur != null){
             int tmp = key.compareTo(cur.key);
             if (tmp == 0){
                 return true;
             }else if (tmp < 0){
                 cur = cur.left;
             }else {
                 cur = cur.right;
             }
        }
        return false;
    }
    public void insert(Integer key){
        Node node = new Node(key);
        //判断当前树是不是一个空树
        if (root == null){
            root = node;
            return;
        }
        //定义parent始终是cur的双亲节点
        Node parent  = null;
        Node cur = root;
        int tmp = 0;
        while(cur != null){
            tmp = key.compareTo(cur.key);
            if (tmp == 0){
                throw new RuntimeException("当前节点有重复");
            }else if (tmp < 0){
                parent = cur;
                cur = cur.left;

            }else {
                parent = cur;
                cur = cur.right;
            }
        }
        if (tmp < 0){
            parent.left = node;
        }else {
            parent.right = node;
        }

    }
}
