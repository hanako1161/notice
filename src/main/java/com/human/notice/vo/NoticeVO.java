package com.human.notice.vo;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.dao.DataAccessException;

import java.util.List;

@Mapper
public interface NoticeVO {

    /**
     * 코드 그룹 관리 조회
     * @return
     * @throws DataAccessException
     */
    public List selectAllCodeTB_NOTICE() throws DataAccessException;
}