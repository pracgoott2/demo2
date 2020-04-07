package com.corona.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.corona.vo.NoticeVO;

@Mapper
public interface NoticeMapper {

	List<NoticeVO> selectNoticeList();

}
