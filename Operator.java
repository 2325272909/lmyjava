package lesson3;


import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

public  class Operator extends User{

	public Operator(String name, String password, String role) {
		super(name, password, role);
		 
	}
	
	 public void uploadFile() {
		 
		// TODO Auto-generated method stub
		
	}
  
     public void showMenu() {
    	 System.out.println("*****欢迎进入档案录入人员菜单******");
 		System.out.println("   1.上传文件\n   2.下载文件\n   3.文件列表\n    4.修改密码\n   5.退出\n");
 		System.out.println("请选择菜单：");
 		@SuppressWarnings("resource")
 		Scanner cin=new Scanner(System.in);
 		int a=cin.nextInt();
 		switch(a) {
 		case 1:
 			System.out.println("请输入源文件名:");
 			Scanner cin1=new Scanner(System.in);
	        cin1. nextLine();
	        System.out.println("请输入档案号：");
	        Scanner cin2=new Scanner(System.in);
	        cin2.next();
	        System.out.println("请输入档案描述：");
	        Scanner cin3=new Scanner(System.in);
	        cin3.next();
	    
	        uploadFile();
 			
 		case 2:
 	         System.out.println("请输入源文件名：");
 	         Scanner cin4=new Scanner(System.in);
 	         String filename1=cin4. nextLine();
 			 try {
				downloadFile(filename1);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
 			 break;
 		case 3:
 			 try {
				showFileList();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
 			 break;
 		case 4:
 			System.out.println("请输入更改密码：");
 			Scanner cin11 =new Scanner(System.in);
 			String password =cin11.next();
 			changeSelfInfo( password);
 			break;
 		case 5:
 			break;
 			
 		}
 		
 		
     }


	
}
