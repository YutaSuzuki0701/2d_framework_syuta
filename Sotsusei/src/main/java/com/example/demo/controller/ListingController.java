package com.example.demo.controller;

import java.io.IOException;
import java.util.Base64;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class ListingController {
	//DBへつなぐために必要
	@Autowired
	JdbcTemplate jdbcTemplate;

	@RequestMapping(path = "listing", method = RequestMethod.GET)
	public String listing() {
		return "listing";
	}

	//出品本機能↓↓↓↓↓↓↓↓
	@RequestMapping(path = "/listing", method = RequestMethod.POST)
    public String listing(String productName, String category,int price, String condition,String description,int userId,@RequestParam("image") MultipartFile image, Model model) throws IOException {
        if (!image.isEmpty()) {
            // 画像が選択されている場合のみ処理を行う

            // 画像データをバイト配列に変換
            byte[] imageData = image.getBytes();

            // Base64エンコード
            String encodedImage = Base64.getEncoder().encodeToString(imageData);

            // モデルにエンコードされた画像データを追加
            model.addAttribute("encodedImage", encodedImage);

            // データベースに画像を保存
            jdbcTemplate.update("INSERT INTO merchandise (product_name,category,price,product_condition,description,user_id,photograph) VALUES (?,?,?,?,?,?,?)",productName,category,price,condition,description,userId, encodedImage);

        }

        return "redirect:/home";
    }
}
