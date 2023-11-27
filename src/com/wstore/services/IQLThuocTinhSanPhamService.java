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
public interface IQLThuocTinhSanPhamService<E> {

    List<E> getAll();

    boolean insert(E obj);

    boolean update(E obj, int id);

    boolean updateHienThi(E obj);
}
