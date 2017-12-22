package model;

import com.jfinal.plugin.activerecord.Model;

/**
 * 中巴价值投资研习社
 *
 * @ author: tangjianhua
 * @ date: 2017/12/21.
 */
public class User extends Model<User> {
    public static final User dao  = new User().dao();
}
