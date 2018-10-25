package cn.oscar.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

@Controller
public class FileUploadCpntroller {
    @RequestMapping("/fileUpload")
    public String handleFileUpload(@RequestParam(value = "name",required = false) String name,
            @RequestParam(value = "uploadfile",required = false) List<MultipartFile> uploadfile,
            HttpServletRequest request) {
        //判斷文件是否上傳
        if (uploadfile.size() > 0&&!uploadfile.isEmpty() ){
            //循环输出上传文件
            for (MultipartFile file : uploadfile) {
                //获取上传文件的原始名称
                String originalFilename = file.getOriginalFilename();
                //设置上传文件的保存地址目录
                String realPath = request.getServletContext().getRealPath("/upload/");
                File filePath = new File(realPath);
                //如果文件地址不存在 就先创建地址
                if (!filePath.exists()){
                    filePath.mkdir();
                }
                //使用UUID重命名上传文件名称 上传人_uuid_原文件名称
                String newfilename = name+"_"+UUID.randomUUID()+"_"+originalFilename;
                //使用MultipartFile接口的方法完成文件上传到指定位置
                try {
                    file.transferTo(new File(realPath+newfilename));
                    //输出文件位置
                    System.out.println(realPath+newfilename);
                } catch (IOException e) {
                    e.printStackTrace();
                    return "error";
                }
            }
        return "success";
        }else {
            return "error";
        }
    }
    @RequestMapping("/get")
    public String getFile(){
        return "fileUpload";
    }
}
