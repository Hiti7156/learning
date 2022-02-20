package learning;
public class Mobile {
	
	private String name;
	
	private String color;
	
	private long price;
	
	private int height;
	

	public Mobile() {
	}
		public Mobile(String name,String color, int price, int height) {
			super();
			
			this.name =  name;
			this.color = color;
			this.price = price;
			this.height = height;
		}
		
		
		public String name() {
			return name;
			}
			
	    public String color() {
			return color;	
		 }	
				
				
		public int price() {
			return (int) price;
				}	
				
		public int height() {
		   return height;
				   
		   }
	
		public String getName() {
			return name;
		}
		
		public void setName(String name) {
			this.name = name;
		}
		public String getColor() {
			return color;
		}
		public void setColor(String color) {
			this.color = color;
		}
		public int getPrice() {
			return (int) price;
		}
		public void setPrice(int price) {
			this.price = price;
		}
		public int getHeight() {
			return height;
		}
		public void setHeight(int height) {
			this.height = height;
		}
		
		   
}	
			
			
			
		
	


