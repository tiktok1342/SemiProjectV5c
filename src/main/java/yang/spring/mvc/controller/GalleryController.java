package yang.spring.mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import yang.spring.mvc.service.BDReplyService;
import yang.spring.mvc.service.BoardService;
import yang.spring.mvc.vo.BoardVO;
import yang.spring.mvc.vo.ReplyVO;

import java.util.ArrayList;

@Controller
public class GalleryController {

    private BoardService bsrv;
    private BDReplyService brsrv;
    @Autowired
    // 두개의 멤버변수를 생성자를 통해 DI 받음
    public GalleryController(BoardService bsrv, BDReplyService brsrv) {
        this.bsrv = bsrv;
        this.brsrv = brsrv;
    }

    // 목록보기
    @RequestMapping(value = "/board/list")
    public ModelAndView list(String cp) {

        ModelAndView mv = new ModelAndView();

        mv.setViewName("layout/layout"); // 뷰이름 지정
        mv.addObject("action", "../board/list.jsp");

        // 목록 불러오기
        ArrayList<BoardVO> bdlist =
                bsrv.showBoard(cp);
        mv.addObject("bdlist", bdlist);

        // 총 게시물 수 불러오기
        int bdcnt = bsrv.countBoard();
        mv.addObject("bdcnt", bdcnt);

        return mv;
    }

    // 새글쓰기
    @RequestMapping(value = "/board/write")
    public ModelAndView write() {

        ModelAndView mv = new ModelAndView();
        mv.setViewName("layout/layout"); // 뷰이름 지정

        mv.addObject("action", "../board/write.jsp");

        return mv;
    }

    // 새글쓰기
    @PostMapping(value = "/gallery/write")
    public String writeok() {

        return "redirect:/gallery/list";
    }

    // 본문보기
    @RequestMapping(value = "/gallery/view")
    public ModelAndView view() {

        ModelAndView mv = new ModelAndView();
        mv.setViewName("layout/layout"); // 뷰이름 지정

        mv.addObject("action", "../gallery/view.jsp");

        return mv;
    }

    // 수정하기
    @RequestMapping(value = "/gallery/update")
    public ModelAndView update() {

        ModelAndView mv = new ModelAndView();
        mv.setViewName("layout/layout"); // 뷰이름 지정

        mv.addObject("action", "../gallery/modify.jsp");

        return mv;
    }

    // 삭제하기
    @RequestMapping(value = "/gallery/delete")
    public String delete() {

        return "redirect:/gallery/list?cp=1";
    }

}
