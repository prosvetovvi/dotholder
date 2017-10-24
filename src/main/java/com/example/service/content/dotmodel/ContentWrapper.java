package com.example.service.content.dotmodel;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

public class ContentWrapper<T> {

    private List<T> objects;

    @JsonCreator
    public ContentWrapper(@JsonProperty(value = "contentlets") List<T> objects) {
        this.objects = objects;
    }

    public List<T> getObjects() {
        return objects;
    }
}
