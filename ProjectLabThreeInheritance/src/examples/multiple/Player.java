package examples.multiple;
public class Player extends CharacterModel implements Theme{
	@Override
	public String getTheme(String pref) {
		// from 'Theme' interface
		return pref;
	}
	// note: to implement multiple inheritance it is important that there must be
	// an interface but abstract class is not mandatory
	@Override
	public String showCharacter(String gender) {
		// from 'CharacterModel' abstract class
		if(gender.equals("male")) {
			return "Male Character";
		} else if (gender.equals("female")) {
			return "Female Character";
		}
		return "Please select your character";
	}
	
	public static void main(String args[]) {
		Player p = new Player();
		System.out.println(p.getTheme("Dark Mode"));
		System.out.println(p.showCharacter("male"));
	}
}
