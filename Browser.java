package lesson3;
import java.io.IOException;
import java.sql.SQLException;
import java.util.*;


//���������Ա

public  class Browser extends User {
	 

	Browser(String name, String password, String role) {
		super(name, password, role);
		// TODO Auto-generated constructor stub
	}

	@SuppressWarnings("resource")
	public void showMenu( ) {
	
		System.out.println("*****��ӭ���뵵�����Ա�˵�******");
		System.out.println("  1.�����ļ�\n   2.�ļ��б�\n   3.�޸�����\n   4.�˳�\n");
		System.out.println("��ѡ��˵���");
		 
		Scanner cin=new Scanner(System.in);
		int a=cin.nextInt();
		switch(a) {
		case 1:
			 System.out.println("�����뵵������");
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
