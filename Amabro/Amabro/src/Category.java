

public class Category {
	
	protected String NameCategory = "";
	protected String SubCategory = "";
	protected String IdCategory = "";
	
	
	protected Category(String NC, String SC, String IC) {
		
		NameCategory = NC;
		SubCategory = SC;
		IdCategory = IC;
		
		
		
	
	}
	
	protected String getNameCategory() {
		return NameCategory;
	}
	protected String getSubCategory() {
		return SubCategory;
	}
	protected String getIdCategory() {
		return IdCategory;
	}
	
}
