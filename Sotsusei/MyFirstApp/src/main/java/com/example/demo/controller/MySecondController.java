package com.example.demo.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
@Controller
public class MySecondController {
//「???1」にはURLが入るよ。今回の練習問題はどんなURLにしたいんだろう？
@RequestMapping(path = "/mysecond", method = RequestMethod.GET)
	public String first() {
 ///「???2」には表示するhtmlを書くよ。今回の練習問題ではどのhtmlを読み込めば良いんだろう？
return "mysecond";
}
}