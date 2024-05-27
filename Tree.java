public class Tree {
    private Node root;

    public Tree(int letterASCII) {
        root = new Node(letterASCII);
    }

    public Node getRoot() { return root; }
}
