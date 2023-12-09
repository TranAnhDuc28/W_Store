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
order by sp.id
offset 0 rows
fetch next 100 rows only;

select *
from SanPham

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
where sp.ma_san_pham like '%%' or sp.ma_hang_hoa like '%06%' or th.ten_thuong_hieu like '%%'
order by sp.id
offset ? rows
fetch next ? rows only;

-- san pham ban hang
select sp.id,  sp.hinh_anh, sp.ma_san_pham, th.ten_thuong_hieu, sp.ma_hang_hoa
    , sp.don_gia, sp.so_luong_ton,
	case
        when ctkm.hinh_thuc_giam_gia = N'Phần trăm' then (sp.don_gia * (1 -  CAST(ctkm.gia_tri_giam AS decimal(10, 0))/100))
        when ctkm.hinh_thuc_giam_gia = N'Tiền mặt' then sp.don_gia - ctkm.gia_tri_giam
        else sp.don_gia
    end as gia_khuyen_mai
from SanPham sp
	left join ThuongHieu th on sp.id_thuong_hieu = th.id
	left join SanPhamKhuyenMai spkm on sp.id = spkm.id_san_pham
	left join ChuongTrinhKhuyenMai ctkm on spkm.id_chuong_trinh_khuyen_mai = ctkm.id
where sp.trang_thai = 0
order by sp.id
offset 0 rows
fetch next 200 rows only;


update SanPham set so_luong_ton = ? where id = ?;


select * from SanPham


insert into SanPham
	(ma_san_pham, id_thuong_hieu, ma_hang_hoa, gia_nhap, don_gia, so_luong_ton, hinh_anh, doi_tuong_su_dung
	, dong_san_pham, khang_nuoc, khoang_tru_cot, size_mat, hinh_dang, do_day, id_dong_may
	, id_chat_lieu_day, id_chat_lieu_kinh, id_xuat_xu, id_chat_lieu_vo, id_mau_vo, id_mau_mat, ghi_chu, trang_thai)
values
	(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, default);


update SanPham
set ma_san_pham = ?, id_thuong_hieu = ?, ma_hang_hoa = ?, gia_nhap = ?, don_gia = ?, so_luong_ton = ?, hinh_anh = ?, doi_tuong_su_dung = ?
	, dong_san_pham = ?, khang_nuoc = ?, khoang_tru_cot = ?, size_mat = ?, hinh_dang = ?, do_day = ?, id_dong_may = ?
	, id_chat_lieu_day = ?, id_chat_lieu_kinh = ?, id_xuat_xu = ?, id_chat_lieu_vo = ?, id_mau_vo = ?, id_mau_mat = ?, ghi_chu = ?
where id = ?;

update SanPham
set id_dong_may = 0
where id = 111;

-- query thuoc tinh san pham

update ThuongHieu set trang_thai = false where id = ?;

select *
from DongMay

-- query DongSanPham
select id, ten_dong_san_pham, id_thuong_hieu, trang_thai
from DongSanPham
where id_thuong_hieu = ?;

update DongSanPham
set ten_dong_san_pham = ?
where id = ? and id_thuong_hieu = ?;



--query TinhNangSanPham
select *
from TinhNang
select *
from SanPham;
select *
from TinhNangSanPham


select tn.id, tn.ten_tinh_nang, tn.trang_thai
from TinhNang tn join TinhNangSanPham tnsp on tnsp.id_tinh_nang = tn.id
where id_san_pham = ?;

insert into TinhNangSanPham
	(id_san_pham, id_tinh_nang)
values
	(?, ?);

--query PhongCachSanPham
select *
from PhongCach
select *
from SanPham;
select *
from PhongCachSanPham


select pc.id, pc.ten_phong_cach, pc.trang_thai
from PhongCach pc join PhongCachSanPham pcsp on pcsp.id_phong_cach = pc.id
where id_san_pham = 2;

--query NhanVien
select *
from NhanVien

select id, ma_nhan_vien , mat_khau, ho_ten, gioi_tinh, ngay_sinh, so_dien_thoai
		, can_cuoc_cong_dan, email , dia_chi, vai_tro, ngay_tao, hinh_anh, ghi_chu, trang_thai
from NhanVien
where trang_thai = 1
order by id
offset 0 rows
fetch next 100 rows only;

