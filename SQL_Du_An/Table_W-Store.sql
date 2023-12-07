create database W_Store
go

use W_Store
go

if OBJECT_ID('ThuongHieu') is not null
drop table ThuongHieu
go
create table ThuongHieu(
	id int identity(1,1) not null,
	ten_thuong_hieu varchar(100) not null,
	lo_go varchar(255) default 'No image',
	trang_thai bit default 1 not null,
	constraint thuong_hieu_PK primary key (id)
)
go

if OBJECT_ID('DongSanPham') is not null
drop table DongSanPham
go
create table DongSanPham(
	id int identity(1,1) not null,
	ten_dong_san_pham varchar(100) not null,
	id_thuong_hieu int not null,
	trang_thai bit default 1 not null,
	constraint dong_san_pham_PK primary key (id),
	constraint thuong_hieu_FK_tbl_DongSanPham foreign key (id_thuong_hieu) references ThuongHieu(id)
)
go

if OBJECT_ID('DongMay') is not null
drop table DongMay
go
create table DongMay(
	id int identity(1,1) not null,
	ten_dong_may nvarchar(100) not null,
	trang_thai bit default 1 not null,
	constraint dong_may_PK primary key (id),
)
go

if OBJECT_ID('ChatLieuDay') is not null
drop table ChatLieuDay
go
create table ChatLieuDay(
	id int identity(1,1) not null,
	ten_chat_lieu_day nvarchar(100) not null,
	trang_thai bit default 1 not null,
	constraint chat_lieu_day_PK primary key (id),
)
go

if OBJECT_ID('ChatLieuKinh') is not null
drop table ChatLieuKinh
go
create table ChatLieuKinh(
	id int identity(1,1) not null,
	ten_chat_lieu_kinh nvarchar(100) not null,
	trang_thai bit default 1 not null,
	constraint chat_lieu_kinh_PK primary key (id),
)
go

if OBJECT_ID('ChatLieuVo') is not null
drop table ChatLieuVo
go
create table ChatLieuVo(
	id int identity(1,1) not null,
	ten_chat_lieu_vo nvarchar(100) not null,
	trang_thai bit default 1 not null,
	constraint chat_lieu_vo_PK primary key (id),
)
go

if OBJECT_ID('XuatXu') is not null
drop table XuatXu
go
create table XuatXu(
	id int identity(1,1) not null,
	noi_xuat_xu nvarchar(100) not null,
	trang_thai bit default 0 not null,
	constraint noi_xuat_xu_PK primary key (id),
)
go

--if OBJECT_ID('PhongCach') is not null
--drop table PhongCach
-- go
-- create table PhongCach(
-- 	id int identity(1,1) not null,
-- 	ten_phong_cach nvarchar(100) not null,
-- 	trang_thai bit default 1 not null,
-- 	constraint phong_cach_PK primary key (id),
-- )
-- go

if OBJECT_ID('Mau') is not null
drop table Mau
go
create table Mau(
	id int identity(1,1) not null,
	ten_mau nvarchar(100) not null,
	trang_thai bit default 1 not null,
	constraint mau_PK primary key (id),
)
go

if OBJECT_ID('TinhNang') is not null
drop table TinhNang
go
create table TinhNang(
	id int identity(1,1) not null,
	ten_tinh_nang nvarchar(100) not null,
	trang_thai bit default 1 not null,
	constraint tinh_nang_PK primary key (id),
)
go

if OBJECT_ID('SanPham') is not null
drop table SanPham
go
create table SanPham(
	id int identity(1,1) not null,
	ma_san_pham char(8),
	id_thuong_hieu int not null,
	ma_hang_hoa varchar(50) not null,
	gia_nhap decimal(10,0) default 0 not null,
	don_gia decimal(10,0) default 0 not null,
	so_luong_ton int default 0 not null,
	hinh_anh varchar(255) default 'No image',
	doi_tuong_su_dung nvarchar(25),
	dong_san_pham varchar(100),
	khang_nuoc int,
	khoang_tru_cot int,
	size_mat float,
	hinh_dang nvarchar(100),
	do_day float,
	id_dong_may int,
	id_chat_lieu_day int,
	id_chat_lieu_kinh int, 
	id_xuat_xu int,
	id_chat_lieu_vo int,
	id_mau_vo int,
	id_mau_mat int,
	ghi_chu nvarchar(max),
	trang_thai int default 0 not null,
	constraint san_pham_PK primary key (id),
	constraint thuong_hieu_FK_tbl_SanPham foreign key (id_thuong_hieu) references ThuongHieu(id),
	constraint dong_may_FK_tbl_SanPham foreign key (id_dong_may) references DongMay(id),
	constraint chat_lieu_day_FK_tbl_SanPham foreign key (id_chat_lieu_day) references ChatLieuDay(id),
	constraint chat_lieu_kinh_FK_tbl_SanPham foreign key (id_chat_lieu_kinh) references ChatLieukinh(id),
	constraint xuat_xu_FK_tbl_SanPham foreign key (id_xuat_xu) references XuatXu(id),
	constraint chat_lieu_vo_FK_tbl_SanPham foreign key (id_chat_lieu_vo) references ChatLieuVo(id),
	constraint mau_vo_FK_tbl_SanPham foreign key (id_mau_vo) references Mau(id),
	constraint mau_mat_FK_tbl_SanPham foreign key (id_mau_mat) references Mau(id)
)
go

if OBJECT_ID('TinhNangSanPham') is not null
drop table TinhNangSanPham
go
create table TinhNangSanPham(
	id_san_pham int not null,
	id_tinh_nang int not null,
	constraint tinh_nang_san_pham_PK primary key (id_san_pham, id_tinh_nang),
	constraint san_pham_FK_tbl_TinhNangSanPham foreign key (id_san_pham) references SanPham(id),
	constraint tinh_nang_FK_tbl_TinhNangSanPham foreign key (id_tinh_nang) references TinhNang(id),
)
go

