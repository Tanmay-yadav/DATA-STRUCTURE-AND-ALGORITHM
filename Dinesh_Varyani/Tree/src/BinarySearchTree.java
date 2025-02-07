import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchTree {

    private treenode root;
    private class treenode{
        private int data;
        private treenode left;
        private treenode right;

        public treenode(int data){
            this.data= data;
        }
    }
    public treenode  insert(treenode root,int value){
        if (root==null){
            root =new treenode(value);
            return root;
        }
        if (value<root.data){
           root.left=insert(root.left,value);
        }else{
            root.right=insert(root.right,value);
        }
        return root;
    }

    public void levelOrder (BinarySearchTree.treenode root ){
        if(root ==null){
            return;
        }
        Queue<BinarySearchTree.treenode> queue =new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            BinarySearchTree.treenode temp= queue.poll();
            System.out.print(temp.data+ " ");
            if(temp.left!=null){
                queue.offer(temp.left);

            }
            if (temp.right!=null){
                queue.offer(temp.right);
            }
        }
    }


    public static void main(String[] args) {
BinarySearchTree bst= new BinarySearchTree();
treenode node1= bst.new treenode(5);
                bst.insert(node1,2);
                bst.insert(node1,7);
                bst.insert(node1,3);
                bst.insert(node1,9);
                bst.insert(node1,6);
                bst.insert(node1,1);
                bst.insert(node1,2);

        System.out.println("the nodes of bst are");
        bst.levelOrder(node1);


    }
}
