package com.wifihi.terminalServerAction;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import javax.servlet.http.HttpServletRequest;

public class GetRequestAction {

		public static String getJsonContent(HttpServletRequest request){
			StringBuffer result = new StringBuffer(""); //�̰߳�ȫ ����string ��
//			System.out.println("res: " + result);
			try{
				BufferedReader br = new BufferedReader(new InputStreamReader(request.getInputStream(),"utf-8"));
				String line = null;
				while((line = br.readLine()) != null){
					result.append(line);
				}
			}catch(Exception e){
				e.printStackTrace();
			}
//		System.out.println("result: " + result);
			return result.toString();
		}
	
}
