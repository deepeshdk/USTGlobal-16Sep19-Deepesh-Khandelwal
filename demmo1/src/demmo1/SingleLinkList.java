package demmo1;
public class SingleLinkList 
{
class Node
{
	Object data;
	Node next;
	Node(Object data)
	{
		this.data = data;
	}
}
     Node head;
   boolean add(Object obj)
   {
	   Node n = new Node(obj);
	   if(head==null)
	   {
		   head=n;
		   return true;
	   }
	   Node t = head;
	   while(t.next!=null)
	   {
		   t=t.next;
	   }
	   t.next=n;
	   return true;
   }
   boolean addFirst(Object obj)
   {
	   Node n = new Node(obj);
	   n.next  = head;
	   head = n;
	   return true;
   }
   boolean addLast(Object obj)
   {
	   Node n = new Node(obj);
	   if(head==null)
	   {
		   head=n;
		   return true;
	   }
	   n.next = null;
	        Node t= head;
	        while(t.next!=null)
	        	t=t.next;
	        t.next=n;
	   return true;
   }
   @Override
	public String toString()
   {
	   String st=" ";
		Node t=head;
		while (t!=null)
		{
			st=st+t.data;
			if(t.next!=null)
				st=st+"-->";
				t=t.next;
		}
		return st;	
	
	}
	public static void main(String[] args) 
	{
        SingleLinkList sll = new SingleLinkList();
        sll.add("A");
        sll.add("B");
        sll.addFirst("Z");
        sll.addLast("C");
        System.out.println(sll);
	}
}