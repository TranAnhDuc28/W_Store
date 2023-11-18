/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.wstore.services.impl.thuoctinhsanpham;

import com.wstore.repositories.IThuocTinhSanPhamRepository;
import com.wstore.repositories.impl.thuoctinhsanpham.ChatLieuDayRepository;
import com.wstore.services.IThuocTinhSanPhamService;
import com.wstore.viewmodels.QLsanpham.thuoctinhsanpham.ChatLieuDayView;
import java.util.List;

/**
 *
 * @author ducan
 */
public class ChatLieuDayService implements IThuocTinhSanPhamService<ChatLieuDayView> {

    private final IThuocTinhSanPhamRepository chatLieuDayRepository = new ChatLieuDayRepository();

    @Override
    public List<ChatLieuDayView> getAll() {
        return chatLieuDayRepository.getAll();
    }

    @Override
    public boolean insert(ChatLieuDayView cld) {
        return chatLieuDayRepository.insert(cld);
    }

    @Override
    public boolean update(ChatLieuDayView cld, int id) {
        return chatLieuDayRepository.update(cld, id);
    }

    @Override
    public boolean updateHienThi(ChatLieuDayView cld) {
        return chatLieuDayRepository.updateHienThi(cld);
    }

}
