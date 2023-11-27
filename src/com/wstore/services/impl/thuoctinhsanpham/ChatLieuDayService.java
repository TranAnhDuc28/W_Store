/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.wstore.services.impl.thuoctinhsanpham;

import com.wstore.repositories.IThuocTinhSanPhamRepository;
import com.wstore.repositories.impl.thuoctinhsanpham.ChatLieuDayRepository;
import com.wstore.viewmodels.QLsanpham.thuoctinhsanpham.ChatLieuDayViewModel;
import java.util.List;
import com.wstore.services.IQLThuocTinhSanPhamService;

/**
 *
 * @author ducan
 */
public class ChatLieuDayService implements IQLThuocTinhSanPhamService<ChatLieuDayViewModel> {

    private final IThuocTinhSanPhamRepository chatLieuDayRepository = new ChatLieuDayRepository();

    @Override
    public List<ChatLieuDayViewModel> getAll() {
        return chatLieuDayRepository.getAll();
    }

    @Override
    public boolean insert(ChatLieuDayViewModel cld) {
        return chatLieuDayRepository.insert(cld);
    }

    @Override
    public boolean update(ChatLieuDayViewModel cld, int id) {
        return chatLieuDayRepository.update(cld, id);
    }

    @Override
    public boolean updateHienThi(ChatLieuDayViewModel cld) {
        return chatLieuDayRepository.updateHienThi(cld);
    }

}
