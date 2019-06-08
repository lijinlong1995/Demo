package springAOP;

  public  class UserServiceImpl implements UserService {
	  
	  private  UserDao dao;

	@Override
	public void addNewUser(User user) {
		dao.save(user);
		dao.insertUser(user);
	     System.out.println("添加成功");
	}
	
	public void setDao(UserDao dao) {
		this.dao = dao;
	}

	@Override
	public void deleteUser(String name) {
		  dao.deteleUser(name);
		 System.out.println("删除成功");
	}

}
