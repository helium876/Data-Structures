public class Node {
	private int Data;
	private Node Next;

	public Node(){
		Data = 0;
		Next = null;
	}

	public void setData(int x){
		Data = x;
	}

	public int GetData(){
		return Data;
	}

	public void SetNextNode(Node n){
		Next = n;
	}

	public Node GetNextNode(){
		return Next;
	}

	public static void PrintNodes(Node n){
		while(n != null){
			System.out.println(n.GetData());
			n = n.GetNextNode();
		}
	}

	public static void main(String[] args) {
		Node first = new Node();
		first.setData(5);
		Node middle  = new Node();
		middle.setData(7);
		Node last = new Node();
		last.setData(9);
		first.SetNextNode(middle);
		middle.SetNextNode(last);
		PrintNodes(first);

	}
}

