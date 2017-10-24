package com.example.service.content.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import retrofit2.Call;
import retrofit2.Response;
import com.example.service.content.dotmodel.Device;
import com.example.service.content.api.ContentAPI;
import com.example.service.content.dotmodel.ContentWrapper;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Service
public class ContentService {

    private ContentAPI contentAPI;

    @Autowired
    public void setContentAPI(ContentAPI contentAPI) {
        this.contentAPI = contentAPI;
    }

    public List<Device> getDevices() {
        List<Device> devices = new ArrayList<>();
        try {
            Call<ContentWrapper<Device>> call = contentAPI.getDevices();
            Response<ContentWrapper<Device>> response = call.execute();
            if (response.isSuccessful()) {
                ContentWrapper<Device> contentWrapper = response.body();
                devices = contentWrapper != null ? contentWrapper.getObjects() : devices;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return devices;
    }

}
