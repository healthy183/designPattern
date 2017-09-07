package com.kang.design.composite.simple;

import java.util.ArrayList;
import java.util.List;

/**
 * @Title 类名
 * @Description 描述
 * @Date 2017/6/18.
 * @Author Healthy
 * @Version
 */
public class Folder implements IFile {

    private String name;
    private IFile folder;
    private List<IFile> files;

    public Folder(String name) {
        this(name, null);
    }

    public Folder(String name,IFile folder) {
        super();
        this.name = name;
        this.folder = folder;
        files = new ArrayList<IFile>();
    }

    public String getName() {
        return name;
    }

    //与File的删除方法不同，先删除下面的文件以及文件夹后再删除自己
    public void delete() {
        List<IFile> copy = new ArrayList<IFile>(files);
        System.out.println("------------删除子文件-------------");
        for (IFile file : copy) {
            file.delete();
        }
        System.out.println("----------删除子文件结束-------------");
        if (folder != null) {
            folder.deleteFile(name);
        }
        System.out.println("---删除[" + name + "]---");
    }

    public void createNewFile(String name) {
        if (name.contains(".")) {
            files.add(new File(name,this));
        }else {
            files.add(new Folder(name,this));
        }
    }

    public void deleteFile(String name) {
        for (IFile file : files) {
            if (file.getName().equals(name)) {
                files.remove(file);
                break;
            }
        }
    }

    public IFile getIFile(int index) {
        return files.get(index);
    }
}
