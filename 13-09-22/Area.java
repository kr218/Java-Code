class Area{
	void areaDetail(String city)
	{
		System.out.println(city);
	}
	
	void areaDetail(String city , String street)
	{
		System.out.println(city);
		System.out.println(street);
	}

	void areaDetail(String city , String street , String area)
	{
		System.out.println(city);
		System.out.println(street);
		System.out.println(area);
	}

	void areaDetail(String city , String street , String area, int pincode)
	{
		System.out.println(city);
		System.out.println(street);
		System.out.println(area);
		System.out.println(pincode);
	}

	public static void main(String[] args){
		Area a1=new Area();
		a1.areaDetail("Kalyan","kadakpada circle","vasantvally",321114);
}
}
		