select *
from NhanVien
order by id
offset 10 rows
fetch next 10 rows only;

select *
from SanPham
order by id
offset 100 rows
fetch next 100 rows only;

insert into NhanVien
	(ma_nhan_vien, mat_khau, ho_ten, gioi_tinh, ngay_sinh
	, can_cuoc_cong_dan, dia_chi, so_dien_thoai, email, vai_tro
	, hinh_anh, ghi_chu, trang_thai)
values
	(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, default);

update NhanVien
set ho_ten = ?, gioi_tinh = ?, ngay_sinh = ?, can_cuoc_cong_dan = ?, 
dia_chi = ?, so_dien_thoai = ?, email = ?, vai_tro = ?, hinh_anh = ?, ghi_chu = ?
where id = ?;

select *
from NhanVien
where ho_ten like N'%%'


-- query HoaDon
select *
from HoaDon

select hd.id, ma_hoa_don, hd.ngay_tao, ten_khach_hang, hd.so_dien_thoai, hd.dia_chi
		, ngay_thanh_toan, ngay_giao_hang, tien_ship, tien_coc, ngay_nhan_hang, httt.loai_hinh_thanh_toan
		, sum(hdct.so_luong * hdct.don_gia_khuyen_mai) as tong_tien, hd.ghi_chu, hd.trang_thai
		, id_nhan_vien, nv.ma_nhan_vien, nv.ho_ten, id_khach_hang
from HoaDon hd left join NhanVien nv on hd.id_nhan_vien = nv.id
	left join KhachHang kh on hd.id_khach_hang = kh.id
	left join HoaDonChiTiet hdct on hd.id = hdct.id_hoa_don
	left join HinhThucThanhToan httt on hd.id = httt.id_hoa_don
group by  hd.id, ma_hoa_don, hd.ngay_tao, ten_khach_hang, hd.so_dien_thoai, hd.dia_chi
		, ngay_thanh_toan, ngay_giao_hang, tien_ship, tien_coc, ngay_nhan_hang, httt.loai_hinh_thanh_toan
		, hd.ghi_chu, hd.trang_thai, id_nhan_vien, nv.ma_nhan_vien, nv.ho_ten, id_khach_hang
order by hd.id
offset 0 rows
fetch next 10 rows only


select hd.id, ma_hoa_don, hd.ngay_tao, ten_khach_hang, hd.so_dien_thoai, hd.dia_chi
		, ngay_thanh_toan, ngay_giao_hang, tien_ship, tien_coc, ngay_nhan_hang, httt.loai_hinh_thanh_toan
		, sum(hdct.so_luong * hdct.don_gia) as tong_tien, hd.ghi_chu, hd.trang_thai
		, id_nhan_vien, nv.ma_nhan_vien, nv.ho_ten, id_khach_hang
from HoaDon hd left join NhanVien nv on hd.id_nhan_vien = nv.id
	left join KhachHang kh on hd.id_khach_hang = kh.id
	left join HoaDonChiTiet hdct on hd.id = hdct.id_hoa_don
	left join HinhThucThanhToan httt on hd.id = httt.id_hoa_don
group by  hd.id, ma_hoa_don, hd.ngay_tao, ten_khach_hang, hd.so_dien_thoai, hd.dia_chi
		, ngay_thanh_toan, ngay_giao_hang, tien_ship, tien_coc, ngay_nhan_hang, httt.loai_hinh_thanh_toan
		, hd.ghi_chu, hd.trang_thai, id_nhan_vien, nv.ma_nhan_vien, nv.ho_ten, id_khach_hang
having hd.ngay_tao between '2023-12-06' and '2023-12-07'
order by hd.id
offset 0 rows
fetch next 10 rows only


-- tìm kiếm hóa đơn
select hd.id, ma_hoa_don, hd.ngay_tao, ten_khach_hang, hd.so_dien_thoai, hd.dia_chi
		, ngay_thanh_toan, ngay_giao_hang, tien_ship, tien_coc, ngay_nhan_hang, httt.loai_hinh_thanh_toan
		, sum(hdct.so_luong * hdct.don_gia) as tong_tien, hd.ghi_chu, hd.trang_thai
		, id_nhan_vien, nv.ma_nhan_vien, nv.ho_ten, id_khach_hang
