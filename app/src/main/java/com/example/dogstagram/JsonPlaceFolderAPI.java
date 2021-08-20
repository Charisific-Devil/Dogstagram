package com.example.dogstagram;

import com.example.dogstagram.DOG_Model_Lists.BreedName;
import com.example.dogstagram.DOG_Model_Lists.ImageAnalysis;
import com.example.dogstagram.DOG_Model_Lists.ImageURL;
import com.example.dogstagram.DOG_Model_Lists.SearchBreed;
import com.example.dogstagram.DOG_Model_Lists.UploadImg;
import com.example.dogstagram.DOG_Model_Lists.Vote;
import com.example.dogstagram.DOG_Model_Lists.VoteData;

import java.util.List;

import okhttp3.MultipartBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface JsonPlaceFolderAPI {

    @GET("breeds")
    @Headers("x-api-key:6c94689e-0a22-4664-8127-6dc32130b4ae")
    Call<List<BreedName>> getBreed(@Query("limit") int limit, @Query("page") int page);


    @GET("images/search")
    @Headers("x-api-key:6c94689e-0a22-4664-8127-6dc32130b4ae")
    Call<List<ImageURL>> getImages(@Query("breed_ids") int id);


    @GET("images/{image_id}/analysis")
    @Headers("x-api-key:6c94689e-0a22-4664-8127-6dc32130b4ae")
    Call<List<ImageAnalysis>> getAnalysis(@Path("image_id") String imageid);


    @GET("breeds/search")
    @Headers("x-api-key:6c94689e-0a22-4664-8127-6dc32130b4ae")
    Call<List<SearchBreed>> getSearchResults(@Query("q") String q);


    @Multipart
    @POST("images/upload")
    @Headers("x-api-key:6c94689e-0a22-4664-8127-6dc32130b4ae")
    Call<UploadImg> uploadImg(@Part MultipartBody.Part photo);


    @POST("votes")
    @Headers("x-api-key:6c94689e-0a22-4664-8127-6dc32130b4ae")
    Call<Vote> addVote(@Body VoteData voteData);

}
