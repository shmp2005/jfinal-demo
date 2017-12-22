import com.jfinal.plugin.activerecord.ActiveRecordPlugin;
import com.jfinal.plugin.druid.DruidPlugin;
import model.User;

/**
 * 中巴价值投资研习社
 *
 * @ author: tangjianhua
 * @ date: 2017/12/21.
 */
public class ActiveRecordApp {
    public static void main(String[] args) {
        DruidPlugin dp = new DruidPlugin("mysql://localhost:3307/depot", "root", "User@123");
        ActiveRecordPlugin arp = new ActiveRecordPlugin(dp);
        arp.addMapping("t_user", User.class);
        dp.start();
        arp.start();

        User user = new User().dao().findById(1029);
        System.out.println(user);
    }
}
