package com.example.lemonokhttp.enums;

/**
 * Created by Administrator on 2017/1/17 0017.
 */
public enum DownloadStopMode
{
    /**
     * 后台根据下载优先级调度自动停止下载任务
     */
    error(0),

    auto(1),

    /**
     * 手动停止下载任务
     */
    hand(2);
    DownloadStopMode(Integer value)
    {
        this.value = value;
    }

    /**
     * 值
     */
    private Integer value;

    public Integer getValue()
    {
        return value;
    }

    public void setValue(Integer value)
    {
        this.value = value;
    }

    public static DownloadStopMode getInstance(int value)
    {
        for (DownloadStopMode mode : DownloadStopMode.values())
        {
            if (mode.getValue() == value)
            {
                return mode;
            }
        }
        return DownloadStopMode.auto;
    }
}
