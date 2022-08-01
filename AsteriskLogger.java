
public class AsteriskLogger implements Logger{
	
	public void Log() {
		System.out.println("***" + w + "***");
	}
	public void Error() {
		System.out.println("****************");
		System.out.println("***Error:"+ w +"***");
		System.out.println("****************");
	}
}
