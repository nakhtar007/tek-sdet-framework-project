package tek.sdet.framework.utilities;

import net.datafaker.Faker;



public class DataGeneratorUtility {
	
	public static void main(String[] args) {
		System.out.println(data("fullName"));
	
		
	}public static String data(String input) {
		Faker faker = new Faker();
		String outPut = "";
		if (input.equals("firstName")) {
			outPut = faker.name().firstName();
		} else if (input.equals("lastName")) {
			outPut = faker.name().lastName();
			
		}else if(input.equals("email")) {
			outPut = faker.name().firstName()+"." + faker.name()+"@tekschool.us";
		} else if (input.equals("phoneNumber")) {
			outPut = faker.phoneNumber().cellPhone();
		} else if (input.equals("fullName")) {
			outPut = faker.name().fullName();
			
		} else if(input.equals("address")) {
			outPut = faker.address().streetName();
		} else if (input.equals("city")) {
			outPut = faker.address().city();
			
		} 
		return outPut;
	}
}

