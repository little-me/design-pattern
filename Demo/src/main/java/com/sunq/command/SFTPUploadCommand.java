package com.sunq.command;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class SFTPUploadCommand implements Command {

    private String sftp;

    @Override
    public void execute() {
        System.out.println(sftp + "上传");
    }

    @Override
    public void undo() {
        System.out.println(sftp + "取消上传");
    }
}
