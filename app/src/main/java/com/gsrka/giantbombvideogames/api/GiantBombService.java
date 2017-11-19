package com.gsrka.giantbombvideogames.api;

import com.gsrka.giantbombvideogames.Custom.ListResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by Deepak Kaku on 28-09-2017.
 */

public interface GiantBombService {


   @GET("/api/search")
   Call<ListResponse> getList(@Query("api_key") String api_key,@Query("page")int page,@Query("format") String format,@Query("query") String query,@Query("resources") String resources, @Query("filed_list") String filed_list, @Query("limit") int limit);

   @GET("/api/games")
   Call<ListResponse> getTopGames(@Query("api_key") String api_key,@Query("format") String format,@Query("filed_list") String filed_list,@Query("limit") int limit);

   @GET("/api/games")
   Call<ListResponse> getMoreGames(@Query("api_key") String api_key,@Query("page")int page,@Query("format") String format,@Query("query") String query,@Query("resources") String resources, @Query("filed_list") String filed_list, @Query("limit") int limit);


}
