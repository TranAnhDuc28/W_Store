/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.wstore.services.impl.thuoctinhsanpham;

import com.wstore.repositories.IThuocTinhSanPhamRepository;
import com.wstore.repositories.impl.thuoctinhsanpham.ChatLieuKinhRepository;
import com.wstore.services.IThuocTinhSanPhamService;
import com.wstore.viewmodels.QLsanpham.thuoctinhsanpham.ChatLieuKinhView;
import java.util.List;

/**
 *
 * @author ducan
 */
public class ChatLieuKinhService implements IThuocTinhSanPhamService<ChatLieuKinhView> {

    private final IThuocTinhSanPhamRepository chatLieuKinhRepository 
            = new ChatLieuKinhRepository();

    @Override
    public List<ChatLieuKinhView> getAll() {
        return chatLieuKinhRepository.getAll();
    }

    @Override
    public boolean insert(ChatLieuKinhView clk) {
        return chatLieuKinhRepository.insert(clk);
    }

    @Override
    public boolean update(ChatLieuKinhView clk, int id) {
        return chatLieuKinhRepository.update(clk, id);
    }

    @Override
    public boolean updateHienThi(ChatLieuKinhView clk) {
        return chatLieuKinhRepository.updateHienThi(clk);
    }
}
