package com.itheima.demo03.FileFilter;

import java.io.File;
import java.io.FileFilter;

/**
 * @author xuzhipu
 * @create 2019-05-25 9:50
 */
public class FileFilterImpl implements FileFilter {
    @Override
    public boolean accept(File pathname) {
        if(pathname.isDirectory()){
            return true;
        }else if(pathname.getPath().toLowerCase().endsWith(".doc")){
            return true;
        }
        return false;
    }
}
