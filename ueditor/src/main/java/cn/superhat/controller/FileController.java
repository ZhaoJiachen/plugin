package cn.superhat.controller;

import org.springframework.stereotype.Controller;
import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URISyntaxException;

@Controller
@RequestMapping("file")
public class FileController {

    @RequestMapping(value = "upload")
    @ResponseBody
    public String upload(@RequestParam("file")MultipartFile file, HttpServletRequest request){
        //获取文件名
        String fileName = file.getOriginalFilename();
        System.err.println(">>>>>>>>>>>>>>>>>>filename:" + fileName);
        try {
//            String path = Thread.currentThread().getContextClassLoader().getResource("").toURI().getPath();
//            System.err.println(">>>>>>>>>>>>>>>>>>imgFile:" + path);
            File imgFile = new File("d:/img/" + fileName);
            file.transferTo(imgFile);
            return imgFile.getPath() + fileName;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return  "error";
    }
}
