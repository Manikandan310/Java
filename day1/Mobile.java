package week1.day1;

public class Mobile {
	public void sendMessage() {
		System.out.println("send the Message to anyone");
	}
	public void shareDocument() {
		System.out.println("share the Document");
	}
	public void Call() {
		System.out.println("make a Call");
	}
	public static void main(String[] args) {
		Mobile Oppo=new Mobile();
		Oppo.sendMessage();
		Oppo.shareDocument();
		Oppo.Call();
	}
}
