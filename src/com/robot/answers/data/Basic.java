
package com.robot.answers.data;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class Basic {

    @SerializedName("phonetic")
    @Expose
    private String phonetic;
    @SerializedName("explains")
    @Expose
    private List<String> explains = new ArrayList<String>();

    /**
     * @return The phonetic
     */
    public String getPhonetic() {
        return phonetic;
    }

    /**
     * @param phonetic
     *         The phonetic
     */
    public void setPhonetic(String phonetic) {
        this.phonetic = phonetic;
    }

    /**
     * @return The explains
     */
    public List<String> getExplains() {
        return explains;
    }

    /**
     * @param explains
     *         The explains
     */
    public void setExplains(List<String> explains) {
        this.explains = explains;
    }


}
