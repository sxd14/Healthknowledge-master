package cn.edu.gdpt.healthknowledge.utils;

import java.io.IOException;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class HttpUtils {
    private static String Json;

    private static String Home_URL = "http://api.tianapi.com/health/?key=5c0470cd12fe61bfe7c73080b0b85409&num=10";
    private static OkHttpClient okHttpClient = new OkHttpClient();

    public static String Async_Get(String word) {
        Request request = new Request.Builder().url(Home_URL + word).build();
        okHttpClient.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                Json = "Failure";
            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                Json = response.body().string();

            }

        });

        return Json;
    }

    public static String Sync_Get(String word) throws IOException {
        Request request = new Request.Builder().url(Home_URL + word).build();
        Response response = okHttpClient.newCall(request).execute();

        if (response.isSuccessful()) {
            Json = response.body().string();
        } else {
            Json = "Failure";
        }

        return Json;
    }
}





