import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Random;

public class Move {

	ArrayList<Integer> arr1 = new ArrayList<>();
	ArrayList<Integer> arr2 = new ArrayList<>();
	ArrayList<Integer> arr3 = new ArrayList<>();
	ArrayList<Integer> arr4 = new ArrayList<>();
	
	public void populate() {
		for (int i = 0; i < 1000; i++) {
			arr1.add(1);
			arr2.add(2);
			arr3.add(3);
			arr4.add(4);
		}
	}
	
	public void moveUnits(ArrayList<Unit> unitArray, int i, Unit l1, Unit l2, Unit l3, Unit l5, Unit l6, Unit l7, Unit l8) {
			Random r = new Random();
			
			int x = unitArray.get(i).memArray.get(r.nextInt(unitArray.get(i).memArray.size()));
			System.out.println(x);
			if (!unitArray.get(1).intersects(l1) && !unitArray.get(1).intersects(l2) &&  !unitArray.get(1).intersects(l3)  
					&& !unitArray.get(1).intersects(l5) &&  !unitArray.get(1).intersects(l6) &&  !unitArray.get(1).intersects(l7) 
					&&  !unitArray.get(1).intersects(l8) && unitArray.get(1).x <= 537.0 && unitArray.get(1).x >= 241.0)	{
			if (x == 1)  {
				unitArray.get(i).y -= 1;
			}
			else if (x == 2)  {
				unitArray.get(i).x += 1;
			}
			else if (x == 3)  {
				unitArray.get(i).y += 1;
			}
			else if (x == 4)  {
				unitArray.get(i).x -= 1;
			}
		}
			
	}

}
