package lesson3;
import java.io.IOException;
import java.sql.SQLException;
import java.util.*;


//档案浏览人员

public  class Browser extends User {
	 

	Browser(String name, String password, String role) {
		super(name, password, role);
		// TODO Auto-generated constructor stub
	}

	@SuppressWarnings("resource")
	public void showMenu( ) {
	
		System.out.println("*****欢迎进入档案浏览员菜单******");
		System.out.println("  1.下载文件\n   2.文件列表\n   3.修改密码\n   4.退出\n");
		System.out.println("请选择菜单：");
		 
		Scanner cin=new Scanner(System.in);
		int a=cin.nextInt();
		switch(a) {
		case 1:
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
		case 2:
			 
			try {
				showFileList();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 
			 break;
		case 3:
			changeSelfInfo(getPassword());
			break;
		case 4:
			break;
			
		}
		
		
		
	}

}
