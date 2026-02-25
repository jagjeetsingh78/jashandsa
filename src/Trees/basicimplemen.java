package Trees;

class Node {
    int val;
    Node left;
    Node right;

    Node(int val) {
        this.val = val;
    }
}

public class basicimplemen {

    public static void main(String[] args) {

        Node a = new Node(2);
        Node b = new Node(2);
        Node c = new Node(2);
       Node f = new Node(2);
        Node g= new Node(2);
        Node h= new Node(2);
        Node i= new Node(2);
        Node k = new Node(99);
       c.left=f;

       c.right=g;
       b.left=h;
       b.right=i;


        a.left = b;
        a.right = c;

        System.out.println(a.val);
        System.out.println(a.left.val);
        System.out.println(a.right.val);
        System.out.println(b.left);
        // null
        printtrees(a);
        int m = Size(a);
        System.out.println("the size of the tree is the "+m);
        System.out.println(  "the product of the 2 to power 7 is "+product(a));
        System.out.println(  "the product of the only one is "+product(k));
    }


    static void printtrees(Node a){
        if(a==null) return ;
        System.out.println(a.val);

        printtrees(a.left);

        printtrees(a.right);

        // this traversal is the preorder traversal of the trees
    }


    static int Size(Node a){
        if(a==null) return 0 ;
        int left = Size(a.left);
        int right= Size(a.right);
        return 1+left+right;


    }

    static int product(Node m){
        if(m==null) return 1;
//        if(m.left==null&&m.right==null) return m.val;
        return m.val*product(m.left)*product(m.right);
    }

    
}
