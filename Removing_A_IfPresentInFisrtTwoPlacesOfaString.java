/*
 * PROBLEM STATEMENT:
 * 
 * 
 * Remove ‘A’ if it is present in first 2 characters of the string.
 *	if ‘A’ is present after 2 characters, it should not be removed.
 *	Example : “ABCD” => “BCD”
 *            “AACD” => “CD” 
 *            “BACD” => “BCD”
 *            “BBAA” => “BBAA”       
 *            “AABAA” => “BAA”
 */
public class Removing_A_IfPresentInFisrtTwoPlacesOfaString
{
	public String Removing_A_IfPresentInFisrtTwoPlaces(String string)
	{
		String NewString="";
		if(string.charAt(0)=='A'&&string.charAt(1)=='A')
		{
			NewString=string.substring(2,string.length());
		}
		else if(string.charAt(0)!='A'&&string.charAt(1)=='A')
		{
			
			NewString=string.charAt(0)+string.substring(2,string.length());
		}
		else if(string.charAt(0)=='A'&&string.charAt(1)!='A')
		{
			NewString=string.substring(1,string.length());
		}
		else
			NewString=string;
		return NewString;
			}
}
