import java.util.LinkedList;

public class InsertionSort {
	public static void main(String[] args) {
		LinkedList<Integer> mList = new LinkedList<>();
		mList.add(3);mList.add(5);mList.add(7);mList.add(9);
		mList.add(2);mList.add(4);mList.add(6);mList.add(8);
		mList.add(0);mList.add(1);
		
				
		System.out.println("mList = " + mList);
		int counter = 0;
		
//		for(int i=0; i<mList.size(); i++) {
//			counter++;
//			for(int k=0; k < mList.size()-1; k++) {
//				counter++;
//				int curr = mList.get(k);
//				int next = mList.get(k+1);
//				if(next < curr) {
//					mList.add(k, next);
//					mList.remove(k+2);
//				}
//			}
//		}
		
		for(int i=0; i<mList.size(); i++) {
			counter++;
			int curr = mList.get(i);
			for(int k = i; k >= 0; k--) {
				counter++;
				int left = mList.get(k);
				if(left > curr) {
					mList.add(k, curr);
					mList.remove(k+2);
				}
			}
		}
		
		System.out.println("mList = " + mList);
		System.out.println("counter = " + counter);
	}
}	
