package com.example.board.service;

import java.util.List;

import com.example.board.BoardDTO;

public interface BoardService {

    List<BoardDTO> boardList() throws Exception;

}