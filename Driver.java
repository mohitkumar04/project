/* use TreeSet data Structure instead of PriorityQueue*/
import java.util.*;
import java.io.*;
class Schedule implements Comparable<Schedule>{
	int jobID;
	int length;
	int priority;
	long completiontime;
	Schedule(int jobID,int length,int priority)
	{
		this.jobID=jobID;			//assingning values
		this.length=length;
		this.priority=priority;
	}
	Schedule(int jobID,int length,int priority,long completiontime)
		{
			this.jobID=jobID;
			this.length=length;
			this.priority=priority;
			this.completiontime=completiontime;
	}
	public String toString()		//overide Object class Method toString()
	{
		return jobID+"      "+length+"        "+priority+"           "+completiontime;
	}
	public int compareTo(Schedule s)		//implements compareTo() method of Comaparable Interface
	{
		if(this.priority>s.priority)		//if current object is greater than object which is being passed in arguments
		return 1;
		else if(this.priority==s.priority)// for equal
		return 1;
		else
		return -1;// for lesser than the object which is being passed
	}
}
class Driver{
	public static void main(String arg[]) throws Exception{
			BufferedReader br=new BufferedReader(new InputStreamReader(new FileInputStream("jobs.txt")));// to read the data from file and parse the data
			BufferedReader br1=new BufferedReader(new InputStreamReader(new FileInputStream("jobs.txt")));
			TreeSet<Schedule> t=new TreeSet<Schedule>();// for adding jobs in Tree data structure
			int size=0;
			String d=br1.readLine();
			while(d!=null){ d=br1.readLine();size++;}
			Schedule[] sd=new Schedule[size];
			String s1=br.readLine();
			int i=0;
			while(s1!=null)
			{
				System.out.println(s1);
				String[] str=s1.split(" ");
				int a=Integer.parseInt(str[0]);
				int b=Integer.parseInt(str[1]);
				int c=Integer.parseInt(str[2]);
					sd[i]=new Schedule(a,b,c);
					t.add(sd[i]);
					i++;
					s1=br.readLine();
			}
			System.out.println();
			Schedule[] sd1=new Schedule[t.size()];
			int j=0;
			for(Schedule item:t)
			{
			sd1[j]=item;
			j++;
			}
			long sum=0;
			Schedule[] sd2=new Schedule[sd1.length];
			t.clear();
			for(int k=0;k<sd1.length;k++)
			{
				sum+=sd1[k].length;// for calculating completion time
				sd2[k]=new Schedule(sd1[k].jobID,sd1[k].length,sd1[k].priority,sum);
				t.add(sd2[k]);
			}
			System.out.print("jobID"+"    "+"length"+"    "+"priority"+"    "+"completionTime");
			System.out.println();
			for(Schedule item:t)
						{
							System.out.println(item);// to retreive the jobs accordng to their priority
			}
	}
}