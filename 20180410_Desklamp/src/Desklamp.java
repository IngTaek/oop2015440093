
public class Desklamp {
	
	// Field
	private boolean isOn;
	
	// Method
	public void turnOn() {
		this.isOn = true;
	}
	
	public void turnOff() {
		this.isOn = false;
	}
	
	public String toString() {
		if(isOn)
		{
			return "�����ֽ��ϴ�.";
		}
		else
		{
			return "�����ֽ��ϴ�.";
		}
	}
}