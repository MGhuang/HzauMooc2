package com.feidian.george.hzaumooc.Bmob.Bean;

import cn.bmob.v3.BmobObject;

/**
 * Created by Administrator on 2016/5/13.
 */
public class MainValue extends BmobObject{
    private String class_name;
    private String class_image;
    private String class_kind;
    private String class_teacher;
    private String class_id;
    public String getClass_name()
    {
        return class_name;
    }
    public String getClass_image()
    {
        return class_image;
    }
    public String getClass_kind()
    {
        return class_kind;
    }
    public String getClass_id()
    {
        return class_id;
    }
    public String getClass_teacher()
    {
        return class_teacher;
    }
    public void setClass_name(String class_name1){class_name=class_name1;}
    public void setClass_image(String class_image1){class_image=class_image1;}
    public void setClass_kind(String class_image1){class_image=class_image1;}
    public void setClass_teacher(String class_teacher1){class_teacher=class_teacher1;}
    public void setClass_id(String class_id1){class_id=class_id1;}
    @Override
    public String toString() {
        return new String(class_name+"   "+class_teacher);
    }
}