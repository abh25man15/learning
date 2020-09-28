package learningjva;

public class TreeTraversingbase {

	public static void main(String[] args) {
		TreeNode root=new TreeNode(1);
        root.setLeft(new TreeNode(2));
        root.setRight(new TreeNode(3));
        root.getLeft().setLeft(new TreeNode(4));
        root.getLeft().setRight(new TreeNode(5));
        root.getRight().setLeft(new TreeNode(6));
        root.getRight().setRight(new TreeNode(7));
        System.out.println("preorder");
        preorder(root);
        System.out.println("");
        System.out.println("postorder");
        postorder(root);
        System.out.println("");
        System.out.println("inorder");
        inorder(root);
        System.out.println("");
    }

    private static void inorder(TreeNode root) {
        // TODO Auto-generated method stub
        if(root==null)
            return;
        inorder(root.getLeft());
        System.out.print(root.getData());
        inorder(root.getRight());
    }

    private static void postorder(TreeNode root) {
        // TODO Auto-generated method stub
        if(root==null)
            return;
        postorder(root.getLeft());
        postorder(root.getRight());
        System.out.print(root.getData());
    }

    private static void preorder(TreeNode root) {
        // TODO Auto-generated method stub
        if(root==null)
            return;
        System.out.print(root.getData());
        preorder(root.getLeft());
        preorder(root.getRight());
    }

	}


