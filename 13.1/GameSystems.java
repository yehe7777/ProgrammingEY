public class GameSystems
{
	public String platform;
	public int serialNum;
	
	public GameSystems(){
		this.platform = "";
		this.serialNum = (int)(Math.random()*10000000)+1;
	}
	
	public GameSystems(String p){
		this.platform = p;
		this.serialNum = (int)(Math.random()*10000000)+1;
	}
	
	public String getPlatform(){
		return platform;
	}
	
	public int getSerialNum(){
		return serialNum;
	}
}