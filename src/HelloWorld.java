public class HelloWorld {

	private int id;
	private String name;
	
	
	public HelloWorld(){
		System.out.println("I am constructor");
	}

	
	public HelloWorld(int id, String name){
		System.out.println(" I am within another constructor");
		this.id = id;
		this.name = name;
		
	}

	
	public void sayHello(){
		System.out.println("Hello " + this.name);
	}
	
	public void sayHello(String name)
	{
		System.out.println("Hello" + name);
	}
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println("Hello World");
		
		HelloWorld helloWorld = new HelloWorld();
		HelloWorld helloWorldNew = new HelloWorld(10, "Ongole");
		

	}

}
