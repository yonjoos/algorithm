import java.util.*;


public class Main {

    public static void main(String[] args) throws Exception{


//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//
//        N = Integer.parseInt(st.nextToken());
//        M = Integer.parseInt(st.nextToken());
//


        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        Tree tree = new Tree();

        String ss = sc.next();
        String ll = sc.next();
        String rr = sc.next();

        Node root = makeNode(ss, ll, rr);
        tree.addRoot(root);

        List<Node> nodes = new ArrayList<>();
        nodes.add(root);

        //CREATE TREE

        //CREATE NODES
        for(int i = 1; i < N; i++){
            String s = sc.next();
            String l = sc.next();
            String r = sc.next();

            Node n = makeNode(s, l, r);
            nodes.add(n);
        }

        //CONNECT NODES
        for(int i = 0; i < N;i++){
            Node n = nodes.get(i);
            String ls = "";
            String rs = "";

            if(n.left != null) ls = n.left.name;
            if(n.right != null) rs = n.right.name;

            if(n.left == null && n.right == null) continue;
            for(int j = 0; j < N; j++){
                if(j == i) continue;
                Node nn = nodes.get(j);
                if(nn.name.equals(ls)){
                    n.left = nn;
                }
                if(nn.name.equals(rs)){
                    n.right = nn;
                }
            }
        }


        //SEARCH
        tree.search1(tree.root);
        System.out.println();
        tree.search2(tree.root);
        System.out.println();
        tree.search3(tree.root);
    }

    public static Node makeNode(String s, String l, String r){
        Node n = new Node(s);
        if(!l.equals(".")){
            n.left =new Node(l);
        }
        if(!r.equals(".")){
            n.right = new Node(r);
        }
        return n;
    }

    public static class Tree{
        Node root;

        Tree(){}
        void addRoot(Node root){
            this.root = root;
        }

        void search1(Node node){
            if (node == null) return;

            Node n = new Node(node);

            n.print();
            search1(n.left);
            search1(n.right);

        }

        void search2(Node node){
            if(node == null) return;

            Node n = new Node(node);

            search2(n.left);
            n.print();
            search2(n.right);


        }

        void search3(Node node){
            if(node == null) return;

            Node n = new Node(node);

            search3(n.left);
            search3(n.right);
            n.print();
        }

    }
    public static class Node{
        String name = "";
        Node left = null;
        Node right = null;

        Node(String s){
            this.name = s;
        }
        Node(String s, Node l, Node r){
            this.name = s;
            this.left = (l != null) ? l : null;
            this.right = (r != null) ? r : null;
        }

        Node(Node n){
            this.name = n.name;
            this.left = n.left;
            this.right = n.right;
        }

        void print(){
            System.out.print(this.name);
        }

    }


}