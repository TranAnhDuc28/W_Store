package com.wstore.repositories.impl.thuoctinhsanpham;

import com.wstore.domainmodels.thuoctinhsanpham.ChatLieuKinh;
import java.util.List;
import com.wstore.repositories.IThuocTinhSanPhamRepository;
import com.wstore.utilities.DBConnect;
import com.wstore.viewmodels.QLsanpham.thuoctinhsanpham.ChatLieuKinhView;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class ChatLieuKinhRepository implements IThuocTinhSanPhamRepository<ChatLieuKinhView> {

    @Override
    public List<ChatLieuKinhView> getAll() {
        List<ChatLieuKinhView> list = new ArrayList<>();
        String sql = "select id, ten_chat_lieu_kinh, trang_thai from ChatLieuKinh";
        try (Connection cn = DBConnect.getConnection(); PreparedStatement pstm = cn.prepareStatement(sql);) {
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                ChatLieuKinhView clk = new ChatLieuKinhView(
                        rs.getInt("id"),
                        rs.getString("ten_chat_lieu_kinh"),
                        rs.getBoolean("trang_thai"));
                list.add(clk);
            }
            return list;
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

    @Override
    public boolean insert(ChatLieuKinhView clk) {
        int checkInsert = 0;
        String sql = "insert into ChatLieuKinh(ten_chat_lieu_kinh, trang_thai) values (?, default);";
        try (Connection cn = DBConnect.getConnection(); PreparedStatement pstm = cn.prepareStatement(sql);) {
            pstm.setString(1, clk.getTenChatLieuKinh());
            checkInsert = pstm.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return checkInsert > 0;
    }

    @Override
    public boolean update(ChatLieuKinhView clk, int id) {
        int checkUpdate = 0;
        String sql = "update ChatLieuKinh set ten_chat_lieu_kinh = ? where id = ?";
        try (Connection cn = DBConnect.getConnection(); PreparedStatement pstm = cn.prepareStatement(sql);) {
            pstm.setString(1, clk.getTenChatLieuKinh());
            pstm.setInt(2, id);
            checkUpdate = pstm.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return checkUpdate > 0;
    }

    @Override
    public boolean updateHienThi(ChatLieuKinhView clk) {
        String sql = "update ChatLieuKinh set trang_thai =? where id=?";
        return true;
    }

}
