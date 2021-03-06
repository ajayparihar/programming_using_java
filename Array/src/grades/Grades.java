package grades;

class Student {
    private int[] marks;
    private char[] grade;

    public Student(int[] m) {
	marks = m;

    }

    public char[] findGrade() {
	char grades = 0;
	String gr = "";
	for (int i = 0; i < marks.length; i++) {

	    if (marks[i] >= 92) {
		grades = 'E';
	    } else if ((marks[i] >= 85) && (marks[i] < 92)) {
		grades = 'A';
	    } else if ((marks[i] >= 70) && (marks[i] < 85)) {
		grades = 'B';
	    } else if ((marks[i] >= 65) && (marks[i] < 70)) {
		grades = 'C';
	    } else if (marks[i] < 65) {
		grades = 'D';
	    }
	    gr = gr + grades;

	}
	grade = gr.toCharArray();
	return grade;
    }

    public int[] getMarks() {
	return marks;
    }

    public void setMarks(int[] marks) {
	this.marks = marks;
    }

    public char[] getGrade() {
	return grade;
    }

    public void setGrade(char[] grade) {
	this.grade = grade;
    }

}

public class Grades {
    public static void main(String[] args) {
	int[] marks = { 79, 87, 97, 65, 78, 99, 66 };
	Student student = new Student(marks);
	student.findGrade();
	System.out.print("Grades corresponding to the marks are : ");
	char[] grades = student.getGrade();
	for (int index = 0; index < grades.length; index++) {
	    System.out.print(grades[index] + " ");
	}
    }
}
