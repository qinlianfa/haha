package com.wifihi.terminalServerAction;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.hibernate.Session;
import org.json.JSONObject;

import com.opensymphony.xwork2.ActionSupport;
import com.wifihi.persistance.HibernateSessionFactory;
import com.wifihi.persistance.User;
import com.wifihi.terminalServerService.IDString;



public class RegisterAction extends ActionSupport implements ServletRequestAware{
	private static final long serialVersionUID = 1L;
	private String reqContent = null;
	private IDString id;


	public IDString getId() {
		return id;
	}

	public void setId(IDString id) {
		this.id = id;
	}

	@Override
	public void setServletRequest(HttpServletRequest arg0) {   //获得这次请求的request对象
		this.reqContent = GetRequestAction.getJsonContent(arg0);  //static method getJsonContent no new
		System.out.println("reqContent: " + reqContent);
	}
	
	public String registerPrivateUser() throws ParseException{
		JSONObject json = new JSONObject(this.reqContent);
		String passwd = json.getString("passwd");
		String telNum = json.getString("tel");
		User user = new User();
		user.setPassword(passwd);
		user.setPhoneNumber(telNum);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		user.setRegistrateDate(sdf.parse(sdf.format(new Date())));
		id= new IDString();
		Session session = HibernateSessionFactory.getSession();
		try{
			session.beginTransaction();
			session.save(user);	
			id.setId(user.getUserId().toString());
		}catch(Exception e){
			session.getTransaction().rollback();
		}
		finally{
			session.close();
		}

		
		return SUCCESS;
	}
	
}
