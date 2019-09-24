import java.io.FileNotFoundException;
import java.io.IOException;

public interface EmpServices {
	void addUser();
	void removeUser();
	void viewAll();
	void view();
	void update();
	void importEmp() throws FileNotFoundException;
	void exportEmp() throws IOException;
	
	

}