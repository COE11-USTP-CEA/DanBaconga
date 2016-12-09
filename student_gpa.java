import java.util.List;

class student_gpa{
	public static void main(String[] args){
		/*
		student penya = new student();
		baconga.setName("Benjo Gaburno");
		baconga.setDept("CEA");
		subject oop_class = new subject();
		oop_class.setSubjectName("Object Oriented Programming");
		oop_class.setGrade(75.00f);
		baconga.addSubject(oop_class);
		subject intgc_class = new subject();
		intgc_class.setSubjectName("intgconometry");
		intgc_class.setGrade(61.17f);
		baconga.addSubject(intgc_class);
		System.out.println("Student is " + baconga.getName());
		System.out.println("Dept: " + baconga.getDept());
		
		System.out.println("Subjects of Student");
		System.out.println("-------------------");
		List<subject> subjects_ni_abs = baconga.getSubjects();
		
		for(subject s : subjects_ni_abs){
			System.out.println(" -- Subject: " + s.getSubjectName());
			System.out.println("    Grade is " + s.getGrade());
		}
		*/
		
		
		student baconga = new student();
		baconga.setName("Dan Baconga");
		baconga.setDept("CEA");

		subject oop_class = new subject();
		oop_class.setSubjectName("Object Oriented Programming");
		oop_class.setGrade(89.00f);
		baconga.addSubject(oop_class);

		subject intgc_class = new subject();
		intgc_class.setSubjectName("Integral Calculus");
		intgc_class.setGrade(88.42f);
		baconga.addSubject(intgc_class);

		System.out.println("Student is " + baconga.getName());
		System.out.println("Dept: " + baconga.getDept());
		
		System.out.println("Subjects of Student");
		System.out.println("-------------------");
		List<subject> subjects_ni_baconga = baconga.getSubjects();
		
		for(subject s : subjects_ni_baconga){
			System.out.println(" -- Subject: " + s.getSubjectName());
			System.out.println("    Grade is " + s.getGrade());
		}
	
	}
}
