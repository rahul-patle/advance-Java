import java.util.HashMap;

public class Quantity {
	public static HashMap<String, String> materialInputCheck(String name) {
		HashMap<String, String> map = new HashMap<String, String>();
		try {
			if (("table").equalsIgnoreCase(name)) {
				map.put("name", "table");
				map.put("size", "size");
				

			} else if (("book").equalsIgnoreCase(name)) {
				map.put("name", "book");
				map.put("size", "size");

			} else if (("bottle").equalsIgnoreCase(name)) {
				map.put("name", "bottle");
				map.put("size", "size");

			} else {
				map.put("name", "key");
				map.put("size", "size");
			}
		} catch (Exception e) {
			e.printStackTrace();

		}
		System.out.println(map);
		return map;
	}

	public static void main(String[] args) {
		Quantity.materialInputCheck("bottle");
	}
}
