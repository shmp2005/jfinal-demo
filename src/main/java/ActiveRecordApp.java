import com.jfinal.plugin.activerecord.ActiveRecordPlugin;
import com.jfinal.plugin.activerecord.Db;
import com.jfinal.plugin.activerecord.IAtom;
import com.jfinal.plugin.druid.DruidPlugin;
import model.User;

import java.sql.SQLException;

/**
 * 中巴价值投资研习社
 *
 * @ author: tang jian hua
 * @ date: 2017/12/21.
 */
public class ActiveRecordApp {
    public static void main(String[] args) {
        final String mysqlUrl = "jdbc:mysql://localhost:3306/homestead?useSSL=false";
        DruidPlugin dp = new DruidPlugin(mysqlUrl, "root", null);
        ActiveRecordPlugin arp = new ActiveRecordPlugin(dp);
        arp.addMapping("users", User.class);
        dp.start();
        arp.start();

        boolean succeed = Db.tx(new IAtom() {
            public boolean run() throws SQLException {
                User user = new User();
                user.set("name", "tang22")
                        .set("password", "p2")
                        .set("email", "shmp2020@163.com")
                        .save();
                return true;
            }
        });


    }
}
