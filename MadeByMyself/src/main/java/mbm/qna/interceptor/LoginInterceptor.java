package mbm.qna.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class LoginInterceptor extends HandlerInterceptorAdapter {

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		HttpSession session = request.getSession();
		if(session.getAttribute("login") != null) {
			System.out.println("clear login data before");
			session.removeAttribute("login");
		}
		return true;
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		HttpSession session = request.getSession();
		Object userVO = modelAndView.getModelMap().get("userVO");
		
		if(userVO != null) {
			System.out.println("new login Success....");
			session.setAttribute("login", userVO);
			Object dest = session.getAttribute("dest");
			response.sendRedirect(dest != null ? (String)dest : "/qna/index");
		}
	}
	

}
