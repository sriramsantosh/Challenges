package com.week2.presession;

import java.awt.Point;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PointOnStraightLine {

	public static void main(String[] args) {
		Integer[]a = {1,1};
		Integer[]b = {2,2};
		
		System.out.println(maxPoints(Arrays.asList(a), Arrays.asList(b)));
	}
	
    public static int maxPoints(List<Integer> a, List<Integer> b) {
    	
    	int length = a.size() > b.size() ? b.size() : a.size();
    	
    	Point[] points = new Point[length];
    	
    	for(int i = 0; i < points.length; i++) {
    		points[i] = new Point();
    		points[i].x = a.get(i);
    		points[i].y = b.get(i);
    	}
    	
        if(points.length <= 0) return 0;
        if(points.length <= 2) return points.length;
        int result = 0;
        for(int i = 0; i < points.length; i++){
            Map<Double, Integer> hm = new HashMap<Double, Integer>();
            int samex = 1;
            int samep = 0;
            for(int j = 0; j < points.length; j++){
                if(j != i){
                    if((points[j].x == points[i].x) && (points[j].y == points[i].y)){
                        samep++;
                    }
                    if(points[j].x == points[i].x){
                        samex++;
                        continue;
                    }
                    double k = (double)(points[j].y - points[i].y) / (double)(points[j].x - points[i].x);
                    if(hm.containsKey(k)){
                        hm.put(k,hm.get(k) + 1);
                    }else{
                        hm.put(k, 2);
                    }
                    result = Math.max(result, hm.get(k) + samep);
                }
            }
            result = Math.max(result, samex);
        }
        return result;
    }


}
