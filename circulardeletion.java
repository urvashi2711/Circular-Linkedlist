import java.util.Scanner;
class Circulardeletion
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
		int data,n;
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
			System.out.println("enter 1 if you want to insert more node");
			n=sc.nextInt();
		}while(n==1);
	}
	public void deletion()
	{
		int data,p,m;
		Scanner sc=new Scanner(System.in);
			if(head==null){
				System.out.println("ll is empty");
			}
			else{
				System.out.println("perss 1 if you want to delete node grom the beginning press 2 if you want to delete node from the end press 3 if you want to delete the node at specific position");
				m=sc.nextInt();
				switch(m){
				case 1:
					Node temp=head;
					temp=temp.next;
					head=temp;
					break;
				case 2:
					Node temp1=head;
					Node ptr=temp1.next;
					while(ptr.next!=head){	
						temp1=ptr;
						ptr=ptr.next;
					}
					temp1.next=head;
					tail=temp1;
					break;
				case 3:
					System.out.println("enetr position from which you want to delete the node");
					p=sc.nextInt();
					Node temp2=head;
					Node ptr1=temp2.next;
					for(int i=1 ;i<(p-1);i++){
						temp2=ptr1;
						ptr1=ptr1.next;
					}
					temp2.next=ptr1.next;
					break;
				}
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
		Circulardeletion m=new Circulardeletion();
		m.creation();
		m.deletion();
		m.traverse();
		
	}
}