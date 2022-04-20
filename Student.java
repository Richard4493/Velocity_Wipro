public class Student{
	int no;
	String name;
	long contact;
	double marks;
	public void initialize() {
		no=44;
		name="AMAL";
		contact=9447537894l;
		marks=94.5;
	}
	public void display() {
		System.out.println("name is "+name);
		System.out.println("number is "+no);
		System.out.println("contact : "+contact);
		System.out.println("marks : "+marks);
	}
	public static void main(String[] args) {
		Student s1=new Student();
		s1.initialize();
		s1.display();
	}
	}
