package medimArrayQuestions;

import java.util.ArrayList;
import java.util.List;

public class pascalTriangle {
	public static void main(String[] args) {
		int row=3;
		List<List<Integer>>pascal=pascal(row);
		System.out.println(pascal);
	}

	private static List<List<Integer>> pascal(int row) {
	//1 create a list of list
		List<List<Integer>>result=new ArrayList<>();
		
		if(row==0) {
			return result;
		}
		//2 create row list
		List<Integer>rows= new ArrayList<>();
		rows.add(1);//fist add 1 number
		result.add(rows);//add first row number=1 in result list
		
		if(row==1) {
			return result;
		}
		
		for(int i=1;i<row;i++) {
			//create prevrow and add previous element of prev row
			List<Integer>prevRow = result.get(i-1);
			
			//create nextrow
			ArrayList<Integer>numRow = new ArrayList<>();
			numRow.add(1);
			for(int j=0;j<i-1;j++) {
				numRow.add(prevRow.get(j)+prevRow.get(j+1));
				}
			numRow.add(1);
			
	      result.add(numRow);
		}
		return result;
	}


}
