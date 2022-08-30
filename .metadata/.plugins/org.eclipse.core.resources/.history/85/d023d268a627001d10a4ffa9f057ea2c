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
	public List<BoardDTO> boardList() throws Exception {
		return boardMapper.boardList();
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
	public void boardInsert(BoardDTO boardDto) throws Exception {
		boardMapper.boardInsert(boardDto);		
	}
	
	// 게시물 수정
	@Override
	public void boardUpdate(BoardDTO reqDto) throws Exception {
		boardMapper.boardUpdate(reqDto);		
	}
	
	// 게시물 삭제
	@Override
	public void boardDelete(int pIdx) throws Exception {
		boardMapper.boardDelete(pIdx);		
	}
}

