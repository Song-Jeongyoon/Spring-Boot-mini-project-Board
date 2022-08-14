package com.example.board.controller;

import java.util.List;

import org.mybatis.logging.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.example.board.service.BoardService;

import ch.qos.logback.classic.Logger;


@Controller // 컨트롤러 선언
public class BoardController {

    @Autowired
    private BoardService boardService;      //서비스와 연결

    // Slf4j 로그
    private static final Logger logger = LoggerFactory.getLogger(BoardController.class);
    
    /*
     * RequestMapping을 통해 해당 url을 호출 시 해당되는 화면(view)을 매핑시켜주는 역할
     * localhost:8080/openBoardList.do 에서 "/openBoardList.do" 맵핑 설정
     * 해당 request 호출 시 리턴되는 화면 (BoardList.jsp) 호출 
     */ 
    @RequestMapping("/openBoardList.do") //노테이션의 값으로 주소 지정
    public String openBoardList() throws Exception{
    	
    	logger.debug("boardController dedug");
    	logger.info("boardController info");
    	logger.error("boardController error");
    	
    	return "BoardList";
    	
    	
    		
     	/*
    	ModelAndView mv = new ModelAndView("/board/src/main/webapp//BoardList.jsp");
    	
        //게시글 목록을 조회하기 위해 ServiceImpl 클래스의 selectBoardList 메서드 호출
        List<BoardDTO> list = boardService.boardList();  
        mv.addObject("list", list);

        return mv;
        */
    }
} 
