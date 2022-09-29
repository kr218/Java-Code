package Practical3;

public class Cars_Main {

	public static void main(String[] args) {
		Cars c1=new Cars("Tata Tiago"," Hatchback");
		Cars c2=new Cars("Tata Tigore"," Sedan");
		Cars c3=new Cars("Tata Harrier","Compact  SUV");
		Cars c4=new Cars("Tata Safari","  SUV");
		
		Cars[] Variety = new Cars[4];
		Variety[0]=c1;
		Variety[1]=c2;
		Variety[2]=c3;
		Variety[3]=c4;
		for (Cars c :Variety) {
			System.out.println(" Name : " + c.name + ", BodyType " + c.bodytype);
	}

	}
}
