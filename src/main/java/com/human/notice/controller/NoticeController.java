package com.human.notice.controller;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

public interface NoticeController {

    public ModelAndView TB_NOTICE(HttpServletRequest reqeust, HttpServletResponse response) throws Exception;

    @GetMapping("/notice/notice_list.jsp.do")
    ModelAndView listNoticeDAO(HttpServletRequest request, HttpServletResponse response) throws Exception;
}