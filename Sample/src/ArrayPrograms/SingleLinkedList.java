package ArrayPrograms;
import java.util.HashSet;
import java.util.Set;
public class SingleLinkedList 
{
	class Node
	{
		Object data;
		Node next;
		
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
		return true;
	}
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
	boolean addFirst(Object obj)
	{
		Node n=new Node(obj);
		n.next=head;
		head=n;
		return true;
	}
	Object addSpecifiedIndex(Object ele,int in)
	{ 
		Node n=new Node(ele);
		if(in==0)
			{
				n.next=head;
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
				n.next=t;
				t1.next=n;
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
		return obj;
	}
	Object removeLast()
	{
		Object obj;
		if(head==null)
		{
			System.out.println("list is empty");
			return " ";
		}	
			Node t=head;
			Node t1=null;
			while(t.next!=null)
			{
				t1=t;
				t=t.next;
			}
			if(t1==null)
			{
				head=null;
			}	
			else
			t1.next=null;
			return t.data;
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
			}	
			else
			t1.next=t.next;
			return t.data;
		}
		catch(Exception e)
		{
		return null;
	    }
	}
		static boolean detectLoop(Node n) 
		{
		 	Set<Node> hs = new HashSet<Node>();
		 	if(n==null)
		 		return false;
		 	while(n!=null)
		 	{
		 		if(hs.contains(n))
		 			return true;
		 		hs.add(n);
		 		n=n.next;
		 	}
		 	return false;
		}
		static boolean isCircular(Node n)
		{
		if(n==null)	
			return false;
		Node t=n.next;
		while(t!=null&&t!=n)
		{
			t=t.next;
		}
			return t==n;
		}
		static Node reverseList(Node n) 
		{
			Node next = null;
			Node current = n;
			Node prev = null;
			while(current!=null)
			{
				next=current.next;
				current.next=prev;
				prev=current;
				current=next;
			}
			n=prev;
			return n;
		}
		
	public static void main(String[] args) 
	{
		SingleLinkedList sl=new SingleLinkedList();
		sl.add("P");
		sl.add("L");
		sl.add("A");
		sl.add("D");
		sl. addFirst("G");
		sl.addSpecifiedIndex("j", 1);
		sl.removeFirst();
		sl.removeLast();
		sl.removeSpecifiedIndex(5);
		System.out.println(sl);	
		boolean rs=detectLoop(sl.head);
		System.out.println(rs);
		boolean res=isCircular(sl.head);
		System.out.println(res);
		sl.head=reverseList(sl.head);
		System.out.println(sl);
	}
}