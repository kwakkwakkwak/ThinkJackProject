package domain;

import java.util.Date;

public class BoardVO {
    private Integer bno;
    private String title;
    private String content;
    private String writer;
    private Date regdate;
    private int viewcnt;
    private String categoryName;

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

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    @Override
    public String toString() {
        return "BoardVO{" +
                "bno=" + bno +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", writer='" + writer + '\'' +
                ", regdate=" + regdate +
                ", viewcnt=" + viewcnt +
                ", categoryname='" + categoryName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BoardVO)) return false;

        BoardVO boardVO = (BoardVO) o;

        if (getViewcnt() != boardVO.getViewcnt()) return false;
        if (getBno() != null ? !getBno().equals(boardVO.getBno()) : boardVO.getBno() != null) return false;
        if (getTitle() != null ? !getTitle().equals(boardVO.getTitle()) : boardVO.getTitle() != null) return false;
        if (getContent() != null ? !getContent().equals(boardVO.getContent()) : boardVO.getContent() != null)
            return false;
        if (getWriter() != null ? !getWriter().equals(boardVO.getWriter()) : boardVO.getWriter() != null) return false;
        if (getRegdate() != null ? !getRegdate().equals(boardVO.getRegdate()) : boardVO.getRegdate() != null)
            return false;
        return getCategoryName() != null ? getCategoryName().equals(boardVO.getCategoryName()) : boardVO.getCategoryName() == null;
    }
}
