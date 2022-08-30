package com.example.board.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.board.BoardDTO;
import com.example.board.mapper.BoardMapper;



@Service       // 서비스임을 선언
public class BoardServiceImpl implements BoardService{
	BoardDTO dto; // 데이터 전달 확인용

	@Autowired // Mapper와 연결
	private BoardMapper boardMapper;
	


	// 게시물 목록
	@Override
	public List<BoardDTO> boardList(int pageStart, int pageSize) throws Exception {
		return boardMapper.boardList(pageStart, pageSize);
	}
		
	// 게시물 목록 + 검색
	@Override
	public List<BoardDTO> boardListSearch (String searchType, String keyword) throws Exception {
		return boardMapper.boardListSearch(searchType, keyword);
	}
	
	// 게시물 상세 조회
	@Override
	public BoardDTO boardDetail(int pIdx) throws Exception {
		return boardMapper.boardDetail(pIdx);
	}
	
	// 게시물 등록
	@Override
	public int boardInsert(BoardDTO boardDto) throws Exception {
		return boardMapper.boardInsert(boardDto);		
	}
	
	// 게시물 수정
	@Override
	public int boardUpdate(BoardDTO reqDto) throws Exception {
		return boardMapper.boardUpdate(reqDto);		
	}
	
	// 게시물 삭제
	@Override
	public int boardDelete(int pIdx) throws Exception {
		return boardMapper.boardDelete(pIdx);		
	}
	
	// 게시물 총 개수
	@Override
	public int count() throws Exception {
		return boardMapper.count();
	}
}

