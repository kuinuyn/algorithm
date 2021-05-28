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
		
		// �ٸ� ���� ��ŭ�� ť ���� 
		// �ð� ���� �ѹ� �̵��� �� 1�� ��� ��� �Ǿ� �ִ�. 
		for (int i = 0; i < bridge_length - 1; i++) { 
			// ó���� �ٸ��� ���� ��� �ִ�. (0�� ��� ������ �ǹ�) 
			// bridge_length -1 �̸��� ���� ������ 0��° Ʈ���� ������ �ٸ� ���� �� ���̱� ������ 
			bridge.add(0); 
		}
		
		// 0��° Ʈ���� ������ �ٸ� ���� ���� ���̴�. (�ϳ��� Ʈ�� ���԰� weight ���� ū ���� ���� ��) 
		int currentWeights = truck_weights[0]; 
		bridge.add(currentWeights); 
		// ���� �ٸ� ���� �ִ� Ʈ���� 0 �̰� ������ �� Ʈ���� 1�̴�. 
		int index = 1; 
		// �ٸ� ���� 0��° Ʈ���� �ö󰬱� ������ 1���� ���� (0�ʰ� ����) 
		answer = 1;

		while (!bridge.isEmpty()) {
			// �ð� ���� 
			answer++;
			
			// �ٸ� ���� �ִ� ù��° Ʈ���� ������. 
			// �ٸ� ���� Ʈ���� ������ �� ���� 0�� ���̴�. 
			int truck = bridge.poll();
			System.out.println(currentWeights);
			
			// �ٸ� ���� ù��° Ʈ���� ������ ������
			// ���� �ٸ� ���� ��� Ʈ���� ���Կ��� ù��° Ʈ���� ���Ը� ���ش�.
			currentWeights -= truck; 
			// ����ϴ� Ʈ���� ���� �ִٸ�

			if (index < truck_weights.length) {
				// ���� ���� + ����ϴ� ù��° Ʈ���� ���԰� weight ���� ���� ��� 
				// ���� Ʈ�� (����ϴ� ù��° Ʈ��) �� �ٸ� ���� �� �� �ִ�.
				if (currentWeights + truck_weights[index] <= weight) {
					// ���� Ʈ���� �ٸ� ���� �´�. 
					currentWeights += truck_weights[index];
					bridge.add(truck_weights[index++]);
				}
				else { 
					// �ٸ� ���� �ִ� Ʈ���� ������ �̵��Ѵ�. (����ϴ� Ʈ���� �ٸ� ���� ���� ���Ѵ�.) 
					// �ٸ� ���� �� Ʈ���� ���� �ʴ´�. (0�� Ʈ���� ������ �ǹ�) 
					bridge.add(0);
				}

			}
		}
		
		return answer;
	}
}
