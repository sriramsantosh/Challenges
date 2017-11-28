package com.week1.presession;

import java.util.Arrays;
import java.util.List;

public class NBy3RepeatNumber {

	public static void main(String[] args) {

		//final int [] arr =  {1 ,2 , 3 , 1 ,1};
		final int [] arr =  {9, 7, 2,  3,  4,  5,  6,  7, 7, 7};
		final int [] arr3 = {4, 4, 4, 9, 9, 1, 1, 9, 9, 9, 1, 9, 9};
		final Integer []arr2 = new Integer[] { 1000274, 1000802, 1000914, 1000847, 1000073, 1000562, 1000741, 1000802, 1000965, 1000371, 1000406, 1000441, 1000179, 1000802, 1000552, 1000802, 1000100, 1000724, 1000024, 1000134, 1000313, 1000802, 1000977, 1000777, 1000206, 1000412, 1000802, 1000570, 1000802, 1000518, 1000691, 1000959, 1000903, 1000802, 1000802, 1000273, 1000802, 1000802, 1000265, 1000706, 1000677, 1000802, 1000843, 1000802, 1000061, 1000802, 1000802, 1000975, 1000403, 1000150, 1000959, 1000889, 1000177, 1000416, 1000491, 1000177, 1000807, 1000989, 1000489, 1000447, 1000802, 1000860, 1000104, 1000802, 1000570, 1000015, 1000802, 1000802, 1000593, 1000802, 1000802, 1000326, 1000802, 1000802, 1000120, 1000772, 1000965, 1000802, 1000887, 1000802, 1000567, 1000973, 1000577, 1000820, 1000922, 1000802, 1000982, 1000525, 1000369, 1000829, 1000740, 1000159, 1000909, 1000510, 1000402, 1000802, 1000802, 1000239, 1000247, 1000328, 1000427, 1000802, 1000519, 1000296, 1000114, 1000149, 1000802, 1000802, 1000107, 1000841, 1000017, 1000909, 1000192, 1000425, 1000088, 1000077, 1000506, 1000163, 1000465, 1000626, 1000371, 1000802, 1000179, 1000306, 1000159, 1000802, 1000802, 1000848, 1000138, 1000306, 1000802, 1000881, 1000828, 1000802, 1000008, 1000802, 1000456, 1000802, 1000880, 1000579, 1000434, 1000163, 1000188, 1000802, 1000802, 1000231, 1000945, 1000802, 1000070, 1000727, 1000802, 1000802, 1000802, 1000051, 1000644, 1000802, 1000802, 1000057, 1000967, 1000802, 1000802, 1000366, 1000802, 1000485, 1000802, 1000061, 1000212, 1000192, 1000577, 1000559, 1000802, 1000189, 1000802, 1000802, 1000107, 1000177, 1000011, 1000802, 1000987, 1000400, 1000802, 1000402, 1000024, 1000009, 1000118, 1000046, 1000349, 1000250, 1000282, 1000138, 1000405, 1000295, 1000802, 1000878, 1000166, 1000802, 1000135, 1000005, 1000723, 1000491, 1000802, 1000802, 1000802, 1000802, 1000786, 1000306, 1000802, 1000802, 1000802, 1000639, 1000683, 1000880, 1000329, 1000408, 1000822, 1000947, 1000802, 1000455, 1000037, 1000311, 1000802, 1000802, 1000339, 1000802, 1000519, 1000401, 1000802, 1000256, 1000802, 1000802, 1000503, 1000802, 1000787, 1000802, 1000802, 1000384, 1000456, 1000845, 1000802, 1000802, 1000000, 1000213, 1000629, 1000802, 1000226, 1000802, 1000802, 1000107, 1000100, 1000802, 1000587, 1000882, 1000049, 1000623, 1000802, 1000178, 1000788, 1000648, 1000802, 1000567, 1000802, 1000802, 1000802, 1000085, 1000109, 1000965, 1000353, 1000802, 1000802, 1000802, 1000982, 1000663, 1000829, 1000578, 1000753, 1000802, 1000802, 1000529, 1000060, 1000047, 1000802, 1000750, 1000780, 1000277, 1000802, 1000751, 1000590, 1000802, 1000953, 1000240, 1000218, 1000659, 1000802, 1000001, 1000766, 1000802, 1000508, 1000802, 1000802, 1000802, 1000028, 1000802, 1000493, 1000077, 1000427, 1000505, 1000752, 1000802, 1000747, 1000126, 1000269, 1000297, 1000394, 1000257, 1000708, 1000802, 1000802, 1000697, 1000802, 1000802, 1000802, 1000921, 1000559, 1000450, 1000206, 1000802, 1000802, 1000149, 1000031, 1000866, 1000721, 1000497, 1000654, 1000057, 1000802, 1000130, 1000523, 1000577, 1000750, 1000536, 1000339, 1000796, 1000802, 1000802, 1000197, 1000584, 1000939, 1000802, 1000633, 1000553, 1000124, 1000086, 1000619, 1000802, 1000415, 1000802, 1000125, 1000802, 1000104, 1000348, 1000464, 1000187, 1000887, 1000369, 1000281, 1000802, 1000802, 1000526, 1000685, 1000029, 1000922, 1000191, 1000802, 1000802, 1000802, 1000298, 1000802, 1000176, 1000295, 1000802, 1000802, 1000238, 1000802, 1000802, 1000314, 1000303, 1000802, 1000698, 1000309, 1000677, 1000606, 1000802, 1000701, 1000898, 1000579, 1000990, 1000513, 1000435, 1000192, 1000960, 1000324, 1000509, 1000906, 1000802, 1000492, 1000705, 1000641, 1000479, 1000662, 1000642, 1000791, 1000942, 1000802, 1000802, 1000100, 1000296, 1000802, 1000802, 1000533, 1000802, 1000038, 1000802, 1000254, 1000802, 1000802, 1000802, 1000802, 1000393, 1000802, 1000435, 1000484, 1000802, 1000847, 1000802, 1000360, 1000961, 1000544, 1000914, 1000802, 1000802, 1000663, 1000802, 1000802, 1000519, 1000802, 1000928, 1000802, 1000802, 1000802, 1000802, 1000258, 1000108, 1000544, 1000802, 1000169, 1000097, 1000802, 1000306, 1000977, 1000802, 1000153, 1000802, 1000802, 1000039, 1000099, 1000802, 1000468, 1000862, 1000802, 1000802, 1000802, 1000068, 1000802, 1000161, 1000179, 1000710, 1000802, 1000802, 1000802, 1000802, 1000540, 1000802, 1000115, 1000802, 1000802, 1000089, 1000802, 1000798, 1000802, 1000802, 1000544, 1000979, 1000850, 1000085, 1000197, 1000802, 1000802, 1000031, 1000704, 1000515, 1000802, 1000198, 1000382, 1000597, 1000613, 1000857, 1000798, 1000319, 1000266, 1000154, 1000753, 1000017, 1000004, 1000802 }; 
		System.out.println(majorityElement(Arrays.asList(arr2)));
//		System.out.println(iisNBy3(Arrays.asList(arr2)));
	}
	
	
    static int majorityElement(final List<Integer> a) {
        int n = a.size(), k = 3;  
        if (n==0 || k<2) return -1;
        int[] candidates = new int[k-1];
        int[] counts = new int[k-1];
        for (int num: a) {
            boolean settled = false;
            for (int i=0; i<k-1; i++) {
                if (candidates[i]==num) {
                    counts[i]++;
                    settled = true;
                    break;
                } 
            }
            if (settled) continue;
            for (int i=0; i<k-1; i++) {
                if (counts[i]==0) {
                    counts[i] = 1;
                    candidates[i] = num;
                    settled = true;
                    break;
                } 
            }
            if (settled) continue;
            for (int i=0; i<k-1; i++) counts[i] = (counts[i] > 0) ? (counts[i]-1) : 0;
        }
        Arrays.fill(counts, 0);
        for (int num: a) {
            for (int i=0;i<k-1; i++) {
                if (candidates[i]==num) {
                    counts[i]++;
                    break;
                }
            }
        }
        for (int i=0; i<k-1; i++) if (counts[i]>n/k) return candidates[i];
        return -1;
    }


}