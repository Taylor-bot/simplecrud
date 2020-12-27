package cc.ztl.cool.user.dao;

import cc.ztl.cool.user.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * (User)表数据库访问层
 *
 * @author taylor
 * @since 2020-12-27 00:06:55
 */
 @Mapper
public interface UserDao {

    /**
     * 通过ID查询单条数据
     *
     * @param  id
     * @return 实例对象
     */
    User selectById(int id);
    
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
     * @return 影响行数
     */
    int update(User user);

    /**
     * 通过主键删除数据
     *
     * @param  uid
     * @param uid
     * @return 影响行数
     */
    int deleteById(int uid);

    /**
     * 查询总数据数
     *
     * @return 数据总数
     */
    int count();

    /**
     * 查询当前页的数据
     * @param current
     * @param size
     * @return
     */
    List<User> selectPage(int current, int size);
}