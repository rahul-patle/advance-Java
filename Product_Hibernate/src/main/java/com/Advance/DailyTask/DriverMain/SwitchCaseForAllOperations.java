package com.Advance.DailyTask.DriverMain;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Scanner;

import com.Advance.DailyTask.Entity.Product;
import com.Advance.DailyTask.Operation.AllOperationsMethods;

public class SwitchCaseForAllOperations {

	public static void main(String[] args) throws Exception {

		AllOperationsMethods allOperation = new AllOperationsMethods();
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		Scanner scanner = new Scanner(System.in);
		int ProductId = 0;
		String ProductName = null;
		int productQuantity = 0;
		double productPrice = 0.0;
		while (true) {
			System.out.println(
					"enter choice 1.fetch data ,2.save data, 3.save Multiple 4. update data 5.delete data, 6.exit");

			// int choice = Integer.parseInt(bufferedReader.readLine());
			int choice = scanner.nextInt();
			switch (choice) {
			case 1:
				// Get data at specific product ID

				System.out.println("enter productId");
				ProductId = scanner.nextInt();
				Product product = allOperation.GetMethod(ProductId);
				System.out.println(product);
				break;
			case 2:
				// data save
				Product productSave = allOperation.getInput();
				// Product productSave = new Product(1, "cellphone", 50, 50000);

				allOperation.saveData(productSave);

				break;
			case 3:

				allOperation.allListSave();

			case 4:
				// update data

				// Product productUpdate = new Product (3,"table",20,50);
				Product productUpdate = allOperation.getInput();
				allOperation.updateMethod(productUpdate);
				break;
			case 5:
				// delete data
				System.out.println("enter productId");
				ProductId = scanner.nextInt();
				allOperation.deletedata(ProductId);
				break;

			default:
				// exit
				System.exit(0);
			}
		}
	}
}
