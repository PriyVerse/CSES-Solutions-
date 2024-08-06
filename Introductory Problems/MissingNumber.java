import java.util.Scanner;
//METHOD 1
class Node {
	Node link;
	long info;
}
class LinkedList{
	Node start;
	Scanner sc = new Scanner(System.in);
	void ins(long s) {
		Node p = new Node();
		p.info = s;
		if(start == null) 
			start = p;
		else {
			Node q = start;
			while(q.link != null) 
				q= q.link;
			q.link=p;
			p.link=null;	
			
		}
	}
	long sum() {
		Node p= start;
		long sum = 0;
		while(p!= null) {
			sum+=p.info;
			p=p.link;
		}
		return sum;
	}
	
}
public class MissingNumber {

	public static void main(String[] args) {
		
		// Scanner sc = new Scanner(System.in);
        // long n = sc.nextLong();
        // LinkedList l1= new LinkedList();
        // for(int i=1;i<n;i++) {
        // 	long p = sc.nextLong() ;
        // 	l1.ins(p);
        // }
        // long f = l1.sum();
        // long sum =n*(n+1)/2;
        // System.out.println(sum-f);
	
    //TIME LIMIT EXTENDED :-/
	//METHOD 2
    Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long m[] = new long[n-1];
        long p=0;
        for(int i=0;i<n-1;i++){
            m[i] =sc.nextLong();
            p+=m[i]; 
        }
        long s = n*(n+1)/2;
        System.out.println(s-p);
    }

}