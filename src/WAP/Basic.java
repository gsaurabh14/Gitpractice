package WAP;

public class Basic {
	String name;
	int age;
	String address;
	
	public Basic(String name, int age, String address){
	this.name = name;
	this.age = age;
	this.address = address;
	}
	
	public void setName(String name){
		this.name = name;
	}
	public void setAge(int age){
		this.age = age;
	}
	public void setAdd(String address){
		this.address = address;
	}
	
	public String getName(){
		return name;
	}
	
	public int getAge(){
		return age;
	}
	
		public String getAdd(){
		return address;
	}
	
	public static void main(String[] args) {
		Basic b = new Basic("Saurabh", 25, "TT nagar");
		System.out.println(b.getName());
		System.out.println(b.getAge());
		System.out.println(b.getAdd());
	

	}

}
