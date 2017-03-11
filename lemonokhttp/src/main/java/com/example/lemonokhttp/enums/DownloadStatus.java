package com.example.lemonokhttp.enums;

/**
 * Created by ShuWen on 2017/3/1.
 */

public enum DownloadStatus {
    waitting(0),

    startting(1),

    downloading(2),

    pause(3),

    finish(4),

    failed(5)
    ;

    private int value;
    DownloadStatus(int value)
    {
        this.value=value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
