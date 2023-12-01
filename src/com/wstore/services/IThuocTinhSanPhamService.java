/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.wstore.services;

import java.util.List;

/**
 *
 * @author ducan
 * @param <E>
 */
public interface IThuocTinhSanPhamService<E> {

    List<E> getAll();

    List<E> getAllByTrangThai(boolean trangThai);

    boolean insert(E obj);

    boolean update(E obj, int id);

    void updatesHienThi(List<E> list);

}
