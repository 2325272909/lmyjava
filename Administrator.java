package lesson3;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Scanner;


public  class Administrator extends User{
	
	public Administrator(String name, String password, String role) {
		super(name,password,role);
		 
	}
	
	@SuppressWarnings("resource")
	public  boolean changeUserInfo(String password) {
		 
		// 更改密码
		System.out.println("请输入用户名：");
		Scanner cin1=new Scanner(System.in);
 		 String name=cin1.toString();
 		 
 		System.out.println("请输入密码：");
 		Scanner cin2=new Scanner(System.in);
 		 String password1=cin2.toString();
 		 
 		 String role="administrator";
		if (DataProcessing.update( name, password1,role))
	   {
				setPassword(password);
				System.out.println("修改成功");
				return true;
		}else
				return false;
		
	}
	
	 //删除
	public   boolean delUser(String name) {
		Hashtable<String, User> users =new Hashtable<String,User>();
		@SuppressWarnings("resource")
		Scanner cin=new Scanner(System.in);
		String name1=cin. nextLine();
		if (users.containsKey(name1)){
			users.remove(name1);
			return true;
		}else
			return false;
	}
	
	//添加
	public  boolean addUser(String name,String password,String role) {
		Hashtable<String, User> users =new Hashtable<String,User>();
		User user;
		
		if (users.containsKey(name))
			return false;
		else{
			if (role.equalsIgnoreCase("administrator"))
				user = new Administrator(name,password, role);
			else if (role.equalsIgnoreCase("operator"))
				user = new Operator(name,password, role);
			else
				user = new Browser(name,password, role);
			users.put(name, user);
			return true;
		}
	}
	//列表
	public  Enumeration<User> listUser() {
		Hashtable<String, User> users =new Hashtable<String,User>();
		Enumeration<User> e  = users.elements();
		return e;
	}
	
	public void showMenu( )
	{
		System.out.println("******欢迎进入系统管理员员菜单******");
		System.out.println(" 1.修改用户\n  2.删除用户\n  3.新增用户\n   4.列出用户\n  5.下载文件\n  6.文件列表\n  7.修改（本人）密码 \n  8.退出");
		System.out.println("请选择菜单：");
		@SuppressWarnings("resource")
		Scanner cin=new Scanner(System.in);
		int a=cin.nextInt();
		switch(a) {
		case 1:
			 
			 //
			break;
		case 2:
			System.out.println("请输入删除用户名：");
			Scanner cin4=new Scanner(System.in);
	 		 String  name1= cin4.nextLine();
			delUser( name1) ;
			 break;
		case 3:
			System.out.println("请输入用户名：");
			Scanner cin1=new Scanner(System.in);
			 String name=cin1. nextLine();
			 
			System.out.println("请输入密码：");
			Scanner cin2=new Scanner(System.in);
			 String password=cin2. nextLine();
			 
			 String role1= "administrator";
			addUser (name,password,role1);
			break;
		case 4:
			listUser();
			break;
		case 5:
			 
	 		 System.out.println("请输入档案名：");
	 		 Scanner cin8=new Scanner(System.in);
	 		 String  filename=cin8. nextLine();
			 try {
				downloadFile(filename);
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			 break;
		case 6:
			 try {
				showFileList();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 break;
		case 7:
			 
	 		 System.out.println("请输入更改后的密码：");
	 		Scanner cin9=new Scanner(System.in);
	 		 String  passwords=cin9. nextLine();
			changeUserInfo(passwords);
			break;
		case 8:
			System.out.println("退出系统！");
			break;
		default:
			System.out.println("输入指令错误");
			break;
				
		}
	}
	

}
