import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

//           9     binary tree of the the below different tree traversal methods
//          / \
//          2  3
//          /
//          4







public class Binary {
    private treenode root;

    private class treenode{
        private treenode right;
        private treenode left;
        private int data;

        public treenode(int data){
            this.data=data;
            left=null;
            right=null;
        }
    }
    public void createnode(){
        treenode first =new treenode(9);
        treenode second = new treenode(2);
        treenode third = new treenode(3);
        treenode fourth = new treenode(4);
//        treenode fifth = new treenode(5);
         root = first;
         first.left=second;
         first.right=third;
         second.right=fourth;
//         second.left=fifth;
    }
// recursive preorder tree traversal
public void preorderRecursive(treenode root){
        if (root ==null){
            return;
        }
    System.out.print(root.data + " ");
        preorderRecursive(root.left);
        preorderRecursive(root.right);
}
    public void preorderiterative(treenode root){ // Iterative preorder binary tree traversal
        if(root==null){
            return;
        }
        Stack<treenode> stack =new Stack<>();
         stack.push(root);
         while(!stack.isEmpty()){
             treenode temp =stack.pop();
             System.out.print(temp.data+" ");
            if (temp.right!=null){
                stack.push(temp.right);
            }
            if(temp.left!=null){
                stack.push(temp.left);
            }
         }


    }
    public void inorder(treenode root){
        if (root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public void inorderIterative(treenode root){
        if (root==null){
            return;
        }
        Stack<treenode>stack=new Stack<>();
        treenode temp = root;
        while(!stack.isEmpty()||temp!=null){
            if (temp!=null){
                stack.push(temp);
                temp=temp.left;
            }
            else {
             temp=stack.pop();
                System.out.print(temp.data + " ");
                temp=temp.right;
            }
            }
        }
        public void PostorderRecursive(treenode root){
        if (root==null){
            return;
        }

        PostorderRecursive(root.left);
        PostorderRecursive(root.right);
            System.out.print(root.data+ " ");
        }

        public void PostorderIterative(treenode root ){
        treenode current = root;
        Stack<treenode> stack = new Stack<>();
        while(current!=null || !stack.isEmpty() ){
            if(current!=null ){
                stack.push(current);
                current =current.left;
            }else{
                treenode temp =stack.peek().right;
                if(temp==null){
                    temp=stack.pop();
                    System.out.print(temp.data + " ");
                    while(!stack.isEmpty() && temp==stack.peek().right){
                        temp=stack.pop();
                        System.out.print(temp.data + " ");
                    }

                }else{
                    current =temp;
                }
            }
        }
        }
        public void levelOrder (treenode root ){
        if(root ==null){
            return;
        }
            Queue<treenode> queue =new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            treenode temp= queue.poll();
            System.out.print(temp.data+ " ");
            if(temp.left!=null){
                queue.offer(temp.left);

            }
            if (temp.right!=null){
                queue.offer(temp.right);
            }
        }
        }

        public int maxvalue(treenode root){
        if (root==null){
            return Integer.MIN_VALUE;

        }
        int result=root.data;
        int left=maxvalue(root.left);
        int right =maxvalue(root.right);
        if (left>result){
            result=left;
        }
        if(right>result){
        result =right;
        }
        return result;
        }


    public static void main(String[] args) {
        Binary binary =new Binary();
        binary.createnode();
        System.out.println(" \n Preorder iterative:--");
        binary.preorderiterative(binary.root);
        System.out.println("\n Preorder recursive");
        binary.preorderRecursive(binary.root);
        System.out.println(" \n Inorder recursive:--");


        binary.inorder(binary.root);
        System.out.println(" \n Inorder iterative:--");
        binary.inorderIterative(binary.root);
        System.out.println(" \n Postorder recursive:--");
        binary.PostorderRecursive(binary.root);
        System.out.println(" \n Postorder Iterative:--");
        binary.PostorderIterative(binary.root);
        System.out.println(" \n Level order traversal:--");
        binary.levelOrder(binary.root);
        System.out.println(" \n Maximum value in the tree by recursion:--");
        int result= binary.maxvalue(binary.root);
        System.out.print(result);

    }
}
