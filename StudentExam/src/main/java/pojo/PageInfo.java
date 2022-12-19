package pojo;

import java.util.List;

public class PageInfo {
    public Integer code;
    private String msg;
    private Integer count;
    private List<Student> data;

    public PageInfo(int i, String s, int i1, List<Student> list) {
    }

    @Override
    public String toString() {
        return "PageInfo{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                ", count=" + count +
                ", data=" + data +
                '}';
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public List<Student> getData() {
        return data;
    }

    public void setData(List<Student> data) {
        this.data = data;
    }
}
