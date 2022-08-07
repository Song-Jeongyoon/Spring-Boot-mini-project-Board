package com.example.demo1.board.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo1.board.*;

@Mapper
// 데이터 접근 객체인 DAO와 같은 역할. 마이바티스에서는 DAO보다 SqlSessionDaoSupport나 SqlSessionTemplate를 사용하기를 권장함.
// 매퍼를 사용하면 일일이 DAO를 만들지 않고, 인터페이스만을 이용해 편하게 개발이 가능
public interface BoardMapper {
	
	// 게시글 개수
	public int boardCount() throws Exception;
	
	// 게시글 목록
	public List<BoardDTO> boardList() throws Exception;
	
	// 게시글 상세
	public BoardDTO boardDetail(int bno) throws Exception;
	
	// 게시글 수정
	public void boardUpdate(BoardDTO board) throws Exception;
	
}