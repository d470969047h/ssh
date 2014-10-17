package com.shinowit.actions;

import com.opensymphony.xwork2.ActionSupport;
import com.shinowit.entity.StudentInfoEntity;
import com.shinowit.framework.dao.BaseDAO;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by daihui on 2014/10/16.
 */
public class StuInfoAction extends ActionSupport {

    private List<StudentInfoEntity> stuList;

    @Resource
    private BaseDAO<StudentInfoEntity> stuDAO;

    public String query(){
        stuList=stuDAO.listAll(StudentInfoEntity.class);
        return SUCCESS;
    }

    public List<StudentInfoEntity> getStuList() {
        return stuList;
    }

    public void setStuList(List<StudentInfoEntity> stuList) {
        this.stuList = stuList;
    }
}
