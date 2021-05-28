package test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Baek1874 {
	public static void main(String[] args) {

		try {
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(isr);

			int n = Integer.parseInt(br.readLine());
			int[] nums = new int[n];

			for (int i = 0; i < n; i++) {
				nums[i] = Integer.parseInt(br.readLine());
			}

			br.close();
			isr.close();

			int index = 0;
			Stack<Integer> stack = new Stack<Integer>();
			StringBuilder sb = new StringBuilder();// append�ϱ� ���ؼ� StringBuilder
													// �̿� �迭�� ����� �� �� ���� ����

			// ���������� �ϱ� ���� for�� ����
			for (int i = 1; i <= n; i++) {
				stack.add(i);
				sb.append("+\n"); // + ���̰� ���� ��¹� ó�� ��������

				// nums�� ���� stack�� top�� ���� ���ٸ�
				while (stack.peek() == nums[index]) {
					// stack�� pop���ְ�
					stack.pop();
					sb.append("-\n"); // - ���̰� ���� ��¹� ó�� ��������

					// arr���� �� �񱳸� ���� ++
					index++;

					// stack�� pop�� �� �ؼ� ������� ��� ��Ǫ�� ����������
					if (stack.isEmpty()) {
						break;
					}
				}
			}

			if (stack.isEmpty()) {
				// stack�� ��������� sb���
				System.out.println(sb);
			} else {
				// stack�� ������������� ������ �ȵȰ��̹Ƿ� NO ���
				System.out.println("NO");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
