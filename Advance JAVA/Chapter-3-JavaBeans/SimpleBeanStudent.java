package example;

public class SimpleBeanStudent implements java.io.Serializable
{
	String stdName;
	int stdId;
	
	

	public String getStdName() {
		return stdName;
	}



	public void setStdName(String stdName) {
		this.stdName = stdName;
	}



	public int getStdId() {
		return stdId;
	}



	public void setStdId(int stdId) {
		this.stdId = stdId;
	}



	public static void main(String[] args) {
		SimpleBeanStudent std = new SimpleBeanStudent();
		std.setStdName("John"); // std.stdName = "John";
		std.setStdId(20);  // std.stdId = 20;
		
		
		// access the attributes of the object std
		System.out.println("Student Name: " + std.getStdName());
		System.out.println("Student Id: "+std.getStdId());
		
//		System.out.println("Student Name: " + std.stdName);
//		System.out.println("Student Id: "+std.stdId);

	}

}
