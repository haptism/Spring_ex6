package com.iu.board.qna;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;

import com.iu.board.BoardDAO;
import com.iu.board.BoardDTO;
import com.iu.util.PageMaker;

public class QnaDAO implements BoardDAO {

	@Inject
	private SqlSession sqlSession;
	
	@Override
	public int getTotalCount(PageMaker pageMaker) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int setWrite(BoardDTO boardDTO) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int setDelete(int num) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int setUpdate(BoardDTO boardDTO) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public BoardDTO getSelect(int num) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<BoardDTO> getList(PageMaker pageMaker) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
