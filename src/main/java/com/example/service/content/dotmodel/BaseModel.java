package com.example.service.content.dotmodel;

class BaseModel {

    private String owner;
    private String identifier;
    private String modDate;
    private String languageId;
    private String inode;
    private String folder;
    private String dotname;
    private String sortOrder;
    private String modUser;
    private String host;
    private String lastReview;
    private String stInode;

    BaseModel(String owner,
              String identifier,
              String modDate,
              String languageId,
              String inode,
              String folder,
              String dotname,
              String sortOrder,
              String modUser,
              String host,
              String lastReview,
              String stInode) {
        this.owner = owner;
        this.identifier = identifier;
        this.modDate = modDate;
        this.languageId = languageId;
        this.inode = inode;
        this.folder = folder;
        this.dotname = dotname;
        this.sortOrder = sortOrder;
        this.modUser = modUser;
        this.host = host;
        this.lastReview = lastReview;
        this.stInode = stInode;
    }
}
