package cc.ztl.cool.user.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**用于封装返回给前端的结果
  * @author taylor
  * @title: StatusCode
  * @description: TODO
  * @date 2020-12-27 00:06:56
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Result<T> {
    private boolean flag;
    private Integer code;
    private String message;
    private T data;

    public Result(boolean flag, int code, String message) {
        this.flag = flag;
        this.code = code;
        this.message = message;
    }
}