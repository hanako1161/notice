package com.human.notice.controller;

import com.human.notice.service.NoticeService;
import com.human.notice.vo.NoticeVO;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller("noticeController")
public class NoticeControllerImpl implements NoticeController {

    // NoticeService 주입 (TB_NOTICE 데이터 처리)
    @Autowired
    private NoticeService noticeService;

    @Override
    public ModelAndView TB_NOTICE(HttpServletRequest reqeust, HttpServletResponse response) throws Exception {
        return null;
    }

    @Override
    @GetMapping("/code/listCodeGroup.do")
    public ModelAndView listNoticeDAO(HttpServletRequest request, HttpServletResponse response) throws Exception {


        List<NoticeVO> tbNoticeList = noticeService.listNoticeDAO();
        ModelAndView mav = new ModelAndView("/code/listCodeGroup");
        mav.addObject("tbNoticeList", tbNoticeList);
        return mav;
    }
}