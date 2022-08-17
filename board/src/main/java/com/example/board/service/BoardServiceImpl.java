package com.example.board.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.board.BoardDTO;
import com.example.board.mapper.BoardMapper;


@Service       // 서비스임을 선언
public class BoardServiceImpl implements BoardService{

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
}

