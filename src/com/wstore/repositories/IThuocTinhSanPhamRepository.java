package com.wstore.repositories;

import java.util.List;

/**
 *
 * @author ducan
 * @param <E>
 */
public interface IThuocTinhSanPhamRepository<E> {
    
    List<E> getAll();
    
    boolean insert(E obj);
    
    boolean update(E obj, int id);
    
    boolean updateHienThi(E obj);
}
