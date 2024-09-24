package wj.template;

import java.util.Date;

public class Book {
    private String name;
    private Date pdate;

    public Book(String name, Date pdate) {
        this.name = name;
        this.pdate = pdate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getPdate() {
        return pdate;
    }

    public void setPdate(Date pdate) {
        this.pdate = pdate;
    }
}
