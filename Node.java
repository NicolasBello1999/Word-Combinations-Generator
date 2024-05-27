public class Node {
    private Node[] dictionary;
    private boolean activeLetter;

    public Node() {
        dictionary = new Node[26];
        activeLetter = true;
    }

    public Node(int letterASCII) {
        for (int i = 0; i < 26; i++) {
            dictionary[i] = null;
        }

        dictionary[letterASCII - 'a'] = new Node();
        activeLetter = true;
    }

    public Node(boolean activeLetter) {
        dictionary = new Node[26];
        this.activeLetter = activeLetter;
    }

    public Node[] getDictionary() { return dictionary; }
    public boolean getActiveLetter() { return activeLetter; }

    public void setActiveLetter(boolean switchActivation) { this.activeLetter = switchActivation; }
}
