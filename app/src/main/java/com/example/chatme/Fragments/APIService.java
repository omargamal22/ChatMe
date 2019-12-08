package com.example.chatme.Fragments;

import com.example.chatme.Notifications.MyResponse;
import com.example.chatme.Notifications.Sender;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface APIService {
    @Headers(
            {
                    "Content-Type:application/json",
                    "Authorization:key=AAAAGD30e7w:APA91bEp4Pyqz0mrojtE58LJEQl9vtesDQ-2C20pJB4JJBH__uf2AEv2mK0lIEuBQwddPF_0MQ7bCbMbZpalQ-ln-baAq6vl4cshvu-6pDI0j8B9xBUH2NnJyCJ5LnzdY2jqc3EuFL6g"
}
    )

    @POST("fcm/send")
    Call<MyResponse> sendNotification(@Body Sender body);
}
