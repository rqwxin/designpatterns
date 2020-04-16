package com.cgx.builder.v2;

import lombok.Data;

/**********
 * @program: designpatterns
 * @description:
 * @author: cgx
 * @create: 2020-04-11 22:15
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

    public Computer(ComputerBuilder computerBuilder) {
        this.cpu = computerBuilder.cpu;
        this.board = computerBuilder.board;
        this.disk=computerBuilder.disk;
        this.memory = computerBuilder.memory;
        this.os = computerBuilder.os;
    }

    public static class ComputerBuilder{
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

        public ComputerBuilder  buildCpu(String cpu){
            this.cpu = cpu;
            return this;
        }
        public ComputerBuilder  buildBoard(String board){
            this.board=board;
            return this;
        }
        public ComputerBuilder  buildMemory(String memory){
            this.memory = memory;
            return this;
        }
        public ComputerBuilder  buildDisk(String disk){
            this.disk = disk;
            return this;
        }
        public ComputerBuilder  buildOs(String os){
            this.os =os;
            return this;
        }
        public Computer build(){
            return new Computer(this);
        }

    }
}
