package learning.spring.annotations;

public class SadFortuneService implements FortuneService{

	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return "It's sad day. :(";
	}

}
