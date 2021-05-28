package test;

import java.util.LinkedList;
import java.util.Queue;

public class ProgrammersDFS_BFS_1 {
	public static void main(String[] args) {
		int bridge_length = 2;
		int weight = 10;
		int truck_weights[] = {7,4,5,6};
		
		System.out.print(solution(bridge_length, weight, truck_weights));
	}
	
	public static int solution(int bridge_length, int weight, int[] truck_weights) {
		int answer = 0;
		Queue<Integer> bridge = new LinkedList<Integer>();
		
		// 다리 길이 만큼의 큐 생성 
		// 시간 값은 한번 이동할 때 1초 라고 명시 되어 있다. 
		for (int i = 0; i < bridge_length - 1; i++) { 
			// 처음에 다리는 전부 비어 있다. (0이 비어 있음을 의미) 
			// bridge_length -1 미만을 도는 이유는 0번째 트럭은 무조건 다리 위에 올 것이기 때문에 
			bridge.add(0); 
		}
		
		// 0번째 트럭은 무조건 다리 위에 있을 것이다. (하나의 트럭 무게가 weight 보다 큰 경우는 없을 것) 
		int currentWeights = truck_weights[0]; 
		bridge.add(currentWeights); 
		// 현재 다리 위에 있는 트럭은 0 이고 다음에 올 트럭이 1이다. 
		int index = 1; 
		// 다리 위에 0번째 트럭이 올라갔기 때문에 1부터 시작 (0초가 지남) 
		answer = 1;

		while (!bridge.isEmpty()) {
			// 시간 증가 
			answer++;
			
			// 다리 위에 있는 첫번째 트럭이 빠진다. 
			// 다리 위에 트럭이 없으면 이 값은 0일 것이다. 
			int truck = bridge.poll();
			System.out.println(currentWeights);
			
			// 다리 위의 첫번째 트럭이 빠졌기 때문에
			// 현재 다리 위에 모든 트럭의 무게에서 첫번째 트럭의 무게를 빼준다.
			currentWeights -= truck; 
			// 대기하는 트럭이 남아 있다면

			if (index < truck_weights.length) {
				// 현재 무게 + 대기하는 첫번째 트럭의 무게가 weight 보다 작은 경우 
				// 다음 트럭 (대기하는 첫번째 트럭) 은 다리 위에 올 수 있다.
				if (currentWeights + truck_weights[index] <= weight) {
					// 다음 트럭이 다리 위에 온다. 
					currentWeights += truck_weights[index];
					bridge.add(truck_weights[index++]);
				}
				else { 
					// 다리 위에 있는 트럭이 앞으로 이동한다. (대기하는 트럭은 다리 위에 오지 못한다.) 
					// 다리 위에 새 트럭은 오지 않는다. (0은 트럭이 없음을 의미) 
					bridge.add(0);
				}

			}
		}
		
		return answer;
	}
}