from HoaDon hd left join NhanVien nv on hd.id_nhan_vien = nv.id
	left join KhachHang kh on hd.id_khach_hang = kh.id
	left join HoaDonChiTiet hdct on hd.id = hdct.id_hoa_don
	left join HinhThucThanhToan httt on hd.id = httt.id_hoa_don
group by  hd.id, ma_hoa_don, hd.ngay_tao, ten_khach_hang, hd.so_dien_thoai, hd.dia_chi
		, ngay_thanh_toan, ngay_giao_hang, tien_ship, tien_coc, ngay_nhan_hang, httt.loai_hinh_thanh_toan
		, hd.ghi_chu, hd.trang_thai, id_nhan_vien, nv.ma_nhan_vien, nv.ho_ten, id_khach_hang
having ma_hoa_don like '%440%' 
order by hd.id
offset 0 rows
fetch next 10 rows only


insert into HoaDon (ma_hoa_don, ngay_tao, ten_khach_hang, so_dien_thoai, dia_chi, trang_thai, id_nhan_vien)
values (?, ?, ?, ?, ?, ?, ?);

select id, ma_hoa_don, ngay_tao, ten_khach_hang
from HoaDon
where ma_hoa_don = 'HD301123111957'

select hd.id, ma_hoa_don, hd.ngay_tao, ten_khach_hang, id_nhan_vien, nv.ma_nhan_vien, nv.ho_ten, hd.trang_thai
from HoaDon hd left join NhanVien nv on hd.id_nhan_vien = nv.id
where ma_hoa_don =
;


update HoaDon
set ten_khach_hang = ?, dia_chi = ?, so_dien_thoai = ?, ngay_thanh_toan = ?, ngay_giao_hang = ?
	, tien_ship = ?, tien_coc = ?, ngay_nhan_hang = ?, ghi_chu = ?, trang_thai = ?, id_khach_hang = ?
where id = ?;

select hd.id, ma_hoa_don, hd.ngay_tao, ten_khach_hang, hd.so_dien_thoai, hd.dia_chi
		, ngay_thanh_toan, ngay_giao_hang, tien_ship, tien_coc, ngay_nhan_hang
		, httt.loai_hinh_thanh_toan, hd.ghi_chu, hd.trang_thai
		, id_nhan_vien, nv.ma_nhan_vien, nv.ho_ten, id_khach_hang
from HoaDon hd left join NhanVien nv on hd.id_nhan_vien = nv.id
	left join KhachHang kh on hd.id_khach_hang = kh.id
	left join HoaDonChiTiet hdct on hd.id = hdct.id_hoa_don
	left join HinhThucThanhToan httt on hd.id = httt.id_hoa_don
where hd.id = ?	

-- query HoaDonChiTiet
select hdct.id, hdct.id_san_pham, sp.ma_san_pham, tt.ten_thuong_hieu, sp.doi_tuong_su_dung, sp.ma_hang_hoa, hdct.id_hoa_don, hdct.so_luong, hdct.don_gia
from HoaDonChitiet hdct join SanPham sp on hdct.id_san_pham = sp.id
	join ThuongHieu tt on sp.id_thuong_hieu = tt.id
	join HoaDon hd on hdct.id_hoa_don = hd.id
where hdct.id_hoa_don = 2
group by hdct.id, hdct.id_san_pham, sp.ma_san_pham, tt.ten_thuong_hieu, sp.doi_tuong_su_dung, sp.ma_hang_hoa, hdct.id_hoa_don, hdct.so_luong, hdct.don_gia

insert into HoaDonChiTiet
	(id_san_pham, id_hoa_don, so_luong, don_gia)
values(?, ?, ?, ?);

-- query KhachHang
select id, ma_khach_hang, ho_ten, gioi_tinh, ngay_sinh, so_dien_thoai,
	email, dia_chi , hinh_anh, ngay_tao, ghi_chu, trang_thai
from KhachHang
where trang_thai = 0 and ho_ten like N'%a%' or ma_khach_hang like N'%a%' or so_dien_thoai like N'%a%'
order by id
                offset 0 rows
                fetch next 100 rows only;



-- query ChuongTrinhKhuyenMai
select id, ma_chuong_trinh, ten_chuong_trinh, ngay_bat_dau, ngay_ket_thuc, hinh_thuc_giam_gia, gia_tri_giam, trang_thai from ChuongTrinhKhuyenMai

