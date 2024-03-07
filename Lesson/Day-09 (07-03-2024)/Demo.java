import com.algo.Stretcher;

/*
18: Write a program to input a text, an integer and a character from the keyboard
    and stretch the string to the number of character mentioned in the integer by
    padding it with the character?
    Example:    Enter a text:           Hello World
                Enter the length:       60
                Enter the character:    -

    IIG Varsity-------------------------------------------------
    -------------------------IIG Varsity------------------------
    -------------------------------------------------IIG Varsity

 */

public class Demo {
	public static void main(String[] args) {
		Stretcher s = new Stretcher();
		System.out.println(s.padL("Milan Das", 50, '.'));
		System.out.println(s.padC("Milan Das", 50, '.'));
		System.out.println(s.padR("Milan Das", 50, '.'));
	}
}
