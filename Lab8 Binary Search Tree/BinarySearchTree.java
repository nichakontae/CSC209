package BinarySearchTreeLab;

public class BinarySearchTree {
    BinarySearchTreeNode root;

    public BinarySearchTree() {
        root=null;
    }

    // insert we always start from root
    // 4 condition
    // 2 condition have node move to left right
    // 2 condition no node cannot move, you should create new node

    public void addNewNode(int newInfo){
        BinarySearchTreeNode temp = root;
        if(root==null){
            root = new BinarySearchTreeNode(newInfo,null,null);
        }else {
            while(true){
                if(newInfo < temp.getInfo() && temp.left != null){
                    temp=temp.left;
                } else if (newInfo >= temp.getInfo() && temp.right != null){
                    temp=temp.right;
                } else if(newInfo < temp.getInfo()){ // already check -> then this condition for temp.left is null
                    temp.left = new BinarySearchTreeNode(newInfo,null,null);
                    break;
                } else{  // newInfo >= temp.info && temp.right is null
                    temp.right = new BinarySearchTreeNode(newInfo,null,null);
                    break;
                }
            }
        }

    }

    public BinarySearchTreeNode search(int key){
        BinarySearchTreeNode temp=root;
        while(temp!=null && temp.getInfo()!= key){
            if(key < temp.getInfo()){
                temp=temp.left;
            }else{
                temp=temp.right;
            }
        }
        return temp;
        /*
        * BinarySearchTreeNode temp = root;
            while(true){
                if(temp.getInfo() == key) return true;
                BinarySearchTreeNode temp2 = key < temp.getInfo() ? temp.left : temp.right;
                if(temp2 != null) temp = temp2;
                else return false;
            }
        * */
    }

}
