
public class StringTypeTest {
	public static void main(String[] args) {
		StringBuffer strBuffer = new StringBuffer();  
        strBuffer.append("StringBuffer");  
        strBuffer.append(" ");  
        strBuffer.append("Test");  
        System.out.println(strBuffer.toString());  
          
        StringBuilder strBuilder = new StringBuilder();  
        strBuilder.append("StringBuffer");  
        strBuilder.append(" ");  
        strBuilder.append("Test");  
        System.out.println(strBuilder.toString());  
	}
}
