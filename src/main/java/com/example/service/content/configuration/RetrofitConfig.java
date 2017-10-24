package com.example.service.content.configuration;

import com.example.service.content.api.ContentAPI;
import org.springframework.context.annotation.Bean;
import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;

@org.springframework.context.annotation.Configuration
public class RetrofitConfig {

    private static final String API_URL_DOTCMS = "http://localhost:8080/api/content/render/false/query/";

    @Bean
    public Retrofit retrofit() {
        return new Retrofit.Builder()
                .baseUrl(API_URL_DOTCMS)
                .addConverterFactory(JacksonConverterFactory.create())
                .build();
    }

    @Bean
    public ContentAPI dotCMSService(Retrofit dotCMS) {
        return dotCMS.create(ContentAPI.class);
    }
}
