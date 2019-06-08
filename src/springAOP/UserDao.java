package springAOP;

public interface UserDao {
 
	public  void  save(User user);
	
	public  void insertUser(User user);
	
	public  void  deteleUser(String name);
}
