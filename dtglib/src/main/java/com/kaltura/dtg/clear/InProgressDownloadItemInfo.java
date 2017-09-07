package com.kaltura.dtg.clear;

import java.util.ArrayList;
import java.util.List;


public class InProgressDownloadItemInfo {

    private long totalBytes;
    private List<String> completedDownloadItemTasks;

    public InProgressDownloadItemInfo() {
        this.totalBytes = 0;
        completedDownloadItemTasks = new ArrayList<>();
    }

    public long getTotalBytes() {
        return totalBytes;
    }

    public void setTotalBytes(long totalBytes) {
        this.totalBytes = totalBytes;
    }

    public List<String> getCompletedDownloadItemTasks() {
        return completedDownloadItemTasks;
    }
}
