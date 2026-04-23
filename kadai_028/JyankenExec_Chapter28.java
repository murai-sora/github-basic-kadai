package kadai_028;

public class JyankenExec_Chapter28 
{

	public static void main(String[] args) {
		JyankenExec_Chapter28 jyanken = new JyankenExec_Chapter28();
		
		String my = Jyanken_Chapter28.getMyChoice();
		String you =Jyanken_Chapter28.getRandom();
		Jyanken_Chapter28.playGame(my, you);
	}

}
