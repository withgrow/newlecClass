package class1208;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Exam[] exams = new Exam[3];
		exams[0] = new Exam();
		exams[1] = exams[0];
		exams[2]= exams[0];
		System.out.println(exams[0]);
		System.out.println(exams[1]);
		System.out.println(exams[2]);
	
	}

}
