package streamApis;

import java.util.*;
import java.util.stream.Collectors;

public class Aggregation {

	public static void main(String[] args) {

		record Product(String name, String category, Integer price) {
		}
		;

		// Sample list of products
		List<Product> products = List.of(new Product("Laptop", "Electronics", 1000),
				new Product("Phone", "Electronics", 600), new Product("Shirt", "Clothing", 400),
				new Product("Jeans", "Clothing", 600), new Product("TV", "Electronics", 1100));

		// grouping products by category
		Map<String, Integer> groupedSum = products.stream()
				.collect(Collectors.groupingBy(Product::category, Collectors.summingInt(Product::price)));

		System.out.print("sum by category : " + groupedSum);
		System.out.println();

		// average by category
		Map<String, Double> groupedAverage = products.stream()
				.collect(Collectors.groupingBy(Product::category, Collectors.averagingInt(Product::price)));
		System.out.print("average by category : " + groupedAverage);
		System.out.println();

		// counting based on category
		Map<String, Long> counting = products.stream()
				.collect(Collectors.groupingBy(Product::category, Collectors.counting()));
		System.out.println("counting by category : " + counting);

		// Using summary statistics for product
		// sum, average, min, max, count
		Map<String, IntSummaryStatistics> productstatistics = products.stream()
				.collect(Collectors.groupingBy(Product::category, Collectors.summarizingInt(Product::price)));

		System.out.println(productstatistics);

	}

}
