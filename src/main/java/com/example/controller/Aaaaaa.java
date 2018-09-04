package com.example.controller;


import com.example.entity.HotEvents;
import com.example.page.PageBean;
import com.example.service.HEService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;


@Controller

public class Aaaaaa {

	@Resource
	private HEService heService;

	@RequestMapping("/search.do")
	public String search(HttpServletRequest request){
		String search = request.getParameter("search");
		String pageNoStr = request.getParameter("pageNo");
		int pageNo = Integer.parseInt(pageNoStr);
		System.out.println(pageNo);
		int countTotal = heService.findCount(search);
		System.out.println(countTotal);

		PageBean p = new PageBean(pageNo,2,countTotal);
		int startRow = (pageNo-1)*2;

		List<HotEvents> list = heService.findAllByOrder(startRow, 2, search);

		request.setAttribute("list", list);
		request.setAttribute("search", search);
		request.setAttribute("p", p);
		return "list";
	}

	@RequestMapping("/comment.do")
	public String comment(HttpServletRequest request){
		String idStr = request.getParameter("id");
		int id = Integer.parseInt(idStr);

		List<HotEvents> list = heService.findByidC(id);
		HotEvents hotEvents= heService.findByidH(id);

		request.setAttribute("details", list);
		request.setAttribute("hotEvents", hotEvents);
		return "details";
	}

	@RequestMapping("/addContent.do")
	public String addContent(HttpServletRequest request){
		String idStr = request.getParameter("id");
		int id = Integer.parseInt(idStr);
		String content = request.getParameter("content");

		int flag = heService.addContent(id, content);


		if(flag>0){
			System.out.println("��ӳɹ�");
			int count = heService.findSearchSum(id);
			count++;
			heService.addSearchSum(id, count);
			List<HotEvents> list = heService.findByidC(id);
			HotEvents hotEvents= heService.findByidH(id);

			request.setAttribute("details", list);
			request.setAttribute("hotEvents", hotEvents);
			return "details";
		}else{
			System.out.println("���ʧ��");
			return "list";
		}
	}
}
	
