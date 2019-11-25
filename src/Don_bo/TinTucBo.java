package Don_bo;

import java.util.ArrayList;

import Don_bean.TinTucBean;
import Don_dao.TinTucDao;
public class TinTucBo {
	TinTucDao tintucdao=new TinTucDao();
	ArrayList<TinTucBean> listtintuc=null;
	public ArrayList<TinTucBean> gettintuc(){
		listtintuc=tintucdao.gettintuc();
		return tintucdao.gettintuc();
	}
	public ArrayList<TinTucBean> timnoidung(String matintuc){
		ArrayList<TinTucBean> tam=null;
		for(TinTucBean s: listtintuc) {
			if(s.getMatintuc().equals(matintuc))
				tam.add(s);
		}
		return tam;
	}
	public ArrayList<TinTucBean> timkey(String key){
		key=key.toLowerCase();
		ArrayList<TinTucBean>tam=new ArrayList<TinTucBean>();
		for(TinTucBean s: listtintuc) {
			if(s.getTieude().toLowerCase().contains(key))
				tam.add(s);
		}
		return tam;
	}
}
