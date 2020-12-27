package cc.ztl.cool.user.response;

import lombok.Data;

import java.util.List;

/**分页结果对象
 * @author taylor
 * @title: PageResult
 * @description: TODO
 * @date 2020-12-27 00:06:57
 */
@Data
public class PageResult<T> {
    private Long total;
    private List<T> rows;
    public PageResult(Long total, List<T> rows) {
        this.total = total;
        this.rows = rows;
    }

}