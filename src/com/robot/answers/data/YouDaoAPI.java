
package com.robot.answers.data;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class YouDaoAPI {

    @SerializedName("translation")
    @Expose
    private List<String> translation = new ArrayList<String>();
    @SerializedName("basic")
    @Expose
    private Basic basic;
    @SerializedName("query")
    @Expose
    private String query;
    @SerializedName("errorCode")
    @Expose
    private long errorCode;
    @SerializedName("web")
    @Expose
    private List<Web> web = new ArrayList<Web>();

    /**
     * @return The translation
     */
    public List<String> getTranslation() {
        return translation;
    }

    /**
     * @param translation
     *         The translation
     */
    public void setTranslation(List<String> translation) {
        this.translation = translation;
    }

    /**
     * @return The basic
     */
    public Basic getBasic() {
        return basic;
    }

    /**
     * @param basic
     *         The basic
     */
    public void setBasic(Basic basic) {
        this.basic = basic;
    }

    /**
     * @return The query
     */
    public String getQuery() {
        return query;
    }

    /**
     * @param query
     *         The query
     */
    public void setQuery(String query) {
        this.query = query;
    }

    /**
     * @return The errorCode
     */
    public long getErrorCode() {
        return errorCode;
    }

    /**
     * @param errorCode
     *         The errorCode
     */
    public void setErrorCode(long errorCode) {
        this.errorCode = errorCode;
    }

    /**
     * @return The web
     */
    public List<Web> getWeb() {
        return web;
    }

    /**
     * @param web
     *         The web
     */
    public void setWeb(List<Web> web) {
        this.web = web;
    }
}
