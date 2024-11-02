package com.example.service;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

public interface ApiService {
    // 구급대원의 정보를 가져오는 API
    /*@GET("paramedics/{id}")
    Call<Paramedic> getParamedicInfo(@Path("id") int paramedicId);

    // 새로운 응급 요청을 생성하는 API
    @POST("emergency-requests")
    Call<EmergencyRequest> createEmergencyRequest(@Body EmergencyRequest request);

    // 응급 요청 상태 업데이트
    @PUT("emergency-requests/{id}/status")
    Call<Void> updateRequestStatus(@Path("id") int requestId, @Body RequestStatus status);*/
}

