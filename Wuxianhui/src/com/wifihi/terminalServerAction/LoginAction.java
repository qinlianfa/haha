package com.wifihi.terminalServerAction;

import javax.servlet.http.HttpServletRequest;

import com.opensymphony.xwork2.ActionSupport;
import com.wifihi.persistance.HibernateSessionFactory;
import com.wifihi.persistance.User;
import com.wifihi.terminalServerService.LoginResultString;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.hibernate.Session;
import org.json.JSONObject;


public class LoginAction extends ActionSupport implements ServletRequestAware{
	private static final long serialVersionUID = 1L;
	private String reqContent = null;
	private LoginResultString result;
	
	@Override
	public void setServletRequest(HttpServletRequest arg0) {   //鑾峰緱杩欐璇锋眰鐨剅equest瀵硅薄
		this.reqContent = GetRequestAction.getJsonContent(arg0);  //static method getJsonContent no new
		System.out.println("reqContent: " + reqContent);
	}
	
	public String userLoginCheck(){
		JSONObject json = new JSONObject(this.reqContent);
		String tel=json.getString("tel");
		String passwd=json.getString("passwd");
	//	String sql = "Select id from t_privateuser where phonenumber="+"'"+tel+"'"+"'"+passwd+"'";
		User user = new User(); 
		Session session = HibernateSessionFactory.getSession();
		result = new LoginResultString();
		try{
				session.beginTransaction();
				//姝ゅ浣跨敤HQL 浣嗚繕鍙互鏈夊皝瑁呯殑鏇村ソ鐨勬柟娉�
				user = (User)session.createQuery("from user u where u.phonenumber ='"+tel+"'");
				if(user.getPassword().equals(passwd)){
					result.setResult(user.getUserId().toString());
				}
				else if(!user.getPassword().equals(passwd)){
					result.setResult("err10002");
				}
				else{
					result.setResult("err10003");
				}
		}catch(Exception e){
			session.getTransaction().rollback();
		}finally{
			session.close();
		}
		
		System.out.println(result.getResult());
		return SUCCESS;
	}
	public LoginResultString getResult() {
		return result;
	}

	public void setResult(LoginResultString result) {
		this.result = result;
	}
	
}
