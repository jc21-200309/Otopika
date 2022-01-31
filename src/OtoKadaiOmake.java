import jp.jc21.t.yoshizawa.otopika.Otopika;

/**
 *
 */


/**
 * @author @AUTHOR AB2B18
 *
 */
public class OtoKadaiOmake  {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Otopika oto1 = new Otopika();
		Otopika oto2 = new Otopika();
		Otopika oto3 = new Otopika();
		Otopika oto4 = new Otopika();
		oto1.powerOn();
		oto2.powerOn();
		oto3.powerOn();
		oto4.powerOn();
		while(true) {
			oto3.lightAll();
			oto1.lightGreen();
			oto1.sleep();
			oto1.lightYellow();
			oto1.sleep();
			oto1.lightRed();
			oto1.sleep(2);
			oto1.lightOff();
			oto3.lightOff();
			oto4.lightAll();
			oto2.lightGreen();
			oto2.sleep();
			oto2.lightYellow();
			oto2.sleep();
			oto2.lightRed();
			oto2.sleep();
			oto2.lightOff();
			oto2.lightYellow();
			oto2.sleep();
			oto2.lightGreen();
			oto2.sleep();
			oto2.lightOff();
			oto4.lightOff();
			oto3.lightAll();
			oto1.lightRed();
			oto1.sleep();
			oto1.lightYellow();
			oto1.sleep();
		}
	}

}
