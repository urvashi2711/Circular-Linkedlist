import java.util.Scanner;
class Main
{
	static class Node{
		int data;
		Node next;
		Node(int data){
			this.data=data;
			this.next=null;
		}	
	}
	Node head=null;	
	Node tail=null;
	public void creation()
	{
		int data,m,n,p;
		Scanner sc=new Scanner(System.in);
		do{
		System.out.println("enter data");
		data=sc.nextInt();
		Node newnode=new Node(data);
		if(head==null)
			{
				head=newnode;
				tail=newnode;
				newnode.next=head;
			}
		else
			{
				newnode.next=head;
				head=newnode;
				tail.next=head;
			}
			System.out.println("entre 1 if you want to insert more node");
			n=sc.nextInt();
		}while(n==1);
	}
	public void deletion()
	{
		int data,p;
		Scanner sc=new Scanner(System.in);
			if(head==null){
				System.out.println("ll is empty");
			}
			else{
				System.out.println("enetr position from which you want to delete the node");
				p=sc.nextInt();
				Node temp2=head;
				Node ptr1=temp2.next;
				for(int i=1 ;i<(p-1);i++){
					temp2=ptr1;
					ptr1=ptr1.next;
				}
				temp2.next=ptr1.next;
			}
		
	}
	public void traverse()
	{
		Node temp=head;
		if(head==null)
		{
			System.out.println("ll does not exist");
		}
		else
		{
			do
			{
				System.out.println(temp.data+"");
				temp=temp.next;
				System.out.println(temp);
				
			}while(temp!=head);
		}	
	}

	public static void main(String[] args){
		Main m=new Main();
		m.creation();
		m.deletion();
		m.traverse();
		
	}
}