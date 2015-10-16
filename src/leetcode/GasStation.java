package leetcode;

public class GasStation {
	// http://www.programcreek.com/2014/03/leetcode-gas-station-java/
	/*
	 * Analysis
	 * 
	 * To solve this problem, we need to understand: 1) if sum of gas[] >= sum
	 * of cost[], then there exists a start index to complete the circle. 2) if
	 * A can not read C in a the sequence of A-->B-->C, then B can not make it
	 * either.
	 * 
	 * Proof:
	 * 
	 * If gas[A] < cost[A], then A can not go to B. Therefore, gas[A] >=cost[A].
	 * We already know A can not go to C, we have gas[A] + gas[B] < cost[A] +
	 * cost[B] And gas[A] >=cost[A], Therefore, gas[B] < cost[B], i.e., B can
	 * not go to C. In the following solution, sumRemaining tracks the sum of
	 * remaining to the current index. If sumRemaining < 0, then every index
	 * between old start and current index is bad, and we need to update start
	 * to be the current index.
	 * 
	 * You can use the following example to visualize the solution.
	 * leetcode-gas-station-java
	 * 
	 */
	public int canCompleteCircuit(int[] gas, int[] cost) {
		int sumRemaining = 0; // Track current remaining
		int total = 0; // Track total remaining
		int start = 0;

		for (int i = 0; i < gas.length; i++) {
			int remaining = gas[i] - cost[i];

			if (sumRemaining >= 0) {
				sumRemaining += remaining;
			} else {
				sumRemaining = remaining;
				start = i;
			}

			total += remaining;
		}

		if (total >= 0) {
			return start;
		} else {
			return -1;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
