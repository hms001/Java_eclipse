package lab2;

public class Account{

	public static void main(String[] args) {
		
		Student stud1 = new Student("Sarah","2242799");		
		stud1.setPhone("97670117");
		stud1.setCity("Los Angeles");
		stud1.setState("California");				
		stud1.enroll("CSCI213");
		stud1.enroll("CSCI205");
		stud1.enroll("CSCI203");
		stud1.enroll("CSCI315");
		System.out.println(stud1.toString());
		stud1.showCourses();		
		stud1.pay(800);
		stud1.checkBalance();
		
	}

}
