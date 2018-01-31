package com.example.per6.jsontest;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

    public class Strike {

        @SerializedName("_id")
        @Expose
        private String id;
        @SerializedName("number")
        @Expose
        private Integer number;

        @Override
        public String toString() {
            return "Strike{" +
                    "id='" + id + '\'' +
                    ", number=" + number +
                    ", country='" + country + '\'' +
                    '}';
        }

        @SerializedName("country")
        @Expose
        private String country;
        @SerializedName("date")
        @Expose
        private String date;
        @SerializedName("narrative")
        @Expose
        private String narrative;
        @SerializedName("town")
        @Expose
        private String town;
        @SerializedName("location")
        @Expose
        private String location;
        @SerializedName("deaths")
        @Expose
        private String deaths;
        @SerializedName("deaths_min")
        @Expose
        private String deathsMin;
        @SerializedName("deaths_max")
        @Expose
        private String deathsMax;
        @SerializedName("civilians")
        @Expose
        private String civilians;
        @SerializedName("injuries")
        @Expose
        private String injuries;
        @SerializedName("children")
        @Expose
        private String children;
        @SerializedName("tweet_id")
        @Expose
        private String tweetId;
        @SerializedName("bureau_id")
        @Expose
        private String bureauId;
        @SerializedName("bij_summary_short")
        @Expose
        private String bijSummaryShort;
        @SerializedName("bij_link")
        @Expose
        private String bijLink;
        @SerializedName("target")
        @Expose
        private String target;
        @SerializedName("lat")
        @Expose
        private String lat;
        @SerializedName("lon")
        @Expose
        private String lon;
        @SerializedName("articles")
        @Expose
        private List<Object> articles = null;
        @SerializedName("names")
        @Expose
        private List<String> names = null;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public Integer getNumber() {
            return number;
        }

        public void setNumber(Integer number) {
            this.number = number;
        }

        public String getCountry() {
            return country;
        }

        public void setCountry(String country) {
            this.country = country;
        }

        public String getDate() {
            return date;
        }

        public void setDate(String date) {
            this.date = date;
        }

        public String getNarrative() {
            return narrative;
        }

        public void setNarrative(String narrative) {
            this.narrative = narrative;
        }

        public String getTown() {
            return town;
        }

        public void setTown(String town) {
            this.town = town;
        }

        public String getLocation() {
            return location;
        }

        public void setLocation(String location) {
            this.location = location;
        }

        public String getDeaths() {
            return deaths;
        }

        public void setDeaths(String deaths) {
            this.deaths = deaths;
        }

        public String getDeathsMin() {
            return deathsMin;
        }

        public void setDeathsMin(String deathsMin) {
            this.deathsMin = deathsMin;
        }

        public String getDeathsMax() {
            return deathsMax;
        }

        public void setDeathsMax(String deathsMax) {
            this.deathsMax = deathsMax;
        }

        public String getCivilians() {
            return civilians;
        }

        public void setCivilians(String civilians) {
            this.civilians = civilians;
        }

        public String getInjuries() {
            return injuries;
        }

        public void setInjuries(String injuries) {
            this.injuries = injuries;
        }

        public String getChildren() {
            return children;
        }

        public void setChildren(String children) {
            this.children = children;
        }

        public String getTweetId() {
            return tweetId;
        }

        public void setTweetId(String tweetId) {
            this.tweetId = tweetId;
        }

        public String getBureauId() {
            return bureauId;
        }

        public void setBureauId(String bureauId) {
            this.bureauId = bureauId;
        }

        public String getBijSummaryShort() {
            return bijSummaryShort;
        }

        public void setBijSummaryShort(String bijSummaryShort) {
            this.bijSummaryShort = bijSummaryShort;
        }

        public String getBijLink() {
            return bijLink;
        }

        public void setBijLink(String bijLink) {
            this.bijLink = bijLink;
        }

        public String getTarget() {
            return target;
        }

        public void setTarget(String target) {
            this.target = target;
        }

        public String getLat() {
            return lat;
        }

        public void setLat(String lat) {
            this.lat = lat;
        }

        public String getLon() {
            return lon;
        }

        public void setLon(String lon) {
            this.lon = lon;
        }

        public List<Object> getArticles() {
            return articles;
        }

        public void setArticles(List<Object> articles) {
            this.articles = articles;
        }

        public List<String> getNames() {
            return names;
        }

        public void setNames(List<String> names) {
            this.names = names;
        }
}
