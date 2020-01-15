package Day12;

import java.util.Objects;

public class JourneyTheWest {
    private String master;
    private String wuKong;
    private String baJie;
    private String shaSng;
    private String BaiLong;

    public JourneyTheWest() {
    }

    public JourneyTheWest(String master, String wuKong, String baJie, String shaSng, String baiLong) {
        this.master = master;
        this.wuKong = wuKong;
        this.baJie = baJie;
        this.shaSng = shaSng;
        BaiLong = baiLong;
    }

    public String getMaster() {
        return master;
    }

    public void setMaster(String master) {
        this.master = master;
    }

    public String getWuKong() {
        return wuKong;
    }

    public void setWuKong(String wuKong) {
        this.wuKong = wuKong;
    }

    public String getBaJie() {
        return baJie;
    }

    public void setBaJie(String baJie) {
        this.baJie = baJie;
    }

    public String getShaSng() {
        return shaSng;
    }

    public void setShaSng(String shaSng) {
        this.shaSng = shaSng;
    }

    public String getBaiLong() {
        return BaiLong;
    }

    public void setBaiLong(String baiLong) {
        BaiLong = baiLong;
    }

    @Override
    public String toString() {
        return "JourneyTheWest{" +
                "master='" + master + '\'' +
                ", wuKong='" + wuKong + '\'' +
                ", baJie='" + baJie + '\'' +
                ", shaSng='" + shaSng + '\'' +
                ", BaiLong='" + BaiLong + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        JourneyTheWest that = (JourneyTheWest) o;
        return Objects.equals(master, that.master) &&
                Objects.equals(wuKong, that.wuKong) &&
                Objects.equals(baJie, that.baJie) &&
                Objects.equals(shaSng, that.shaSng) &&
                Objects.equals(BaiLong, that.BaiLong);
    }

    @Override
    public int hashCode() {
        return Objects.hash(master, wuKong, baJie, shaSng, BaiLong);
    }
}