--if OBJECT_ID('PhongCachSanPham') is not null
--drop table PhongCachSanPham
--go
--create table PhongCachSanPham(
-- 	id_san_pham int not null,
-- 	id_phong_cach int not null,
-- 	constraint phong_cach_san_pham_PK primary key (id_san_pham, id_phong_cach),
--	constraint san_pham_FK_tbl_PhongCachSanPham foreign key (id_san_pham) references SanPham(id),
-- 	constraint phong_cach_FK_tbl_PhongCachSanPham foreign key (id_phong_cach) references PhongCach(id)
--)
--go

if OBJECT_ID('NhanVien') is not null
drop table NhanVien
go
create table NhanVien(
	id int identity(1,1) not null,
	ma_nhan_vien varchar(12) unique not null,
	mat_khau varchar(max),
	ho_ten nvarchar(100) not null,
	gioi_tinh bit not null,
	ngay_sinh date not null,
	can_cuoc_cong_dan varchar(25),
	dia_chi nvarchar(255),
	so_dien_thoai varchar(20),
	email varchar(255),
	vai_tro int default 0,
	hinh_anh varchar(max),
	ngay_tao datetime2 default getdate(),
	ghi_chu nvarchar(255),
	trang_thai int default 0,
	constraint nhan_vien_PK primary key (id)
)
go


if OBJECT_ID('KhachHang') is not null
drop table KhachHang
go
create table KhachHang(
	id int identity(1,1) not null,
	ma_khach_hang char(8) not null,
	ho_ten nvarchar(100) not null,
	gioi_tinh bit not null,
	ngay_sinh date,
	so_dien_thoai varchar(20),
	email varchar(255),
	dia_chi nvarchar(255),
	hinh_anh varchar(max) default 'No image',
	ngay_tao datetime2 default getdate(),
	ghi_chu nvarchar(255),
	trang_thai int default 0,
	constraint khach_hang_PK primary key (id)
)
go


if OBJECT_ID('HoaDon') is not null
drop table HoaDon
go
create table HoaDon(
	id int identity(1,1) not null,
	ma_hoa_don varchar(25) not null,
	ngay_tao datetime2 default getdate(),
	ten_khach_hang nvarchar(100),
	dia_chi nvarchar(255),
	so_dien_thoai varchar(20),
	ngay_thanh_toan datetime2,
	ngay_giao_hang datetime2,
	tien_ship decimal(10,0) default 0,
	tien_coc decimal(10,0) default 0,
	ngay_nhan_hang datetime2,
	ghi_chu nvarchar(255),
	trang_thai int default 0,
	id_nhan_vien int not null,
	id_khach_hang int,
	constraint hoa_don_PK primary key (id),
	constraint nhan_vien_FK_tbl_HoaDon foreign key (id_nhan_vien) references NhanVien(id),
	constraint khach_hang_FK_tbl_HoaDon foreign key (id_khach_hang) references KhachHang(id)
)
go

if OBJECT_ID('HinhThucThanhToan') is not null
drop table HinhThucThanhToan
go
create table HinhThucThanhToan(
	id int identity(1,1) not null,
	loai_hinh_thanh_toan nvarchar(100),
	trang_thai int default 1,
	id_hoa_don int not null,
	constraint hinh_thuc_thanh_toan_PK primary key (id),
	constraint hoa_don_FK_tbl_HinhThucThanhToan foreign key (id_hoa_don) references HoaDon(id),
)
go

if OBJECT_ID('HoaDonChiTiet') is not null
drop table HoaDonChiTiet
go
create table HoaDonChiTiet(
	id bigint identity(1,1) not null,
	id_san_pham int not null,
	id_hoa_don int not null,
	so_luong int default 0,
	don_gia decimal(10,0) default 0,
	don_gia_khuyen_mai decimal(10,0) default 0,
	constraint hoa_don_chi_tiet_PK primary key (id),
	constraint san_pham_FK_tbl_HoaDonChiTiet foreign key (id_san_pham) references SanPham(id),
	constraint hoa_don_FK_tbl_HoaDonChiTiet foreign key (id_hoa_don) references HoaDon(id)
)
go

if OBJECT_ID('ChuongTrinhKhuyenMai') is not null
drop table ChuongTrinhKhuyenMai
go
create table ChuongTrinhKhuyenMai(
	id int identity(1,1) not null,
	ma_chuong_trinh char(8) not null,
	ten_chuong_trinh nvarchar(255) not null,
	ngay_bat_dau datetime2 not null,
	ngay_ket_thuc datetime2 not null,
	hinh_thuc_giam_gia nvarchar(100),
	gia_tri_giam int,
	trang_thai int default 0,
	constraint chuong_trinh_khuyen_mai_PK primary key (id),
)
go


if OBJECT_ID('SanPhamKhuyenMai') is not null
drop table SanPhamKhuyenMai
go
create table SanPhamKhuyenMai(
	id_san_pham int not null,
	id_chuong_trinh_khuyen_mai int not null,
	constraint san_pham_khuyen_mai_PK primary key (id_san_pham, id_chuong_trinh_khuyen_mai),
	constraint san_pham_FK_tbl_SanPhamKhuyenMai foreign key (id_san_pham) references SanPham(id),
	constraint chuong_trinh_khuyen_mai_FK_tbl_SanPhamKhuyenMai foreign key (id_chuong_trinh_khuyen_mai) references ChuongTrinhKhuyenMai(id)
)
go
