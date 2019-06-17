package com.springcloud.controller;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.springcloud.common.UploadUtils;
import com.springcloud.vo.ResultValue;

@RestController
public class FileUploadController {
	/*
	 * //从application.properties文件中获得指定键的值，并赋给相应的成员变量
	 */ 
	@Value("${web.user-path}")
	private String userPath;

	@Value("${web.goods-path}")
	private String goodsPath;

	@RequestMapping(value = "/userUpload")
	public ResultValue userUpload(@RequestParam("userImage") MultipartFile file) {
		ResultValue rv = new ResultValue();
	
		try {
			Map<String, Object> map = this.uploadFile(userPath, file);
			if(map !=null && map.size()>0) {
				rv.setCode(0);
				rv.setDataMap(map);
				return rv;
			}
			
		} catch (IOException e) {

			e.printStackTrace();
		}
		rv.setCode(1);
		rv.setMessage("用户头像上传失败！！！");
		return rv;
	}
	
	@RequestMapping(value = "/goodsUpload")
	public ResultValue goodsUpload(@RequestParam("goodsImage") MultipartFile file) {
		ResultValue rv = new ResultValue();
		try {
			Map<String, Object> map = this.uploadFile(goodsPath, file);
			if(map !=null && map.size()>0) {
				rv.setCode(0);
				rv.setDataMap(map);
				return rv;
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		rv.setCode(1);
		rv.setMessage("商品图片上传失败！！");
		return rv;

		}  
		/**
		 *  删除商品图片
		 * @return
		 */
		@RequestMapping(value="/deleteGoodsImg")
		public ResultValue deleteGoodsImg(@RequestParam("goodPhoto") String goodPhoto) {
		    ResultValue rv = new ResultValue();
			try {
				//从url中获得商品图片的名字
				int indexOf = goodPhoto.lastIndexOf("/");
				if(indexOf != -1) {
					String fileName = goodPhoto.substring(indexOf + 1);
					//System.out.println(fileName);
					File file = new File(this.goodsPath + fileName);
					//判断文件或目录是否存在
					
							file.delete();
							
							rv.setCode(0);
							return rv;
						
					
				}
				
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			rv.setCode(1);
			return rv;
			
		}
		
		@RequestMapping(value="/deleteUserImg")
		public ResultValue deleteUserImg(@RequestParam("userImg") String userImg) {
		    ResultValue rv = new ResultValue();
			try {
				//从url中获得商品图片的名字
				int indexOf = userImg.lastIndexOf("/");
				if(indexOf != -1) {
					String fileName = userImg.substring(indexOf + 1);
					//System.out.println(fileName);
					File file = new File(this.userPath + fileName);
					//判断文件或目录是否存在
					
							file.delete();
							
							rv.setCode(0);
							return rv;
						
					
				}
				
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			rv.setCode(1);
			return rv;
			
		}
	
	
		 private Map<String,Object> uploadFile(String path,MultipartFile file) throws IOException{
			// 获得新的文件名
				String fileName = UploadUtils.getFileName();
				// 根据上传文件的文件名获得文件的扩展名
				String extendedName = UploadUtils.getExtendedName(file.getOriginalFilename());
				
				// 将文件转换为字节类型的数组
				byte[] bytes = file.getBytes();
				// 创建File类的对象，并设置文件名上传路径及文件名
				File saveFile = new File(path + fileName + extendedName);
				// 上传文件
				FileCopyUtils.copy(bytes, saveFile);
				
				Map<String, Object> map = new HashMap<>();
				map.put("fileName", fileName);
				map.put("extendedName", extendedName);
				return map;
		 
		  }
		 

}
