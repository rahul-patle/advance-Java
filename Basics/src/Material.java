
public class Material {
	String name ;
	String size;
	
	public Material(String name,String size) {
		super();
		this.name = name;
		this.size = size;
	}

	public Material() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	@Override
	public String toString() {
		return "Material [name=" + name + ", size=" + size + "]";
	}

}
		
	