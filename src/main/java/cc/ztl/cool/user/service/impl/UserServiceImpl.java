package cc.ztl.cool.user.service.impl;


import cc.ztl.cool.user.dao.UserDao;
import cc.ztl.cool.user.entity.User;
import cc.ztl.cool.user.service.UserService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;


/**
 * (User表)服务实现类
 *
 * @author taylor
 * @since 2020-12-27 00:06:55
 */
@Service("userServiceImpl")
public class UserServiceImpl implements UserService {
    @Resource
    private UserDao userDao;

    /**
     * 通过ID查询单条数据
     *
     * @param  uid
     * @return 实例对象
     */
    @Override
    public User selectById(int uid) {
        return this.userDao.selectById(uid);
    }

    /**
     * 分页查询
     *
     * @param current 当前页
     * @param size 每一页的条数
     * @return 对象列表
     */
    @Override
    public PageInfo<User> selectPage(int current, int size) {
        PageHelper.startPage(current,size);


        List<User> dataList = userDao.selectPage(current,size);
        return new PageInfo<>(dataList);
    }

    /**
     * 查询所有
     *
     * @return 实例对象的集合
     */
     @Override
     public List<User> selectAll() {
        return this.userDao.selectAll();
     }
     
    /**
     * 根据条件查询
     *
     * @return 实例对象的集合
     */
    @Override
    public List<User> selectList(User user) {
        return this.userDao.selectList(user);
    }
    
    /**
     * 新增数据
     *
     * @param user 实例对象
     * @return 实例对象
     */
    @Override
    @Transactional
    public int insert(User user) {
        return this.userDao.insert(user);
    }

    /**
     * 批量新增
     *
     * @param users 实例对象的集合
     * @return 生效的条数
     */
    @Override
    @Transactional
    public int batchInsert(List<User> users) {
        return this.userDao.batchInsert(users);
    }

    /**
     * 修改数据
     *
     * @param user 实例对象
     * @return 实例对象
     */
    @Override
    @Transactional
    public User update(User user) {
        this.userDao.update(user);
        return this.selectById(user.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param  uid
     * @return 是否成功
     */
    @Override
    @Transactional
    public int deleteById( int uid) {
        return this.userDao.deleteById(uid);
    }
    
    /**
     * 查询总数据数
     *
     * @return 数据总数
     */
     @Override
     public int count(){
        return this.userDao.count();
     }
}