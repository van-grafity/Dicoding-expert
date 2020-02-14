package com.ivan.mysubmissionone.model;

import android.os.Parcel;
import android.os.Parcelable;

public class Movie implements Parcelable {
    private int image;
    private String title;
    private String date;
    private String overview;
    private String featured_crew;

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }

    public String getFeatured_crew() {
        return featured_crew;
    }

    public void setFeatured_crew(String featured_crew) {
        this.featured_crew = featured_crew;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(this.image);
        dest.writeString(this.title);
        dest.writeString(this.date);
        dest.writeString(this.overview);
        dest.writeString(this.featured_crew);
    }

    public Movie() {
    }

    protected Movie(Parcel in) {
        this.image = in.readInt();
        this.title = in.readString();
        this.date = in.readString();
        this.overview = in.readString();
        this.featured_crew = in.readString();
    }

    public static final Parcelable.Creator<Movie> CREATOR = new Parcelable.Creator<Movie>() {
        @Override
        public Movie createFromParcel(Parcel source) {
            return new Movie(source);
        }

        @Override
        public Movie[] newArray(int size) {
            return new Movie[size];
        }
    };
}
