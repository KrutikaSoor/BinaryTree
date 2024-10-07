public class BinaryTree{

    private TreeNode root;

    private class TreeNode{
        private int data;
        private TreeNode left;
        private TreeNode right;

        public TreeNode(int data){
            this.data=data;
        }
    }

    public void CreateBinaryTree(){
        TreeNode first = new TreeNode(9);
        TreeNode second = new TreeNode(2);
        TreeNode third= new TreeNode(3);
        TreeNode fourth = new TreeNode(4);
        //TreeNode fifth = new TreeNode(5);

        root=first;
        first.left=second;
        first.right= third;

        second.left=fourth;
        //second.right=fifth;

    }

    public void preOrder(TreeNode root){
        if(root==null){
            return;
        }
        System.out.println(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }


    public static void main(String[] args){
        BinaryTree bt= new BinaryTree();
        bt.CreateBinaryTree();
        bt.preOrder(bt.root);
    }
}