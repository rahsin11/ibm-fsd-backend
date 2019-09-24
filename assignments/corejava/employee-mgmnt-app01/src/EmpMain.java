import java.util.*;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class EmpMain {
	
	
	class exec implements Callable<String>{

		@Override
		public String call() throws Exception {
			System.out.println("Thread Activated");
			Thread.sleep(4000);
			System.out.println("Thread Stopped");
			return "Done";
		}
		
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in); 
		EmpServ Serv=new EmpServ();
       
		int select =0;
		do
		{
			System.out.println(" CHOOSE AN OPTION");
			System.out.println("1) VIEW ALL EMPLOYEES");
			System.out.println("2) ADD  EMPLOYEE");
			System.out.println("3) VIEW EMPLOYEE");
			System.out.println("4) REMOVE EMPLOYEE ");
			System.out.println("5) UPDATE EMPLOYEE");
			System.out.println("6) IMPORT EMPLOYEE");
			System.out.println("7) EXPORT EMPLOYEE");
			System.out.println("8) EXIT ");
			
			select=sc.nextInt();
			switch(select)
			{
				case 1:
					Serv.viewAll();
					break;
				case 2:
					Serv.addUser();
					
					break;
				case 3:
					Serv.view();
					break;
				case 4:
					Serv.removeUser();
					
					break;
				case 5:
					
				break;
					
				case 6:
					EmpMain e = new EmpMain();
					
					Callable<String> c = e.new exec();
					
					ExecutorService ex = Executors.newFixedThreadPool(1);
					Future<String> f = ex.submit(c);
					Serv.importEmp();
					while(!f.isDone())
					{
						System.out.println(Thread.currentThread().getName() + "Thread Wait" );
						
						String s=null;
						s=f.get();
						System.out.println(Thread.currentThread().getName() + "returns the value" +s);
					}
					
					
					
					
				break;
				case 7:
                 EmpMain x = new EmpMain();
					
					Callable<String> cc = x.new exec();
					
					ExecutorService exx = Executors.newFixedThreadPool(1);
					Future<String> ff = exx.submit(cc);
					Serv.exportEmp();
					while(!ff.isDone())
					{
						System.out.println(Thread.currentThread().getName() + "Thread Wait" );
						
						String s=null;
						s=ff.get();
						System.out.println(Thread.currentThread().getName() + "returns the value" +s);
					}
					
					
					
					
	
					
					break;
				case 8:
					
					break;
					
					
			}
			
			
			
		} while(select != 8);
		System.out.println("EXITING .....");

	}

}