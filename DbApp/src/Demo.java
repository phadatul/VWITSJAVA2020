import com.vwits.db.EmployeeDAO;

public class Demo {

	public static void main(String[] args) {
		EmployeeDAO d = new EmployeeDAO();

		System.out.println(d.getAll());
	}

}
