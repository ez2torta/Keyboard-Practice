import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;
import java.util.Random;

// Este Code Outputea Strings en el Teclado que son para un 2P Kim pegándole a un mono mirando hacia la izquierda en Training.

// Porfavor Utilizar la configuración en reclado que viene abajo (es fácil de leer :s)

// Importante: Una vez que Kim cambie de lado, es necesario resetear el practice, recomiendo utilizar el botón select para Reiniciar : )
// Usted tiene 2 segundos para cambiar la ventana de Java al KOF13SE previamente configurado (Practice, Dummy Player, etc)

// Cualquier consulta, INBOCS (@Tortiiilla)

public class Keyboard {
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
	r.keyPress(Right);
	TimeUnit.MILLISECONDS.sleep(Frames_Milli(13));
	r.keyRelease(Right);
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

public static void Dash_Feint() throws InterruptedException, AWTException{
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
	r.keyPress(Down);
	r.keyPress(Button_B);
	TimeUnit.MILLISECONDS.sleep(Frames_Milli(13));
	r.keyRelease(Down);
	r.keyRelease(Button_B);
	TimeUnit.MILLISECONDS.sleep(Frames_Milli(2));
	r.keyPress(Down);
	r.keyPress(Button_B);
	TimeUnit.MILLISECONDS.sleep(Frames_Milli(13));
	r.keyRelease(Down);
	r.keyRelease(Button_B);
	TimeUnit.MILLISECONDS.sleep(Frames_Milli(2));
	r.keyPress(Button_B);
	TimeUnit.MILLISECONDS.sleep(Frames_Milli(13));
	r.keyRelease(Button_B);
	TimeUnit.MILLISECONDS.sleep(Frames_Milli(2));
}

public static void Walk_Agarre() throws InterruptedException, AWTException{
	Robot r = new Robot();
	//dash
	r.keyPress(Right);
	TimeUnit.MILLISECONDS.sleep(Frames_Milli(20));
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
	TimeUnit.MILLISECONDS.sleep(Frames_Milli(13));
	r.keyPress(Button_D);
	TimeUnit.MILLISECONDS.sleep(Frames_Milli(13));
	r.keyRelease(Left);
	r.keyRelease(Button_D);
	TimeUnit.MILLISECONDS.sleep(Frames_Milli(2));
}

public static void BS_EXMamil() throws InterruptedException, AWTException{
	Robot r = new Robot();
	r.keyPress(Down);
	TimeUnit.MILLISECONDS.sleep(Frames_Milli(1));
	r.keyPress(Left);
	TimeUnit.MILLISECONDS.sleep(Frames_Milli(1));
	r.keyRelease(Down);
	TimeUnit.MILLISECONDS.sleep(Frames_Milli(1));
	r.keyRelease(Left);
	TimeUnit.MILLISECONDS.sleep(Frames_Milli(5));
	r.keyPress(Left);
	TimeUnit.MILLISECONDS.sleep(Frames_Milli(2));
	r.keyPress(Button_B);
	r.keyPress(Button_D);
	TimeUnit.MILLISECONDS.sleep(Frames_Milli(13));
	r.keyRelease(Left);
	r.keyRelease(Button_B);
	r.keyRelease(Button_D);
	TimeUnit.MILLISECONDS.sleep(Frames_Milli(2));
}

public static void EX_Mamil() throws InterruptedException, AWTException{
	Robot r = new Robot();
	r.keyPress(Down);
	TimeUnit.MILLISECONDS.sleep(Frames_Milli(1));
	r.keyPress(Left);
	TimeUnit.MILLISECONDS.sleep(Frames_Milli(1));
	r.keyRelease(Down);
	TimeUnit.MILLISECONDS.sleep(Frames_Milli(1));
	r.keyPress(Button_B);
	r.keyPress(Button_D);
	TimeUnit.MILLISECONDS.sleep(Frames_Milli(13));
	r.keyRelease(Left);
	r.keyRelease(Button_B);
	r.keyRelease(Button_D);
	TimeUnit.MILLISECONDS.sleep(Frames_Milli(2));
}


static public void main(String args[]) throws AWTException, InterruptedException{
	    TimeUnit.SECONDS.sleep(2); // para cambiar la ventana
	    Walk(60);
		Random randomGenerator = new Random();
		while(true){
		      int randomInt = randomGenerator.nextInt(10);
		      switch(randomInt){
			      case 0: Overhead(); break;
			      case 1: Walk(15);	break;
			      case 2: Overhead(); break;
			      case 3: Crouch_B_String(); Crouch_B_String(); Stand_B_String(); break;
			      case 4: Dash_Agarre(); break;
			      case 5: Crouch_B_String(); Stand_A_String(); Walk_Agarre(); break;
			      case 6: Far_D_String(); break;
			      case 7: EX_Mamil(); break;
			      case 8: BS_EXMamil(); break;
			      case 9: Dash_Feint(); break;
		      }
			Walk(15);
		}
	}
}
