package urlConnection;

import java.io.*;
import java.net.*;
public class DownloadWebPageUrlConnection {
	public static void main(String[] args) {
		String url = "https://www.oreilly.com";

		try {
			URL u = new URL(url);
			HttpURLConnection uc = (HttpURLConnection) u.openConnection();
			try (InputStream raw = uc.getInputStream()) {
				printFromStream(raw);
			} catch (IOException ex) {
				printFromStream(uc.getErrorStream());
			}
		} catch (MalformedURLException ex) {
			System.err.println(url + " is not a parseable URL");
		} catch (IOException ex) {
			System.err.println(ex);
		}
	}
	private static void printFromStream(InputStream raw) throws IOException {
		try (InputStream buffer = new BufferedInputStream(raw)) {
			Reader reader = new InputStreamReader(buffer);
			int c;
			while ((c = reader.read()) != -1) {
				System.out.print((char) c);
			}
		}
	}
}
