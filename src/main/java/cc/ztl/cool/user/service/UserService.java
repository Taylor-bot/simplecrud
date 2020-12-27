package cc.ztl.cool.user.service;

import cc.ztl.cool.user.entity.User;
import com.github.pagehelper.PageInfo;

import java.util.List;

/**
 * (User)表服务接口
 *
 * @author taylor
 * @since 2020-12-27 00:06:54
 */
public interface UserService {

    /**
     * 通过ID查询单条数据
     *
     * @param  uid
     * @return 实例对象
     */
    User selectById( int uid);

    /**
     * 分页查询
     *
     * @param current 当前页
     * @param size 每一页数据的条数
     * @return 对象列表
     */
    PageInfo<User> selectPage(int current, int size);

    /**
     * 查询全部
     *
     * @return 对象列表
     */
    List<User> selectAll();
    
    /**
     * 通过实体作为筛选条件查询
     *
     * @param user 实例对象
     * @return 对象列表
     */
    List<User> selectList(User user);

    /**
     * 新增数据
     *
     * @param user 实例对象
     * @return 影响行数
     */
    int insert(User user);
    
    /**
     * 批量新增
     *
     * @param users 实例对象的集合
     * @return 影响行数
     */
    int batchInsert(List<User> users);
    
    /**
     * 修改数据
     *
     * @param user 实例对象
     * @return 修改
     */
    User update(User user);

    /**
     * 通过主键删除数据
     *
     * @param  uid
     * @return 影响行数
     */
    int deleteById(int uid );
    
    /**
     * 查询总数据数
     *
     * @return 数据总数
     */
    int count();
}