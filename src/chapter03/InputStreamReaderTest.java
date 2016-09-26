package chapter03;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReaderTest {

	public static void main(String[] args) {
		InputStreamReader isr = null;

		try {
			// 기반스트림(byte 단위 기반 스트림)
			FileInputStream fis = new FileInputStream("ms949.txt");

			// 보조스트림 (ms949 -> utf8 )
			isr = new InputStreamReader(fis, "MS949");

			int data = -1;
			while ((data = isr.read()) != -1) {
				System.out.println((char) data);
			}

		} catch (IOException ex) {
			System.out.println("error:" + ex);
		} finally {
			try {
				if (isr != null) {
					isr.close();
				}
			} catch (IOException ex) {
				System.out.println("error:" + ex);
			}
		}
	}
}





