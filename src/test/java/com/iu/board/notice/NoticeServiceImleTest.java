package com.iu.board.notice;

import static org.junit.Assert.*;

import java.util.List;

import javax.inject.Inject;

import org.junit.Test;

import com.iu.board.BoardDTO;
import com.iu.board.qna.QnaDAO;
import com.iu.s6.AbtractTest;
import com.iu.util.PageMaker;

public class NoticeServiceImleTest extends AbtractTest {

	@Inject
	private NoticeService noticeService;
	
	@Inject
	private QnaDAO qnaDAO;
	
	@Test
	public void qnaTest() {
		assertNotNull(qnaDAO);
	}
	
	//@Test
	public void test() throws Exception {
		PageMaker pageMaker= new PageMaker();
		pageMaker.setCurPage(1);
		
		
		 List<BoardDTO>  ar = noticeService.getList(pageMaker);
		 assertEquals(10, ar.size());
	}

}
