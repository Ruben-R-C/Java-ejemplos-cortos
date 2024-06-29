package challenge;

import challenge.pojo.ProductSales;
import challenge.pojo.ProductStock;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.stream.Collectors;

public class Solution {

	//funcion que ordena la lista de productos tenido en cuenta 
	//las ventas y el stock de forma ponderada
	public static List<Long> sortProductsByScores(int stockWeight, int salesWeight,
			List<ProductStock> productsStock, List<ProductSales> productsSales) throws Exception {

		// Guard clause: List must be empty
		if (productsStock.isEmpty()) {
			throw new Exception("Error list of stock is empty");
		}

		// Guard clauses: Stock and Sales list must have the same lenght
		int listStockSize = productsStock.size();
		int listSalesSize = productsStock.size();
		if (listStockSize != listSalesSize) {
			throw new Exception("Error no tiene la misma longitud");
		}

		// Guard clause: Any of both lists must contains null values
		boolean stockListNull = productsStock.stream().anyMatch(x -> x == null);
		boolean salesListNull = productsSales.stream().anyMatch(x -> x == null);
		if (stockListNull || salesListNull) {
			throw new Exception("Error contienen nulos");
		}

		// Guard clause: The product id of both list must be identical
		List<Long> listStockindex = productsStock.stream()
				.map(stock -> stock.getProductId()).sorted().collect(Collectors.toList());
		List<Long> listSalesindex = productsSales.stream()
				.map(stock -> stock.getProductId()).sorted().collect(Collectors.toList());

		if (!listStockindex.equals(listSalesindex)) { // O(nlogn)
			throw new Exception("The ids of stock and sales products are different.");
		}

		// Guard clause: identificador unico
		boolean containsDuplicateProduct = listStockindex.stream().distinct().count() != listStockSize;
		if (containsDuplicateProduct) {
			throw new Exception("Product list contains duplicate id, that must be unique.");
		}

		// Guard clause: the weight of both mush be the total 100%
		int totalWeight = stockWeight + salesWeight;
		final int TOTAL_WEIGHT = 100;
		if (TOTAL_WEIGHT != totalWeight) {
			throw new Exception("Both weights are not 100%.");
		}

		// Main logic:

		// lambda to find product by id and return its stock
		BiFunction<List<ProductStock>, Long, Long> findStock = (list, id) -> list.stream()
				.filter(stock -> stock.getProductId().equals(id))
				.findFirst()
				.get()
				.getAvailableStock();

		// lambda to find product by id and return its sales
		BiFunction<List<ProductSales>, Long, Double> findSales = (list, id) -> list.stream()
				.filter(stock -> stock.getProductId().equals(id))
				.findFirst()
				.get()
				.getSalesAmount();

		// parse from percent weight to decimal weight
		double factorStock = (double) stockWeight / 100;
		double factorSales = (double) salesWeight / 100;

		// calculate the total weight of each product
		Map<Long, Double> productsWeight = productsStock.stream()
				.map(ProductStock::getProductId)
				.collect(Collectors.toMap(id -> id,
						id -> (findStock.apply(productsStock, id) * factorStock) +
								(findSales.apply(productsSales, id) * factorSales)));

		// reverse order products comparing its weight from larger to shorter
		List<Long> orderProductsWeight = productsWeight.entrySet()
				.stream()
				.sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
				.map(Map.Entry::getKey)
				.collect(Collectors.toList());

		return orderProductsWeight;
	}

}
