package com.wstore.repositories;

import java.util.List;

/**
 *
 * @author ducan
 * @param <E>
 */
public interface IThuocTinhSanPhamRepository<E> {
    
    List<E> getAll();
    
    List<E> getAllByTrangThai(boolean trangThai);
    
    boolean insert(E obj);
    
    boolean update(E obj, int id);
    
    void updatesHienThi(List<E> list);
     
}
