package com.corona.serviceImpl;

import java.util.List;

import com.corona.mapper.NoticeMapper;
import com.corona.service.NoticeService;
import com.corona.vo.NoticeVO;

public class NoticeServiceImpl implements NoticeService{
		
	private NoticeMapper noticeMapper;

	public void setNoticeMapper(NoticeMapper noticeMapper) {
		this.noticeMapper = noticeMapper;
	}

	@Override
	public List<NoticeVO> findNoticeList() {
		return noticeMapper.selectNoticeList();
	}
	
	

}
