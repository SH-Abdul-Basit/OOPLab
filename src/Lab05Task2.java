import java.util.Scanner;

public class Lab05Task2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a number to search: ");
		int searchNum = input.nextInt();


		System.out.println("Enter 10 numbers to search : ");
		int[] nums = new int[10];
		for (int i = 0; i < nums.length; i++) {
			nums[i] = input.nextInt();
		}
		
		System.out.println("No. to search in array: " + searchNum);
		int counter = 0;
		for (int i = 0; i < nums.length; i++) {
			if (searchNum == nums[i]) {
				counter++;
			}
			System.out.print(nums[i] + " ");
		}
		System.out.println();
		System.out.println("Finding occurence of " + searchNum);
		System.out.println("The element " + searchNum + " occurs " + counter + " times in array!");
		
		for (int i = 0; i < nums.length - 1; i++) {
			int dup = -1;
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] == nums[j]) {
					dup = nums[j];
				}
			}
			if (dup != -1) {
				System.out.println("Duplicated elements are " + dup);
			}
		}
		
		input.close();	
	}
}
