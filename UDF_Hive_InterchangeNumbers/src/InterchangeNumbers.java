import org.apache.hadoop.hive.ql.exec.UDF;

public class InterchangeNumbers extends UDF 
{
	public static void evaluate(int a, int b) throws Exception
	{
		int value1 = a;
		int value2 = b;
		int value3;
		value3 = value1;
		value1 = value2;
		value2 = value3;
		System.out.println("Interchanged Numbers are:");
		System.out.println("Value1: "+value1);
		System.out.println("Value2: "+value2);		
	}
	
/*	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		evaluate(2,3);	
		}
*/
}
