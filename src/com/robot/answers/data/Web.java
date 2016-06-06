
package com.robot.answers.data;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class Web {

    @SerializedName("value")
    @Expose
    private List<String> value = new ArrayList<String>();
    @SerializedName("key")
    @Expose
    private String key;

    /**
     * @return The value
     */
    public List<String> getValue() {
        return value;
    }

    /**
     * @param value
     *         The value
     */
    public void setValue(List<String> value) {
        this.value = value;
    }

    /**
     * @return The key
     */
    public String getKey() {
        return key;
    }

    /**
     * @param key
     *         The key
     */
    public void setKey(String key) {
        this.key = key;
    }


}
