/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.wstore.services.impl.thuoctinhsanpham;

import com.wstore.repositories.IThuocTinhSanPhamRepository;
import com.wstore.repositories.impl.thuoctinhsanpham.ChatLieuVoRepository;
import com.wstore.viewmodels.QLsanpham.thuoctinhsanpham.ChatLieuVoViewModel;
import java.util.List;
import com.wstore.services.IThuocTinhSanPhamService;

/**
 *
 * @author ducan
 */
public class ChatLieuVoService implements IThuocTinhSanPhamService<ChatLieuVoViewModel>{

    private final IThuocTinhSanPhamRepository chatLieuRepository
            = new ChatLieuVoRepository();

    @Override
    public List<ChatLieuVoViewModel> getAll() {
        return chatLieuRepository.getAll();
    }

    @Override
    public boolean insert(ChatLieuVoViewModel clv) {
        return chatLieuRepository.insert(clv);
    }

    @Override
    public boolean update(ChatLieuVoViewModel clv, int id) {
        return chatLieuRepository.update(clv, id);
    }

    @Override
    public boolean updateHienThi(ChatLieuVoViewModel clv) {
        return chatLieuRepository.updateHienThi(clv);
    }
}
