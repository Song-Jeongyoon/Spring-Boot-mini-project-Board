package com.example.board.service;

import java.util.List;
import com.example.board.BoardDTO;

public interface BoardService {

	// 게시물 목록
	List<BoardDTO> boardList() throws Exception;
	
	// 게시물 목록 + 검색
	List<BoardDTO> boardListSearch(String searchType, String keyword) throws Exception;
    
	// 게시물 상세 조회
	BoardDTO boardDetail(int pIdx) throws Exception;
   
}