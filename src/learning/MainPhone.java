package learning;

public class MainPhone {
	
	public static void main(String[] args) {
		
		Iphone i1 = new Iphone();
		i1.setName("iphone13");
		System.out.println("name is : "+i1.getName());
		
		i1.setColor("Black");
		System.out.println("color is : "+i1.getColor());
		
		i1.setHeight(6);
		System.out.println("Height is:"+i1.getHeight() );
		
		i1.setPrice(1500);
		System.out.println("price is :"+i1.getPrice());
		
		
		i1.favourite();
		i1.favourite("shape");
		
		
		Samsung s1= new Samsung();
		s1.display();
		
	}

}
