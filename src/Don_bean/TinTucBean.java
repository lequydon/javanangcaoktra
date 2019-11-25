package Don_bean;

import java.util.Date;

public class TinTucBean {
	private String matintuc;
	private String tieude;
	private String tomtat;
	private Date ngayduatin;
	private String noidung;
	public TinTucBean(String matintuc, String tieude, String tomtat, Date ngayduatin, String noidung) {
		super();
		this.matintuc = matintuc;
		this.tieude = tieude;
		this.tomtat = tomtat;
		this.ngayduatin = ngayduatin;
		this.noidung = noidung;
	}
	public String getMatintuc() {
		return matintuc;
	}
	public void setMatintuc(String matintuc) {
		this.matintuc = matintuc;
	}
	public String getTieude() {
		return tieude;
	}
	public void setTieude(String tieude) {
		this.tieude = tieude;
	}
	public String getTomtat() {
		return tomtat;
	}
	public void setTomtat(String tomtat) {
		this.tomtat = tomtat;
	}
	public Date getNgayduatin() {
		return ngayduatin;
	}
	public void setNgayduatin(Date ngayduatin) {
		this.ngayduatin = ngayduatin;
	}
	public String getNoidung() {
		return noidung;
	}
	public void setNoidung(String noidung) {
		this.noidung = noidung;
	}
}
