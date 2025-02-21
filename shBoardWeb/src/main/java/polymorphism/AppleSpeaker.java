package polymorphism;

import org.springframework.stereotype.Component;

//@Component("apple")
public class AppleSpeaker implements Speaker {
	public AppleSpeaker() {
		System.out.println("===> AppleSpeaker 按眉 积己");
	}

	@Override
	public void volumeUp() {
		System.out.println("AppleSpeaker --- 家府 棵赴促.");
	}

	@Override
	public void volumeDown() {
		System.out.println("AppleSpeaker --- 家府 郴赴促.");
	}
	

}
