package com.cgx.builder.model;

import lombok.Data;

/**********
 * @program: designpatterns
 * @description: 要创建的对象
 * @author: cgx
 * @create: 2019-08-15 10:29
 **/
@Data
public class Computer {

    /****
     * cpu
     */
    private String cpu;

    /**
     * 主板
     */
    private String board;

    /****
     * 内存
     */
    private String memory;

    /**
     * 硬盘
     */
    private String  disk;

    /***
     * 系统
     */
    private String os;


}
