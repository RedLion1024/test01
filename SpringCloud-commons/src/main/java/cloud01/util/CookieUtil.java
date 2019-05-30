package cloud01.util;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CookieUtil {
	
	//�����趨Cookie�ķ���
	public static void setCookie(HttpServletResponse response
			,String name,String value,String domain ,String path,int maxAge) {
		
		Cookie cookie = new Cookie(name,value);
		if(domain!=null) {
			cookie.setDomain(domain);
		}
		
		cookie.setMaxAge(maxAge);
		cookie.setPath(path);
		
		response.addCookie(cookie);
	}
	
	public static void setCookie(HttpServletResponse response, String name, String value, int maxAge) {
		setCookie(response, name, value, null, "/", maxAge);
	}
	public static void setCookie(HttpServletResponse response, String name, String value) {
		setCookie(response, name, value, null, "/", 3600);
	}
	public static void setCookie(HttpServletResponse response, String name) {
		setCookie(response, name, "", null, "/", 3600);
	}

	
	public static void getCookie(HttpServletRequest request,String name ) {
		String value =null;
		Cookie[] cookies = request.getCookies();
		if(cookies!=null) {
			for (Cookie cookie : cookies) {
				if(cookie.getName().equals(name)) {
					value=cookie.getValue();
				}
				
			}
		}
		
	}
	
	//�Ƴ�cookie=����ͬ��������Ϊ0��ͬһ�������µ� cookie
	public static void removeCookie(HttpServletResponse response,String name ,String domain ,String path) {
		setCookie(response,name,"",domain,path,0);
	}
	
}