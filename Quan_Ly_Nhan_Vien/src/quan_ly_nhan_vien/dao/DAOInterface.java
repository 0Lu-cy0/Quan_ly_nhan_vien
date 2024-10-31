package quan_ly_nhan_vien.dao;

public interface DAOInterface <T>{
    public void them(T t);
    public void sua(T t);
    public void xoa(T t);
}

