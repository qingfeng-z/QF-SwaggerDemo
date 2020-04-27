package com.qingfengservice.swaggerdemo.controller;

import com.qingfengservice.swaggerdemo.model.ResObject;
import com.qingfengservice.swaggerdemo.model.User;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("user")
public class HelloController {

    @GetMapping("userinfo")
    @ResponseBody
    public String GetUser(@RequestParam(name = "name",defaultValue = "张三") String name) {
        return name;
    }

    @ApiOperation(value = "新增用户" ,  notes="新增注册")
    @RequestMapping(value="/createUser",method=RequestMethod.POST,consumes= MediaType.APPLICATION_JSON_VALUE)
    public ResObject createUser(@RequestBody User user){
        System.out.println("createUser:::"+user.toString());
        return new ResObject(user.toString());
    }
}
