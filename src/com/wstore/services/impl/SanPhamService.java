/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.wstore.services.impl;

import com.wstore.domainmodels.SanPham;
import com.wstore.domainmodels.thuoctinhsanpham.ChatLieuDay;
import com.wstore.domainmodels.thuoctinhsanpham.ChatLieuKinh;
import com.wstore.domainmodels.thuoctinhsanpham.ChatLieuVo;
import com.wstore.domainmodels.thuoctinhsanpham.DongMay;
import com.wstore.domainmodels.thuoctinhsanpham.Mau;
import com.wstore.domainmodels.thuoctinhsanpham.PhongCachSanPham;
import com.wstore.domainmodels.thuoctinhsanpham.ThuongHieu;
import com.wstore.domainmodels.thuoctinhsanpham.TinhNangSanPham;
import com.wstore.domainmodels.thuoctinhsanpham.XuatXu;
import com.wstore.repositories.IPhongCachSanPhamRepository;
import com.wstore.repositories.ISanPhamRepository;
import com.wstore.repositories.ITinhNangSanPhamRepository;
import com.wstore.repositories.impl.SanPhamRepository;
import com.wstore.repositories.impl.thuoctinhsanpham.PhongCachSanPhamReporitory;
import com.wstore.repositories.impl.thuoctinhsanpham.TinhNangSanPhamRepository;
import com.wstore.services.ISanPhamService;
import com.wstore.utilities.Helper;
import com.wstore.viewmodels.QLsanpham.SanPhamViewModel;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author ducan
 */
public class SanPhamService implements ISanPhamService {

    private ISanPhamRepository sanPhamRepository = new SanPhamRepository();
    private ITinhNangSanPhamRepository tinhNangRepository = new TinhNangSanPhamRepository();
    private IPhongCachSanPhamRepository phongCachRepository = new PhongCachSanPhamReporitory();

    @Override
    public List<SanPhamViewModel> getAll(int page, int pageSize) {
        List<SanPham> listSanPham = sanPhamRepository.getAll(page, pageSize);

        List<SanPhamViewModel> listSanPhamView = new ArrayList<>();
        for (SanPham sanPham : listSanPham) {
            int idSanPham = sanPham.getId();
            Set<TinhNangSanPham> listTNSP = tinhNangRepository.getAllByIdSanPham(sanPham.getId());
            Set<PhongCachSanPham> listPCSP = phongCachRepository.getAllByIdSanPham(sanPham.getId());
            
            SanPhamViewModel sanPhamView = new SanPhamViewModel(
                    idSanPham,
                    sanPham.getMaSanPham(),
                    new ThuongHieu(sanPham.getThuongHieu().getId(), sanPham.getThuongHieu().getTenThuongHieu()),
                    sanPham.getMaHangHoa(),
                    sanPham.getGiaNhap(),
                    sanPham.getDonGia(),
                    sanPham.getSoLuongTon(),
                    sanPham.getHinhAnh(),
                    sanPham.getDoiTuongSuDung(),
                    sanPham.getDongSanPham(),
                    sanPham.getKhangNuoc(),
                    sanPham.getKhoangTruCot(),
                    sanPham.getSizeMat(),
                    sanPham.getHinhDang(),
                    sanPham.getDoDay(),
                    new DongMay(sanPham.getDongMay().getId(), sanPham.getDongMay().getTenDongMay()),
                    new ChatLieuDay(sanPham.getChatLieuDay().getId(), sanPham.getChatLieuDay().getTenChatLieuDay()),
                    new ChatLieuKinh(sanPham.getChatLieuKinh().getId(), sanPham.getChatLieuKinh().getTenChatLieuKinh()),
                    new XuatXu(sanPham.getXuatXu().getId(), sanPham.getXuatXu().getNoiXuatXu()),
                    new ChatLieuVo(sanPham.getChatLieuVo().getId(), sanPham.getChatLieuVo().getTenChatLieuVo()),
                    new Mau(sanPham.getMauVo().getId(), sanPham.getMauVo().getTenMau()),
                    Helper.removeDauNgoacVuong(listPCSP.toString()),
                    Helper.removeDauNgoacVuong(listTNSP.toString()),
                    new Mau(sanPham.getMauMat().getId(), sanPham.getMauMat().getTenMau()),
                    "",
                    sanPham.getTrangThai());
            listSanPhamView.add(sanPhamView);
        }
        return listSanPhamView;
    }

    @Override
    public String insert(SanPham sp) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String update(SanPham sp, int idSanPham) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<SanPham> findByNameOrMa(int page, int pageSize, int trangThai, String name) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int getRecordCount() {
        return sanPhamRepository.getRecordCount();
    }

}
