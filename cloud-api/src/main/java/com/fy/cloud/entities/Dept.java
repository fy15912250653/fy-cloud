package com.fy.cloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class Dept {
    private long id;
    private String name;
    private String dbSource;

    public long getId() {
        return id;
    }

    public Dept setId(long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Dept setName(String name) {
        this.name = name;
        return this;
    }

    public String getDbSource() {
        return dbSource;
    }

    public Dept setDbSource(String dbSource) {
        this.dbSource = dbSource;
        return this;
    }
}
