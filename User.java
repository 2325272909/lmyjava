package lesson3;

import java.io.IOException;
import java.sql.SQLException;
 

public abstract class User {
	private String name;
	private String password;
	private String role;
	
	User(String name,String password,String role){
		this.name=name;
		this.password=password;
		this.role=role;				
	}
	
	public boolean changeSelfInfo(String password){
		// ��������
		 
		if (DataProcessing.update(name, password, role)){
			this.password=password;
			System.out.println("�޸ĳɹ�");
			return true;
		}else
			return false;
	}
	
	public abstract void showMenu();
	
	public static boolean downloadFile(String filename) throws IOException{
		double ranValue=Math.random();
		if (ranValue>0.5)
			throw new IOException( "Error in accessing file" );
		System.out.println("�����ļ�... ...");
		return true;
	}
	
	 
	public void exitSystem(){
		System.out.println(" ��ӭ�´�ʹ�� ! ");
		System.exit(0);
	}
	
	public   void showFileList() throws SQLException{
		double ranValue=Math.random();
		if (ranValue>0.5)
			throw new SQLException( "Error in accessing file DB" );
		System.out.println("�б�... ...");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public  void setPassword(String password) {
		this.password = password;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
	

}
