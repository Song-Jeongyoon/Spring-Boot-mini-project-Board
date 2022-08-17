package com.example.board.controller;

import java.util.List;
import java.util.logging.Logger;

import org.apache.ibatis.annotations.Param;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.board.BoardDTO;
import com.example.board.service.BoardService;


@Controller // 컨트롤러 선언
@RequestMapping("/board/*") 
public class BoardController {

    @Autowired
    private BoardService boardService;      //서비스와 연결

    // Slf4j 로그
    //private static final Logger logger = LoggerFactory.getLogger(BoardController.class);
    
    /*
     * RequestMapping을 통해 해당 url을 호출 시 해당되는 화면(view)을 매핑시켜주는 역할
     * localhost:8080/openBoardList.do 에서 "/openBoardList.do" 맵핑 설정
     * 해당 request 호출 시 리턴되는 화면 (BoardList.jsp) 호출 
     */ 
    //@RequestMapping("/openBoardList.do") 
    
    //게시물 목록
    @RequestMapping(value = "/openBoardList", method = RequestMethod.GET)
    public ModelAndView openBoardList() throws Exception{
    	
    	/*
    	* logger.debug("boardController dedug");
		* logger.info("boardController info");
		* logger.error("boardController error");
		*/ 
		    	 	
    	// jsp파일 부르기 - 방법1
    	// return "BoardList"; (String 메소드로 변경)
    	   	
    	// jsp파일 부르기 - 방법2	   	
    	ModelAndView mv = new ModelAndView("/BoardList");    	
        //게시글 목록을 조회하기 위해 ServiceImpl 클래스의 boardList 메서드 호출
        List<BoardDTO> boardlist = boardService.boardList();  
        mv.addObject("list", boardlist);

        return mv;
        
    }
    
    // 게시판 목록 조회 - 검색 기능
    @RequestMapping(value = "/search", method = RequestMethod.GET)
    public ModelAndView search(@RequestParam(value="searchType") String searchType, 
    					@RequestParam(value="keyword") String keyword) throws Exception{ // URL을 통해 searchType과 keyword를 받아낼 수 있도록
    	
    	ModelAndView mv = new ModelAndView("/BoardList");
    	List<BoardDTO> boardlist = boardService.boardListSearch(searchType, keyword);
    	mv.addObject("list", boardlist);

        return mv;
    }
} 
