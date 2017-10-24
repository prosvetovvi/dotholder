package com.example.service.content.api;

import retrofit2.Call;
import retrofit2.http.GET;
import com.example.service.content.dotmodel.Device;
import com.example.service.content.dotmodel.ContentWrapper;

public interface ContentAPI {

    @GET("+contentType:PreviewDevice%20+languageId:1")
    Call<ContentWrapper<Device>> getDevices();

}
