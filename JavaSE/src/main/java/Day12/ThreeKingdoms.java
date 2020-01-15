package Day12;

import java.util.Objects;

/**
 * JAVA中所有的类都直接或间接继承于object类，自动拥有Object类里面的所有方法
 * toString方法用于将对象的内容格式转化为字符串输出
 */
public class ThreeKingdoms {
    private String nation;
    private String king;
    private String general;
    private int arms;

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public String getKing() {
        return king;
    }

    public void setKing(String king) {
        this.king = king;
    }

    public String getGeneral() {
        return general;
    }

    public void setGeneral(String general) {
        this.general = general;
    }

    public int getArms() {
        return arms;
    }

    public void setArms(int arms) {
        this.arms = arms;
    }

    public ThreeKingdoms() {
    }

    public ThreeKingdoms(String nation, String king, String general, int arms) {
        this.nation = nation;
        this.king = king;
        this.general = general;
        this.arms = arms;
    }

    // 为了输出对象的内容，重写Object类的toString方法

    @Override
    public String toString() {
        return "ThreeKingdoms{" +
                "nation='" + nation + '\'' +
                ", king='" + king + '\'' +
                ", general='" + general + '\'' +
                ", arms=" + arms +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ThreeKingdoms that = (ThreeKingdoms) o;
        return arms == that.arms &&
                Objects.equals(nation, that.nation) &&
                Objects.equals(king, that.king) &&
                Objects.equals(general, that.general);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nation, king, general, arms);
    }
}
