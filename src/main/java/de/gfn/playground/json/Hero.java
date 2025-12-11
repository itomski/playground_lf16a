package de.gfn.playground.json;

import java.util.Arrays;

public class Hero {

    private String name;

    private String realName;

    private String[] locations;

    public Hero(String name, String realName, String[] locations) {
        this.name = name;
        this.realName = realName;
        this.locations = locations;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String[] getLocations() {
        return locations;
    }

    public void setLocations(String[] locations) {
        this.locations = locations;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Hero{");
        sb.append("name='").append(name).append('\'');
        sb.append(", realName='").append(realName).append('\'');
        sb.append(", locations=").append(Arrays.toString(locations));
        sb.append('}');
        return sb.toString();
    }
}
