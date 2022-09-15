class  CarsShowroom{
	 
	String c;
	String m;
	String cl ;
	int p;
	
	CarsShowroom(String company)
	{
		c= company;
	}

	CarsShowroom(String company ,String modelname)
	{
		c = company;
		m = modelname;
	}

	CarsShowroom(String company ,String modelname ,String color )
	{
		c = company;
		m = modelname;
		cl = color;
	}

	CarsShowroom(String company ,String modelname ,String color ,int price)
	{
		c = company;
		m = modelname;
		cl= color;
		p =price ;
	}

	void carsDetails()
	{
		System.out.println(c+" "+m+" "+cl+" "+p);
	}
	public static void main(String[] arg)
	{
		CarsShowroom c1= new CarsShowroom("TATA" , "Nexon","White", 450000000);
		CarsShowroom c2= new CarsShowroom("Meenas" , "Mustang","Green", 9500000);
		CarsShowroom c3= new CarsShowroom("Mahindra" , "Scorpio","Blue", 200000);
		c1.carsDetails();
		c2.carsDetails();
		c3.carsDetails();
	}
}


