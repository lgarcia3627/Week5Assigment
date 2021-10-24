	interface Logger {
		public void Log(String log);
		public void Error(String error);
	}
	class AsteriskLogger implements Logger {
		
		public void Log(String log) {
		//***message**
			System.out.println("***" +log+ "***");
		}
		public void Error(String error) {
			
			String msg = buildMessage(error);
			String stars = "*".repeat(msg.length());// print asterisks to message length
		    
			System.out.println(stars + "\n" + msg + "\n" + stars);
		}
		private String buildMessage(String error) {
			return "***" + "ERROR:" + error + "***";
		}
	}
	class SpacedLogger implements Logger {	
		private String buildMessage2(String error) {
	
			StringBuilder b = new StringBuilder();
			
			for(int i = 0; i < error.length(); i++) { 
				char ch= error.charAt(i);
				b.append(ch);
				b.append(' ');
				}
			return b.toString();
		}
		public void Log(String log) {
			String var = "";
			var = buildMessage2(log);
			System.out.println(var);
		}
		
		public void Error(String error) {
			String var = "";
			var = buildMessage2(error);
			System.out.println("ERROR:" + var);		
			}
	}
	
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AsteriskLogger object = new AsteriskLogger();
		SpacedLogger space = new SpacedLogger();
		object.Log("Hello");
		object.Error("Hello");
		space.Log("Hello");
		space.Error("Hello");
		
		
	}
}


