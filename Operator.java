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
    	 System.out.println("*****��ӭ���뵵��¼����Ա�˵�******");
 		System.out.println("   1.�ϴ��ļ�\n   2.�����ļ�\n   3.�ļ��б�\n    4.�޸�����\n   5.�˳�\n");
 		System.out.println("��ѡ��˵���");
 		@SuppressWarnings("resource")
 		Scanner cin=new Scanner(System.in);
 		int a=cin.nextInt();
 		switch(a) {
 		case 1:
 			System.out.println("������Դ�ļ���:");
 			Scanner cin1=new Scanner(System.in);
	        cin1. nextLine();
	        System.out.println("�����뵵���ţ�");
	        Scanner cin2=new Scanner(System.in);
	        cin2.next();
	        System.out.println("�����뵵��������");
	        Scanner cin3=new Scanner(System.in);
	        cin3.next();
	    
	        uploadFile();
 			
 		case 2:
 	         System.out.println("������Դ�ļ�����");
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
 			System.out.println("������������룺");
 			Scanner cin11 =new Scanner(System.in);
 			String password =cin11.next();
 			changeSelfInfo( password);
 			break;
 		case 5:
 			break;
 			
 		}
 		
 		
     }


	
}
