import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.*;


public class Main {

    static int[][] graph = {};
    static int ans = 0;
    static HashSet<Integer> a = new HashSet<>();
    static boolean[] visited = {};

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
        for(int i = 1; i < N; i++){
            String s = sc.next();
            String l = sc.next();
            String r = sc.next();

            Node n = makeNode(s, l, r);
            nodes.add(n);
        }

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

//        Node no = tree.root;
//        System.out.println(no.name);
//        while(true){
//            if(no.left != null){
//                no = no.left;
//                System.out.println("b "+no.name);
//            }else{
//                System.out.println(no.name);
//                break;
//            }
//        }

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

            if(n.left != null){
                search1(n.left);
                search1(n.right);
            }if(n.left == null && n.right != null){
                search1(n.right);
            }
        }

        void search2(Node node){
            if(node == null) return;

            Node n = new Node(node);
            if(n.left != null){
                search2(n.left);
                n.print();
                search2(n.right);

            }
            else if(n.left == null && n.right != null){
                n.print();
                search2(n.right);
            }
            else if(n.left == null && n.right == null){
                n.print();
            }
        }

        void search3(Node node){
            if(node == null) return;
//            System.out.print("oh please");
//            node.print();

            Node n = new Node(node);
            if(n.left != null){
                search3(n.left);
                search3(n.right);
            }
            else if(n.right != null){
                search3(n.right);
            }
            else if(n.left == null && n.right == null){
            }
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