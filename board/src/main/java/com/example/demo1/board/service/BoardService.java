package com.example.demo1.board.service;

import java.util.List;

import com.example.demo1.board.*;

public interface BoardService {

    List<BoardDTO> boardList() throws Exception;

}