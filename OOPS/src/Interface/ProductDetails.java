package Interface;

public class ProductDetails implements Dmart {

	public static void main(String[] args) {
		ProductDetails pd=new ProductDetails();
		pd.Product();
		pd.Price();

	}

	@Override
	public void Product() {
		System.out.println("Product Name: ");
		
	}

	@Override
	public void Price() {
		System.out.println("Product Price: ");
	}

}
