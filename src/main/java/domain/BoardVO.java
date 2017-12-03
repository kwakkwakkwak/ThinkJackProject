package domain;

import java.util.Date;

public class BoardVO {
    private Integer bno;
    private String title;
    private String content;
    private int writer;
    private Date regdate;
    private int viewcnt;
    private String categoryname;

    public Integer getBno() {
        return bno;
    }

    public void setBno(Integer bno) {
        this.bno = bno;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getWriter() {
        return writer;
    }

    public void setWriter(int writer) {
        this.writer = writer;
    }

    public Date getRegdate() {
        return regdate;
    }

    public void setRegdate(Date regdate) {
        this.regdate = regdate;
    }

    public int getViewcnt() {
        return viewcnt;
    }

    public void setViewcnt(int viewcnt) {
        this.viewcnt = viewcnt;
    }

    public String getCategoryname() {
        return categoryname;
    }

    public void setCategoryname(String categoryname) {
        this.categoryname = categoryname;
    }


    @Override
    public String toString() {
        return "BoardVO{" +
                "bno=" + bno +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", writer=" + writer +
                ", regdate=" + regdate +
                ", viewcnt=" + viewcnt +
                ", categoryname='" + categoryname + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BoardVO)) return false;

        BoardVO boardVO = (BoardVO) o;

        if (getWriter() != boardVO.getWriter()) return false;
        if (getViewcnt() != boardVO.getViewcnt()) return false;
        if (getBno() != null ? !getBno().equals(boardVO.getBno()) : boardVO.getBno() != null) return false;
        if (getTitle() != null ? !getTitle().equals(boardVO.getTitle()) : boardVO.getTitle() != null) return false;
        if (getContent() != null ? !getContent().equals(boardVO.getContent()) : boardVO.getContent() != null)
            return false;
        if (getRegdate() != null ? !getRegdate().equals(boardVO.getRegdate()) : boardVO.getRegdate() != null)
            return false;
        return getCategoryname() != null ? getCategoryname().equals(boardVO.getCategoryname()) : boardVO.getCategoryname() == null;
    }
}
