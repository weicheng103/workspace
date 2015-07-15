package ch01;

import java.io.*;
import java.net.URL;
public class Sample {
	private static HttpClient httpClient = new HttpClient();
	
	static{
		httpClient.getHostConfiguration().setProxy("172.17.18.84", 8080);
	}
	
	public static boolean downloadPage(String path) throws HttpException, IOException{
		InputStream input = null;
		OutputStream output = null;
		
		PostMethod postMethod = new PostMethod(path);
		
			NameValuePair[] postData = new NameValuePair[2];
			postData[0] = new
					Name
	}
}
