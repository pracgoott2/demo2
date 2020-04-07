package com.corona.vo;

import java.util.Date;

public class NoticeVO {
	public int getNoticeNo() {
		return noticeNo;
	}
	public void setNoticeNo(int noticeNo) {
		this.noticeNo = noticeNo;
	}
	public String getNoticeTitle() {
		return noticeTitle;
	}
	public void setNoticeTitle(String noticeTitle) {
		this.noticeTitle = noticeTitle;
	}
	public String getNoticeContent() {
		return noticeContent;
	}
	public void setNoticeContent(String noticeContent) {
		this.noticeContent = noticeContent;
	}
	public Date getNoticeRegDate() {
		return noticeRegDate;
	}
	public void setNoticeRegDate(Date noticeRegDate) {
		this.noticeRegDate = noticeRegDate;
	}
	public int getNoticeCount() {
		return noticeCount;
	}
	public void setNoticeCount(int noticeCount) {
		this.noticeCount = noticeCount;
	}
	public String getNoticeWriter() {
		return noticeWriter;
	}
	public void setNoticeWriter(String noticeWriter) {
		this.noticeWriter = noticeWriter;
	}
	public boolean isNoticeDeleted() {
		return noticeDeleted;
	}
	public void setNoticedeleted(boolean noticeDeleted) {
		this.noticeDeleted = noticeDeleted;
	}
	public int getMemberNo() {
		return memberNo;
	}
	public void setMemberNo(int memberNo) {
		this.memberNo = memberNo;
	}
	private int noticeNo;
	private String noticeTitle;
	private String noticeContent;
	private Date noticeRegDate;
	private int noticeCount;
	private String noticeWriter;
	private boolean noticeDeleted;
	private int memberNo;
}
