package com.dongtu.service;

import com.dongtu.consts.Result;
import com.dongtu.pojo.TravelCommentary;
import com.dongtu.pojo.Travels;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;


/**
 * 游记服务接口
 */
@FeignClient("TRAVEL-NOTES")
public interface TravelNotesI {
    //增加游记
    @PostMapping("/travelnotesController/saveTravels")
    Result saveTravels(@RequestBody Travels travels);

    //查询全部游记
    @GetMapping("/travelnotesController/findTravelsAll")
    Result<List<Travels>> findTravelsAll();

    //根据id查询
    @GetMapping("/travelnotesController/findTravelsById")
    Result<Travels> findTravelsById(@RequestParam String travelsId);

    //根据游记id查询此游记评论
    @GetMapping("/travelnotesController/findTravelsCommentsByTravelsId/{travelsId}")
    Result findTravelsCommentsByTravelsId(@PathVariable("travelsId") String travelsId);

    //增加游记评论
    @PostMapping("/travelnotesController/saveTravelsComments")
    Result saveTravelsComments(@RequestBody TravelCommentary travelCommentary);

    //根据用户查询
    @GetMapping("/travelnotesController/findTravelsByIdAndUserId")
    public Result<List<Travels>> findTravelsByIdAndUserId(@RequestParam String userName);
}
