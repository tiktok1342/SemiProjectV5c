package yang.spring.mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import yang.spring.mvc.service.BoardService;
import yang.spring.mvc.service.PdsService;
import yang.spring.mvc.vo.BoardVO;
import yang.spring.mvc.vo.PdsVO;

import java.util.ArrayList;

@Controller
public class PdsController {

    private PdsService psrv;

    @Autowired
    public PdsController(BoardService bsrv) {
        this.psrv = psrv;
    }

    // 목록보기
    @RequestMapping(value = "/pds/list")
    public ModelAndView list() {

        ModelAndView mv = new ModelAndView();

        mv.setViewName("layout/layout"); // 뷰이름 지정
        mv.addObject("action", "../pds/list.jsp");

        // 목록 불러오기
        ArrayList<PdsVO> pdlist = psrv.showPds();
        mv.addObject("pdlist", pdlist);

        return mv;
    }

    // 새글쓰기
    @RequestMapping(value = "/pds/write")
    public ModelAndView write() {

        ModelAndView mv = new ModelAndView();
        mv.setViewName("layout/layout"); // 뷰이름 지정

        mv.addObject("action", "../board/write.jsp");

        return mv;
    }

    // 새글쓰기
    @RequestMapping(value = "/pds/write", method = RequestMethod.POST)
    public String writeok(PdsVO pd) {

        psrv.newPds(pd);

        return "redirect:/pds/list";
    }

    // 본문보기
    @RequestMapping(value = "/pds/view")
    public ModelAndView view(String pno) {

        ModelAndView mv = new ModelAndView();

        mv.setViewName("layout/layout"); // 뷰이름 지정
        mv.addObject("action", "../pds/view.jsp");

        PdsVO p = psrv.showOnePds(pno);
        mv.addObject("p", p);

        return mv;
    }

}
