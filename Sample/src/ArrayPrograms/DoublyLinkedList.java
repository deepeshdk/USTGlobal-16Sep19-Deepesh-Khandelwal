package ArrayPrograms;
public class DoublyLinkedList 
{
	class Node
	{
		Object data;
		Node next;
		Node prev;
		
		Node(Object data)
		{
			this.data=data;
		}
		
	}
	Node head;
	boolean add(Object obj)
	{
		Node n=new Node(obj);
		if(head==null)
		{
			head=n;
			return true;	
		}
		Node t=head;
		while(t.next!=null)
		{
			t=t.next;
		}
		t.next=n;
		n.prev=t;
		return true;
	}
	public String toString()
	{
		String st="[";
		Node t=head;
		while (t!=null)
		{
			st=st+t.data;
			if(t.next!=null)
				st=st+"-->";
				t=t.next;
		}
		return st+"]";		
	}
	boolean addFirst(Object obj)
	{
		Node n=new Node(obj);
		if(head==null)
		{
			head=n;
			return true;	
		}
		n.next=head;
		head.prev=n;
		head=n;
		return true;
	}
	Object addSpecifiedIndex(Object ele,int in)
	{ 
		Node n=new Node(ele);
		if(in==0)
			{
				n.next=head;
				n.prev=null;
				head=n;
			}
			Node t=head;
			Node t1=head;
			while(in>0)
			{
				t1=t;
				t=t.next;
				in--;
			}
				n.prev=t1;
				n.next=t;
				t1.next=n;
				t.prev=n;
			return true;
	}
	Object removeFirst()
	{
		if(head==null)
		{
			System.out.println("List is blank");
			return " ";
		}
		Object obj=head.data;
		head=head.next;
		if(head!=null)
			head.prev=null;
		return obj;
	}
	Object removeLast()
	{
		if(head==null)
		{
			System.out.println("List is blank");
			return " ";
		}
		Node t=head;
		while(t.next!=null)
		{
			t=t.next;
		}	
		Object obj=t.data;
		if(t.prev!=null)
			t.prev.next=null;
		else
			head=null;
		return obj;
	}
	Object removeSpecifiedIndex(int in)
	{ 
		try
		{
			Object obj;	
			Node t=head;
			Node t1=null;
			while(in>0)
			{
				t1=t;
				t=t.next;
				in--;
			}
			if(t1==head)
			{
				head=t1.next;
				t1.prev=null;
			}	
			else
				t1.next=t.next;
				t.prev.prev=t1;
				return t.data;
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return null;
	}
	public static void main(String[] args) 
	{
		DoublyLinkedList dl=new DoublyLinkedList();
		dl.add("P");
		dl.add("L");
		dl.add("A");
		dl.add("D");
		System.out.println(dl);
		dl.addFirst("O");
		System.out.println(dl);
		dl.addSpecifiedIndex("Q", 2);
		System.out.println(dl);
		dl.removeFirst();
		System.out.println(dl);
		dl.removeLast();
		System.out.println(dl);
		dl.removeSpecifiedIndex(3);
		System.out.println(dl);		
	}
	
}
