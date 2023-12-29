package com.oops;

class youtube{
	public void Mrgulua() {
		System.out.println("Mr gulua comedy reached 1m subscriber in youtube");
	}
}
class Instagram extends youtube{
	public void viratkohli() {
		System.out.println("250m + follower in instagram -the king kohli");
	}

	public void Elonmusk() {
		// TODO Auto-generated method stub
		
	}
}
class twitter extends youtube{
	public void Elonmusk()
	{
		System.out.println("the ceo of twitter is elonmusk");
	}
}
public class hiraricalInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Instagram tapa=new Instagram();
//         twitter tapu=new twitter();
         tapa.Mrgulua();
         tapa.viratkohli();
         tapa.Elonmusk();
	}

}
