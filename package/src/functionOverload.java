

		import java.util.Scanner; 
		public class functionOverload {
			
			
			void display(int emp_id[],String emp_name[],int emp_sal[])
			{ System.out.println ("Employee Id   Employee Name   Employee Salary");
				for(int i=0 ;i<5;i++){
					System.out.println(emp_id[i]+"   "+emp_name[i]+"    "+emp_sal[i]);
				}
				
			}
			void display(int emp_id[],String emp_name[])
			{ System.out.println ("Employee Id   Employee Name   ");
				for(int i=0 ;i<5;i++){
					System.out.println(emp_id[i]+"   "+emp_name[i]);
				}
			}private static Scanner sn;
			void display(String search_name,int emp_id[],String emp_name[],int emp_sal[])
			{ System.out.println ("Employee Id   Employee Name   Employee Salary");
				for(int i=0 ;i<5;i++){
					if(emp_name[i].equals(search_name))
					System.out.println(emp_id[i]+"   "+emp_name[i]+"  "+emp_sal[i]);
				}
			}
			public static void main(String args[])
			{
				 sn=new Scanner(System.in);
				int[] emp_id=new int[5];
				int[] emp_sal=new int[5];
				String[] emp_name=new String[5];
				
				for (int i=0;i<5;i++){
					System.out.println(i+1);
					System.out.println("Enter the Employee id  :");
					emp_id[i]=sn.nextInt();
					System.out.println("Enter the Employee Name  :");
					emp_name[i]=sn.next();
					System.out.println("Enter the Employee Salary :");
					emp_sal[i]=sn.nextInt();}
				// creating a constructor.
					functionOverload fn=new functionOverload();
					// function overload 
					fn.display(emp_id,emp_name,emp_sal);
					fn.display(emp_id,emp_name);
					System.out.println("Enter employee name to search for....");
					String search_name=sn.next();
					fn.display(search_name,emp_id,emp_name,emp_sal);
					
				
				
				
				
				
				
			}

		

	}


