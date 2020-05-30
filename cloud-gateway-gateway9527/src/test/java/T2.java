import java.time.ZonedDateTime;

/**
 * @PACKAGE_NAME: PACKAGE_NAME
 * @NAME: T2
 * @Author: 钟子豪
 * @DATE: 2020/5/17
 * @MONTH_NAME_FULL: 五月
 * @DAY: 17
 * @DAY_NAME_FULL: 星期日
 * @PROJECT_NAME: cloud2020_4
 **/
public class T2 {
    public static void main(String[] args) {
        ZonedDateTime zbj = ZonedDateTime.now(); // 默认时区
        System.out.println(zbj);
        //2020-05-17T18:51:39.779+08:00[Asia/Shanghai]
    }
}
