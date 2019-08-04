import java.util.Scanner;
import java.util.GregorianCalendar;
import java.util.Calendar;
public class CalendarDemo
{
	final static String blank="      ";
	final static String border="  |   ";
	public static void PrintWeek()
	{	
		String [] week={"周日","周一","周二","周三","周四","周五","周六"};
		for(int i=0;i<3;i++)
		{	for(String element:week)
			{	
			System.out.printf(" %s"+" ",element);
			}
			if(i<2)
				System.out.print(border);
			else 
				System.out.println(blank);	
		}
	}
	public static void PrintFestival(GregorianCalendar day,int month)
	{
			for(int i=7;i>=1;i--)
			{	
				day.add(Calendar.DAY_OF_MONTH,-i);
				int monthday=day.get(Calendar.DAY_OF_MONTH);
				if(month-1==day.get(Calendar.MONTH))
					{if(month==1&&monthday==1)		System.out.print("阳历年");
					else if (month==4&&monthday==1) 	System.out.print("愚人节");
					else if (month==5&&monthday==1)		System.out.print("劳动节");
					else if (month==3&&monthday==1)         System.out.print("我生日");
					else if (month==1&&monthday==19)         System.out.print("瑾生日");
					else if (month==3&&monthday==8)         System.out.print("妇女节");
					else if (month==6&&monthday==1) 	System.out.print("儿童节");
					else if (month==7&&monthday==1)         System.out.print("建党节");
					else if (month==8&&monthday==1)    	System.out.print("建军节");
					else if (month==9&&monthday==10)    	System.out.print("教师节");
					else if (month==10&&monthday==1)   	System.out.print("国庆节");
					else if (month==12&&monthday==25)   	System.out.print("圣诞节");
					else System.out.print(blank);

					}

				else System.out.print(blank);
				day.add(Calendar.DAY_OF_MONTH,i);

			}
	}
	public static void PrintBorderLine(String symbol1,String symbol2,String symbol3)
	{	
		for(int j=1;j<4;j++)
			{	
				for(int k=1;k<8;k++)
					System.out.print(symbol1);
				if(j<3) System.out.print(symbol2);
				else    System.out.println(symbol3);
			}
	}

	public static void PrintLine(GregorianCalendar day,int m,int month,int year)
                        {
                        int week = day.get(Calendar.DAY_OF_WEEK);
                        GregorianCalendar today = new GregorianCalendar ();
                        if(m==1)
                                {       for(int i=0;i<week-1;i++)
                                                System.out.print(blank);
                                        for(int i=0;i<=7-week;i++)
                                        {       if(day==today)
                                                        System.out.printf("%4d* ",day.get(Calendar.DAY_OF_MONTH));
                                                else System.out.printf("%4d  ",day.get(Calendar.DAY_OF_MONTH));
                                                day.add(Calendar.DAY_OF_MONTH,1);
                                        }
                                }
			if(m>=2&&m<=4)
				{	for(int i=1;i<=7;i++)
						{
						if(year==today.get(Calendar.YEAR)&&month==today.get(Calendar.MONTH)&&today.get(Calendar.DAY_OF_MONTH)==day.get(Calendar.DAY_OF_MONTH))	
							 System.out.printf("%4d* ",day.get(Calendar.DAY_OF_MONTH));
                                                else 	 System.out.printf("%4d  ",day.get(Calendar.DAY_OF_MONTH));
                                                day.add(Calendar.DAY_OF_MONTH,1);
						}
					
				}
                        

			if(m>=5)
				{	
					for(int i=1;i<=7;i++)
					{	if(month==day.get(Calendar.MONTH))
						{
							if(year==today.get(Calendar.YEAR)&&month==today.get(Calendar.MONTH)&&today.get(Calendar.DAY_OF_MONTH)==day.get(Calendar.DAY_OF_MONTH)) 
									System.out.printf("%4d* ",day.get(Calendar.DAY_OF_MONTH));
                                                	else            System.out.printf("%4d  ",day.get(Calendar.DAY_OF_MONTH));
						}
						else System.out.print(blank);
						day.add(Calendar.DAY_OF_MONTH,1);
		
					}
				}	
			}
	public static void printmonth(int month)
		{
			for(int i=1;i<=3;i++)
				System.out.print(blank);
			if(month==1)	System.out.print("*一月*");
			else if (month==2)    System.out.print("*二月*");
			else if (month==3)    System.out.print("*三月*");
			else if (month==4)    System.out.print("*四月*");
			else if (month==5)    System.out.print("*五月*");
			else if (month==6)    System.out.print("*六月*");
			else if (month==7)    System.out.print("*七月*");
			else if (month==8)    System.out.print("*八月*");
			else if (month==9)    System.out.print("*九月*");
			else if (month==10)    System.out.print("*十月*");
			else if (month==11)    System.out.print("*十一*");
			else if (month==12)    System.out.print("*十二*");

			for(int i=1;i<=3;i++)
                                System.out.print(blank);

		}
	public static void main(String[] args)
	{	Scanner in = new Scanner(System.in); 
		System.out.println("请输入四位年份...");
		int  year = in.nextInt();
		System.out.println("");
		System.out.println("");

		for (int i=1;i<=10;i++) System.out.print(blank);
		System.out.printf("***%4d年日历如下***",year);
		System.out.println("");
		System.out.println("");

		for(int i=1;i<=4;i++)
			{
			PrintWeek(); 
			PrintBorderLine(blank,"  |   ",blank); 
			GregorianCalendar day1 = new  GregorianCalendar(year,3*i-3,1);		
			GregorianCalendar day2 = new  GregorianCalendar(year,3*i-2,1);
			GregorianCalendar day3 = new  GregorianCalendar(year,3*i-1,1);
			
			for(int m=1;m<=6;m++)
				{
				PrintLine(day1,m,3*i-3,year);
				System.out.print(border);
					
				PrintLine(day2,m,3*i-2,year);
                                System.out.print(border);
					
				PrintLine(day3,m,3*i-1,year);
                                System.out.println(blank);
				
				PrintFestival(day1,3*i-2);
                       		System.out.print(border);

                        	PrintFestival(day2,3*i-1);
                        	System.out.print(border);

                        	PrintFestival(day3,3*i);
                        	System.out.println(blank);
				PrintBorderLine(blank,"  |   ",blank);	
	        		}
				
				printmonth(3*i-2);
				System.out.print(border);
				printmonth(3*i-1);
				System.out.print(border);
				printmonth(3*i);
				System.out.println(blank);
				//goodjob					

				PrintBorderLine("------","--+---",blank);
				if(i<4)	PrintBorderLine(blank,"  |   ",blank);
			}
	}

	
}
