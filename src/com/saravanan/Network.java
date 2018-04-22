package com.saravanan;

public class Network {

	Network(int x, Network n){
		id=x;
		p=this;
		if(n!=null)
			p=n;
	}
	int id;
	Network p;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Network n1 = new Network(1, null);
		n1.go(n1);
		
	}
	private void go(Network n1) {
		// TODO Auto-generated method stub
		Network n2 = new Network(2, n1);
		Network n3 = new Network(3, n2);
		System.out.println(n2.p.p.id);
		System.out.println(n3.p.p.id);
	}

}
