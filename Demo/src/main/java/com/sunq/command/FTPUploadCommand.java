package com.sunq.command;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class FTPUploadCommand implements Command {

    private String ftp;

    @Override
    public void execute() {
        System.out.println(ftp + "上传");
    }

    @Override
    public void undo() {
        System.out.println(ftp + "取消上传");
    }
}
