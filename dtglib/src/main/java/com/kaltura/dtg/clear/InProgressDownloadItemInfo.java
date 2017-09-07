package com.kaltura.dtg.clear;

import java.util.ArrayList;
import java.util.List;


public class InProgressDownloadItemInfo {

    private long totalBytes;
    private List<String> completedDownloadItemTasks;
    private int  totalChunkItem;
    private DefaultDownloadItem defaultDownloadItem;

    public InProgressDownloadItemInfo(int totalChunkItem) {
        this.totalChunkItem = totalChunkItem;
        this.totalBytes = 0;
        this.completedDownloadItemTasks = new ArrayList<>();
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

    public void setCompletedDownloadItemTasks(List<String> completedDownloadItemTasks) {
        this.completedDownloadItemTasks = completedDownloadItemTasks;
    }

    public int getTotalChunkItem() {
        return totalChunkItem;
    }

    public void setTotalChunkItem(Integer totalChunkItem) {
        this.totalChunkItem = totalChunkItem;
    }

    public DefaultDownloadItem getDefaultDownloadItem() {
        return defaultDownloadItem;
    }

    public void setDefaultDownloadItem(DefaultDownloadItem defaultDownloadItem) {
        this.defaultDownloadItem = defaultDownloadItem;
    }
}
