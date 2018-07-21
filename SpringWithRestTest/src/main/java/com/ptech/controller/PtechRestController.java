package com.ptech.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ptech.dao.genericDao;
import com.ptech.other.PtechConstant;
import com.ptech.pojo.Data;
import com.ptech.pojo.StudentMaster;


@RestController
public class PtechRestController<T> extends PtechConstant {
	
	private List<String> mylist=new ArrayList<String>(Arrays.asList("Henry","Vikash"));
    @Autowired
	private genericDao<StudentMaster> studentdao;
	
	
@RequestMapping("/getdata")
public Data getData(@RequestParam(value="id",defaultValue="0")Integer id)
{
	return new Data(id,mylist.get(id));
}


@RequestMapping("/getStudentdata")
public StudentMaster getStudentData(@RequestParam(value="name") String name)
{
	
return studentdao.getData(name, getStudentDataByName);
}






}
