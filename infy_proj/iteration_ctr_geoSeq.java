package infy_proj;

public class iteration_ctr_geoSeq {
    public static void main(String[] args) {
	int num = 5;
	int seq = 1;
	System.out.print("1");
	for (int i = 1; i < num; i++) {
	    seq = seq * 2;
	    System.out.print(", " +seq);
	}
    }

}
