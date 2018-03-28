import java.util.HashMap;
import java.util.Hashtable;

public class SetClassTest {
	public static void main(String[] args) {
		try {
			Hashtable<String, String> table = new Hashtable<>();
			table.put(null, null);
		} catch (Exception e) {
			
		}
		HashMap<String, String> map = new HashMap<>();
		map.put(null, null);
	}
}
