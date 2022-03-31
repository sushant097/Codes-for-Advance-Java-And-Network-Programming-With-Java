package urlclass;

import java.io.UnsupportedEncodingException;
import java.net.*;


public class URLDecoderString {

	public static void main(String[] args) {
		String input = "https://www.google.com/" +
				 "search?hl=en&as_q=Java&as_epq=I%2FO";
				String output;
				try {
					output = URLDecoder.decode(input, "UTF-8");
					System.out.println(output);

				} catch (UnsupportedEncodingException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

	}

}
