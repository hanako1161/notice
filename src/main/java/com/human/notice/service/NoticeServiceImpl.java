package com.human.notice.service;

import com.human.notice.repository.NoticeDAO;  // NoticeDAO import
import com.human.notice.vo.NoticeVO;  // NoticeVO import (DTO)
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class NoticeServiceImpl {

    @Autowired
    private NoticeDAO noticeDAO;

    public List<NoticeVO> listNoticeDAO() throws Exception {
        List noticeslist = null;
        noticeslist = noticeDAO.selectAllCodeGroupList();
        return noticeslist;
    }
}