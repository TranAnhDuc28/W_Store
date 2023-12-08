/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.wstore.services;

import com.wstore.domainmodels.SanPham;
import com.wstore.viewmodels.QLsanpham.SanPhamViewModel;
import com.wstore.viewmodels.banhang.SanPhamBanHangViewModel;
import java.util.List;
import java.util.Map;

/**
 *
 * @author ducan
 */
public interface ISanPhamService {

    List<SanPhamViewModel> getAll(int page, int pageSize, int trangThai);

    List<SanPhamBanHangViewModel> getAllSanPhamBanHang(int page, int pageSize, int trangThai);

    SanPham findByMa(String ma);

    boolean insert(SanPham sp);

    boolean update(SanPham sp, int idSanPham);

    void updateSoLuong(Map<SanPhamBanHangViewModel, Integer> sanPham);

    boolean updateAStatus(int trangThai, int idSanPham);

    void updateStatuses(int trangThai, List<Integer> listID);

    List<SanPhamViewModel> findSPByNameOrMa(int page, int pageSize, String name, int trangThai);

    List<SanPhamBanHangViewModel> findSPBanHangByNameOrMa(int page, int pageSize, String name, int trangThai);

    int getRecordCount();

    int getRecordCountByTrangThai(int trangThai);

    String getMaSanPhamTuDongSinh();

    SanPhamBanHangViewModel getOne(int id);

    SanPhamBanHangViewModel findByMaHangHoa(String maHangHoa);

}
