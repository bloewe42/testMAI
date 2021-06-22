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

	public void moveUnits(ArrayList<Unit> unitArray, int i, Unit l1, Unit l2a, Unit l2b, Unit l3a, Unit l3b, Unit l4,
			Unit l5a, Unit l5b, Unit l6a, Unit l6b, Unit l7) {
		Random r = new Random();

		int x = unitArray.get(i).memArray.get(r.nextInt(unitArray.get(i).memArray.size()));

		// North
		if (x == 1 && (unitArray.get(i).intersects(l1)
				|| (unitArray.get(i).intersects(l2a) && unitArray.get(i).intersects(l2b))
				|| (unitArray.get(i).intersects(l3a) && unitArray.get(i).intersects(l3b))
				|| unitArray.get(i).intersects(l4)
				|| (unitArray.get(i).intersects(l5a) && unitArray.get(i).intersects(l5b))
				|| (unitArray.get(i).intersects(l6a) && unitArray.get(i).intersects(l6b))
				|| unitArray.get(i).intersects(l7))) {
			unitArray.get(i).y -= 1;
			if (!unitArray.get(i).intersects(l1)
					&& (!unitArray.get(i).intersects(l2a) || !unitArray.get(i).intersects(l2b))
					&& (!unitArray.get(i).intersects(l3a) || !unitArray.get(i).intersects(l3b))
					&& !unitArray.get(i).intersects(l4)
					&& (!unitArray.get(i).intersects(l5a) || !unitArray.get(i).intersects(l5b))
					&& (!unitArray.get(i).intersects(l6a) || !unitArray.get(i).intersects(l6b))
					&& !unitArray.get(i).intersects(l7)) {
				unitArray.get(i).y += 1;
			}

		}
		// East
		else if (x == 2 && (unitArray.get(i).intersects(l1)
				|| (unitArray.get(i).intersects(l2a) && unitArray.get(i).intersects(l2b))
				|| (unitArray.get(i).intersects(l3a) && unitArray.get(i).intersects(l3b))
				|| unitArray.get(i).intersects(l4)
				|| (unitArray.get(i).intersects(l5a) && unitArray.get(i).intersects(l5b))
				|| (unitArray.get(i).intersects(l6a) && unitArray.get(i).intersects(l6b))
				|| unitArray.get(i).intersects(l7))) {
			unitArray.get(i).x += 1;
			if (!unitArray.get(i).intersects(l1)
					&& (!unitArray.get(i).intersects(l2a) || !unitArray.get(i).intersects(l2b))
					&& (!unitArray.get(i).intersects(l3a) || !unitArray.get(i).intersects(l3b))
					&& !unitArray.get(i).intersects(l4)
					&& (!unitArray.get(i).intersects(l5a) || !unitArray.get(i).intersects(l5b))
					&& (!unitArray.get(i).intersects(l6a) || !unitArray.get(i).intersects(l6b))
					&& !unitArray.get(i).intersects(l7)) {
				unitArray.get(i).x -= 1;
			}
		}
		// South
		else if (x == 3 && (unitArray.get(i).intersects(l1)
				|| (unitArray.get(i).intersects(l2a) && unitArray.get(i).intersects(l2b))
				|| (unitArray.get(i).intersects(l3a) && unitArray.get(i).intersects(l3b))
				|| unitArray.get(i).intersects(l4)
				|| (unitArray.get(i).intersects(l5a) && unitArray.get(i).intersects(l5b))
				|| (unitArray.get(i).intersects(l6a) && unitArray.get(i).intersects(l6b))
				|| unitArray.get(i).intersects(l7))) {
			unitArray.get(i).y += 1;
			if (!unitArray.get(i).intersects(l1)
					&& (!unitArray.get(i).intersects(l2a) || !unitArray.get(i).intersects(l2b))
					&& (!unitArray.get(i).intersects(l3a) || !unitArray.get(i).intersects(l3b))
					&& !unitArray.get(i).intersects(l4)
					&& (!unitArray.get(i).intersects(l5a) || !unitArray.get(i).intersects(l5b))
					&& (!unitArray.get(i).intersects(l6a) || !unitArray.get(i).intersects(l6b))
					&& !unitArray.get(i).intersects(l7)) {
				unitArray.get(i).y -= 1;
			}
		}
		// West
		else if (x == 4 && (unitArray.get(i).intersects(l1)
				|| (unitArray.get(i).intersects(l2a) && unitArray.get(i).intersects(l2b))
				|| (unitArray.get(i).intersects(l3a) && unitArray.get(i).intersects(l3b))
				|| unitArray.get(i).intersects(l4)
				|| (unitArray.get(i).intersects(l5a) && unitArray.get(i).intersects(l5b))
				|| (unitArray.get(i).intersects(l6a) && unitArray.get(i).intersects(l6b))
				|| unitArray.get(i).intersects(l7))) {
			unitArray.get(i).x -= 1;
			if (!unitArray.get(i).intersects(l1)
					&& (!unitArray.get(i).intersects(l2a) || !unitArray.get(i).intersects(l2b))
					&& (!unitArray.get(i).intersects(l3a) || !unitArray.get(i).intersects(l3b))
					&& !unitArray.get(i).intersects(l4)
					&& (!unitArray.get(i).intersects(l5a) || !unitArray.get(i).intersects(l5b))
					&& (!unitArray.get(i).intersects(l6a) || !unitArray.get(i).intersects(l6b))
					&& !unitArray.get(i).intersects(l7)) {
				unitArray.get(i).x += 1;
			}
		}
	}

	public void Learn(ArrayList<Integer> l) {

	}
}
