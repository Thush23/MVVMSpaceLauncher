
package com.example.MVVMShuttleLauncher.data;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Launch {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("windowstart")
    @Expose
    private String windowstart;
    @SerializedName("windowend")
    @Expose
    private String windowend;
    @SerializedName("net")
    @Expose
    private String net;
    @SerializedName("wsstamp")
    @Expose
    private Integer wsstamp;
    @SerializedName("westamp")
    @Expose
    private Integer westamp;
    @SerializedName("netstamp")
    @Expose
    private Integer netstamp;
    @SerializedName("isostart")
    @Expose
    private String isostart;
    @SerializedName("isoend")
    @Expose
    private String isoend;
    @SerializedName("isonet")
    @Expose
    private String isonet;
    @SerializedName("status")
    @Expose
    private Integer status;
    @SerializedName("inhold")
    @Expose
    private Integer inhold;
    @SerializedName("tbdtime")
    @Expose
    private Integer tbdtime;
    @SerializedName("vidURLs")
    @Expose
    private List<String> vidURLs = null;
    @SerializedName("vidURL")
    @Expose
    private String vidURL;
    @SerializedName("infoURLs")
    @Expose
    private List<Object> infoURLs = null;
    @SerializedName("infoURL")
    @Expose
    private Object infoURL;
    @SerializedName("holdreason")
    @Expose
    private Object holdreason;
    @SerializedName("failreason")
    @Expose
    private Object failreason;
    @SerializedName("tbddate")
    @Expose
    private Integer tbddate;
    @SerializedName("probability")
    @Expose
    private Integer probability;
    @SerializedName("hashtag")
    @Expose
    private Object hashtag;
    @SerializedName("location")
    @Expose
    private Location location;
    @SerializedName("rocket")
    @Expose
    private Rocket rocket;
    @SerializedName("missions")
    @Expose
    private List<Mission> missions = null;
    @SerializedName("lsp")
    @Expose
    private Lsp lsp;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWindowstart() {
        return windowstart;
    }

    public void setWindowstart(String windowstart) {
        this.windowstart = windowstart;
    }

    public String getWindowend() {
        return windowend;
    }

    public void setWindowend(String windowend) {
        this.windowend = windowend;
    }

    public String getNet() {
        return net;
    }

    public void setNet(String net) {
        this.net = net;
    }

    public Integer getWsstamp() {
        return wsstamp;
    }

    public void setWsstamp(Integer wsstamp) {
        this.wsstamp = wsstamp;
    }

    public Integer getWestamp() {
        return westamp;
    }

    public void setWestamp(Integer westamp) {
        this.westamp = westamp;
    }

    public Integer getNetstamp() {
        return netstamp;
    }

    public void setNetstamp(Integer netstamp) {
        this.netstamp = netstamp;
    }

    public String getIsostart() {
        return isostart;
    }

    public void setIsostart(String isostart) {
        this.isostart = isostart;
    }

    public String getIsoend() {
        return isoend;
    }

    public void setIsoend(String isoend) {
        this.isoend = isoend;
    }

    public String getIsonet() {
        return isonet;
    }

    public void setIsonet(String isonet) {
        this.isonet = isonet;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getInhold() {
        return inhold;
    }

    public void setInhold(Integer inhold) {
        this.inhold = inhold;
    }

    public Integer getTbdtime() {
        return tbdtime;
    }

    public void setTbdtime(Integer tbdtime) {
        this.tbdtime = tbdtime;
    }

    public List<String> getVidURLs() {
        return vidURLs;
    }

    public void setVidURLs(List<String> vidURLs) {
        this.vidURLs = vidURLs;
    }

    public String getVidURL() {
        return vidURL;
    }

    public void setVidURL(String vidURL) {
        this.vidURL = vidURL;
    }

    public List<Object> getInfoURLs() {
        return infoURLs;
    }

    public void setInfoURLs(List<Object> infoURLs) {
        this.infoURLs = infoURLs;
    }

    public Object getInfoURL() {
        return infoURL;
    }

    public void setInfoURL(Object infoURL) {
        this.infoURL = infoURL;
    }

    public Object getHoldreason() {
        return holdreason;
    }

    public void setHoldreason(Object holdreason) {
        this.holdreason = holdreason;
    }

    public Object getFailreason() {
        return failreason;
    }

    public void setFailreason(Object failreason) {
        this.failreason = failreason;
    }

    public Integer getTbddate() {
        return tbddate;
    }

    public void setTbddate(Integer tbddate) {
        this.tbddate = tbddate;
    }

    public Integer getProbability() {
        return probability;
    }

    public void setProbability(Integer probability) {
        this.probability = probability;
    }

    public Object getHashtag() {
        return hashtag;
    }

    public void setHashtag(Object hashtag) {
        this.hashtag = hashtag;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Rocket getRocket() {
        return rocket;
    }

    public void setRocket(Rocket rocket) {
        this.rocket = rocket;
    }

    public List<Mission> getMissions() {
        return missions;
    }

    public void setMissions(List<Mission> missions) {
        this.missions = missions;
    }

    public Lsp getLsp() {
        return lsp;
    }

    public void setLsp(Lsp lsp) {
        this.lsp = lsp;
    }

}
