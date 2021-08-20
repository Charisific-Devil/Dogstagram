package com.example.dogstagram.Dog_DB;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity (tableName = "data")
public class Data {

    @PrimaryKey (autoGenerate = true)
    public int uid;

    @ColumnInfo(name = "breed")
    public String breed;

    @ColumnInfo(name = "life_span")
    public String lifeSpan;

    @ColumnInfo(name = "origin")
    public String origin;

    @ColumnInfo(name = "temperament")
    public String temperament;

    @ColumnInfo(name = "imageURL")
    public String imageURL;

    @ColumnInfo(name = "height")
    public String height;

    @ColumnInfo(name = "weight")
    public String weight;
}
