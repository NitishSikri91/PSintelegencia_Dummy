package APIwithMaven.PSintelegencia_Dummy;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Random;
import org.apache.commons.lang3.RandomStringUtils;


public class inputValues {

	//Method to generate the random number between the limit 1 to 99 
	static int RandomNumberGen()
	{
	Random randomnumbergen = new Random();
	int randomint = randomnumbergen.nextInt(99)+1;
		//System.out.println("Random number is "+ randomint);
		return randomint;
	}
	
	//Method to generate the Admit date based on the current date and adding any day till 99 days in future
		public static String AdmitDate()
		{
		SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd");
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DAY_OF_MONTH, RandomNumberGen());
		String New_date = dateformat.format(cal.getTime());
		//System.out.println(New_date);
		return New_date;
		}

	//Method to return the DOB based on the current date ensuring age is greater than 65 years 
		public static String GenerateDOB()
		{
		SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd");
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DAY_OF_MONTH, -23725);
		cal.add(Calendar.DAY_OF_MONTH, -RandomNumberGen());
				String New_date = dateformat.format(cal.getTime());
		//System.out.println(New_date);
		return New_date;
		}
		
	//Method to generate PI of length 10
		public static String PIGenerator()
		{
		String S = RandomStringUtils.randomAlphabetic(10).toLowerCase();
		//System.out.println(S);
		return S;
		}
	//Method to generate Patient ID with appended date time stamp
		public static String PID()
		{
			SimpleDateFormat dateformat = new SimpleDateFormat("yyyyMMddhhmmss");
			Calendar cal = Calendar.getInstance();
			String S3 = dateformat.format(cal.getTime());
			String S2 = RandomStringUtils.randomAlphanumeric(20).toLowerCase();
			String S1 = "PID000";
			
			String PID = S1+S2+S3;
			
			return PID;
		}

}
