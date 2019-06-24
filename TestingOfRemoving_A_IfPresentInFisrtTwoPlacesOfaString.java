import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
/*
 * 
 *	Example : “ABCD” => “BCD”
 *            “AACD” => “CD” 
 *            “BACD” => “BCD”
 *            “BBAA” => “BBAA”       
 *            “AABAA” => “BAA”
 *            
 */            
class TestingOfRemoving_A_IfPresentInFisrtTwoPlacesOfaString {
	Removing_A_IfPresentInFisrtTwoPlacesOfaString object=new Removing_A_IfPresentInFisrtTwoPlacesOfaString();
@Test
void test() {
		assertEquals("BCD",object.Removing_A_IfPresentInFisrtTwoPlaces("ABCD"),"Executed Successfully");
		assertEquals("CD",object.Removing_A_IfPresentInFisrtTwoPlaces("AACD"),"Executed Successfully");
		assertEquals("BCD",object.Removing_A_IfPresentInFisrtTwoPlaces("BACD"),"Executed Successfully");
		assertEquals("BBAA",object.Removing_A_IfPresentInFisrtTwoPlaces("BBAA"),"Executed Successfully");
		assertEquals("BAA",object.Removing_A_IfPresentInFisrtTwoPlaces("AABAA"),"Executed Successfully");
		
	}
	
	
	

}