select * from ChuongTrinhKhuyenMai







-- query in hóa đơn
WITH OrderTotal AS (
	SELECT  dbo.HoaDon.id, dbo.HoaDon.ma_hoa_don, SUM(dbo.HoaDonChiTiet.so_luong * dbo.HoaDonChiTiet.don_gia_khuyen_mai) AS tong_tien
	FROM  dbo.HoaDon INNER JOIN dbo.HoaDonChiTiet ON dbo.HoaDon.id = dbo.HoaDonChiTiet.id_hoa_don
	GROUP BY  dbo.HoaDon.ma_hoa_don, dbo.HoaDon.id
)
SELECT     dbo.HoaDon.ma_hoa_don, dbo.HoaDon.ngay_tao, dbo.HoaDon.ten_khach_hang, dbo.HoaDon.dia_chi, ISNULL(dbo.HoaDon.so_dien_thoai, '') as soDienThoai, dbo.SanPham.ma_san_pham, 
				CONCAT(dbo.ThuongHieu.ten_thuong_hieu, ' ', dbo.SanPham.ma_hang_hoa) as ten_san_pham, dbo.NhanVien.ho_ten, 
                dbo.HoaDonChiTiet.so_luong, dbo.HoaDonChiTiet.don_gia, dbo.HoaDonChiTiet.don_gia_khuyen_mai, (dbo.HoaDonChiTiet.don_gia_khuyen_mai * CAST(dbo.HoaDonChiTiet.so_luong AS decimal(10, 0))) AS thanh_tien, OrderTotal.tong_tien
FROM            dbo.HoaDon INNER JOIN OrderTotal ON  dbo.HoaDon.id = OrderTotal.id INNER JOIN
                         dbo.HoaDonChiTiet ON dbo.HoaDon.id = dbo.HoaDonChiTiet.id_hoa_don INNER JOIN
                         dbo.NhanVien ON dbo.HoaDon.id_nhan_vien = dbo.NhanVien.id INNER JOIN
                         dbo.SanPham ON dbo.HoaDonChiTiet.id_san_pham = dbo.SanPham.id INNER JOIN
                         dbo.ThuongHieu ON dbo.SanPham.id_thuong_hieu = dbo.ThuongHieu.id 
WHERE dbo.HoaDon.ma_hoa_don = 'HD112823113327'
GROUP BY  dbo.HoaDon.ma_hoa_don, dbo.HoaDon.ngay_tao, dbo.HoaDon.ten_khach_hang, dbo.HoaDon.dia_chi, dbo.HoaDon.so_dien_thoai, dbo.SanPham.ma_san_pham,
	  dbo.ThuongHieu.ten_thuong_hieu, dbo.SanPham.ma_hang_hoa, dbo.NhanVien.ho_ten, dbo.HoaDonChiTiet.so_luong, dbo.HoaDonChiTiet.don_gia, dbo.HoaDonChiTiet.don_gia_khuyen_mai, OrderTotal.tong_tien

select * from HoaDonChiTiet where id_hoa_don = 20

select * from HoaDon where id = 20

delete HoaDonChiTiet where id = ?;

-- query thống kê 

-- thống kê 7 ngày gần nhất
WITH dates AS (
    SELECT DATEADD(DAY, -7, GETDATE()) AS ngay_thang_nam
    UNION ALL
    SELECT DATEADD(DAY, 1, ngay_thang_nam)
    FROM dates
    WHERE ngay_thang_nam < GETDATE()
)
SELECT 
	dates.ngay_thang_nam AS ngay,
	ISNULL(SUM(sp.gia_nhap), 0) as von,
	ISNULL(SUM(hdct.don_gia_khuyen_mai), 0) as doanh_thu
FROM dates
LEFT JOIN HoaDon hd on CONVERT(DATE, hd.ngay_tao) =  CONVERT(DATE, dates.ngay_thang_nam)
LEFT JOIN HoaDonChiTiet hdct on hd.id = hdct.id_hoa_don
LEFT JOIN SanPham sp on hdct.id_san_pham = sp.id
GROUP BY dates.ngay_thang_nam  

select * from HoaDon

select count(*) from HoaDon where CONVERT(DATE, ngay_tao) = '2023-12-08'

select * from SanPham