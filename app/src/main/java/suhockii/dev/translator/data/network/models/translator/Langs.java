package suhockii.dev.translator.data.network.models.translator;

import com.google.gson.internal.LinkedTreeMap;

import java.util.List;
import java.util.Map;
import java.util.Set;

import suhockii.dev.translator.data.repositories.database.Lang;

/**
 * Created by Maksim Sukhotski on 4/15/2017.
 */

public class Langs {
    private Set<String> dirs;
    private Map<String, String> langs;
    private List<Lang> langsObject;

    public Langs() {
    }

    public Langs(Set<String> dirs, Map<String, String> langs) {
        this.dirs = dirs;
        this.langs = langs;
    }

    public Langs(Set<String> dirs, List<Lang> langs) {
        this.dirs = dirs;
        setLangs(langs);
    }

    public void setLangs(Map<String, String> langs) {
        this.langs = langs;
    }

    public Set<String> getDirections() {
        return dirs;
    }

    public void setDirs(Set<String> routes) {
        this.dirs = routes;
    }

    public Map<String, String> getLangs() {
        return langs;
    }

    public void setLangs(List<Lang> langs) {
        this.langsObject = langs;
        this.langs = new LinkedTreeMap<>(String::compareTo);
        for (Lang lang : langs) {
            this.langs.put(lang.getCode(), lang.getDescription());
        }
    }

    public List<Lang> getLangsObject() {
        return langsObject;
    }
}
