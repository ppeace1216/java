package sec2;

import java.util.Date;

public class Board {
	private int number;
	private String title;
	private String contents;
	private String writer;
	private Date resdate;
	public int getNumber() {
		return number;
	}
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContents() {
		return contents;
	}

	public void setContents(String contents) {
		this.contents = contents;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public Date getResdate() {
		return resdate;
	}

	public void setResdate(Date resdate) {
		this.resdate = resdate;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public void boardWrite(int number,String title,String contents,String writer,Date resdate){
		this.number=number; this.title=title; this.contents=contents; this.writer=writer; this.resdate=resdate;
	}
	public void boardUpdate(int number,String title,String contents){
		if(number==this.number){
			this.title=title;
			this.contents=contents;
		}
	}
	public void boardDelete(int number){
		if(number==this.number){
			try{
				this.finalize();
			} catch (Throwable e){
				e.printStackTrace();
			}
		}
	}
	public void boardSearch(int number){
		if(number==this.number){
			System.out.println(this.number+"\t"+this.title+"\t"+this.contents+"\t"+this.writer+"\t"+this.resdate);
		}
	}
}
