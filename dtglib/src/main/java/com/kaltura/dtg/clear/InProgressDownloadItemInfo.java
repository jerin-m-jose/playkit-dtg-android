package com.kaltura.dtg.clear;

import java.util.ArrayList;
import java.util.List;


public class InProgressDownloadItemInfo {

    private long totalBytes;
    private List<String> completedDownloadItemTasks;
    private int numOfChunksInItem;
    private DefaultDownloadItem defaultDownloadItem;

    public InProgressDownloadItemInfo(int numOfChunksInItem) {
        this.numOfChunksInItem = numOfChunksInItem;
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

    public int getNumOfChunksInItem() {
        return numOfChunksInItem;
    }

    public void setNumOfChunksInItem(Integer numOfChunksInItem) {
        this.numOfChunksInItem = numOfChunksInItem;
    }

    public DefaultDownloadItem getDefaultDownloadItem() {
        return defaultDownloadItem;
    }

    public void setDefaultDownloadItem(DefaultDownloadItem defaultDownloadItem) {
        this.defaultDownloadItem = defaultDownloadItem;
    }
}
