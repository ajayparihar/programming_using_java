package subjects;

class Teacher {
    private String teacherName;
    private String subject;
    private double salary;

    public String getTeacherName() {
	return teacherName;
    }

    public void setTeacherName(String teacherName) {
	this.teacherName = teacherName;
    }

    public String getSubject() {
	return subject;
    }

    public void setSubject(String subject) {
	this.subject = subject;
    }

    public double getSalary() {
	return salary;
    }

    public void setSalary(double salary) {
	this.salary = salary;
    }

    public void Teacher(String name, String sub, double salary) {
	System.out.println("Name : " + name + ", " + "Subject : " + sub + ", " + "Salary : " + salary);
	return;

    }

}

class Subject {
    public static void main(String[] args) {

	Teacher obj1 = new Teacher();

	obj1.Teacher("Alex", "Java Fundamentals", 1200L);
	obj1.getTeacherName();

	Teacher obj2 = new Teacher();
	obj2.Teacher("John", "RDBMS", 800L);
	obj2.getTeacherName();

	Teacher obj3 = new Teacher();
	obj3.Teacher("Sam", "Networking", 900L);
	obj3.getTeacherName();

	Teacher obj4 = new Teacher();
	obj4.Teacher("Maria", "Python", 900L);
	obj4.getTeacherName();

    }
}
