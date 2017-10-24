package com.example.service.content.dotmodel;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Device extends BaseModel {

    private String cssHeight;
    private String physicalHeight;
    private String physicalWidth;
    private String pixelRatio;
    private String physicalPpi;
    private String cssWidth;
    private String cssPpi;
    private String name;

    @JsonCreator
    public Device(
            @JsonProperty(value = "owner") String owner,
            @JsonProperty(value = "identifier") String identifier,
            @JsonProperty(value = "cssHeight") String cssHeight,
            @JsonProperty(value = "modDate") String modDate,
            @JsonProperty(value = "physicalHeight") String physicalHeight,
            @JsonProperty(value = "languageId") String languageId,
            @JsonProperty(value = "inode") String inode,
            @JsonProperty(value = "physicalWidth") String physicalWidth,
            @JsonProperty(value = "folder") String folder,
            @JsonProperty(value = "__DOTNAME__") String dotname,
            @JsonProperty(value = "sortOrder") String sortOrder,
            @JsonProperty(value = "pixelRatio") String pixelRatio,
            @JsonProperty(value = "modUser") String modUser,
            @JsonProperty(value = "name") String name,
            @JsonProperty(value = "host") String host,
            @JsonProperty(value = "physicalPpi") String physicalPpi,
            @JsonProperty(value = "lastReview") String lastReview,
            @JsonProperty(value = "cssWidth") String cssWidth,
            @JsonProperty(value = "stInode") String stInode,
            @JsonProperty(value = "cssPpi") String cssPpi
    ) {
        super(owner, identifier, modDate, languageId, inode, folder, dotname, sortOrder, modUser, host, lastReview, stInode);
        this.cssHeight = cssHeight;
        this.physicalHeight = physicalHeight;
        this.physicalWidth = physicalWidth;
        this.pixelRatio = pixelRatio;
        this.physicalPpi = physicalPpi;
        this.cssWidth = cssWidth;
        this.cssPpi = cssPpi;
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
