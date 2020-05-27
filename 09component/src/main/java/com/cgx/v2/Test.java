package com.cgx.v2;

import java.io.File;

/**********
 * @program: designpatterns
 * @description:
 * @author: cgx
 * @create: 2020-05-27 16:50
 **/
public class Test {
    public static void main(String[] args) {
        Folder folder = new Folder("D:\\tmp");
        createNode(folder);
        folder.display();
    }

    public static void createNode(AbstractNode node){
        String name = node.getName();
        File file = new File(name);
        for (File fl : file.listFiles()){
            if (fl.isFile()){
                Filer f = new Filer(fl.getAbsolutePath());
                node.addNode(f);
            }else if (fl.isDirectory()){
                Folder folder = new Folder(fl.getAbsolutePath());
                node.addNode(folder);
                createNode(folder);
            }

        }
    }
}
