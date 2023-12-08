/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.wstore.repositories;

import com.wstore.domainmodels.SanPham;
import com.wstore.viewmodels.banhang.SanPhamBanHangViewModel;
import java.util.List;

/**
 *
 * @author ducan
 */
public interface ISanPhamRepository {

    List<SanPhamBanHangViewModel> getAllSanPhamBanHang(int page, int pageSize, int trangThai);

    List<SanPham> getAllByTrangThai(int page, int pageSize, int trangThai);

    SanPham findByMa(String ma);

    boolean insert(SanPham sp);

    boolean update(SanPham sp, int idSanPham);

    boolean updateSoLuong(Integer id, int soLuong);

    boolean updateAStatus(int trangThai, int idSanPham);

    void updateStatuses(int trangThai, List<Integer> listID);

    int getRecordCountByTrangThai(int trangThai);

    int getRecordCount();

    List<SanPham> findByNameOrMa(int page, int pageSize, String name, int trangThai);

    List<SanPhamBanHangViewModel> findByNameOrMaSanPhamBanHang(int page, int pageSize, String name, int trangThai);

    List<SanPham> filter(String condition);

    SanPhamBanHangViewModel getOne(int id);

    SanPhamBanHangViewModel findByMaHangHoa(String maHangHoa);
}
