package org.paldo.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.paldo.domain.ShopAdminVO;
import org.paldo.service.AdminService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@Controller
@RequestMapping("/admin")
@Log4j
@AllArgsConstructor
public class AdminController {

	 private AdminService adminservcie;
	 
	 /* 관리자 메인 페이지 이동 */
	    @RequestMapping(value="main", method = RequestMethod.GET)
	    public void adminMainGET() throws Exception{
	        
	        log.info("관리자 페이지 이동");
	        
	    }
//	    /* 관리자 로그인 페이지*/
//	    @RequestMapping(value="login",method=RequestMethod.GET)
//		public void loginPageGET() {
//
//			log.info("관리자 로그인 페이지로");
//
//		}
	    
	    /*로그아웃 */
	    @RequestMapping(value="logout.do",method=RequestMethod.GET)
	    @ResponseBody
	    public void logoutGet() throws Exception{
	    	log.info("로그아웃");
	    
	    }
	    
//	    /* 관리자 로그인*/
//	    @RequestMapping(value="login.do",method=RequestMethod.POST)
//		public String loginPOST(HttpServletRequest request, ShopAdminVO admin, RedirectAttributes rttr) throws Exception {
//			
//			HttpSession session = request.getSession();
//			ShopAdminVO sAvo = adminservcie.adminLogin(admin);
//					
//			if(sAvo == null) {                                // 일치하지 않는 아이디, 비밀번호 입력 경우
//				int result = 0;
//				rttr.addFlashAttribute("result", result);
//				return "redirect:/admin/login";
//			   }
//				session.setAttribute("admin", sAvo);             // 일치하는 아이디, 비밀번호 경우 (로그인 성공)
//				return "redirect:/admin/main";
//			
//		}
	    /* 비동기방식 로그아웃 메서드 */
	    @RequestMapping(value="logout.do", method=RequestMethod.POST)
	    @ResponseBody
	    public String logoutPOST(HttpServletRequest request, RedirectAttributes rttr) throws Exception{
	        
	        log.info("비동기 로그아웃 메서드 진입");
	        
	        HttpSession session = request.getSession();
	        
	        session.invalidate();
	        return "redirect:/main";
	    }
}
