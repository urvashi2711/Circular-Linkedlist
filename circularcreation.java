import java.util.Scanner;
class Circularcreation{
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
		Circularcreation m=new Circularcreation();
		m.creation();
		m.display();
	
	}
}