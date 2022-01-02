package by.epam.basicofoop.task2;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Payment {

	private Map<Product, Integer> productsList = new HashMap<>();

	// покупка товара
	public void purchase(Product product, int amount) {
		productsList.put(product, amount);
	}

	public Map<Product, Integer> getProdustList() {
		return productsList;
	}

	public void setProductsList(Map<Product, Integer> productsList) {
		this.productsList = productsList;
	}

	// покупка нескольких товаров
	public void purchase(Map<Product, Integer> productsList) {
		this.productsList.putAll(productsList);
	}

	// общая стоимость товаров
	public double getTotalPrice() {
		return productsList.entrySet().stream().mapToDouble(productsList -> productsList.getKey().getPrice() * productsList.getValue()).sum();
	}

	class Product {
		private String name;
		private double price;
		private double weight;

		public Product(String name, double price, double weight) {
			super();
			this.name = name;
			this.price = price;
			this.weight = weight;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public double getPrice() {
			return price;
		}

		public void setPrice(double price) {
			this.price = price;
		}

		public double getWeight() {
			return weight;
		}

		public void setWeight(double weight) {
			this.weight = weight;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + getEnclosingInstance().hashCode();
			result = prime * result + Objects.hash(name, price, weight);
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Product other = (Product) obj;
			if (!getEnclosingInstance().equals(other.getEnclosingInstance()))
				return false;
			return Objects.equals(name, other.name)
					&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price)
					&& Double.doubleToLongBits(weight) == Double.doubleToLongBits(other.weight);
		}

		private Payment getEnclosingInstance() {
			return Payment.this;
		}

		@Override
		public String toString() {
			return "Product [name=" + name + ", price=" + price + ", weight=" + weight + "]";
		}
	}
}
