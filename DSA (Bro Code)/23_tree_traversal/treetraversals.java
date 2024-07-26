public class treetraversals
{
    private void inordertrav(Node root)
    {   
        // left -> root -> right
        inordertrav(root.left);
        System.out.println(root.data);
        inordertrav(root.right);
    }
    
    private void postordertrav(Node root)
    {
        // left -> right -> root
        postordertrav(root.left);
        postordertrav(root.right);
        System.out.println(root.data);
    } 

    private void peordertrav(Node root)
    {
        // root -> left -> right 
        System.out.println(root.data);
        peordertrav(root.left);
        peordertrav(root.right);
    }
    
}
