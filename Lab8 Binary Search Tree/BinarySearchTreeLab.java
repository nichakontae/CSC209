package BinarySearchTreeLab;

public class BinarySearchTreeLab {
    public static void main(String[] args) {
        BinarySearchTree t1 = new BinarySearchTree();
        t1.addNewNode(50);
        System.out.println(t1.root.getInfo());
        t1.addNewNode(20);
        System.out.println(t1.root.left.getInfo());
        t1.addNewNode(40);
        System.out.println(t1.root.left.right.getInfo());
//        System.out.println(t1.root.left.left.getInfo());
        // error no left of left from root
        t1.addNewNode(100);
        t1.addNewNode(150);
        t1.addNewNode(1000000);
        t1.addNewNode(50); // 50 is left of 100
        System.out.println(t1.root.right.right.right.getInfo());
        System.out.println(t1.root.right.left.getInfo());
        BinarySearchTreeNode x = t1.search(230);
        if(x!=null){
            System.out.println("Found x is "+x.getInfo());
        } else{
            System.out.println("Not Found 404");
        }
    }
}
