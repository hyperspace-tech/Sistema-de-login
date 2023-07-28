import java.util.HashMap;

public class IDandPassword {
	
	HashMap<String,String> logininfo = new HashMap<String,String>();

	IDandPassword(){
		
		logininfo.put("user","java");
		logininfo.put("user 1","PASSWORD");
		logininfo.put("user 2","abc123");
		
	}
	protected HashMap getlogininfo(){
		return logininfo;
	}
}
