package avgSalary;

public class AvgSalary {
    public static double[] findDetails(double[] salary) {
	double avg = 0;
	double temp = 0;
	for (int i = 0; i < salary.length; i++) {
	    temp = temp + salary[i];
	}
	avg = temp / salary.length;

	int greater = 0;

	for (int i = 0; i < salary.length; i++) {
	    if (salary[i] > avg) {
		greater++;
	    }
	}

	int lesser = salary.length - greater;

	double[] details = { avg, greater, lesser };
	return details;

    }

    public static void main(String[] args) {
	double[] salary = { 23500.0, 25080.0, 28760.0, 22340.0, 19890.0 };
	double[] details = findDetails(salary);

	System.out.println("Average salary: " + details[0]);
	System.out.println("Number of salaries greater than the average salary: " + details[1]);
	System.out.println("Number of salaries lesser than the average salary: " + details[2]);
    }
}
