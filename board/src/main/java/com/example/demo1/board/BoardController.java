package com.example.demo1.board;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo1.board.service.BoardService;

@Controller // 컨트롤러 선언
public class BoardController {

    @Autowired
    private BoardService boardService; //서비스와 연결

    // 이거 아직 미해결!!!!! *********** 불안요소
    @RequestMapping("/openBoardList") //노테이션의 값으로 주소 지정
    public ModelAndView openBoardList() throws Exception{
    	
    
    	ModelAndView mv = new ModelAndView("/BoardList.jsp"); 
    	
        //게시글 목록을 조회하기 위해 ServiceImpl 클래스의 boardList 메서드 호출
        List<BoardDTO> list = boardService.boardList();  
        mv.addObject("list", list);

        return mv;
    }
}
