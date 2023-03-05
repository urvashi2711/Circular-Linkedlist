import java.util.Scanner;
class Circularinsertion{
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
	public void creation(){
		int data,n;
		Scanner sc=new Scanner(System.in);
		do{
		System.out.println("Enter data");
		data=sc.nextInt();
		Node newnode=new Node(data);
		if(head==null){
				head=newnode;
				tail=newnode;
				newnode.next=head;
			}
		else{
			newnode.next=head;
			head=newnode;	
			tail.next=head;
			}
		      System.out.println("do you want to enter more node the press 1:");
		      n=sc.nextInt();
		}while(n==1);
	}
	public void insertion(){
		int data,n,m,p;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter data you want to insert");
		data=sc.nextInt();
		Node newnode=new Node(data);
		if(head==null){
				System.out.println("ll is empty");
			}
		else{
			System.out.println("enter 1 to insert at beginning,2 at end,3 at specific position");
			m=sc.nextInt();
			switch(m){
				case 1:
					newnode.next=head;
					head=newnode;	
					tail.next=head;
					break;
				case 2:
					tail.next=newnode;
					tail=newnode;
					newnode.next=head;
					break;
				case 3:
					System.out.println("enter position at which you want to enter newnode");
					p=sc.nextInt();
					Node temp1=head;
					for(int i=0;i<(p-1);i++){
						temp1=temp1.next;
					}
					newnode.next=temp1.next;
					temp1.next=newnode;
					break;
			}
			
		}
	}
	public void display(){
		Node temp=head;
		if(head==null){
			System.out.println("linked list does not exist");
		}
		else{
			do{
				System.out.println(temp.data);
				temp=temp.next;
				
			}while(temp!=head);
		}
	
	}


	public static void main(String[] args){
		Circularinsertion m=new Circularinsertion();
		m.creation();
		m.insertion();
		m.display();
	
	}
}