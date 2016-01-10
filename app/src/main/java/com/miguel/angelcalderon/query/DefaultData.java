package com.miguel.angelcalderon.query;

import com.activeandroid.Model;
import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;
import com.activeandroid.query.Select;

import java.util.List;

@Table(name = "Defaults")
public class DefaultData extends Model {

    @Column(name = "DefaultsDa")
    public String defaultData;

    public DefaultData() {}

    public List<DefaultData> defaultDatas () {
        return new Select()
                .from(DefaultData.class)
                .execute();
    }
}
