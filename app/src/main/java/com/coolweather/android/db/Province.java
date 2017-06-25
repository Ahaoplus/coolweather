package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by AhaoPlus on 2017/6/25.
 * 添加set和get方法
 * 方式一：Code-->Generate
 * 方式二：通过快捷键Command+N
 */

public class Province extends DataSupport {

    private int id;

    private String provinceName;

    private int provinceCode;

    /*setters*/
    public void setId(int id) {
        this.id = id;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }

    /*getters*/
    public int getId() {
        return id;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public int getProvinceCode() {
        return provinceCode;
    }
}
