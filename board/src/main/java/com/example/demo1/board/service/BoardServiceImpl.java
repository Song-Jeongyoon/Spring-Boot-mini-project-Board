package com.example.demo1.board.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo1.board.*;
import com.example.demo1.board.mapper.BoardMapper;

@Service // 서비스임을 선언
public class BoardServiceImpl implements BoardService{

	@Autowired // Mapper와 연결
	private BoardMapper boardMapper;

	@Override
	public List<BoardDTO> boardList() throws Exception {
		return boardMapper.boardList();
	}
}