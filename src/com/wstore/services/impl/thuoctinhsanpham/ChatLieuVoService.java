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

    private final IThuocTinhSanPhamRepository chatLieuVoRepository
            = new ChatLieuVoRepository();

    @Override
    public List<ChatLieuVoViewModel> getAll() {
        return chatLieuVoRepository.getAll();
    }

    @Override
    public boolean insert(ChatLieuVoViewModel clv) {
        return chatLieuVoRepository.insert(clv);
    }

    @Override
    public boolean update(ChatLieuVoViewModel clv, int id) {
        return chatLieuVoRepository.update(clv, id);
    }

    @Override
    public List<ChatLieuVoViewModel> getAllByTrangThai(boolean trangThai) {
        return chatLieuVoRepository.getAllByTrangThai(trangThai);
    }

    @Override
    public void updatesHienThi(List<ChatLieuVoViewModel> list) {
        chatLieuVoRepository.updatesHienThi(list);
    }
    
    
}
