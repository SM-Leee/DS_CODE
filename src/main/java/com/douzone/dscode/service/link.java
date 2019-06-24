package com.douzone.dscode.service;

import java.io.File;
import java.io.FileInputStream;
import java.net.URL;

import javax.servlet.http.HttpServletResponse;

import org.springframework.util.FileCopyUtils;

public class link {
	
	public void download(HttpServletResponse res, String path, String name, String filetype) {
   	 try {
         String fn = path+name;
         URL url = getClass().getResource(fn);
         File f = new File(url.toURI());
         

         if (f.exists()) {
             res.setContentType(filetype);
             res.setContentLength(new Long(f.length()).intValue());
             res.setHeader("Content-Disposition", "attachment; filename="+name);
             
             FileCopyUtils.copy(new FileInputStream(f), res.getOutputStream());
         } else {
             System.out.println("File"+fn+"("+f.getAbsolutePath()+") does not exist");
         }
     } catch (Exception e) {
    	 e.printStackTrace();
     }
	}

}
