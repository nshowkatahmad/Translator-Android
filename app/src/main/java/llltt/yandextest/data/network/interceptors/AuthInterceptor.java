package llltt.yandextest.data.network.interceptors;

import java.io.IOException;

import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/** Created by Maksim Sukhotski on 4/15/2017. */

public class AuthInterceptor implements Interceptor {
    private String apiKey;

    public AuthInterceptor(String token) {
        this.apiKey = token;
    }

    @Override
    public Response intercept(Chain chain) throws IOException {
        Request original = chain.request();
        Request.Builder builder = original.newBuilder()
                .header("key", apiKey);
        Request request = builder.build();
        return chain.proceed(request);
    }
}
