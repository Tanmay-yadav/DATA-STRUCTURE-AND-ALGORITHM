import java.util.Stack;

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


    }
}
