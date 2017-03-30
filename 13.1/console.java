public abstract class console extends gameSystem




{


	public console()


	{


		super();


	}


	


	public console(String p)


	{


		super(p);


	}


	


	public int getSerialNum()		


	{


		return (int)(Math.random() * 10000000) + 1;


	}


	


	public String getController()


	{


		return "";


	}


	


	public String toString()


	{


		return String.format("Platform:\t\t" + super.getPlatform() + "\nSerial Number:\t" + getSerialNum() + "\nController:\t\t" + getController());


	}


}




	



	

