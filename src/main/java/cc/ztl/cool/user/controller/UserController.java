package cc.ztl.cool.user.controller;


import cc.ztl.cool.user.entity.User;
import cc.ztl.cool.user.response.PageResult;
import cc.ztl.cool.user.response.Result;
import cc.ztl.cool.user.response.StatusCode;
import cc.ztl.cool.user.service.UserService;
import com.github.pagehelper.PageInfo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
import java.util.Objects;

/**
 * (User)控制层
 *
 * @author taylor
 * @since 2020-12-27 00:06:53
 */
@RestController
@Slf4j
@RequestMapping("/user")
public class UserController {
    /**
     * 服务对象
     */
    @Resource
    private UserService userServiceImpl;

    /**
     * 通过主键查询单条数据
     *
     * @param  uid
     * @return 单条数据
     */
    @GetMapping(value = "/get/{uid}")
    public Result selectOne(@PathVariable("uid") int uid) {
        User result = userServiceImpl.selectById(uid);
        if(Objects.nonNull(result)){
            return new Result<>(true, StatusCode.OK,"查询成功",result);
        }
        return new Result<>(true,StatusCode.ERROR,"查询失败");
    }
    
    /**
     * 新增一条数据
     *
     * @param user 实体类
     * @return Result对象
     */
    @PostMapping(value = "/insert")
    public Result insert(@RequestBody User user) {
        int result = userServiceImpl.insert(user);
        if (result > 0) {
          return new Result<>(true,StatusCode.OK,"新增成功",result);
        }
        return new Result<>(true,StatusCode.ERROR,"新增失败"); 
    }

    /**
     * 修改一条数据
     *
     * @param user 实体类
     * @return Result对象
     */
    @PutMapping(value = "/update")
    public Result update(@RequestBody User user) {
        User result = userServiceImpl.update(user);
        if (Objects.nonNull(result)) {
          return new Result<>(true,StatusCode.OK,"修改成功",result);
        }
        return new Result<>(true,StatusCode.ERROR,"修改失败");
    }

    /**
     * 删除一条数据
     *
     * @param  uid
     * @return Result对象
     */
    @DeleteMapping(value = "/delete/{uid}")
    public Result delete(@PathVariable("uid") int uid  ) {
        int result = userServiceImpl.deleteById(uid);
        if (result > 0) {
          return new Result<>(true,StatusCode.OK,"删除成功",result);
        }
        return new Result<>(true,StatusCode.ERROR,"删除失败");
    }

    /**
     * 查询全部
     *
     * @return Result对象
     */
    @GetMapping(value = "/selectAll")
    public Result<List<User>> selectAll() {
        List<User> users = userServiceImpl.selectAll();
        if (CollectionUtils.isEmpty(users)) {
            return new Result<>(true,StatusCode.ERROR,"查询全部数据失败");       
        }
        return new Result<>(true,StatusCode.OK,"查询全部数据成功",users);
        
    }

    /**
     * 分页查询
     *
     * @param current 当前页  第零页和第一页的数据是一样
     * @param size 每一页的数据条数
     * @return Result对象
     */
    @GetMapping(value = "/selectPage/{current}/{size}")
    public Result selectPage(@PathVariable("current") Integer current,@PathVariable("size") Integer size) {
        PageInfo<User> page = userServiceImpl.selectPage(current, size);
        if (Objects.nonNull(page)) {
            return new Result<>(true,StatusCode.OK,"分页条件查询成功",new PageResult<>(page.getTotal(),page.getList()));
        }
        return new Result<>(true,StatusCode.ERROR,"分页查询数据失败");
    }
    
}