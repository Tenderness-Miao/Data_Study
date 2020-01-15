package Day17;

import java.util.Objects;

public class KeyNum {
    private int key;

    public KeyNum() {
    }

    public KeyNum(int key) {
        this.key = key;
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    @Override
    public String toString() {
        return "KeyNum{" +
                "key=" + key +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        KeyNum keyNum = (KeyNum) o;
        return key == keyNum.key;
    }

    @Override
    public int hashCode() {
        return Objects.hash(key);
    }
}
