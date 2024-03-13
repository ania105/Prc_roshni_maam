package p14;

public class Main {

	  public static void main(String[] args) {
	    char last = '6', first = '1';

	    for (int i = 1; i <= (last - '1' + 1); ++i) {
	      for (int j = 1; j <= i; ++j) {
	        System.out.print(first+ " ");
	      }
	      ++first;

	      System.out.println();
	    }
	  }
	}
