/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.wstore.services.impl.thuoctinhsanpham;

import com.wstore.repositories.IThuocTinhSanPhamRepository;
import com.wstore.repositories.impl.thuoctinhsanpham.ChatLieuKinhRepository;
import com.wstore.viewmodels.QLsanpham.thuoctinhsanpham.ChatLieuKinhViewModel;
import java.util.List;
import com.wstore.services.IThuocTinhSanPhamService;

/**
 *
 * @author ducan
 */
public class ChatLieuKinhService implements IThuocTinhSanPhamService<ChatLieuKinhViewModel> {

    private final IThuocTinhSanPhamRepository chatLieuKinhRepository 
            = new ChatLieuKinhRepository();

    @Override
    public List<ChatLieuKinhViewModel> getAll() {
        return chatLieuKinhRepository.getAll();
    }

    @Override
    public boolean insert(ChatLieuKinhViewModel clk) {
        return chatLieuKinhRepository.insert(clk);
    }

    @Override
    public boolean update(ChatLieuKinhViewModel clk, int id) {
        return chatLieuKinhRepository.update(clk, id);
    }

    @Override
    public List<ChatLieuKinhViewModel> getAllByTrangThai(boolean trangThai) {
        return chatLieuKinhRepository.getAllByTrangThai(trangThai);
    }

    @Override
    public void updatesHienThi(List<ChatLieuKinhViewModel> list) {
        chatLieuKinhRepository.updatesHienThi(list);
    }
    
    
}
