package String;

import java.util.Arrays;

public class printAlternateposinega {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = { 9, 4, -2, -1, 5, 0, -5, -3, 2 };
		int pcnt = 0;
		int ncnt = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] >= 0) {
				pcnt++;
			} else {
				ncnt++;
			}
		}
		int[] pa = new int[pcnt];
		int[] na = new int[ncnt];
		int index = 0;
		int index1 = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] >= 0) {
				pa[index++] = a[i];
			} else
				na[index1++] = a[i];
		}
		int max = 0;
		if (pa.length > na.length) {
			max = pa.length;
		} else
			max = na.length;
		int[] c = new int[pa.length + na.length];
		int ind = 0;
		for (int i = 0; i < max; i++) {
			if (i < pa.length) {
				c[ind++] = pa[i];
			}
			if (i < na.length) {
				c[ind++] = na[i];
			}
		}
		//System.out.println(" ");
		System.out.print(Arrays.toString(c));

	}

}
