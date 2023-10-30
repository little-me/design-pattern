package com.sunq.command;

public class CommandClient {
    public static void main(String[] args) {
        // 命令的接收者
        String ftp = "FTP";
        // 构造命令
        FTPUploadCommand command = new FTPUploadCommand(ftp);
        // 客户端只需知道命令的执行，无需关心执行者是如何响应这个命令的。
        command.execute();
    }
}
