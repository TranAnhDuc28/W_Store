package com.wstore.repositories;

import java.util.List;

/**
 *
 * @author ducan
 * @param <E>
 */
public interface IThuocTinhRepository<E> {
    
    List<E> getAll();
    
    boolean insert(E obj);
    
    boolean update(E obj);
    
    boolean updateHienThi(E obj);
}
