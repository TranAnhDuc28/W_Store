-- Query SanPham
select sp.id, sp.ma_san_pham, id_thuong_hieu, th.ten_thuong_hieu, sp.ma_hang_hoa
    , sp.gia_nhap, sp.don_gia, sp.so_luong_ton, sp.hinh_anh, sp.doi_tuong_su_dung
    , sp.dong_san_pham, sp.khang_nuoc, sp.khoang_tru_cot, sp.size_mat
    , sp.hinh_dang, sp.do_day, sp.id_dong_may, dm.ten_dong_may, sp.id_chat_lieu_day
    , cld.ten_chat_lieu_day, sp.id_chat_lieu_kinh, clk.ten_chat_lieu_kinh
    , sp.id_xuat_xu, xx.noi_xuat_xu, sp.id_chat_lieu_vo, clv.ten_chat_lieu_vo
    , sp.id_mau_vo, mv.ten_mau as mau_vo, sp.id_mau_mat, mm.ten_mau as mau_mat
	, sp.ghi_chu, sp.trang_thai
from SanPham sp 
	left join ThuongHieu th on sp.id_thuong_hieu = th.id
	left join DongMay dm on sp.id_dong_may = dm.id
	left join ChatLieuDay cld on sp.id_chat_lieu_day = cld.id
	left join ChatLieuKinh clk on sp.id_chat_lieu_kinh = clk.id
	left join ChatLieuVo clv on sp.id_chat_lieu_vo = clv.id
	left join XuatXu xx on sp.id_xuat_xu = xx.id
	left join Mau mv on sp.id_mau_vo = mv.id
	left join Mau mm on sp.id_mau_mat = mm.id
	left join TinhNangSanPham tnsp on sp.id = tnsp.id_san_pham
	left join TinhNang tn on tnsp.id_tinh_nang = tn.id
order by sp.id
offset ? rows
fetch next ? rows only;

select id from SanPham where ma_san_pham = 'SP000108'

insert into SanPham(ma_san_pham, id_thuong_hieu, ma_hang_hoa, gia_nhap, don_gia, so_luong_ton, hinh_anh, doi_tuong_su_dung, dong_san_pham, khang_nuoc, khoang_tru_cot, size_mat, hinh_dang, do_day, id_dong_may, id_chat_lieu_day, id_chat_lieu_kinh, id_xuat_xu, id_chat_lieu_vo, id_mau_vo, id_mau_mat, trang_thai) 
values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,default);


-- query DongSanPham
select id, ten_dong_san_pham, id_thuong_hieu, trang_thai 
from DongSanPham 
where id_thuong_hieu = ?;

update DongSanPham
set ten_dong_san_pham = ?
where id = ? and id_thuong_hieu = ?;


--query TinhNangSanPham
select * from TinhNang
select * from SanPham;
select * from TinhNangSanPham


select tn.id, tn.ten_tinh_nang, tn.trang_thai 
from  TinhNang tn join TinhNangSanPham tnsp on tnsp.id_tinh_nang = tn.id
where id_san_pham = ?;

insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (?, ?);

--query PhongCachSanPham
select * from PhongCach
select * from SanPham;
select * from PhongCachSanPham


select pc.id, pc.ten_phong_cach, pc.trang_thai
from PhongCach pc join PhongCachSanPham pcsp on pcsp.id_phong_cach = pc.id
where id_san_pham = 2;

--query NhanVien
select * from NhanVien

SELECT id, ma_nhan_vien , mat_khau, ho_ten, gioi_tinh, ngay_sinh, so_dien_thoai
		, can_cuoc_cong_dan, email ,dia_chi, vai_tro, hinh_anh, ghi_chu, trang_thai
FROM NhanVien
WHERE trang_thai = 1
ORDER BY id
OFFSET 1 ROWS
FETCH NEXT 1 ROWS ONLY;
