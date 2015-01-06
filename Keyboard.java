import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;
import java.util.Random;



public class Keyboard {
//static int Up = KeyEvent.VK_5;
//static int Down = KeyEvent.VK_6;
//static int Left = KeyEvent.VK_7;
//static int Right = KeyEvent.VK_8;
//static int Button_A = KeyEvent.VK_1; // the A key;
//static int Button_B = KeyEvent.VK_2; // 2 key
//static int Button_C= KeyEvent.VK_3; // the A key;
//static int Button_D = KeyEvent.VK_4; // 2 key
	static int Up = KeyEvent.VK_H;
	static int Down = KeyEvent.VK_N;
	static int Left = KeyEvent.VK_M;
	static int Right = KeyEvent.VK_B;
	static int Button_A = KeyEvent.VK_A; // the A key;
	static int Button_B = KeyEvent.VK_D; // 2 key
	static int Button_C= KeyEvent.VK_S; // the A key;
	static int Button_D = KeyEvent.VK_F; // 2 key
	
static int Frames_Milli(int frames){
	return ((int)frames*17);
}
public static void Overhead() throws InterruptedException, AWTException{
	Robot r = new Robot();
	r.keyPress(Right);
	r.keyPress(Button_B);
	TimeUnit.MILLISECONDS.sleep(Frames_Milli(30));
	r.keyRelease(Right);
	r.keyRelease(Button_B);
	TimeUnit.MILLISECONDS.sleep(Frames_Milli(2));
}

public static void Walk(int f) throws InterruptedException, AWTException{
	Robot r = new Robot();
	r.keyPress(Right);
	TimeUnit.MILLISECONDS.sleep(Frames_Milli(f));
	r.keyRelease(Right);
	TimeUnit.MILLISECONDS.sleep(Frames_Milli(2));
}

public static void Crouch_B_String() throws InterruptedException, AWTException{
	Robot r = new Robot();
	r.keyPress(Down);
	r.keyPress(Button_B);
	TimeUnit.MILLISECONDS.sleep(Frames_Milli(13));
	r.keyRelease(Down);
	r.keyRelease(Button_B);
	TimeUnit.MILLISECONDS.sleep(Frames_Milli(2));
}

public static void Crouch_A_String() throws InterruptedException, AWTException{
	Robot r = new Robot();
	r.keyPress(Down);
	r.keyPress(Button_A);
	TimeUnit.MILLISECONDS.sleep(Frames_Milli(13));
	r.keyRelease(Down);
	r.keyRelease(Button_A);
	TimeUnit.MILLISECONDS.sleep(Frames_Milli(2));
}

public static void Stand_B_String() throws InterruptedException, AWTException{
	Robot r = new Robot();
	r.keyPress(Button_B);
	TimeUnit.MILLISECONDS.sleep(Frames_Milli(13));
	r.keyRelease(Button_B);
	TimeUnit.MILLISECONDS.sleep(Frames_Milli(2));
}

public static void Stand_A_String() throws InterruptedException, AWTException{
	Robot r = new Robot();
	r.keyPress(Button_A);
	TimeUnit.MILLISECONDS.sleep(Frames_Milli(13));
	r.keyRelease(Button_A);
	TimeUnit.MILLISECONDS.sleep(Frames_Milli(2));
}

public static void Dash_Agarre() throws InterruptedException, AWTException{
	Robot r = new Robot();
	//dash
	r.keyPress(Right);
	TimeUnit.MILLISECONDS.sleep(Frames_Milli(2));
	r.keyRelease(Right);
	TimeUnit.MILLISECONDS.sleep(Frames_Milli(2));
	r.keyPress(Right);
	TimeUnit.MILLISECONDS.sleep(Frames_Milli(35));
	r.keyRelease(Right);
	//agarre?
	TimeUnit.MILLISECONDS.sleep(Frames_Milli(2));
	r.keyPress(Left);
	r.keyPress(Button_C);
	TimeUnit.MILLISECONDS.sleep(Frames_Milli(5));
	r.keyRelease(Left);
	r.keyRelease(Button_C);
	TimeUnit.MILLISECONDS.sleep(Frames_Milli(13));
}

public static void Far_D_String() throws InterruptedException, AWTException{
	Robot r = new Robot();
	r.keyPress(Left);
	r.keyPress(Button_D);
	TimeUnit.MILLISECONDS.sleep(Frames_Milli(13));
	r.keyRelease(Left);
	r.keyRelease(Button_D);
	TimeUnit.MILLISECONDS.sleep(Frames_Milli(2));
}

static public void main(String args[]) throws AWTException, InterruptedException{
	    TimeUnit.SECONDS.sleep(2); // para cambiar la ventana
	    Walk(60);
		Random randomGenerator = new Random();
		while(true){
		      int randomInt = randomGenerator.nextInt(7);
		      switch(randomInt){
		      
			      case 0 : Overhead(); break;
			      case 1: Walk(15);	break;
			      case 2: Overhead(); break;
			      case 3: Crouch_B_String(); Crouch_B_String(); Stand_B_String(); break;
			      case 4: Dash_Agarre(); break;
			      case 5: Crouch_B_String(); Stand_A_String(); break;
			      case 6: Far_D_String(); break;
		      }
			Walk(15);
		}
	}
}
