public class Main {
	public static void main (String [] args) {
		int [] s = new int [11];
		int [] f = new int [11];
		int n = 11;
		s[0] = 3;
		s[1] = 5;
		s[2] = 12;
		s[3] = 3;
		s[4] = 1;
		s[5] = 5;
		s[6] = 6;
		s[7] = 8;
		s[8] = 0;
		s[9] = 2;
		s[10] = 8;
		f[0] = 8;
		f[1] = 7;
		f[2] = 14;
		f[3] = 5;
		f[4] = 4;
		f[5] = 9;
		f[6] = 10;
		f[7] = 11;
		f[8] = 6;
		f[9] = 13;
		f[10] = 12;
		
		
		int [] resultSDM = gulosoSDM(s,f, n);
		for (int i=0; i< resultSDM.length; i++) {
			System.out.println(resultSDM[i]);
		}
	}


	public static int[] gulosoSDM(int[]s, int []f, int n) {
		int [] x = new int [n];
		x[1] = 1;
		int j = 0;
		for (int k = 2; k < n; k++) {
			if (s[k]>= f[j]) {
				x[k]=1;
				j=k;
			} else {
				x[k]=0;
			}
		}
		return x;
	}
	
}
