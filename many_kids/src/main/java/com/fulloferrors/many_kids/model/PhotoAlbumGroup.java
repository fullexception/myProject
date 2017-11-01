package com.fulloferrors.many_kids.model;

import java.util.List;

public class PhotoAlbumGroup {
    private int photoAlbumGroupId;
    private String photoAlbumGroupName;
    private List<PhotoAlbum> photoAlbums;

    public int getPhotoAlbumGroupId() {
        return photoAlbumGroupId;
    }

    public void setPhotoAlbumGroupId(int photoAlbumGroupId) {
        this.photoAlbumGroupId = photoAlbumGroupId;
    }

    public String getPhotoAlbumGroupName() {
        return photoAlbumGroupName;
    }

    public void setPhotoAlbumGroupName(String photoAlbumGroupName) {
        this.photoAlbumGroupName = photoAlbumGroupName;
    }

    public List<PhotoAlbum> getPhotoAlbums() {
        return photoAlbums;
    }

    public void setPhotoAlbums(List<PhotoAlbum> photoAlbums) {
        this.photoAlbums = photoAlbums;
    }
}
