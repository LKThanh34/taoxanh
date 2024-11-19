package com.dev.taoxanh.domain;

import java.util.Date;

import com.mysql.cj.x.protobuf.MysqlxDatatypes.Scalar.String;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "slide_image")
public class SlideImage extends BaseModel{

    @Column(name = "name", length = 300, nullable = true)
    private String name;

    @Column(name = "path", length = 255, nullable = false)
    private String path;

    @Column(name = "description", length = 500, nullable = true)
    private String description;

    public SlideImage(Integer id, Integer createBy, Integer updateBy, Date createDate, Date updateDate, Boolean status,
            String name, String path, String description) {
        super(id, createBy, updateBy, createDate, updateDate, status);
        this.name = name;
        this.path = path;
        this.description = description;
    }

    public SlideImage(){
        super();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
