package lesson3;
import java.util.Scanner;

  
public  class Main{
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			String tip_system="档案系统";
			 
			String tip_menu="请选择菜单：";
			@SuppressWarnings("unused")
			String tip_exit="系统退出，谢谢使用！";
			String infos="****欢迎进入"+tip_system+"*****\n\t   "+
			             "1.登录\n   \t    2.退出\n"+
					     "****************************";
			int a;
			 do
			 {
				    System.out.println(infos);
					System.out.println(tip_menu);
					@SuppressWarnings("resource")
					Scanner cin=new Scanner(System.in);
			 		a=cin.nextInt();
					switch(a) {
					case 1:
						System.out.println("请选择身份：");
						System.out.println("1.Administrator\n 2.Browser\n 3.Operator\n");
						Scanner cin11=new Scanner(System.in);
				 		int b=cin11.nextInt();
						switch(b) {
						case 1:
						    Administrator Ad=new Administrator(null, null, null);
						    Ad.showMenu();
							break;
						case 2:
							Browser Br=new Browser(null,null,null);
							Br.showMenu();
							break;
						case 3:
							Operator Op=new Operator(null,null,null);
							Op.showMenu();
							break;
							
						
						}
					case 2:
						break;
					
					}
					
					
				}
			    while(a!=0);		
		}
}

			 
			