package example;

public class SimpleJavaBean implements java.io.Serializable {
	// Employee class
	private int id;
	private String name;
	boolean active;
	// public SimpleJavaBean()
	// {
	//
	// }

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public static void main(String[] args) {
		// Use JavaBean
		SimpleJavaBean bean = new SimpleJavaBean();
		bean.setName("Hari");
		bean.setId(1);
		bean.setActive(true);
		//
		// // Get the Set attributes of bean
		System.out.println(bean.getName());
		System.out.println(bean.getId());
		System.out.println(bean.isActive());

	}

}
