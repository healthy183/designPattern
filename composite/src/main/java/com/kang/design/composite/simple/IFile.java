package com.kang.design.composite.simple;

/**
 * @Title 类名
 * @Description 描述
 * @Date 2017/6/18.
 * @Author Healthy
 * @Version
 */
public interface IFile {
    //下面两个方法，相当于类图中operation方法
    void delete();
    String getName();
    /* 以上为公共行为，以下为文件夹才有的行为 */
    //创建新文件，相当于add方法
    void createNewFile(String name);
    //相当于remove方法
    void deleteFile(String name);
    //相当于GetChild方法
    IFile getIFile(int index);
}
