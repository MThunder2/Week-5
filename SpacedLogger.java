
public class SpacedLogger implements Logger{
	
	public void Log() {
		System.out.println(w.replaceAll(".(?!$)", "$0 "));
	}
	public void Error() {
		System.out.println("ERROR:" + w.replaceAll(".(?!$)", "$0 "));		
	}
}
