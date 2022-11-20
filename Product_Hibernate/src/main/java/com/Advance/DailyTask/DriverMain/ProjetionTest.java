package com.Advance.DailyTask.DriverMain;

import java.util.List;
import java.util.Scanner;

import com.Advance.DailyTask.Entity.Product;
import com.Advance.DailyTask.Projections.ProjectionsExample;

public class ProjetionTest {

	public static void main(String[] args) {
		ProjectionsExample ex = new ProjectionsExample();

		while (true) {
			Scanner scanner = new Scanner(System.in);

			System.out.println("Enter 1.Sum fetch A, 2.Sum fetch WA 3.");
			System.out.print("Enter 3.Average, 4.Count, 5.Max, 6.Min,");
			System.out.print("Enter 7. row count 8. Distinct ");

			int choice = scanner.nextInt();

			switch (choice) {
			case 1:
				List list = ex.getProjectex(); // output in array [750]
				System.out.println(list);
				break;

			case 2:
				// double gives values without array 750

				double sum = ex.getProjectSum(); // select sum(productprice) from product;
				System.out.println(sum);
				break;

			case 3:
				// select avg(productprice) from product;
				double avg = ex.getProjectionAvg();
				System.out.println(avg);
				break;
			
			case 4:
				// select count(productprice) from product;
				double count = ex.getProjectionCount(); 
				System.out.println(count);
				break;
			
			case 5:
				 // select max(productprice) from product;
				double max = ex.getProjectionMax();
				System.out.println(max);
				break;
			
			case 6:
				// select min(productprice) from product;
				double min = ex.getProjectionMin(); 
				System.out.println(min);

				break;
			
			case 7:
				// select count(*) as y0 from Product;
				Long rowCount = ex.getRowCount(); 
				System.out.println(rowCount);

				break;
		
			case 8:
				ex.getDistinct(); //
				for (Object string : args) {
					System.out.println(string);
				}
				break;
			default:
				System.exit(choice);

			}
		}
	}
}
