package com.wstore.repositories.impl.thuoctinhsanpham;

import java.util.List;
import com.wstore.repositories.IThuocTinhSanPhamRepository;
import com.wstore.utilities.DBConnect;
import com.wstore.viewmodels.QLsanpham.thuoctinhsanpham.ChatLieuVoViewModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ChatLieuVoRepository implements IThuocTinhSanPhamRepository<ChatLieuVoViewModel> {

    @Override
    public List<ChatLieuVoViewModel> getAll() {
        List<ChatLieuVoViewModel> list = new ArrayList<>();
        String sql = "select id, ten_chat_lieu_vo, trang_thai from ChatLieuVo";
        try (Connection cn = DBConnect.getConnection(); PreparedStatement pstm = cn.prepareStatement(sql);) {
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                ChatLieuVoViewModel clv = new ChatLieuVoViewModel();
                clv.setIdChatLieuVo(rs.getInt("id"));
                clv.setTenChatLieuVo(rs.getString("ten_chat_lieu_vo"));
                clv.setHienThi(rs.getBoolean("trang_thai"));
                list.add(clv);
            }
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return list;
    }

    @Override
    public List<ChatLieuVoViewModel> getAllByTrangThai(boolean trangThai) {
        List<ChatLieuVoViewModel> list = new ArrayList<>();
        String sql = "select id, ten_chat_lieu_vo, trang_thai from ChatLieuVo where trang_thai = ?";
        try (Connection cn = DBConnect.getConnection(); PreparedStatement pstm = cn.prepareStatement(sql);) {
            pstm.setBoolean(1, trangThai);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                ChatLieuVoViewModel clv = new ChatLieuVoViewModel();
                clv.setIdChatLieuVo(rs.getInt("id"));
                clv.setTenChatLieuVo(rs.getString("ten_chat_lieu_vo"));
                clv.setHienThi(rs.getBoolean("trang_thai"));
                list.add(clv);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public boolean insert(ChatLieuVoViewModel clv) {
        int checkInsert = 0;
        String sql = "insert into ChatLieuVo(ten_chat_lieu_vo, trang_thai) values (?, default);";
        try (Connection cn = DBConnect.getConnection(); PreparedStatement pstm = cn.prepareStatement(sql);) {
            pstm.setString(1, clv.getTenChatLieuVo());
            checkInsert = pstm.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return checkInsert > 0;
    }

    @Override
    public boolean update(ChatLieuVoViewModel clv, int id) {
        int checkUpdate = 0;
        String sql = "update ChatLieuVo\n"
                + "set ten_chat_lieu_vo = ?\n"
                + "where id = ?;";
        try (Connection cn = DBConnect.getConnection(); PreparedStatement pstm = cn.prepareStatement(sql);) {
            pstm.setString(1, clv.getTenChatLieuVo());
            pstm.setInt(2, id);
            checkUpdate = pstm.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return checkUpdate > 0;
    }

    @Override
    public void updatesHienThi(List<ChatLieuVoViewModel> list) {
        int results[];
        String sql = "update ChatLieuVo set trang_thai = ? where id = ?;";
        try (Connection cn = DBConnect.getConnection();) {
            cn.setAutoCommit(false);
            try (PreparedStatement pstm = cn.prepareStatement(sql);) {
                for (ChatLieuVoViewModel clv : list) {
                    pstm.setBoolean(1, clv.getHienThi());
                    pstm.setInt(2, clv.getIdChatLieuVo());
                    pstm.addBatch();
                }
                // chạy batch và lấy kết quả
                results = pstm.executeBatch();
                // check lỗi
                for (int i = 0; i < results.length; i++) {
                    if (results[i] == PreparedStatement.EXECUTE_FAILED) {
                        System.out.println("Error in statement at index " + i);
                    }
                }
                cn.commit();
            } catch (SQLException e) {
                e.printStackTrace();
                cn.rollback();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
