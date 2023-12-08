use W_Store
go

-- data table ThuongHieu
insert into ThuongHieu(ten_thuong_hieu, lo_go, trang_thai) values ('Casio', 'logo-Casio.jpg', default);
insert into ThuongHieu(ten_thuong_hieu, lo_go, trang_thai) values ('Bonest Gatti', 'logo-Bonest-Gatti.jpg', default);
insert into ThuongHieu(ten_thuong_hieu, lo_go, trang_thai) values ('Bentley', 'logo-bentley.jpg', default);
insert into ThuongHieu(ten_thuong_hieu, lo_go, trang_thai) values ('Bulova', 'logo-bulova.jpg', default);
insert into ThuongHieu(ten_thuong_hieu, lo_go, trang_thai) values ('Calvin Klein', 'logo-Calvin-Klein.jpg', default);
insert into ThuongHieu(ten_thuong_hieu, lo_go, trang_thai) values ('Carnival', 'logo-carnival.jpg', default);
insert into ThuongHieu(ten_thuong_hieu, lo_go, trang_thai) values ('Certina', 'logo-Certina.jpg', default);
insert into ThuongHieu(ten_thuong_hieu, lo_go, trang_thai) values ('Citizen', 'logo-citizen.jpg', default);
insert into ThuongHieu(ten_thuong_hieu, lo_go, trang_thai) values ('Daniel Klein', 'logo-Daniel-Klein.jpg', default);
insert into ThuongHieu(ten_thuong_hieu, lo_go, trang_thai) values ('Daniel Wellington', 'logo-dw.jpg', default);
insert into ThuongHieu(ten_thuong_hieu, lo_go, trang_thai) values ('Fossil', 'logo-Fossil.jpg', default);
insert into ThuongHieu(ten_thuong_hieu, lo_go, trang_thai) values ('Frederique Constant', 'logo-Frederique-Constant.jpg', default);
insert into ThuongHieu(ten_thuong_hieu, lo_go, trang_thai) values ('Freelook', 'logo-Freelook.jpg', default);
insert into ThuongHieu(ten_thuong_hieu, lo_go, trang_thai) values ('Longines', 'logo-Longines.jpg', default);
insert into ThuongHieu(ten_thuong_hieu, lo_go, trang_thai) values ('Maurice Lacroix', 'logo-Maurice-Lacroix.jpg', default);
insert into ThuongHieu(ten_thuong_hieu, lo_go, trang_thai) values ('Mido', 'logo-Mido.jpg', default);
insert into ThuongHieu(ten_thuong_hieu, lo_go, trang_thai) values ('Montblanc', 'logo-Montblanc.jpg', default);
insert into ThuongHieu(ten_thuong_hieu, lo_go, trang_thai) values ('Movado', 'logo-Movado.jpg', default);
insert into ThuongHieu(ten_thuong_hieu, lo_go, trang_thai) values ('Ogival', 'logo-Ogival.jpg', default);
insert into ThuongHieu(ten_thuong_hieu, lo_go, trang_thai) values ('Olym Pianus', 'logo-Olym-Pianus.jpg', default);
insert into ThuongHieu(ten_thuong_hieu, lo_go, trang_thai) values ('Omega', 'logo-Omega.jpg', default);
insert into ThuongHieu(ten_thuong_hieu, lo_go, trang_thai) values ('Orient', 'logo-orient.jpg', default);
insert into ThuongHieu(ten_thuong_hieu, lo_go, trang_thai) values ('Q&Q', 'logo-qq.jpg', default);
insert into ThuongHieu(ten_thuong_hieu, lo_go, trang_thai) values ('Seiko', 'logo-seiko.jpg', default);
insert into ThuongHieu(ten_thuong_hieu, lo_go, trang_thai) values ('SevenFriday', 'logo-SevenFriday.jpg', default);
insert into ThuongHieu(ten_thuong_hieu, lo_go, trang_thai) values ('SRWatch', 'logo-SRWatch.jpg', default);
insert into ThuongHieu(ten_thuong_hieu, lo_go, trang_thai) values ('Thomas Earnshaw', 'logo-Thomas-Earnshaw.jpg', default);
insert into ThuongHieu(ten_thuong_hieu, lo_go, trang_thai) values ('Tissot', 'logo-Tissot.jpg', default);
insert into ThuongHieu(ten_thuong_hieu, lo_go, trang_thai) values ('Versace', 'logo-Versace.jpg', default);
insert into ThuongHieu(ten_thuong_hieu, lo_go, trang_thai) values ('Zenith', 'logo-Zenith.jpg', default);
go

	select * from ThuongHieu

-- data table DongSanPham
insert into DongSanPham(ten_dong_san_pham, id_thuong_hieu, trang_thai) values ('Casio G - Shock', 1, default);
insert into DongSanPham(ten_dong_san_pham, id_thuong_hieu, trang_thai) values ('Casio Baby - G', 1, default);
insert into DongSanPham(ten_dong_san_pham, id_thuong_hieu, trang_thai) values ('Casio Edifice', 1, default);
insert into DongSanPham(ten_dong_san_pham, id_thuong_hieu, trang_thai) values ('Casio Sheen', 1, default);
insert into DongSanPham(ten_dong_san_pham, id_thuong_hieu, trang_thai) values ('Casio MTP', 1, default);
insert into DongSanPham(ten_dong_san_pham, id_thuong_hieu, trang_thai) values ('Casio Vintage', 1, default);
insert into DongSanPham(ten_dong_san_pham, id_thuong_hieu, trang_thai) values ('Casio LTP', 1, default);
insert into DongSanPham(ten_dong_san_pham, id_thuong_hieu, trang_thai) values ('Casio Protrek', 1, default);
insert into DongSanPham(ten_dong_san_pham, id_thuong_hieu, trang_thai) values ('Bentley nam', 3, default);
insert into DongSanPham(ten_dong_san_pham, id_thuong_hieu, trang_thai) values ('Bentley nữ', 3, default);
insert into DongSanPham(ten_dong_san_pham, id_thuong_hieu, trang_thai) values ('Bentley automat', 3, default);
insert into DongSanPham(ten_dong_san_pham, id_thuong_hieu, trang_thai) values ('Bulova Curv', 4, default);
insert into DongSanPham(ten_dong_san_pham, id_thuong_hieu, trang_thai) values ('Bulova Rubaiyat', 4, default);
insert into DongSanPham(ten_dong_san_pham, id_thuong_hieu, trang_thai) values ('Bulova Precisionist', 4, default);
insert into DongSanPham(ten_dong_san_pham, id_thuong_hieu, trang_thai) values ('Bulova Oceanographer', 4, default);
insert into DongSanPham(ten_dong_san_pham, id_thuong_hieu, trang_thai) values ('Bulova Military', 4, default);
insert into DongSanPham(ten_dong_san_pham, id_thuong_hieu, trang_thai) values ('Bulova Military', 4, default);
insert into DongSanPham(ten_dong_san_pham, id_thuong_hieu, trang_thai) values ('Calvin Klein Glam', 5, default);
insert into DongSanPham(ten_dong_san_pham, id_thuong_hieu, trang_thai) values ('Calvin Klein Subtle', 5, default);
insert into DongSanPham(ten_dong_san_pham, id_thuong_hieu, trang_thai) values ('Calvin Klein Hypnotic', 5, default);
insert into DongSanPham(ten_dong_san_pham, id_thuong_hieu, trang_thai) values ('Calvin Klein High Noon', 5, default);
insert into DongSanPham(ten_dong_san_pham, id_thuong_hieu, trang_thai) values ('Calvin Klein Minimal', 5, default);
insert into DongSanPham(ten_dong_san_pham, id_thuong_hieu, trang_thai) values ('Certina Heritage Collection', 7, default);
insert into DongSanPham(ten_dong_san_pham, id_thuong_hieu, trang_thai) values ('Certina Sport Collection', 7, default);
insert into DongSanPham(ten_dong_san_pham, id_thuong_hieu, trang_thai) values ('Certina Aqua Collection', 7, default);
insert into DongSanPham(ten_dong_san_pham, id_thuong_hieu, trang_thai) values ('Certina Urban Collection', 7, default);
insert into DongSanPham(ten_dong_san_pham, id_thuong_hieu, trang_thai) values ('Citizen Eco-drive', 8, default);
insert into DongSanPham(ten_dong_san_pham, id_thuong_hieu, trang_thai) values ('Citizen C7', 8, default);
insert into DongSanPham(ten_dong_san_pham, id_thuong_hieu, trang_thai) values ('Citizen Sunrise Diamond', 8, default);
insert into DongSanPham(ten_dong_san_pham, id_thuong_hieu, trang_thai) values ('Daniel Klein Trendy', 9, default);
insert into DongSanPham(ten_dong_san_pham, id_thuong_hieu, trang_thai) values ('Daniel Klein Premium', 9, default);
insert into DongSanPham(ten_dong_san_pham, id_thuong_hieu, trang_thai) values ('Daniel Klein Premium Ladies', 9, default);
insert into DongSanPham(ten_dong_san_pham, id_thuong_hieu, trang_thai) values ('Daniel Wellington Classic Black', 10, default);
insert into DongSanPham(ten_dong_san_pham, id_thuong_hieu, trang_thai) values ('Daniel Wellington Classic Petite', 10, default);
insert into DongSanPham(ten_dong_san_pham, id_thuong_hieu, trang_thai) values ('Daniel Wellington Quadro', 10, default);
insert into DongSanPham(ten_dong_san_pham, id_thuong_hieu, trang_thai) values ('Daniel Wellington Iconic Link', 10, default);
insert into DongSanPham(ten_dong_san_pham, id_thuong_hieu, trang_thai) values ('Daniel Wellington 5-Link', 10, default);
insert into DongSanPham(ten_dong_san_pham, id_thuong_hieu, trang_thai) values ('Frederique Constant Manufacture', 12, default);
insert into DongSanPham(ten_dong_san_pham, id_thuong_hieu, trang_thai) values ('Frederique Constant Classic', 12, default);
insert into DongSanPham(ten_dong_san_pham, id_thuong_hieu, trang_thai) values ('Frederique Constant Horological Smartwatch', 12, default);
insert into DongSanPham(ten_dong_san_pham, id_thuong_hieu, trang_thai) values ('Frederique Constant Runabout', 12, default);
insert into DongSanPham(ten_dong_san_pham, id_thuong_hieu, trang_thai) values ('Frederique Constant Vintage Rally', 12, default);
insert into DongSanPham(ten_dong_san_pham, id_thuong_hieu, trang_thai) values ('Freelook Lumiere', 13, default);
insert into DongSanPham(ten_dong_san_pham, id_thuong_hieu, trang_thai) values ('Freelook Rein', 13, default);
insert into DongSanPham(ten_dong_san_pham, id_thuong_hieu, trang_thai) values ('Freelook Belle', 13, default);
insert into DongSanPham(ten_dong_san_pham, id_thuong_hieu, trang_thai) values ('Freelook Eiffel', 13, default);
insert into DongSanPham(ten_dong_san_pham, id_thuong_hieu, trang_thai) values ('Freelook Elite', 13, default);
insert into DongSanPham(ten_dong_san_pham, id_thuong_hieu, trang_thai) values ('Longines Elegance', 14, default);
insert into DongSanPham(ten_dong_san_pham, id_thuong_hieu, trang_thai) values ('Longines Watchmaking Tradition', 14, default);
insert into DongSanPham(ten_dong_san_pham, id_thuong_hieu, trang_thai) values ('Longines Avigation', 14, default);
insert into DongSanPham(ten_dong_san_pham, id_thuong_hieu, trang_thai) values ('Longines Diving', 14, default);
insert into DongSanPham(ten_dong_san_pham, id_thuong_hieu, trang_thai) values ('Longines Performance', 14, default);
insert into DongSanPham(ten_dong_san_pham, id_thuong_hieu, trang_thai) values ('Maurice Lacroix Masterpiece', 15, default);
insert into DongSanPham(ten_dong_san_pham, id_thuong_hieu, trang_thai) values ('Maurice Lacroix Aikon', 15, default);
insert into DongSanPham(ten_dong_san_pham, id_thuong_hieu, trang_thai) values ('Maurice Lacroix Pontos', 15, default);
insert into DongSanPham(ten_dong_san_pham, id_thuong_hieu, trang_thai) values ('Mido RAINFLOWER', 16, default);
insert into DongSanPham(ten_dong_san_pham, id_thuong_hieu, trang_thai) values ('Mido BARONCELLI', 16, default);
insert into DongSanPham(ten_dong_san_pham, id_thuong_hieu, trang_thai) values ('Mido BELLUNA', 16, default);
insert into DongSanPham(ten_dong_san_pham, id_thuong_hieu, trang_thai) values ('Mido MULTIFORT', 16, default);
insert into DongSanPham(ten_dong_san_pham, id_thuong_hieu, trang_thai) values ('Mido COMMANDER', 16, default);
insert into DongSanPham(ten_dong_san_pham, id_thuong_hieu, trang_thai) values ('Mido OCEAN STAR', 16, default);
insert into DongSanPham(ten_dong_san_pham, id_thuong_hieu, trang_thai) values ('Mido ALL DIAL', 16, default);
insert into DongSanPham(ten_dong_san_pham, id_thuong_hieu, trang_thai) values ('Movado Ultra Slim', 18, default);
insert into DongSanPham(ten_dong_san_pham, id_thuong_hieu, trang_thai) values ('Movado Museum', 18, default);
insert into DongSanPham(ten_dong_san_pham, id_thuong_hieu, trang_thai) values ('Movado Bold', 18, default);
insert into DongSanPham(ten_dong_san_pham, id_thuong_hieu, trang_thai) values ('Ogival Ultra-thin', 19, default);
insert into DongSanPham(ten_dong_san_pham, id_thuong_hieu, trang_thai) values ('Ogival Jewelry', 19, default);
insert into DongSanPham(ten_dong_san_pham, id_thuong_hieu, trang_thai) values ('Ogival Painted', 19, default);
insert into DongSanPham(ten_dong_san_pham, id_thuong_hieu, trang_thai) values ('Omega Speedmaster Professional', 21, default);
insert into DongSanPham(ten_dong_san_pham, id_thuong_hieu, trang_thai) values ('Omega Constellation Grand Luxe', 21, default);
insert into DongSanPham(ten_dong_san_pham, id_thuong_hieu, trang_thai) values ('Omega Ploprof', 21, default);
insert into DongSanPham(ten_dong_san_pham, id_thuong_hieu, trang_thai) values ('Omega Marine', 21, default);
insert into DongSanPham(ten_dong_san_pham, id_thuong_hieu, trang_thai) values ('Omega Ploprof', 21, default);
insert into DongSanPham(ten_dong_san_pham, id_thuong_hieu, trang_thai) values ('Omega Seamaster Aqua Terra', 21, default);
insert into DongSanPham(ten_dong_san_pham, id_thuong_hieu, trang_thai) values ('Omega Seamaster Professional 300M', 21, default);
insert into DongSanPham(ten_dong_san_pham, id_thuong_hieu, trang_thai) values ('Orient Star', 22, default);
insert into DongSanPham(ten_dong_san_pham, id_thuong_hieu, trang_thai) values ('Orient Sun and Moon', 22, default);
insert into DongSanPham(ten_dong_san_pham, id_thuong_hieu, trang_thai) values ('Orient SK', 22, default);
insert into DongSanPham(ten_dong_san_pham, id_thuong_hieu, trang_thai) values ('Orient 3sao', 22, default);
insert into DongSanPham(ten_dong_san_pham, id_thuong_hieu, trang_thai) values ('Orient Mako 3', 22, default);
insert into DongSanPham(ten_dong_san_pham, id_thuong_hieu, trang_thai) values ('Orient Bambinc', 22, default);
insert into DongSanPham(ten_dong_san_pham, id_thuong_hieu, trang_thai) values ('Orient Golden eye', 22, default);
insert into DongSanPham(ten_dong_san_pham, id_thuong_hieu, trang_thai) values ('Seiko 5', 24, default);
insert into DongSanPham(ten_dong_san_pham, id_thuong_hieu, trang_thai) values ('Seiko Solar' , 24, default);
insert into DongSanPham(ten_dong_san_pham, id_thuong_hieu, trang_thai) values ('Seiko Kinetic' , 24, default);
insert into DongSanPham(ten_dong_san_pham, id_thuong_hieu, trang_thai) values ('Seiko Chronograph' , 24, default);
insert into DongSanPham(ten_dong_san_pham, id_thuong_hieu, trang_thai) values ('Seiko Spot' , 24, default);
insert into DongSanPham(ten_dong_san_pham, id_thuong_hieu, trang_thai) values ('Seiko Presage' , 24, default);
insert into DongSanPham(ten_dong_san_pham, id_thuong_hieu, trang_thai) values ('Seiko Prospex' , 24, default);
insert into DongSanPham(ten_dong_san_pham, id_thuong_hieu, trang_thai) values ('Seiko Premier' , 24, default);
insert into DongSanPham(ten_dong_san_pham, id_thuong_hieu, trang_thai) values ('Grand Seiko' , 24, default);
insert into DongSanPham(ten_dong_san_pham, id_thuong_hieu, trang_thai) values ('SevenFriday P Series' , 25, default);
insert into DongSanPham(ten_dong_san_pham, id_thuong_hieu, trang_thai) values ('SevenFriday M Series' , 25, default);
insert into DongSanPham(ten_dong_san_pham, id_thuong_hieu, trang_thai) values ('SevenFriday V Series' , 25, default);
insert into DongSanPham(ten_dong_san_pham, id_thuong_hieu, trang_thai) values ('SevenFriday Q Series' , 25, default);
insert into DongSanPham(ten_dong_san_pham, id_thuong_hieu, trang_thai) values ('SevenFriday S Series' , 25, default);
insert into DongSanPham(ten_dong_san_pham, id_thuong_hieu, trang_thai) values ('SRWatch Quartz ' , 26, default);
insert into DongSanPham(ten_dong_san_pham, id_thuong_hieu, trang_thai) values ('SRWatch Automatic ' , 26, default);
insert into DongSanPham(ten_dong_san_pham, id_thuong_hieu, trang_thai) values ('SRWatch Solar Movt ' , 26, default);
insert into DongSanPham(ten_dong_san_pham, id_thuong_hieu, trang_thai) values ('Tissot Prx' , 28, default);
insert into DongSanPham(ten_dong_san_pham, id_thuong_hieu, trang_thai) values ('Tissot Le Locle' , 28, default);
insert into DongSanPham(ten_dong_san_pham, id_thuong_hieu, trang_thai) values ('Tissot Luxury' , 28, default);
insert into DongSanPham(ten_dong_san_pham, id_thuong_hieu, trang_thai) values ('Tissot Chemin Des Tourelles' , 28, default);
insert into DongSanPham(ten_dong_san_pham, id_thuong_hieu, trang_thai) values ('Tissot 18K Gold' , 28, default);
insert into DongSanPham(ten_dong_san_pham, id_thuong_hieu, trang_thai) values ('Tissot T-Wave' , 28, default);
insert into DongSanPham(ten_dong_san_pham, id_thuong_hieu, trang_thai) values ('Versace Daphnis' , 29, default);
insert into DongSanPham(ten_dong_san_pham, id_thuong_hieu, trang_thai) values ('Versace Palazzo Empire' , 29, default);
insert into DongSanPham(ten_dong_san_pham, id_thuong_hieu, trang_thai) values ('Versace V-circle Manifesto' , 29, default);
insert into DongSanPham(ten_dong_san_pham, id_thuong_hieu, trang_thai) values ('Versace Vanity' , 29, default);
insert into DongSanPham(ten_dong_san_pham, id_thuong_hieu, trang_thai) values ('Versace Olympo' , 29, default);
insert into DongSanPham(ten_dong_san_pham, id_thuong_hieu, trang_thai) values ('Versace Vanitas' , 29, default);
go


select * from DongSanPham


-- data table DongMay
insert into DongMay(ten_dong_may, trang_thai) values (N'Cơ/Automatic',default);
insert into DongMay(ten_dong_may, trang_thai) values (N'Điện tử',default);
insert into DongMay(ten_dong_may, trang_thai) values (N'Năng lượng mặt trời',default);
insert into DongMay(ten_dong_may, trang_thai) values (N'Pin/Quartz',default);
insert into DongMay(ten_dong_may, trang_thai) values (N'Eco Drive',default);
insert into DongMay(ten_dong_may, trang_thai) values (N'Powermatic 80',default);
insert into DongMay(ten_dong_may, trang_thai) values (N'Seiko 4R35A',default);
insert into DongMay(ten_dong_may, trang_thai) values (N'Seiko 4R36A',default);
go

select * from DongMay

-- data table ChatLieuDay
insert into ChatLieuDay(ten_chat_lieu_day, trang_thai) values (N'Dây da', default);
insert into ChatLieuDay(ten_chat_lieu_day, trang_thai) values (N'Dây kim loại', default);
insert into ChatLieuDay(ten_chat_lieu_day, trang_thai) values (N'Dây cao su', default);
insert into ChatLieuDay(ten_chat_lieu_day, trang_thai) values (N'Dây dù/vải', default);
insert into ChatLieuDay(ten_chat_lieu_day, trang_thai) values (N'Dây nhựa', default);
insert into ChatLieuDay(ten_chat_lieu_day, trang_thai) values (N'Dây nhựa phối kim loại', default);
insert into ChatLieuDay(ten_chat_lieu_day, trang_thai) values (N'Dây thép không gỉ mạ vàng PVD', default);
insert into ChatLieuDay(ten_chat_lieu_day, trang_thai) values (N'Dây titanium', default);
insert into ChatLieuDay(ten_chat_lieu_day, trang_thai) values (N'Dây thép không gỉ', default);
insert into ChatLieuDay(ten_chat_lieu_day, trang_thai) values (N'Silicon', default);
go


-- data table ChatLieuKinh
insert into ChatLieukinh(ten_chat_lieu_kinh, trang_thai) values (N'Kính Sappire', default);
insert into ChatLieukinh(ten_chat_lieu_kinh, trang_thai) values (N'Kính nhựa', default);
insert into ChatLieukinh(ten_chat_lieu_kinh, trang_thai) values (N'Kính khoáng', default);
insert into ChatLieukinh(ten_chat_lieu_kinh, trang_thai) values (N'Hardlex Crystal', default);
go


-- data table ChatLieuVo
insert into ChatLieuVo(ten_chat_lieu_vo, trang_thai) values (N'Mạ vàng', default);
insert into ChatLieuVo(ten_chat_lieu_vo, trang_thai) values (N'Vỏ nhựa', default);
insert into ChatLieuVo(ten_chat_lieu_vo, trang_thai) values (N'Vỏ thép không gỉ', default);
insert into ChatLieuVo(ten_chat_lieu_vo, trang_thai) values (N'Thép không gỉ mạ vàng PVD', default);
insert into ChatLieuVo(ten_chat_lieu_vo, trang_thai) values (N'Vàng & thép không gỉ', default);
insert into ChatLieuVo(ten_chat_lieu_vo, trang_thai) values (N'Vỏ Titanium', default);
go

SELECT * from ChatLieuVo

-- data table XuatXu
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Afghanistan',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Albania',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Algeria',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Samoa thuộc Mỹ',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Andorra',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Angola',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Anguilla',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Antarctica',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Antigua và Barbuda',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Argentina',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Armenia',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Aruba',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Úc',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Áo',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Azerbaijan',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Bahamas',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Bahrain',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Bangladesh',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Barbados',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Belarus',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Bỉ',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Belize',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Benin',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Bermuda',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Bhutan',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Bolivia',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Bonaire',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Bosnia và Herzegovina',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Botswana',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Đảo Bouvet',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Brazil',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Lãnh thổ Ấn Độ Dương thuộc Anh',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Nhà nước Brunei Darussalam',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Bulgaria',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Burkina Faso',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Burundi',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Campuchia',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Cameroon',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Canada',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Cape Verde',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Quần đảo Cayman',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Trung Phi',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Sát (Tchad)',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Chile',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Trung Quốc',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Đảo Giáng Sinh',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Quần đảo Cocos',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Colombia',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Comoros',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Cộng hòa Congo',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Cộng hòa Dân chủ Congo',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Quần đảo Cook',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Costa Rica',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Croatia',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Cuba',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Curacao',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Síp',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Séc',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Bờ Biển Ngà',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Đan Mạch',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Djibouti',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Dominica',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Cộng hòa Dominica',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Ecuador',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Ai Cập',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'El Salvador',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Guinea Xích Đạo',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Eritrea',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Estonia',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Ethiopia',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Quần đảo Falkland',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Quần đảo Faroe',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Fiji',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Phần Lan',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Pháp',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Guiana thuộc Pháp',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Polynesia thuộc Pháp',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Vùng đất phía Nam và châu Nam Cực thuộc Pháp',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Gabon',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Gambia',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Georgia',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Đức',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Ghana',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Gibraltar',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Hy Lạp',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Một quốc gia tự trị thuộc Đan Mạch',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Grenada',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Guadeloupe',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Đảo Guam',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Guatemala',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Guernsey',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Guinea',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Guinea-Bissau',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Guyana',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Haiti',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Đảo Heard và quần đảo McDonald',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Tòa thánh Vatican',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Honduras',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Hồng Kông',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Hungary',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Iceland',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Ấn Độ',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Indonesia',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Iran',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Iraq',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Ireland',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Đảo Man',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Israel',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Ý',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Jamaica',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Nhật Bản',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Jersey',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Jordan',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Kazakhstan',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Kenya',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Kiribati',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Triều tiên',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Hàn Quốc',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Kuwait',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Kyrgyzstan',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Lào',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Latvia',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Lebanon',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Lesotho',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Liberia',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Libya',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Liechtenstein',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Lithuania',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Luxembourg',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Macao',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Macedonia',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Madagascar',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Malawi',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Malaysia',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Maldives',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Mali',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Malta',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Quần đảo Marshall',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Martinique',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Mauritania',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Mauritius',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Mayotte',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Mexico',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Liên bang Micronesia',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Moldova',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Monaco',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Mông Cổ',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Montenegro',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Montserrat',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Ma Rốc (Maroc)',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Mozambique',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Myanmar',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Namibia',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Nauru',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Nepal',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Hà Lan',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'New Caledonia',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'New Zealand',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Nicaragua',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Niger',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Nigeria',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Niue',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Đảo Norfolk',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Quần đảo Bắc Mariana',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Na Uy',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Oman',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Pakistan',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Palau',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Palestine',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Panama',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Papua New Guinea',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Paraguay',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Peru',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Philippines',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Pitcairn',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Ba Lan',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Bồ Đào Nha',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Puerto Rico',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Qatar',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Romania',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Nga',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Rwanda',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Reunion',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Saint Barthelemy',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Saint Helena',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Saint Kitts và Nevis',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Saint Lucia',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Saint Martin (French part)',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Saint Pierre và Miquelon',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Saint Vincent và the Grenadines',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Samoa',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'San Marino',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Sao Tome và Principe',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Ả Rập Xê Út',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Senegal',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Serbia',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Seychelles',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Sierra Leone',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Singapore',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Sint Maarten',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Slovakia',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Slovenia',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Quần đảo Solomon',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Somalia',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Nam Phi',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Nam Georgia và Quần đảo Nam Sandwich',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Nam Sudan',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Tây Ban Nha',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Sri Lanka',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Sudan',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Suriname',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Svalbard và Jan Mayen',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Swaziland',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Thụy Điển',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Thụy Sĩ',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Syria',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Đài Loan ',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Tajikistan',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Tanzania',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Thái Lan',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Đông Timor',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Togo',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Tokelau',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Tonga',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Trinidad và Tobago',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Tunisia',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Thổ Nhĩ Kỳ',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Turkmenistan',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Quần đảo Turks và Caicos',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Tuvalu',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Uganda',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Ukraine',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Các tiểu vương quốc Ả Rập Thống nhất',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Vương quốc Liên hiệp Anh và Bắc Ireland',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Mỹ (Hoa Kỳ)',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Các tiểu đảo xa của Hoa Kỳ',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Uruguay',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Uzbekistan',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Vanuatu',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Venezuela',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Việt Nam',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Quần đảo Virgin thuộc Anh',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Quần đảo Virgin thuộc Mỹ ',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Wallis và Futuna',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Tây Sahara',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Yemen',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Zambia',default);
insert into XuatXu(noi_xuat_xu, trang_thai) values (N'Zimbabwe',default);
go

select * from XuatXu



-- -- data table PhongCach
-- insert into PhongCach(ten_phong_cach, trang_thai) values (N'Sang trọng',default);
-- insert into PhongCach(ten_phong_cach, trang_thai) values (N'Quân đội',default);
-- insert into PhongCach(ten_phong_cach, trang_thai) values (N'Lộ đáy',default);
-- insert into PhongCach(ten_phong_cach, trang_thai) values (N'Classic cổ điển',default);
-- insert into PhongCach(ten_phong_cach, trang_thai) values (N'Thời trang',default);
-- insert into PhongCach(ten_phong_cach, trang_thai) values (N'Lộ máy',default);
-- insert into PhongCach(ten_phong_cach, trang_thai) values (N'Hở tim lộ đáy',default);
-- insert into PhongCach(ten_phong_cach, trang_thai) values (N'Thể thao',default);
-- insert into PhongCach(ten_phong_cach, trang_thai) values (N'Trẻ trung',default);
-- insert into PhongCach(ten_phong_cach, trang_thai) values (N'Cá tính',default);
-- insert into PhongCach(ten_phong_cach, trang_thai) values (N'Chuyên dụng',default);
-- insert into PhongCach(ten_phong_cach, trang_thai) values (N'Phiên bản giới hạn',default);
-- go

-- select * from PhongCach


-- data table Mau
insert into Mau(ten_mau, trang_thai) values (N'Xanh', default);
insert into Mau(ten_mau, trang_thai) values (N'Trắng', default);
insert into Mau(ten_mau, trang_thai) values (N'Đen', default);
insert into Mau(ten_mau, trang_thai) values (N'Chải tia', default);
insert into Mau(ten_mau, trang_thai) values (N'Đỏ', default);
insert into Mau(ten_mau, trang_thai) values (N'Vàng', default);
insert into Mau(ten_mau, trang_thai) values (N'Nâu', default);
insert into Mau(ten_mau, trang_thai) values (N'Cát vàng', default);
insert into Mau(ten_mau, trang_thai) values (N'Xanh lục', default);
insert into Mau(ten_mau, trang_thai) values (N'Khảm trai', default);
insert into Mau(ten_mau, trang_thai) values (N'Hồng', default);
insert into Mau(ten_mau, trang_thai) values (N'Tím', default);
insert into Mau(ten_mau, trang_thai) values (N'Xám', default);
insert into Mau(ten_mau, trang_thai) values (N'Rằn ri', default);
insert into Mau(ten_mau, trang_thai) values (N'Cam', default);
insert into Mau(ten_mau, trang_thai) values (N'Be', default);
insert into Mau(ten_mau, trang_thai) values (N'Bạc', default);
insert into Mau(ten_mau, trang_thai) values (N'Đen hồng', default);
insert into Mau(ten_mau, trang_thai) values (N'Ngọc trai', default);
insert into Mau(ten_mau, trang_thai) values (N'Xanh đen', default);
insert into Mau(ten_mau, trang_thai) values (N'Xanh da trời', default);
insert into Mau(ten_mau, trang_thai) values (N'Xám ghi', default);
insert into Mau(ten_mau, trang_thai) values (N'Đa sắc màu', default);
insert into Mau(ten_mau, trang_thai) values (N'Vàng hồng', default);
insert into Mau(ten_mau, trang_thai) values (N'Đen bóng', default);
insert into Mau(ten_mau, trang_thai) values (N'Ghi', default);
insert into Mau(ten_mau, trang_thai) values (N'Trong suốt', default);
go

select * from Mau

-- data table TinhNang
insert into TinhNang(ten_tinh_nang, trang_thai) values (N'Kết nối Bluetooth', default);
insert into TinhNang(ten_tinh_nang, trang_thai) values (N'World Time', default);
insert into TinhNang(ten_tinh_nang, trang_thai) values (N'Báo thức', default);
insert into TinhNang(ten_tinh_nang, trang_thai) values (N'Đồng hồ bấm giờ', default);
insert into TinhNang(ten_tinh_nang, trang_thai) values (N'Đo nhịp tim', default);
insert into TinhNang(ten_tinh_nang, trang_thai) values (N'Đếm bước chân', default);
insert into TinhNang(ten_tinh_nang, trang_thai) values (N'Chronograph', default);
insert into TinhNang(ten_tinh_nang, trang_thai) values (N'Dạ quang', default);
insert into TinhNang(ten_tinh_nang, trang_thai) values (N'3 mặt 6 kim', default);
insert into TinhNang(ten_tinh_nang, trang_thai) values (N'La bàn', default);
insert into TinhNang(ten_tinh_nang, trang_thai) values (N'Nhiệt kế', default);
insert into TinhNang(ten_tinh_nang, trang_thai) values (N'Lịch thứ', default);
insert into TinhNang(ten_tinh_nang, trang_thai) values (N'Lịch ngày', default);
insert into TinhNang(ten_tinh_nang, trang_thai) values (N'Lịch tuần trăng', default);
insert into TinhNang(ten_tinh_nang, trang_thai) values (N'Lịch vạn niên', default);
insert into TinhNang(ten_tinh_nang, trang_thai) values (N'Kim xăng', default);
insert into TinhNang(ten_tinh_nang, trang_thai) values (N'Radio Controlled', default);
insert into TinhNang(ten_tinh_nang, trang_thai) values (N'Giờ, phút, giây', default);
insert into TinhNang(ten_tinh_nang, trang_thai) values (N'Tachymeter', default);
insert into TinhNang(ten_tinh_nang, trang_thai) values (N'Giờ, phút', default);
insert into TinhNang(ten_tinh_nang, trang_thai) values (N'Dual Time', default);
insert into TinhNang(ten_tinh_nang, trang_thai) values (N'Small Second', default);
insert into TinhNang(ten_tinh_nang, trang_thai) values (N'Lịch tháng', default);
insert into TinhNang(ten_tinh_nang, trang_thai) values (N'Lịch 24 giờ', default);
insert into TinhNang(ten_tinh_nang, trang_thai) values (N'Lịch năm', default);
insert into TinhNang(ten_tinh_nang, trang_thai) values (N'Đèn Led', default);
insert into TinhNang(ten_tinh_nang, trang_thai) values (N'Driver', default);
insert into TinhNang(ten_tinh_nang, trang_thai) values (N'Giờ GMT', default);
insert into TinhNang(ten_tinh_nang, trang_thai) values (N'Perpetual Calendar', default);
insert into TinhNang(ten_tinh_nang, trang_thai) values (N'Word Map', default);
insert into TinhNang(ten_tinh_nang, trang_thai) values (N'Lịch ngày đêm', default);
go

select * from Mau

-- data table SanPham
select * from SanPham
select * from DongMay


insert into SanPham(ma_san_pham, id_thuong_hieu, ma_hang_hoa, gia_nhap, don_gia, so_luong_ton, hinh_anh, doi_tuong_su_dung, dong_san_pham, khang_nuoc, khoang_tru_cot, size_mat, hinh_dang, do_day, id_dong_may, id_chat_lieu_day, id_chat_lieu_kinh, id_xuat_xu, id_chat_lieu_vo, id_mau_vo, id_mau_mat, trang_thai) 
values ('SP000001',	1,	'LA-20WH-4A1DF',	382500,	510000,	15,	'LA-20WH-4A1DF.jpg',	N'Nữ',	null,	3,	null,	30.4,	N'Mặt vuông',	8.6,	2,	5,	2,	111,	2,	11,	22,	default);
insert into SanPham(ma_san_pham, id_thuong_hieu, ma_hang_hoa, gia_nhap, don_gia, so_luong_ton, hinh_anh, doi_tuong_su_dung, dong_san_pham, khang_nuoc, khoang_tru_cot, size_mat, hinh_dang, do_day, id_dong_may, id_chat_lieu_day, id_chat_lieu_kinh, id_xuat_xu, id_chat_lieu_vo, id_mau_vo, id_mau_mat, trang_thai) 
values ('SP000002',	1,	'LTP-V300L-4AUDF',	900000,	1200000,	15,	'LTP-V300L-4AUDF.jpg',	N'Nữ',	'Casio LTP',	3,	null,	33.2,	N'Mặt tròn',	8.2,	4,	1,	3,	111,	3,	17,	11,	default);
insert into SanPham(ma_san_pham, id_thuong_hieu, ma_hang_hoa, gia_nhap, don_gia, so_luong_ton, hinh_anh, doi_tuong_su_dung, dong_san_pham, khang_nuoc, khoang_tru_cot, size_mat, hinh_dang, do_day, id_dong_may, id_chat_lieu_day, id_chat_lieu_kinh, id_xuat_xu, id_chat_lieu_vo, id_mau_vo, id_mau_mat, trang_thai) 
values ('SP000003',	1,	'A159WAD-1DF',	765000,	1020000,	15,	'A159WAD-1DF.jpg',	N'Unisex',	null,	3,	null,	33.2,	N'Mặt chữ nhật',	9.7,	2,	2,	2,	111,	2,	17,	3,	default);
insert into SanPham(ma_san_pham, id_thuong_hieu, ma_hang_hoa, gia_nhap, don_gia, so_luong_ton, hinh_anh, doi_tuong_su_dung, dong_san_pham, khang_nuoc, khoang_tru_cot, size_mat, hinh_dang, do_day, id_dong_may, id_chat_lieu_day, id_chat_lieu_kinh, id_xuat_xu, id_chat_lieu_vo, id_mau_vo, id_mau_mat, trang_thai) 
values ('SP000004',	1,	'F-94WA-9DG',	292500,	390000,	15,	'F-94WA-9DG.jpg',	N'Unisex',	null,	3,	null,	33.2,	N'Mặt vuông',	8.5,	4,	5,	2,	111,	2,	3,	22,	default);
insert into SanPham(ma_san_pham, id_thuong_hieu, ma_hang_hoa, gia_nhap, don_gia, so_luong_ton, hinh_anh, doi_tuong_su_dung, dong_san_pham, khang_nuoc, khoang_tru_cot, size_mat, hinh_dang, do_day, id_dong_may, id_chat_lieu_day, id_chat_lieu_kinh, id_xuat_xu, id_chat_lieu_vo, id_mau_vo, id_mau_mat, trang_thai) 
values ('SP000005',	1,	'W-218HC-4A2VDF',	480000,	640000,	15,	'W-218HC-4A2VDF.jpg',	N'Unisex',	null,	5,	null,	43.2,	N'Mặt vuông',	11,	4,	5,	2,	111,	2,	1,	22,	default);
insert into SanPham(ma_san_pham, id_thuong_hieu, ma_hang_hoa, gia_nhap, don_gia, so_luong_ton, hinh_anh, doi_tuong_su_dung, dong_san_pham, khang_nuoc, khoang_tru_cot, size_mat, hinh_dang, do_day, id_dong_may, id_chat_lieu_day, id_chat_lieu_kinh, id_xuat_xu, id_chat_lieu_vo, id_mau_vo, id_mau_mat, trang_thai) 
values ('SP000006',	1,	'LA670WEM-7DF',	765000,	1020000,	15,	'LA670WEM-7DF.jpg',	N'Nữ',	null,	3,	null,	24.6,	N'Mặt vuông',	7.3,	2,	2,	2,	111,	2,	17,	13,	default);
insert into SanPham(ma_san_pham, id_thuong_hieu, ma_hang_hoa, gia_nhap, don_gia, so_luong_ton, hinh_anh, doi_tuong_su_dung, dong_san_pham, khang_nuoc, khoang_tru_cot, size_mat, hinh_dang, do_day, id_dong_may, id_chat_lieu_day, id_chat_lieu_kinh, id_xuat_xu, id_chat_lieu_vo, id_mau_vo, id_mau_mat, trang_thai) 
values ('SP000007',	1,	'MTP-1384L-1AVDF',	1222500,	1630000,	15,	'MTP-1384L-1AVDF.jpg',	N'Nam',	'Casio MTP',	10,	null,	41,	N'Mặt tròn',	10,	4,	1,	3,	111,	4,	24,	3,	default);
insert into SanPham(ma_san_pham, id_thuong_hieu, ma_hang_hoa, gia_nhap, don_gia, so_luong_ton, hinh_anh, doi_tuong_su_dung, dong_san_pham, khang_nuoc, khoang_tru_cot, size_mat, hinh_dang, do_day, id_dong_may, id_chat_lieu_day, id_chat_lieu_kinh, id_xuat_xu, id_chat_lieu_vo, id_mau_vo, id_mau_mat, trang_thai) 
values ('SP000008',	20,	'OP990-45.24ADGS-D',	4627500,	6170000,	15,	'OP990-45.24ADGS-D.jpg',	N'Nam',	null,	5,	null,	42,	N'Mặt tròn',	10.3,	1,	2,	1,	111,	3,	17,	6,	default);
insert into SanPham(ma_san_pham, id_thuong_hieu, ma_hang_hoa, gia_nhap, don_gia, so_luong_ton, hinh_anh, doi_tuong_su_dung, dong_san_pham, khang_nuoc, khoang_tru_cot, size_mat, hinh_dang, do_day, id_dong_may, id_chat_lieu_day, id_chat_lieu_kinh, id_xuat_xu, id_chat_lieu_vo, id_mau_vo, id_mau_mat, trang_thai) 
values ('SP000009',	20,	'OP89322GS-X',	2385000,	3180000,	15,	'OP89322GS-X.jpg',	N'Nam',	null,	3,	null,	40,	N'Mặt tròn',	null,	4,	2,	1,	111,	3,	17,	1,	default);
insert into SanPham(ma_san_pham, id_thuong_hieu, ma_hang_hoa, gia_nhap, don_gia, so_luong_ton, hinh_anh, doi_tuong_su_dung, dong_san_pham, khang_nuoc, khoang_tru_cot, size_mat, hinh_dang, do_day, id_dong_may, id_chat_lieu_day, id_chat_lieu_kinh, id_xuat_xu, id_chat_lieu_vo, id_mau_vo, id_mau_mat, trang_thai) 
values ('SP000010',	20,	'OP990-45DDGS-T',	3780000,	5040000,	15,	'OP990-45DDGS-T.jpg',	N'Nữ',	null,	5,	null,	34,	N'Mặt tròn',	null,	4,	2,	1,	111,	3,	17,	2,	default);
insert into SanPham(ma_san_pham, id_thuong_hieu, ma_hang_hoa, gia_nhap, don_gia, so_luong_ton, hinh_anh, doi_tuong_su_dung, dong_san_pham, khang_nuoc, khoang_tru_cot, size_mat, hinh_dang, do_day, id_dong_may, id_chat_lieu_day, id_chat_lieu_kinh, id_xuat_xu, id_chat_lieu_vo, id_mau_vo, id_mau_mat, trang_thai) 
values ('SP000011',	20,	'OP89322AMS-X',	3120000,	4160000,	15,	'OP89322AMS-X.jpg',	N'Nam',	null,	3,	null,	36,	N'Mặt tròn',	11,	1,	2,	1,	111,	3,	17,	1,	default);
insert into SanPham(ma_san_pham, id_thuong_hieu, ma_hang_hoa, gia_nhap, don_gia, so_luong_ton, hinh_anh, doi_tuong_su_dung, dong_san_pham, khang_nuoc, khoang_tru_cot, size_mat, hinh_dang, do_day, id_dong_may, id_chat_lieu_day, id_chat_lieu_kinh, id_xuat_xu, id_chat_lieu_vo, id_mau_vo, id_mau_mat, trang_thai) 
values ('SP000012',	20,	'OP89322AMS-T',	3120000,	4160000,	15,	'OP89322AMS-T.jpg',	N'Nam',	null,	3,	null,	36,	N'Mặt tròn',	null,	1,	2,	1,	111,	3,	17,	2,	default);
insert into SanPham(ma_san_pham, id_thuong_hieu, ma_hang_hoa, gia_nhap, don_gia, so_luong_ton, hinh_anh, doi_tuong_su_dung, dong_san_pham, khang_nuoc, khoang_tru_cot, size_mat, hinh_dang, do_day, id_dong_may, id_chat_lieu_day, id_chat_lieu_kinh, id_xuat_xu, id_chat_lieu_vo, id_mau_vo, id_mau_mat, trang_thai) 
values ('SP000013',	20,	'OP990-45.24ADGS-GL-D',	4627500,	6170000,	15,	'OP990-45.24ADGS-GL-D.jpg',	N'Nam',	null,	5,	40,	42,	N'Mặt tròn',	11.5,	1,	3,	1,	111,	3,	17,	6,	default);
insert into SanPham(ma_san_pham, id_thuong_hieu, ma_hang_hoa, gia_nhap, don_gia, so_luong_ton, hinh_anh, doi_tuong_su_dung, dong_san_pham, khang_nuoc, khoang_tru_cot, size_mat, hinh_dang, do_day, id_dong_may, id_chat_lieu_day, id_chat_lieu_kinh, id_xuat_xu, id_chat_lieu_vo, id_mau_vo, id_mau_mat, trang_thai) 
values ('SP000014',	20,	'OP89322AGS-D',	2940000,	3920000,	15,	'OP89322AGS-D.jpg',	N'Nam',	null,	3,	null,	40,	N'Mặt tròn',	null,	1,	2,	1,	111,	3,	17,	3,	default);
insert into SanPham(ma_san_pham, id_thuong_hieu, ma_hang_hoa, gia_nhap, don_gia, so_luong_ton, hinh_anh, doi_tuong_su_dung, dong_san_pham, khang_nuoc, khoang_tru_cot, size_mat, hinh_dang, do_day, id_dong_may, id_chat_lieu_day, id_chat_lieu_kinh, id_xuat_xu, id_chat_lieu_vo, id_mau_vo, id_mau_mat, trang_thai) 
values ('SP000015',	20,	'OP990-45DGS-GL-T',	3450000,	4600000,	15,	'OP990-45DGS-GL-T.jpg',	N'Nữ',	null,	5,	null,	34,	N'Mặt tròn',	null,	4,	3,	1,	111,	3,	17,	2,	default);
insert into SanPham(ma_san_pham, id_thuong_hieu, ma_hang_hoa, gia_nhap, don_gia, so_luong_ton, hinh_anh, doi_tuong_su_dung, dong_san_pham, khang_nuoc, khoang_tru_cot, size_mat, hinh_dang, do_day, id_dong_may, id_chat_lieu_day, id_chat_lieu_kinh, id_xuat_xu, id_chat_lieu_vo, id_mau_vo, id_mau_mat, trang_thai) 
values ('SP000016',	8,	'BM8475-00F',	2782500,	3710000,	15,	'BM8475-00F.jpg',	N'Nam',	null,	10,	null,	42,	N'Mặt tròn',	11,	5,	4,	3,	111,	3,	3,	3,	default);
insert into SanPham(ma_san_pham, id_thuong_hieu, ma_hang_hoa, gia_nhap, don_gia, so_luong_ton, hinh_anh, doi_tuong_su_dung, dong_san_pham, khang_nuoc, khoang_tru_cot, size_mat, hinh_dang, do_day, id_dong_may, id_chat_lieu_day, id_chat_lieu_kinh, id_xuat_xu, id_chat_lieu_vo, id_mau_vo, id_mau_mat, trang_thai) 
values ('SP000017',	8,	'NH8350-08A',	3090000,	4120000,	15,	'NH8350-08A.jpg',	N'Nam',	null,	5,	40,	40,	N'Mặt tròn',	11.5,	1,	1,	3,	111,	3,	17,	2,	default);
insert into SanPham(ma_san_pham, id_thuong_hieu, ma_hang_hoa, gia_nhap, don_gia, so_luong_ton, hinh_anh, doi_tuong_su_dung, dong_san_pham, khang_nuoc, khoang_tru_cot, size_mat, hinh_dang, do_day, id_dong_may, id_chat_lieu_day, id_chat_lieu_kinh, id_xuat_xu, id_chat_lieu_vo, id_mau_vo, id_mau_mat, trang_thai) 
values ('SP000018',	8,	'AW1591-01L',	3810000,	5080000,	15,	'AW1591-01L.jpg',	N'Nam',	null,	10,	null,	43,	N'Mặt tròn',	12.2,	5,	1,	3,	111,	3,	17,	1,	default);
insert into SanPham(ma_san_pham, id_thuong_hieu, ma_hang_hoa, gia_nhap, don_gia, so_luong_ton, hinh_anh, doi_tuong_su_dung, dong_san_pham, khang_nuoc, khoang_tru_cot, size_mat, hinh_dang, do_day, id_dong_may, id_chat_lieu_day, id_chat_lieu_kinh, id_xuat_xu, id_chat_lieu_vo, id_mau_vo, id_mau_mat, trang_thai) 
values ('SP000019',	8,	'EX1484-57D',	3150000,	4200000,	15,	'EX1484-57D.jpg',	N'Nữ',	null,	5,	null,	29,	N'Mặt tròn',	7,	5,	2,	1,	111,	3,	6,	2,	default);
insert into SanPham(ma_san_pham, id_thuong_hieu, ma_hang_hoa, gia_nhap, don_gia, so_luong_ton, hinh_anh, doi_tuong_su_dung, dong_san_pham, khang_nuoc, khoang_tru_cot, size_mat, hinh_dang, do_day, id_dong_may, id_chat_lieu_day, id_chat_lieu_kinh, id_xuat_xu, id_chat_lieu_vo, id_mau_vo, id_mau_mat, trang_thai) 
values ('SP000020',	8,	'AU1062-05E',	2977500,	3970000,	15,	'AU1062-05E.jpg',	N'Nam',	null,	5,	null,	40,	N'Mặt tròn',	8,	5,	1,	3,	111,	4,	6,	3,	default);
insert into SanPham(ma_san_pham, id_thuong_hieu, ma_hang_hoa, gia_nhap, don_gia, so_luong_ton, hinh_anh, doi_tuong_su_dung, dong_san_pham, khang_nuoc, khoang_tru_cot, size_mat, hinh_dang, do_day, id_dong_may, id_chat_lieu_day, id_chat_lieu_kinh, id_xuat_xu, id_chat_lieu_vo, id_mau_vo, id_mau_mat, trang_thai) 
values ('SP000021',	8,	'FE1140-86X',	2362500,	3150000,	15,	'FE1140-86X.jpg',	N'Nữ',	null,	5,	null,	29,	N'Mặt tròn',	null,	5,	2,	3,	null,	3,	17,	11,	default);
insert into SanPham(ma_san_pham, id_thuong_hieu, ma_hang_hoa, gia_nhap, don_gia, so_luong_ton, hinh_anh, doi_tuong_su_dung, dong_san_pham, khang_nuoc, khoang_tru_cot, size_mat, hinh_dang, do_day, id_dong_may, id_chat_lieu_day, id_chat_lieu_kinh, id_xuat_xu, id_chat_lieu_vo, id_mau_vo, id_mau_mat, trang_thai) 
values ('SP000022',	22,	'FAG03001D0',	5242500,	6990000,	15,	'FAG03001D0.jpg',	N'Nam',	'Orient Golden Eye',	5,	40,	38.5,	N'Mặt tròn',	10.8,	1,	2,	1,	111,	3,	17,	1,	default);
insert into SanPham(ma_san_pham, id_thuong_hieu, ma_hang_hoa, gia_nhap, don_gia, so_luong_ton, hinh_anh, doi_tuong_su_dung, dong_san_pham, khang_nuoc, khoang_tru_cot, size_mat, hinh_dang, do_day, id_dong_may, id_chat_lieu_day, id_chat_lieu_kinh, id_xuat_xu, id_chat_lieu_vo, id_mau_vo, id_mau_mat, trang_thai) 
values ('SP000023',	22,	'RA-AK0007S10B',	7582500,	10110000,	15,	'RA-AK0007S10B.jpg',	N'Nam',	'Sun & Moon',	5,	40,	42.5,	N'Mặt tròn',	null,	1,	1,	1,	111,	4,	6,	6,	default);
insert into SanPham(ma_san_pham, id_thuong_hieu, ma_hang_hoa, gia_nhap, don_gia, so_luong_ton, hinh_anh, doi_tuong_su_dung, dong_san_pham, khang_nuoc, khoang_tru_cot, size_mat, hinh_dang, do_day, id_dong_may, id_chat_lieu_day, id_chat_lieu_kinh, id_xuat_xu, id_chat_lieu_vo, id_mau_vo, id_mau_mat, trang_thai) 
values ('SP000024',	22,	'RA-KA0005A00B',	4575000,	6100000,	15,	'RA-KA0005A00B.jpg',	N'Nữ',	'Sun & Moon',	5,	null,	35,	N'Mặt tròn',	null,	4,	1,	1,	111,	3,	17,	10,	default);
insert into SanPham(ma_san_pham, id_thuong_hieu, ma_hang_hoa, gia_nhap, don_gia, so_luong_ton, hinh_anh, doi_tuong_su_dung, dong_san_pham, khang_nuoc, khoang_tru_cot, size_mat, hinh_dang, do_day, id_dong_may, id_chat_lieu_day, id_chat_lieu_kinh, id_xuat_xu, id_chat_lieu_vo, id_mau_vo, id_mau_mat, trang_thai) 
values ('SP000025',	22,	'FAG03002B0',	5287500,	7050000,	15,	'FAG03002B0.jpg',	N'Nam',	'Orient Golden Eye',	5,	40,	38.5,	N'Mặt tròn',	10.8,	1,	2,	1,	111,	3,	17,	3,	default);
insert into SanPham(ma_san_pham, id_thuong_hieu, ma_hang_hoa, gia_nhap, don_gia, so_luong_ton, hinh_anh, doi_tuong_su_dung, dong_san_pham, khang_nuoc, khoang_tru_cot, size_mat, hinh_dang, do_day, id_dong_may, id_chat_lieu_day, id_chat_lieu_kinh, id_xuat_xu, id_chat_lieu_vo, id_mau_vo, id_mau_mat, trang_thai) 
values ('SP000026',	22,	'FAG02004B0',	3817500,	5090000,	15,	'FAG02004B0.jpg',	N'Nam',	null,	5,	null,	41,	N'Mặt tròn',	12,	1,	1,	3,	111,	3,	17,	3,	default);
insert into SanPham(ma_san_pham, id_thuong_hieu, ma_hang_hoa, gia_nhap, don_gia, so_luong_ton, hinh_anh, doi_tuong_su_dung, dong_san_pham, khang_nuoc, khoang_tru_cot, size_mat, hinh_dang, do_day, id_dong_may, id_chat_lieu_day, id_chat_lieu_kinh, id_xuat_xu, id_chat_lieu_vo, id_mau_vo, id_mau_mat, trang_thai) 
values ('SP000027',	22,	'RA-AS0010S10B',	7927500,	10570000,	15,	'RA-AS0010S10B.jpg',	N'Nam',	'Sun & Moon',	5,	40,	42,	N'Mặt tròn',	14,	1,	1,	1,	111,	4,	6,	6,	default);
insert into SanPham(ma_san_pham, id_thuong_hieu, ma_hang_hoa, gia_nhap, don_gia, so_luong_ton, hinh_anh, doi_tuong_su_dung, dong_san_pham, khang_nuoc, khoang_tru_cot, size_mat, hinh_dang, do_day, id_dong_may, id_chat_lieu_day, id_chat_lieu_kinh, id_xuat_xu, id_chat_lieu_vo, id_mau_vo, id_mau_mat, trang_thai) 
values ('SP000028',	24,	'SNKK11K1',	2527500,	3370000,	15,	'SNKK11K1.jpg',	N'Nam',	'Seiko 5',	3,	40,	38,	N'Mặt tròn',	11,	1,	2,	4,	111,	3,	17,	1,	default);
insert into SanPham(ma_san_pham, id_thuong_hieu, ma_hang_hoa, gia_nhap, don_gia, so_luong_ton, hinh_anh, doi_tuong_su_dung, dong_san_pham, khang_nuoc, khoang_tru_cot, size_mat, hinh_dang, do_day, id_dong_may, id_chat_lieu_day, id_chat_lieu_kinh, id_xuat_xu, id_chat_lieu_vo, id_mau_vo, id_mau_mat, trang_thai) 
values ('SP000029',	24,	'SNKP15J1',	3315000,	4420000,	15,	'SNKP15J1.jpg',	N'Nam',	'Seiko 5',	5,	40,	42,	N'Mặt tròn',	11,	1,	2,	4,	111,	3,	null,	2,	default);
insert into SanPham(ma_san_pham, id_thuong_hieu, ma_hang_hoa, gia_nhap, don_gia, so_luong_ton, hinh_anh, doi_tuong_su_dung, dong_san_pham, khang_nuoc, khoang_tru_cot, size_mat, hinh_dang, do_day, id_dong_may, id_chat_lieu_day, id_chat_lieu_kinh, id_xuat_xu, id_chat_lieu_vo, id_mau_vo, id_mau_mat, trang_thai) 
values ('SP000030',	24,	'SNZG07J1',	4417500,	5890000,	15,	'SNZG07J1.jpg',	N'Nam',	'Seiko 5 Sport',	null,	40,	42,	N'Mặt tròn',	11,	1,	4,	4,	111,	3,	17,	8,	default);
insert into SanPham(ma_san_pham, id_thuong_hieu, ma_hang_hoa, gia_nhap, don_gia, so_luong_ton, hinh_anh, doi_tuong_su_dung, dong_san_pham, khang_nuoc, khoang_tru_cot, size_mat, hinh_dang, do_day, id_dong_may, id_chat_lieu_day, id_chat_lieu_kinh, id_xuat_xu, id_chat_lieu_vo, id_mau_vo, id_mau_mat, trang_thai) 
values ('SP000031',	24,	'SNKP17J1',	3262500,	4350000,	15,	'SNKP17J1.jpg',	N'Nam',	'Seiko 5',	5,	40,	42,	N'Mặt tròn',	11,	1,	2,	4,	111,	3,	17,	1,	default);
insert into SanPham(ma_san_pham, id_thuong_hieu, ma_hang_hoa, gia_nhap, don_gia, so_luong_ton, hinh_anh, doi_tuong_su_dung, dong_san_pham, khang_nuoc, khoang_tru_cot, size_mat, hinh_dang, do_day, id_dong_may, id_chat_lieu_day, id_chat_lieu_kinh, id_xuat_xu, id_chat_lieu_vo, id_mau_vo, id_mau_mat, trang_thai) 
values ('SP000032',	24,	'SUR638P1',	2835000,	3780000,	15,	'SUR638P1.jpg',	N'Nữ',	null,	5,	null,	29,	N'Mặt tròn',	8,	4,	1,	1,	111,	4,	6,	2,	default);
insert into SanPham(ma_san_pham, id_thuong_hieu, ma_hang_hoa, gia_nhap, don_gia, so_luong_ton, hinh_anh, doi_tuong_su_dung, dong_san_pham, khang_nuoc, khoang_tru_cot, size_mat, hinh_dang, do_day, id_dong_may, id_chat_lieu_day, id_chat_lieu_kinh, id_xuat_xu, id_chat_lieu_vo, id_mau_vo, id_mau_mat, trang_thai) 
values ('SP000033',	24,	'SRPD53K1',	6292500,	8390000,	15,	'SRPD53K1.jpg',	N'Nam',	'Seiko 5 Sport',	10,	40,	42.5,	N'Mặt tròn',	13.4,	8,	2,	4,	111,	3,	17,	1,	default);
insert into SanPham(ma_san_pham, id_thuong_hieu, ma_hang_hoa, gia_nhap, don_gia, so_luong_ton, hinh_anh, doi_tuong_su_dung, dong_san_pham, khang_nuoc, khoang_tru_cot, size_mat, hinh_dang, do_day, id_dong_may, id_chat_lieu_day, id_chat_lieu_kinh, id_xuat_xu, id_chat_lieu_vo, id_mau_vo, id_mau_mat, trang_thai) 
values ('SP000034',	3,	'BL1869-101MKNN',	2362500,	3150000,	15,	'BL1869-101MKNN.jpg',	N'Nam',	null,	3,	null,	40,	N'Mặt tròn',	8.5,	4,	1,	1,	82,	4,	6,	1,	default);
insert into SanPham(ma_san_pham, id_thuong_hieu, ma_hang_hoa, gia_nhap, don_gia, so_luong_ton, hinh_anh, doi_tuong_su_dung, dong_san_pham, khang_nuoc, khoang_tru_cot, size_mat, hinh_dang, do_day, id_dong_may, id_chat_lieu_day, id_chat_lieu_kinh, id_xuat_xu, id_chat_lieu_vo, id_mau_vo, id_mau_mat, trang_thai) 
values ('SP000035',	3,	'BL1865-30MKWB',	2047500,	2730000,	15,	'BL1865-30MKWB.jpg',	N'Nam',	null,	3,	null,	40,	N'Mặt tròn',	5,	4,	1,	1,	82,	4,	6,	2,	default);
insert into SanPham(ma_san_pham, id_thuong_hieu, ma_hang_hoa, gia_nhap, don_gia, so_luong_ton, hinh_anh, doi_tuong_su_dung, dong_san_pham, khang_nuoc, khoang_tru_cot, size_mat, hinh_dang, do_day, id_dong_may, id_chat_lieu_day, id_chat_lieu_kinh, id_xuat_xu, id_chat_lieu_vo, id_mau_vo, id_mau_mat, trang_thai) 
values ('SP000036',	3,	'BL1784-252KBB-S2-M',	6442500,	8590000,	15,	'BL1784-252KBB-S2-M.jpg',	N'Nam',	null,	5,	null,	43,	N'Mặt tròn',	13.5,	1,	1,	1,	82,	4,	6,	10,	default);
insert into SanPham(ma_san_pham, id_thuong_hieu, ma_hang_hoa, gia_nhap, don_gia, so_luong_ton, hinh_anh, doi_tuong_su_dung, dong_san_pham, khang_nuoc, khoang_tru_cot, size_mat, hinh_dang, do_day, id_dong_may, id_chat_lieu_day, id_chat_lieu_kinh, id_xuat_xu, id_chat_lieu_vo, id_mau_vo, id_mau_mat, trang_thai) 
values ('SP000037',	3,	'BL1869-101MWBI',	2520000,	3360000,	15,	'BL1869-101MWBI.jpg',	N'Nam',	null,	3,	null,	40,	N'Mặt tròn',	null,	4,	2,	1,	82,	3,	17,	3,	default);
insert into SanPham(ma_san_pham, id_thuong_hieu, ma_hang_hoa, gia_nhap, don_gia, so_luong_ton, hinh_anh, doi_tuong_su_dung, dong_san_pham, khang_nuoc, khoang_tru_cot, size_mat, hinh_dang, do_day, id_dong_may, id_chat_lieu_day, id_chat_lieu_kinh, id_xuat_xu, id_chat_lieu_vo, id_mau_vo, id_mau_mat, trang_thai) 
values ('SP000038',	3,	'BL1831-15MKWD',	4530000,	6040000,	15,	'BL1831-15MKWD.jpg',	N'Nam',	null,	5,	null,	41,	N'Mặt tròn',	12,	1,	1,	1,	82,	4,	6,	2,	default);
insert into SanPham(ma_san_pham, id_thuong_hieu, ma_hang_hoa, gia_nhap, don_gia, so_luong_ton, hinh_anh, doi_tuong_su_dung, dong_san_pham, khang_nuoc, khoang_tru_cot, size_mat, hinh_dang, do_day, id_dong_may, id_chat_lieu_day, id_chat_lieu_kinh, id_xuat_xu, id_chat_lieu_vo, id_mau_vo, id_mau_mat, trang_thai) 
values ('SP000039',	3,	'BL1869-101MWWI',	2520000,	3360000,	15,	'BL1869-101MWWI.jpg',	N'Nam',	null,	3,	null,	40,	N'Mặt tròn',	null,	4,	2,	1,	82,	3,	17,	2,	default);
insert into SanPham(ma_san_pham, id_thuong_hieu, ma_hang_hoa, gia_nhap, don_gia, so_luong_ton, hinh_anh, doi_tuong_su_dung, dong_san_pham, khang_nuoc, khoang_tru_cot, size_mat, hinh_dang, do_day, id_dong_may, id_chat_lieu_day, id_chat_lieu_kinh, id_xuat_xu, id_chat_lieu_vo, id_mau_vo, id_mau_mat, trang_thai) 
values ('SP000040',	4,	'98A187',	4125000,	5500000,	15,	'98A187.jpg',	N'Nam',	null,	3,	null,	41,	N'Mặt tròn',	null,	1,	2,	3,	null,	3,	17,	13,	default);
insert into SanPham(ma_san_pham, id_thuong_hieu, ma_hang_hoa, gia_nhap, don_gia, so_luong_ton, hinh_anh, doi_tuong_su_dung, dong_san_pham, khang_nuoc, khoang_tru_cot, size_mat, hinh_dang, do_day, id_dong_may, id_chat_lieu_day, id_chat_lieu_kinh, id_xuat_xu, id_chat_lieu_vo, id_mau_vo, id_mau_mat, trang_thai) 
values ('SP000041',	4,	'98C134',	5047500,	6730000,	15,	'98C134.jpg',	N'Nam',	null,	3,	null,	41.5,	N'Đa giác',	9.8,	4,	2,	3,	235,	3,	3,	3,	default);
insert into SanPham(ma_san_pham, id_thuong_hieu, ma_hang_hoa, gia_nhap, don_gia, so_luong_ton, hinh_anh, doi_tuong_su_dung, dong_san_pham, khang_nuoc, khoang_tru_cot, size_mat, hinh_dang, do_day, id_dong_may, id_chat_lieu_day, id_chat_lieu_kinh, id_xuat_xu, id_chat_lieu_vo, id_mau_vo, id_mau_mat, trang_thai) 
values ('SP000042',	4,	'96P197',	2805000,	3740000,	15,	'96P197.jpg',	N'Nữ',	null,	3,	null,	35,	N'Mặt tròn',	8.4,	4,	1,	1,	111,	3,	17,	10,	default);
insert into SanPham(ma_san_pham, id_thuong_hieu, ma_hang_hoa, gia_nhap, don_gia, so_luong_ton, hinh_anh, doi_tuong_su_dung, dong_san_pham, khang_nuoc, khoang_tru_cot, size_mat, hinh_dang, do_day, id_dong_may, id_chat_lieu_day, id_chat_lieu_kinh, id_xuat_xu, id_chat_lieu_vo, id_mau_vo, id_mau_mat, trang_thai) 
values ('SP000043',	4,	'98P157',	2550000,	3400000,	15,	'98P157.jpg',	N'Nữ',	null,	3,	null,	26,	N'Mặt tròn',	6.5,	4,	1,	1,	215,	3,	null,	12,	default);
insert into SanPham(ma_san_pham, id_thuong_hieu, ma_hang_hoa, gia_nhap, don_gia, so_luong_ton, hinh_anh, doi_tuong_su_dung, dong_san_pham, khang_nuoc, khoang_tru_cot, size_mat, hinh_dang, do_day, id_dong_may, id_chat_lieu_day, id_chat_lieu_kinh, id_xuat_xu, id_chat_lieu_vo, id_mau_vo, id_mau_mat, trang_thai) 
values ('SP000044',	4,	'96C142',	7237500,	9650000,	15,	'96C142.jpg',	N'Nam',	null,	3,	null,	43,	N'Mặt tròn',	null,	1,	1,	1,	235,	3,	17,	1,	default);
insert into SanPham(ma_san_pham, id_thuong_hieu, ma_hang_hoa, gia_nhap, don_gia, so_luong_ton, hinh_anh, doi_tuong_su_dung, dong_san_pham, khang_nuoc, khoang_tru_cot, size_mat, hinh_dang, do_day, id_dong_may, id_chat_lieu_day, id_chat_lieu_kinh, id_xuat_xu, id_chat_lieu_vo, id_mau_vo, id_mau_mat, trang_thai) 
values ('SP000045',	4,	'98L232',	2340000,	3120000,	15,	'98L232.jpg',	N'Nữ',	null,	3,	null,	32,	N'Mặt tròn',	7,	4,	2,	3,	235,	3,	17,	10,	default);
insert into SanPham(ma_san_pham, id_thuong_hieu, ma_hang_hoa, gia_nhap, don_gia, so_luong_ton, hinh_anh, doi_tuong_su_dung, dong_san_pham, khang_nuoc, khoang_tru_cot, size_mat, hinh_dang, do_day, id_dong_may, id_chat_lieu_day, id_chat_lieu_kinh, id_xuat_xu, id_chat_lieu_vo, id_mau_vo, id_mau_mat, trang_thai) 
values ('SP000046',	26,	'SG8886.4103AT',	2497500,	3330000,	15,	'SG8886.4103AT.jpg',	N'Nam',	null,	5,	40,	40,	N'Mặt tròn',	11.7,	1,	1,	1,	111,	3,	17,	1,	default);
insert into SanPham(ma_san_pham, id_thuong_hieu, ma_hang_hoa, gia_nhap, don_gia, so_luong_ton, hinh_anh, doi_tuong_su_dung, dong_san_pham, khang_nuoc, khoang_tru_cot, size_mat, hinh_dang, do_day, id_dong_may, id_chat_lieu_day, id_chat_lieu_kinh, id_xuat_xu, id_chat_lieu_vo, id_mau_vo, id_mau_mat, trang_thai) 
values ('SP000047',	26,	'SG3003.4601CV',	840000,	1120000,	15,	'SG3003.4601CV.jpg',	N'Nam',	null,	5,	null,	40,	N'Mặt tròn',	5,	4,	1,	1,	111,	4,	6,	3,	default);
insert into SanPham(ma_san_pham, id_thuong_hieu, ma_hang_hoa, gia_nhap, don_gia, so_luong_ton, hinh_anh, doi_tuong_su_dung, dong_san_pham, khang_nuoc, khoang_tru_cot, size_mat, hinh_dang, do_day, id_dong_may, id_chat_lieu_day, id_chat_lieu_kinh, id_xuat_xu, id_chat_lieu_vo, id_mau_vo, id_mau_mat, trang_thai) 
values ('SP000048',	26,	'SG2205.4601',	1882500,	2510000,	15,	'SG2205.4601.jpg',	N'Nam',	null,	5,	null,	31,	N'Mặt chữ nhật',	null,	4,	1,	1,	111,	3,	6,	3,	default);
insert into SanPham(ma_san_pham, id_thuong_hieu, ma_hang_hoa, gia_nhap, don_gia, so_luong_ton, hinh_anh, doi_tuong_su_dung, dong_san_pham, khang_nuoc, khoang_tru_cot, size_mat, hinh_dang, do_day, id_dong_may, id_chat_lieu_day, id_chat_lieu_kinh, id_xuat_xu, id_chat_lieu_vo, id_mau_vo, id_mau_mat, trang_thai) 
values ('SP000049',	26,	'SG3002.4601CV',	840000,	1120000,	15,	'SG3002.4601CV.jpg',	N'Nam',	null,	5,	null,	40,	N'Mặt tròn',	5,	4,	1,	1,	111,	4,	6,	3,	default);
insert into SanPham(ma_san_pham, id_thuong_hieu, ma_hang_hoa, gia_nhap, don_gia, so_luong_ton, hinh_anh, doi_tuong_su_dung, dong_san_pham, khang_nuoc, khoang_tru_cot, size_mat, hinh_dang, do_day, id_dong_may, id_chat_lieu_day, id_chat_lieu_kinh, id_xuat_xu, id_chat_lieu_vo, id_mau_vo, id_mau_mat, trang_thai) 
values ('SP000050',	26,	'SL3005.1102CV',	772500,	1030000,	15,	'SL3005.1102CV.jpg',	N'Nữ',	null,	5,	null,	30,	N'Mặt tròn',	null,	4,	2,	1,	111,	3,	17,	2,	default);
insert into SanPham(ma_san_pham, id_thuong_hieu, ma_hang_hoa, gia_nhap, don_gia, so_luong_ton, hinh_anh, doi_tuong_su_dung, dong_san_pham, khang_nuoc, khoang_tru_cot, size_mat, hinh_dang, do_day, id_dong_may, id_chat_lieu_day, id_chat_lieu_kinh, id_xuat_xu, id_chat_lieu_vo, id_mau_vo, id_mau_mat, trang_thai) 
values ('SP000051',	26,	'SG1056.4602TE',	1215000,	1620000,	15,	'SG1056.4602TE.jpg',	N'Nam',	null,	5,	null,	39,	N'Mặt tròn',	null,	4,	1,	1,	111,	3,	6,	2,	default);
insert into SanPham(ma_san_pham, id_thuong_hieu, ma_hang_hoa, gia_nhap, don_gia, so_luong_ton, hinh_anh, doi_tuong_su_dung, dong_san_pham, khang_nuoc, khoang_tru_cot, size_mat, hinh_dang, do_day, id_dong_may, id_chat_lieu_day, id_chat_lieu_kinh, id_xuat_xu, id_chat_lieu_vo, id_mau_vo, id_mau_mat, trang_thai) 
values ('SP000052',	26,	'SG8895.4101',	3562500,	4750000,	15,	'SG8895.4101.jpg',	N'Nam',	null,	5,	40,	40,	N'Mặt tròn',	11.7,	1,	1,	1,	111,	3,	17,	3,	default);
insert into SanPham(ma_san_pham, id_thuong_hieu, ma_hang_hoa, gia_nhap, don_gia, so_luong_ton, hinh_anh, doi_tuong_su_dung, dong_san_pham, khang_nuoc, khoang_tru_cot, size_mat, hinh_dang, do_day, id_dong_may, id_chat_lieu_day, id_chat_lieu_kinh, id_xuat_xu, id_chat_lieu_vo, id_mau_vo, id_mau_mat, trang_thai) 
values ('SP000053',	10,	'DW00100368',	2835000,	3780000,	15,	'DW00100368.jpg',	N'Nữ',	null,	3,	null,	28,	N'Mặt tròn',	null,	4,	2,	3,	null,	null,	24,	11,	default);
insert into SanPham(ma_san_pham, id_thuong_hieu, ma_hang_hoa, gia_nhap, don_gia, so_luong_ton, hinh_anh, doi_tuong_su_dung, dong_san_pham, khang_nuoc, khoang_tru_cot, size_mat, hinh_dang, do_day, id_dong_may, id_chat_lieu_day, id_chat_lieu_kinh, id_xuat_xu, id_chat_lieu_vo, id_mau_vo, id_mau_mat, trang_thai) 
values ('SP000054',	10,	'DW00100647',	2445000,	3260000,	15,	'DW00100647.jpg',	N'Nữ',	null,	3,	null,	28,	N'Mặt chữ nhật',	null,	4,	2,	3,	null,	null,	24,	3,	default);
insert into SanPham(ma_san_pham, id_thuong_hieu, ma_hang_hoa, gia_nhap, don_gia, so_luong_ton, hinh_anh, doi_tuong_su_dung, dong_san_pham, khang_nuoc, khoang_tru_cot, size_mat, hinh_dang, do_day, id_dong_may, id_chat_lieu_day, id_chat_lieu_kinh, id_xuat_xu, id_chat_lieu_vo, id_mau_vo, id_mau_mat, trang_thai) 
values ('SP000055',	10,	'DW00100646',	4080000,	5440000,	15,	'DW00100646.jpg',	N'Nam',	null,	5,	null,	42,	N'Mặt tròn',	null,	4,	1,	3,	null,	null,	24,	2,	default);
insert into SanPham(ma_san_pham, id_thuong_hieu, ma_hang_hoa, gia_nhap, don_gia, so_luong_ton, hinh_anh, doi_tuong_su_dung, dong_san_pham, khang_nuoc, khoang_tru_cot, size_mat, hinh_dang, do_day, id_dong_may, id_chat_lieu_day, id_chat_lieu_kinh, id_xuat_xu, id_chat_lieu_vo, id_mau_vo, id_mau_mat, trang_thai) 
values ('SP000056',	10,	'DW00100626',	3810000,	5080000,	15,	'DW00100626.jpg',	N'Nam',	null,	3,	null,	40,	N'Mặt tròn',	null,	4,	1,	3,	null,	null,	24,	1,	default);
insert into SanPham(ma_san_pham, id_thuong_hieu, ma_hang_hoa, gia_nhap, don_gia, so_luong_ton, hinh_anh, doi_tuong_su_dung, dong_san_pham, khang_nuoc, khoang_tru_cot, size_mat, hinh_dang, do_day, id_dong_may, id_chat_lieu_day, id_chat_lieu_kinh, id_xuat_xu, id_chat_lieu_vo, id_mau_vo, id_mau_mat, trang_thai) 
values ('SP000057',	10,	'DW00100625',	3397500,	4530000,	15,	'DW00100625.jpg',	N'Nữ',	null,	3,	null,	26,	N'Mặt chữ nhật',	null,	4,	2,	3,	null,	null,	17,	2,	default);
insert into SanPham(ma_san_pham, id_thuong_hieu, ma_hang_hoa, gia_nhap, don_gia, so_luong_ton, hinh_anh, doi_tuong_su_dung, dong_san_pham, khang_nuoc, khoang_tru_cot, size_mat, hinh_dang, do_day, id_dong_may, id_chat_lieu_day, id_chat_lieu_kinh, id_xuat_xu, id_chat_lieu_vo, id_mau_vo, id_mau_mat, trang_thai) 
values ('SP000058',	10,	'DW00100622',	3397500,	4530000,	15,	'DW00100622.jpg',	N'Nữ',	null,	3,	null,	26,	N'Mặt chữ nhật',	null,	4,	2,	3,	null,	null,	6,	2,	default);
insert into SanPham(ma_san_pham, id_thuong_hieu, ma_hang_hoa, gia_nhap, don_gia, so_luong_ton, hinh_anh, doi_tuong_su_dung, dong_san_pham, khang_nuoc, khoang_tru_cot, size_mat, hinh_dang, do_day, id_dong_may, id_chat_lieu_day, id_chat_lieu_kinh, id_xuat_xu, id_chat_lieu_vo, id_mau_vo, id_mau_mat, trang_thai) 
values ('SP000059',	10,	'DW00100621',	3712500,	4950000,	15,	'DW00100621.jpg',	N'Nữ',	null,	3,	null,	26,	N'Mặt chữ nhật',	null,	4,	2,	3,	null,	null,	24,	11,	default);
insert into SanPham(ma_san_pham, id_thuong_hieu, ma_hang_hoa, gia_nhap, don_gia, so_luong_ton, hinh_anh, doi_tuong_su_dung, dong_san_pham, khang_nuoc, khoang_tru_cot, size_mat, hinh_dang, do_day, id_dong_may, id_chat_lieu_day, id_chat_lieu_kinh, id_xuat_xu, id_chat_lieu_vo, id_mau_vo, id_mau_mat, trang_thai) 
values ('SP000060',	10,	'DW00100620',	3712500,	4950000,	15,	'DW00100620.jpg',	N'Nữ',	null,	3,	null,	26,	N'Mặt chữ nhật',	null,	4,	2,	3,	null,	null,	24,	2,	default);
insert into SanPham(ma_san_pham, id_thuong_hieu, ma_hang_hoa, gia_nhap, don_gia, so_luong_ton, hinh_anh, doi_tuong_su_dung, dong_san_pham, khang_nuoc, khoang_tru_cot, size_mat, hinh_dang, do_day, id_dong_may, id_chat_lieu_day, id_chat_lieu_kinh, id_xuat_xu, id_chat_lieu_vo, id_mau_vo, id_mau_mat, trang_thai) 
values ('SP000061',	28,	'T006.407.36.053.00',	10455000,	13940000,	15,	'T006.407.36.053.00.jpg',	N'Nam',	'Tissot Le Locle',	3,	80,	39.3,	N'Mặt tròn',	9.8,	6,	1,	1,	215,	4,	24,	3,	default);
insert into SanPham(ma_san_pham, id_thuong_hieu, ma_hang_hoa, gia_nhap, don_gia, so_luong_ton, hinh_anh, doi_tuong_su_dung, dong_san_pham, khang_nuoc, khoang_tru_cot, size_mat, hinh_dang, do_day, id_dong_may, id_chat_lieu_day, id_chat_lieu_kinh, id_xuat_xu, id_chat_lieu_vo, id_mau_vo, id_mau_mat, trang_thai) 
values ('SP000062',	28,	'T137.407.11.051.00',	11175000,	14900000,	15,	'T137.407.11.051.00.jpg',	N'Nam',	'Tissot Prx',	10,	80,	40,	N'Mặt tròn',	10.9,	6,	2,	1,	215,	3,	17,	3,	default);
insert into SanPham(ma_san_pham, id_thuong_hieu, ma_hang_hoa, gia_nhap, don_gia, so_luong_ton, hinh_anh, doi_tuong_su_dung, dong_san_pham, khang_nuoc, khoang_tru_cot, size_mat, hinh_dang, do_day, id_dong_may, id_chat_lieu_day, id_chat_lieu_kinh, id_xuat_xu, id_chat_lieu_vo, id_mau_vo, id_mau_mat, trang_thai) 
values ('SP000063',	28,	'T006.407.22.033.00',	12862500,	17150000,	15,	'T006.407.22.033.00.jpg',	N'Nam',	'Tissot Le Locle',	3,	80,	39.3,	N'Mặt tròn',	9.8,	6,	2,	1,	215,	3,	17,	2,	default);
insert into SanPham(ma_san_pham, id_thuong_hieu, ma_hang_hoa, gia_nhap, don_gia, so_luong_ton, hinh_anh, doi_tuong_su_dung, dong_san_pham, khang_nuoc, khoang_tru_cot, size_mat, hinh_dang, do_day, id_dong_may, id_chat_lieu_day, id_chat_lieu_kinh, id_xuat_xu, id_chat_lieu_vo, id_mau_vo, id_mau_mat, trang_thai) 
values ('SP000064',	28,	'T006.407.16.033.00',	9375000,	12500000,	15,	'T006.407.16.033.00.jpg',	N'Nam',	'Tissot Le Locle',	3,	80,	39.3,	N'Mặt tròn',	9.8,	6,	1,	1,	215,	3,	17,	2,	default);
insert into SanPham(ma_san_pham, id_thuong_hieu, ma_hang_hoa, gia_nhap, don_gia, so_luong_ton, hinh_anh, doi_tuong_su_dung, dong_san_pham, khang_nuoc, khoang_tru_cot, size_mat, hinh_dang, do_day, id_dong_may, id_chat_lieu_day, id_chat_lieu_kinh, id_xuat_xu, id_chat_lieu_vo, id_mau_vo, id_mau_mat, trang_thai) 
values ('SP000065',	28,	'T086.407.11.061.00',	6375000,	8500000,	15,	'T086.407.11.061.00.jpg',	N'Nam',	null,	5,	80,	41,	N'Mặt tròn',	9.8,	6,	2,	1,	215,	3,	17,	13,	default);
insert into SanPham(ma_san_pham, id_thuong_hieu, ma_hang_hoa, gia_nhap, don_gia, so_luong_ton, hinh_anh, doi_tuong_su_dung, dong_san_pham, khang_nuoc, khoang_tru_cot, size_mat, hinh_dang, do_day, id_dong_may, id_chat_lieu_day, id_chat_lieu_kinh, id_xuat_xu, id_chat_lieu_vo, id_mau_vo, id_mau_mat, trang_thai) 
values ('SP000066',	28,	'T006.407.22.036.00',	14175000,	18900000,	15,	'T006.407.22.036.00.jpg',	N'Nam',	'Tissot Le Locle',	3,	80,	39.3,	N'Mặt tròn',	9.8,	6,	2,	1,	215,	3,	17,	2,	default);
insert into SanPham(ma_san_pham, id_thuong_hieu, ma_hang_hoa, gia_nhap, don_gia, so_luong_ton, hinh_anh, doi_tuong_su_dung, dong_san_pham, khang_nuoc, khoang_tru_cot, size_mat, hinh_dang, do_day, id_dong_may, id_chat_lieu_day, id_chat_lieu_kinh, id_xuat_xu, id_chat_lieu_vo, id_mau_vo, id_mau_mat, trang_thai) 
values ('SP000067',	28,	'T065.430.22.031.00',	6750000,	9000000,	15,	'T065.430.22.031.00.jpg',	N'Nam',	null,	3,	null,	39.7,	N'Mặt tròn',	9.5,	1,	2,	1,	215,	3,	17,	2,	default);
insert into SanPham(ma_san_pham, id_thuong_hieu, ma_hang_hoa, gia_nhap, don_gia, so_luong_ton, hinh_anh, doi_tuong_su_dung, dong_san_pham, khang_nuoc, khoang_tru_cot, size_mat, hinh_dang, do_day, id_dong_may, id_chat_lieu_day, id_chat_lieu_kinh, id_xuat_xu, id_chat_lieu_vo, id_mau_vo, id_mau_mat, trang_thai) 
values ('SP000068',	12,	'FC-200MC12B',	16522500,	22030000,	15,	'FC-200MC12B.jpg',	N'Nữ',	null,	3,	null,	23,	N'Mặt chữ nhật',	5.5,	4,	2,	1,	215,	3,	17,	2,	default);
insert into SanPham(ma_san_pham, id_thuong_hieu, ma_hang_hoa, gia_nhap, don_gia, so_luong_ton, hinh_anh, doi_tuong_su_dung, dong_san_pham, khang_nuoc, khoang_tru_cot, size_mat, hinh_dang, do_day, id_dong_may, id_chat_lieu_day, id_chat_lieu_kinh, id_xuat_xu, id_chat_lieu_vo, id_mau_vo, id_mau_mat, trang_thai) 
values ('SP000069',	12,	'FC-303BN5B6B',	20055000,	26740000,	15,	'FC-303BN5B6B.jpg',	N'Nam',	null,	5,	38,	40,	N'Mặt tròn',	10.2,	1,	2,	1,	215,	3,	17,	3,	default);
insert into SanPham(ma_san_pham, id_thuong_hieu, ma_hang_hoa, gia_nhap, don_gia, so_luong_ton, hinh_anh, doi_tuong_su_dung, dong_san_pham, khang_nuoc, khoang_tru_cot, size_mat, hinh_dang, do_day, id_dong_may, id_chat_lieu_day, id_chat_lieu_kinh, id_xuat_xu, id_chat_lieu_vo, id_mau_vo, id_mau_mat, trang_thai) 
values ('SP000070',	12,	'FC-310MC4S36',	24532500,	32710000,	15,	'FC-310MC4S36.jpg',	N'Nam',	null,	3,	null,	33,	N'Mặt chữ nhật',	null,	1,	1,	1,	null,	3,	17,	2,	default);
insert into SanPham(ma_san_pham, id_thuong_hieu, ma_hang_hoa, gia_nhap, don_gia, so_luong_ton, hinh_anh, doi_tuong_su_dung, dong_san_pham, khang_nuoc, khoang_tru_cot, size_mat, hinh_dang, do_day, id_dong_may, id_chat_lieu_day, id_chat_lieu_kinh, id_xuat_xu, id_chat_lieu_vo, id_mau_vo, id_mau_mat, trang_thai) 
values ('SP000071',	12,	'FC-718NWM4H6',	68602500,	91470000,	15,	'FC-718NWM4H6.jpg',	N'Nam',	null,	5,	42,	42,	N'Mặt tròn',	12.1,	1,	1,	1,	215,	3,	17,	1,	default);
insert into SanPham(ma_san_pham, id_thuong_hieu, ma_hang_hoa, gia_nhap, don_gia, so_luong_ton, hinh_anh, doi_tuong_su_dung, dong_san_pham, khang_nuoc, khoang_tru_cot, size_mat, hinh_dang, do_day, id_dong_may, id_chat_lieu_day, id_chat_lieu_kinh, id_xuat_xu, id_chat_lieu_vo, id_mau_vo, id_mau_mat, trang_thai) 
values ('SP000072',	12,	'FC-220MPW3BD26',	46665000,	62220000,	15,	'FC-220MPW3BD26.jpg',	N'Nữ',	null,	5,	null,	36,	N'Mặt tròn',	5,	4,	1,	1,	215,	3,	17,	2,	default);
insert into SanPham(ma_san_pham, id_thuong_hieu, ma_hang_hoa, gia_nhap, don_gia, so_luong_ton, hinh_anh, doi_tuong_su_dung, dong_san_pham, khang_nuoc, khoang_tru_cot, size_mat, hinh_dang, do_day, id_dong_may, id_chat_lieu_day, id_chat_lieu_kinh, id_xuat_xu, id_chat_lieu_vo, id_mau_vo, id_mau_mat, trang_thai) 
values ('SP000073',	12,	'FC-303MLG5B4',	21630000,	28840000,	15,	'FC-303MLG5B4.jpg',	N'Nam',	null,	5,	null,	40,	N'Mặt tròn',	11,	1,	1,	1,	215,	3,	24,	2,	default);
insert into SanPham(ma_san_pham, id_thuong_hieu, ma_hang_hoa, gia_nhap, don_gia, so_luong_ton, hinh_anh, doi_tuong_su_dung, dong_san_pham, khang_nuoc, khoang_tru_cot, size_mat, hinh_dang, do_day, id_dong_may, id_chat_lieu_day, id_chat_lieu_kinh, id_xuat_xu, id_chat_lieu_vo, id_mau_vo, id_mau_mat, trang_thai) 
values ('SP000074',	12,	'FC-303MV5B4',	21630000,	28840000,	15,	'FC-303MV5B4.jpg',	N'Nam',	null,	5,	38,	40,	N'Mặt tròn',	10,	1,	1,	1,	215,	4,	6,	2,	default);
insert into SanPham(ma_san_pham, id_thuong_hieu, ma_hang_hoa, gia_nhap, don_gia, so_luong_ton, hinh_anh, doi_tuong_su_dung, dong_san_pham, khang_nuoc, khoang_tru_cot, size_mat, hinh_dang, do_day, id_dong_may, id_chat_lieu_day, id_chat_lieu_kinh, id_xuat_xu, id_chat_lieu_vo, id_mau_vo, id_mau_mat, trang_thai) 
values ('SP000075',	14,	'L4.809.5.77.7',	32587500,	43450000,	15,	'L4.809.5.77.7.jpg',	N'Nam',	null,	3,	64,	34.5,	N'Mặt tròn',	8,	1,	2,	1,	215,	3,	24,	13,	default);
insert into SanPham(ma_san_pham, id_thuong_hieu, ma_hang_hoa, gia_nhap, don_gia, so_luong_ton, hinh_anh, doi_tuong_su_dung, dong_san_pham, khang_nuoc, khoang_tru_cot, size_mat, hinh_dang, do_day, id_dong_may, id_chat_lieu_day, id_chat_lieu_kinh, id_xuat_xu, id_chat_lieu_vo, id_mau_vo, id_mau_mat, trang_thai) 
values ('SP000076',	14,	'L3.742.3.56.7',	24300000,	32400000,	15,	'L3.742.3.56.7.jpg',	N'Nam',	null,	30,	null,	41,	N'Mặt tròn',	null,	1,	2,	1,	215,	3,	null,	3,	default);
insert into SanPham(ma_san_pham, id_thuong_hieu, ma_hang_hoa, gia_nhap, don_gia, so_luong_ton, hinh_anh, doi_tuong_su_dung, dong_san_pham, khang_nuoc, khoang_tru_cot, size_mat, hinh_dang, do_day, id_dong_may, id_chat_lieu_day, id_chat_lieu_kinh, id_xuat_xu, id_chat_lieu_vo, id_mau_vo, id_mau_mat, trang_thai) 
values ('SP000077',	14,	'L2.821.5.57.2',	37875000,	50500000,	15,	'L2.821.5.57.2.jpg',	N'Nam',	null,	3,	72,	40,	N'Mặt tròn',	10.8,	1,	1,	1,	215,	5,	17,	3,	default);
insert into SanPham(ma_san_pham, id_thuong_hieu, ma_hang_hoa, gia_nhap, don_gia, so_luong_ton, hinh_anh, doi_tuong_su_dung, dong_san_pham, khang_nuoc, khoang_tru_cot, size_mat, hinh_dang, do_day, id_dong_may, id_chat_lieu_day, id_chat_lieu_kinh, id_xuat_xu, id_chat_lieu_vo, id_mau_vo, id_mau_mat, trang_thai) 
values ('SP000078',	14,	'L3.781.4.96.9',	26625000,	35500000,	15,	'L3.781.4.96.9.jpg',	N'Nam',	null,	30,	null,	41,	N'Mặt tròn',	null,	1,	3,	1,	null,	3,	1,	1,	default);
insert into SanPham(ma_san_pham, id_thuong_hieu, ma_hang_hoa, gia_nhap, don_gia, so_luong_ton, hinh_anh, doi_tuong_su_dung, dong_san_pham, khang_nuoc, khoang_tru_cot, size_mat, hinh_dang, do_day, id_dong_may, id_chat_lieu_day, id_chat_lieu_kinh, id_xuat_xu, id_chat_lieu_vo, id_mau_vo, id_mau_mat, trang_thai) 
values ('SP000079',	14,	'L4.921.2.18.8',	22725000,	30300000,	15,	'L4.921.2.18.8.jpg',	N'Nam',	null,	3,	null,	38.5,	N'Mặt tròn',	12,	1,	2,	1,	215,	3,	6,	2,	default);
insert into SanPham(ma_san_pham, id_thuong_hieu, ma_hang_hoa, gia_nhap, don_gia, so_luong_ton, hinh_anh, doi_tuong_su_dung, dong_san_pham, khang_nuoc, khoang_tru_cot, size_mat, hinh_dang, do_day, id_dong_may, id_chat_lieu_day, id_chat_lieu_kinh, id_xuat_xu, id_chat_lieu_vo, id_mau_vo, id_mau_mat, trang_thai) 
values ('SP000080',	14,	'L2.773.4.92.6',	59400000,	79200000,	15,	'L2.773.4.92.6.jpg',	N'Nam',	null,	3,	50,	42,	N'Mặt tròn',	14,	1,	2,	1,	215,	3,	17,	1,	default);
insert into SanPham(ma_san_pham, id_thuong_hieu, ma_hang_hoa, gia_nhap, don_gia, so_luong_ton, hinh_anh, doi_tuong_su_dung, dong_san_pham, khang_nuoc, khoang_tru_cot, size_mat, hinh_dang, do_day, id_dong_may, id_chat_lieu_day, id_chat_lieu_kinh, id_xuat_xu, id_chat_lieu_vo, id_mau_vo, id_mau_mat, trang_thai) 
values ('SP000081',	14,	'L2.820.4.57.2',	33375000,	44500000,	15,	'L2.820.4.57.2.jpg',	N'Nam',	null,	3,	72,	38.5,	N'Mặt tròn',	10.7,	1,	1,	1,	215,	3,	17,	3,	default);
insert into SanPham(ma_san_pham, id_thuong_hieu, ma_hang_hoa, gia_nhap, don_gia, so_luong_ton, hinh_anh, doi_tuong_su_dung, dong_san_pham, khang_nuoc, khoang_tru_cot, size_mat, hinh_dang, do_day, id_dong_may, id_chat_lieu_day, id_chat_lieu_kinh, id_xuat_xu, id_chat_lieu_vo, id_mau_vo, id_mau_mat, trang_thai) 
values ('SP000082',	14,	'L4.921.2.42.2',	20925000,	27900000,	15,	'L4.921.2.42.2.jpg',	N'Nam',	null,	3,	64,	38.5,	N'Mặt tròn',	9,	1,	1,	1,	215,	3,	6,	6,	default);
insert into SanPham(ma_san_pham, id_thuong_hieu, ma_hang_hoa, gia_nhap, don_gia, so_luong_ton, hinh_anh, doi_tuong_su_dung, dong_san_pham, khang_nuoc, khoang_tru_cot, size_mat, hinh_dang, do_day, id_dong_may, id_chat_lieu_day, id_chat_lieu_kinh, id_xuat_xu, id_chat_lieu_vo, id_mau_vo, id_mau_mat, trang_thai) 
values ('SP000083',	14,	'L2.798.5.72.7',	47250000,	63000000,	15,	'L2.798.5.72.7.jpg',	N'Nam',	null,	5,	50,	42,	N'Mặt tròn',	null,	1,	2,	1,	215,	1,	24,	2,	default);
insert into SanPham(ma_san_pham, id_thuong_hieu, ma_hang_hoa, gia_nhap, don_gia, so_luong_ton, hinh_anh, doi_tuong_su_dung, dong_san_pham, khang_nuoc, khoang_tru_cot, size_mat, hinh_dang, do_day, id_dong_may, id_chat_lieu_day, id_chat_lieu_kinh, id_xuat_xu, id_chat_lieu_vo, id_mau_vo, id_mau_mat, trang_thai) 
values ('SP000084',	7,	'C029.807.22.031.00',	15277500,	20370000,	15,	'C029.807.22.031.00.jpg',	N'Nam',	null,	10,	null,	40,	N'Mặt tròn',	null,	1,	2,	1,	215,	3,	24,	2,	default);
insert into SanPham(ma_san_pham, id_thuong_hieu, ma_hang_hoa, gia_nhap, don_gia, so_luong_ton, hinh_anh, doi_tuong_su_dung, dong_san_pham, khang_nuoc, khoang_tru_cot, size_mat, hinh_dang, do_day, id_dong_may, id_chat_lieu_day, id_chat_lieu_kinh, id_xuat_xu, id_chat_lieu_vo, id_mau_vo, id_mau_mat, trang_thai) 
values ('SP000085',	7,	'C029.807.22.081.00',	15277500,	20370000,	15,	'C029.807.22.081.00.jpg',	N'Nam',	null,	10,	null,	40,	N'Mặt tròn',	11,	1,	2,	1,	215,	3,	6,	3,	default);
insert into SanPham(ma_san_pham, id_thuong_hieu, ma_hang_hoa, gia_nhap, don_gia, so_luong_ton, hinh_anh, doi_tuong_su_dung, dong_san_pham, khang_nuoc, khoang_tru_cot, size_mat, hinh_dang, do_day, id_dong_may, id_chat_lieu_day, id_chat_lieu_kinh, id_xuat_xu, id_chat_lieu_vo, id_mau_vo, id_mau_mat, trang_thai) 
values ('SP000086',	7,	'C014.407.11.081.01',	13395000,	17860000,	15,	'C014.407.11.081.01.jpg',	N'Nam',	null,	20,	null,	40,	N'Mặt tròn',	12,	1,	2,	1,	215,	3,	17,	3,	default);
insert into SanPham(ma_san_pham, id_thuong_hieu, ma_hang_hoa, gia_nhap, don_gia, so_luong_ton, hinh_anh, doi_tuong_su_dung, dong_san_pham, khang_nuoc, khoang_tru_cot, size_mat, hinh_dang, do_day, id_dong_may, id_chat_lieu_day, id_chat_lieu_kinh, id_xuat_xu, id_chat_lieu_vo, id_mau_vo, id_mau_mat, trang_thai) 
values ('SP000087',	7,	'C024.410.11.031.20',	8160000,	10880000,	15,	'C024.410.11.031.20.jpg',	N'Nam',	null,	10,	null,	40,	N'Mặt tròn',	9.5,	4,	2,	1,	215,	3,	17,	2,	default);
insert into SanPham(ma_san_pham, id_thuong_hieu, ma_hang_hoa, gia_nhap, don_gia, so_luong_ton, hinh_anh, doi_tuong_su_dung, dong_san_pham, khang_nuoc, khoang_tru_cot, size_mat, hinh_dang, do_day, id_dong_may, id_chat_lieu_day, id_chat_lieu_kinh, id_xuat_xu, id_chat_lieu_vo, id_mau_vo, id_mau_mat, trang_thai) 
values ('SP000088',	7,	'C029.807.16.031.60',	13395000,	17860000,	15,	'C029.807.16.031.60.jpg',	N'Nam',	null,	10,	null,	40,	N'Mặt tròn',	11,	1,	1,	1,	215,	3,	17,	2,	default);
insert into SanPham(ma_san_pham, id_thuong_hieu, ma_hang_hoa, gia_nhap, don_gia, so_luong_ton, hinh_anh, doi_tuong_su_dung, dong_san_pham, khang_nuoc, khoang_tru_cot, size_mat, hinh_dang, do_day, id_dong_may, id_chat_lieu_day, id_chat_lieu_kinh, id_xuat_xu, id_chat_lieu_vo, id_mau_vo, id_mau_mat, trang_thai) 
values ('SP000089',	7,	'C036.407.11.050.01',	16837500,	22450000,	15,	'C036.407.11.050.01.jpg',	N'Nam',	null,	20,	null,	43,	N'Mặt tròn',	12,	1,	2,	1,	215,	3,	3,	3,	default);
insert into SanPham(ma_san_pham, id_thuong_hieu, ma_hang_hoa, gia_nhap, don_gia, so_luong_ton, hinh_anh, doi_tuong_su_dung, dong_san_pham, khang_nuoc, khoang_tru_cot, size_mat, hinh_dang, do_day, id_dong_may, id_chat_lieu_day, id_chat_lieu_kinh, id_xuat_xu, id_chat_lieu_vo, id_mau_vo, id_mau_mat, trang_thai) 
values ('SP000090',	7,	'C035.007.22.117.02',	13395000,	17860000,	15,	'C035.007.22.117.02.jpg',	N'Nữ',	null,	5,	null,	29,	N'Mặt tròn',	null,	1,	2,	1,	null,	3,	6,	2,	default);
insert into SanPham(ma_san_pham, id_thuong_hieu, ma_hang_hoa, gia_nhap, don_gia, so_luong_ton, hinh_anh, doi_tuong_su_dung, dong_san_pham, khang_nuoc, khoang_tru_cot, size_mat, hinh_dang, do_day, id_dong_may, id_chat_lieu_day, id_chat_lieu_kinh, id_xuat_xu, id_chat_lieu_vo, id_mau_vo, id_mau_mat, trang_thai) 
values ('SP000091',	21,	'220.12.38.20.01.001',	62250000,	83000000,	15,	'220.12.38.20.01.001.jpg',	N'Nam',	null,	15,	null,	38,	N'Mặt tròn',	null,	1,	1,	1,	215,	3,	null,	3,	default);
insert into SanPham(ma_san_pham, id_thuong_hieu, ma_hang_hoa, gia_nhap, don_gia, so_luong_ton, hinh_anh, doi_tuong_su_dung, dong_san_pham, khang_nuoc, khoang_tru_cot, size_mat, hinh_dang, do_day, id_dong_may, id_chat_lieu_day, id_chat_lieu_kinh, id_xuat_xu, id_chat_lieu_vo, id_mau_vo, id_mau_mat, trang_thai) 
values ('SP000092',	21,	'424.13.40.20.03.002',	44250000,	59000000,	15,	'424.13.40.20.03.002.jpg',	N'Nam',	'De ville',	3,	null,	39.5,	N'Mặt tròn',	null,	1,	1,	1,	215,	3,	null,	1,	default);
insert into SanPham(ma_san_pham, id_thuong_hieu, ma_hang_hoa, gia_nhap, don_gia, so_luong_ton, hinh_anh, doi_tuong_su_dung, dong_san_pham, khang_nuoc, khoang_tru_cot, size_mat, hinh_dang, do_day, id_dong_may, id_chat_lieu_day, id_chat_lieu_kinh, id_xuat_xu, id_chat_lieu_vo, id_mau_vo, id_mau_mat, trang_thai) 
values ('SP000093',	21,	'231.20.39.21.55.003',	125250000,	167000000,	15,	'231.20.39.21.55.003.jpg',	N'Nam',	null,	15,	60,	38.5,	N'Mặt tròn',	null,	null,	2,	1,	215,	5,	null,	10,	default);
insert into SanPham(ma_san_pham, id_thuong_hieu, ma_hang_hoa, gia_nhap, don_gia, so_luong_ton, hinh_anh, doi_tuong_su_dung, dong_san_pham, khang_nuoc, khoang_tru_cot, size_mat, hinh_dang, do_day, id_dong_may, id_chat_lieu_day, id_chat_lieu_kinh, id_xuat_xu, id_chat_lieu_vo, id_mau_vo, id_mau_mat, trang_thai) 
values ('SP000094',	21,	'326.30.40.50.01.002',	52125000,	69500000,	15,	'326.30.40.50.01.002.jpg',	N'Nam',	null,	10,	null,	40,	N'Mặt tròn',	null,	1,	9,	1,	215,	3,	17,	3,	default);
insert into SanPham(ma_san_pham, id_thuong_hieu, ma_hang_hoa, gia_nhap, don_gia, so_luong_ton, hinh_anh, doi_tuong_su_dung, dong_san_pham, khang_nuoc, khoang_tru_cot, size_mat, hinh_dang, do_day, id_dong_may, id_chat_lieu_day, id_chat_lieu_kinh, id_xuat_xu, id_chat_lieu_vo, id_mau_vo, id_mau_mat, trang_thai) 
values ('SP000095',	21,	'424.13.40.20.03.001',	34500000,	46000000,	15,	'424.13.40.20.03.001.jpg',	N'Nam',	'De ville',	3,	null,	39.5,	N'Mặt tròn',	null,	1,	1,	1,	215,	3,	17,	1,	default);
insert into SanPham(ma_san_pham, id_thuong_hieu, ma_hang_hoa, gia_nhap, don_gia, so_luong_ton, hinh_anh, doi_tuong_su_dung, dong_san_pham, khang_nuoc, khoang_tru_cot, size_mat, hinh_dang, do_day, id_dong_may, id_chat_lieu_day, id_chat_lieu_kinh, id_xuat_xu, id_chat_lieu_vo, id_mau_vo, id_mau_mat, trang_thai) 
values ('SP000096',	21,	'433.53.41.21.13.001',	149250000,	199000000,	15,	'433.53.41.21.13.001.jpg',	N'Nam',	'De ville',	10,	60,	41,	N'Mặt tròn',	13,	1,	1,	1,	215,	null,	24,	7,	default);
insert into SanPham(ma_san_pham, id_thuong_hieu, ma_hang_hoa, gia_nhap, don_gia, so_luong_ton, hinh_anh, doi_tuong_su_dung, dong_san_pham, khang_nuoc, khoang_tru_cot, size_mat, hinh_dang, do_day, id_dong_may, id_chat_lieu_day, id_chat_lieu_kinh, id_xuat_xu, id_chat_lieu_vo, id_mau_vo, id_mau_mat, trang_thai) 
values ('SP000097',	19,	'OG380-46DLW',	9277500,	12370000,	15,	'OG380-46DLW.jpg',	N'Nữ',	null,	3,	null,	30,	N'Mặt tròn',	null,	4,	2,	1,	215,	3,	2,	2,	default);
insert into SanPham(ma_san_pham, id_thuong_hieu, ma_hang_hoa, gia_nhap, don_gia, so_luong_ton, hinh_anh, doi_tuong_su_dung, dong_san_pham, khang_nuoc, khoang_tru_cot, size_mat, hinh_dang, do_day, id_dong_may, id_chat_lieu_day, id_chat_lieu_kinh, id_xuat_xu, id_chat_lieu_vo, id_mau_vo, id_mau_mat, trang_thai) 
values ('SP000098',	19,	'OG377DLW-T-COC',	9562500,	12750000,	15,	'OG377DLW-T-COC.jpg',	N'Nữ',	null,	3,	null,	30,	N'Mặt tròn',	null,	4,	2,	1,	215,	3,	17,	2,	default);
insert into SanPham(ma_san_pham, id_thuong_hieu, ma_hang_hoa, gia_nhap, don_gia, so_luong_ton, hinh_anh, doi_tuong_su_dung, dong_san_pham, khang_nuoc, khoang_tru_cot, size_mat, hinh_dang, do_day, id_dong_may, id_chat_lieu_day, id_chat_lieu_kinh, id_xuat_xu, id_chat_lieu_vo, id_mau_vo, id_mau_mat, trang_thai) 
values ('SP000099',	19,	'OG385-022DMW-T',	5670000,	7560000,	15,	'OG385-022DMW-T.jpg',	N'Nam',	null,	5,	null,	38,	N'Mặt tròn',	9,	4,	2,	1,	215,	3,	17,	2,	default);
insert into SanPham(ma_san_pham, id_thuong_hieu, ma_hang_hoa, gia_nhap, don_gia, so_luong_ton, hinh_anh, doi_tuong_su_dung, dong_san_pham, khang_nuoc, khoang_tru_cot, size_mat, hinh_dang, do_day, id_dong_may, id_chat_lieu_day, id_chat_lieu_kinh, id_xuat_xu, id_chat_lieu_vo, id_mau_vo, id_mau_mat, trang_thai) 
values ('SP000100',	19,	'OG1929-24AGK-T',	12495000,	16660000,	15,	'OG1929-24AGK-T.jpg',	N'Nam',	null,	5,	null,	40,	N'Mặt tròn',	null,	1,	7,	1,	215,	4,	6,	2,	default);
insert into SanPham(ma_san_pham, id_thuong_hieu, ma_hang_hoa, gia_nhap, don_gia, so_luong_ton, hinh_anh, doi_tuong_su_dung, dong_san_pham, khang_nuoc, khoang_tru_cot, size_mat, hinh_dang, do_day, id_dong_may, id_chat_lieu_day, id_chat_lieu_kinh, id_xuat_xu, id_chat_lieu_vo, id_mau_vo, id_mau_mat, trang_thai) 
values ('SP000101',	19,	'OG358.33AGR-GL',	19537500,	26050000,	15,	'OG358.33AGR-GL.jpg',	N'Nam',	null,	5,	null,	40,	N'Mặt tròn',	10,	1,	1,	1,	215,	4,	6,	24,	default);
insert into SanPham(ma_san_pham, id_thuong_hieu, ma_hang_hoa, gia_nhap, don_gia, so_luong_ton, hinh_anh, doi_tuong_su_dung, dong_san_pham, khang_nuoc, khoang_tru_cot, size_mat, hinh_dang, do_day, id_dong_may, id_chat_lieu_day, id_chat_lieu_kinh, id_xuat_xu, id_chat_lieu_vo, id_mau_vo, id_mau_mat, trang_thai) 
values ('SP000102',	19,	'OG358.88AGR-GL',	18675000,	24900000,	15,	'OG358.88AGR-GL.jpg',	N'Nam',	null,	5,	null,	40,	N'Mặt tròn',	null,	1,	1,	1,	215,	4,	6,	24,	default);
insert into SanPham(ma_san_pham, id_thuong_hieu, ma_hang_hoa, gia_nhap, don_gia, so_luong_ton, hinh_anh, doi_tuong_su_dung, dong_san_pham, khang_nuoc, khoang_tru_cot, size_mat, hinh_dang, do_day, id_dong_may, id_chat_lieu_day, id_chat_lieu_kinh, id_xuat_xu, id_chat_lieu_vo, id_mau_vo, id_mau_mat, trang_thai) 
values ('SP000103',	19,	'OG380-451DLW',	7252500,	9670000,	15,	'OG380-451DLW.jpg',	N'Nữ',	null,	5,	null,	34,	N'Mặt tròn',	null,	4,	2,	1,	215,	3,	17,	2,	default);
insert into SanPham(ma_san_pham, id_thuong_hieu, ma_hang_hoa, gia_nhap, don_gia, so_luong_ton, hinh_anh, doi_tuong_su_dung, dong_san_pham, khang_nuoc, khoang_tru_cot, size_mat, hinh_dang, do_day, id_dong_may, id_chat_lieu_day, id_chat_lieu_kinh, id_xuat_xu, id_chat_lieu_vo, id_mau_vo, id_mau_mat, trang_thai) 
values ('SP000104',	18,	'0606555',	7650000,	10200000,	15,	'0606555.jpg',	N'Nam',	null,	3,	null,	40,	N'Mặt tròn',	null,	4,	2,	1,	null,	3,	17,	3,	default);
insert into SanPham(ma_san_pham, id_thuong_hieu, ma_hang_hoa, gia_nhap, don_gia, so_luong_ton, hinh_anh, doi_tuong_su_dung, dong_san_pham, khang_nuoc, khoang_tru_cot, size_mat, hinh_dang, do_day, id_dong_may, id_chat_lieu_day, id_chat_lieu_kinh, id_xuat_xu, id_chat_lieu_vo, id_mau_vo, id_mau_mat, trang_thai) 
values ('SP000105',	18,	'0607445',	7650000,	10200000,	15,	'0607445.jpg',	N'Nữ',	null,	3,	null,	26,	N'Mặt tròn',	null,	4,	2,	3,	215,	3,	6,	3,	default);
insert into SanPham(ma_san_pham, id_thuong_hieu, ma_hang_hoa, gia_nhap, don_gia, so_luong_ton, hinh_anh, doi_tuong_su_dung, dong_san_pham, khang_nuoc, khoang_tru_cot, size_mat, hinh_dang, do_day, id_dong_may, id_chat_lieu_day, id_chat_lieu_kinh, id_xuat_xu, id_chat_lieu_vo, id_mau_vo, id_mau_mat, trang_thai) 
values ('SP000106',	18,	'0607123',	9600000,	12800000,	15,	'0607123.jpg',	N'Nam',	null,	3,	null,	39.5,	N'Mặt tròn',	9,	1,	1,	1,	215,	3,	null,	1,	default);
insert into SanPham(ma_san_pham, id_thuong_hieu, ma_hang_hoa, gia_nhap, don_gia, so_luong_ton, hinh_anh, doi_tuong_su_dung, dong_san_pham, khang_nuoc, khoang_tru_cot, size_mat, hinh_dang, do_day, id_dong_may, id_chat_lieu_day, id_chat_lieu_kinh, id_xuat_xu, id_chat_lieu_vo, id_mau_vo, id_mau_mat, trang_thai) 
values ('SP000107',	18,	'0606896',	7650000,	10200000,	15,	'0606896.jpg',	N'Nam',	null,	5,	null,	40,	N'Mặt tròn',	null,	4,	2,	1,	215,	null,	null,	3,	default);
insert into SanPham(ma_san_pham, id_thuong_hieu, ma_hang_hoa, gia_nhap, don_gia, so_luong_ton, hinh_anh, doi_tuong_su_dung, dong_san_pham, khang_nuoc, khoang_tru_cot, size_mat, hinh_dang, do_day, id_dong_may, id_chat_lieu_day, id_chat_lieu_kinh, id_xuat_xu, id_chat_lieu_vo, id_mau_vo, id_mau_mat, trang_thai) 
values ('SP000108',	18,	'0607313',	5355000,	7140000,	15,	'0607313.jpg',	N'Nam',	null,	3,	null,	40,	N'Mặt tròn',	null,	4,	1,	1,	215,	3,	17,	1,	default);
insert into SanPham(ma_san_pham, id_thuong_hieu, ma_hang_hoa, gia_nhap, don_gia, so_luong_ton, hinh_anh, doi_tuong_su_dung, dong_san_pham, khang_nuoc, khoang_tru_cot, size_mat, hinh_dang, do_day, id_dong_may, id_chat_lieu_day, id_chat_lieu_kinh, id_xuat_xu, id_chat_lieu_vo, id_mau_vo, id_mau_mat, trang_thai) 
values ('SP000109',	18,	'0607283',	7395000,	9860000,	15,	'0607283.jpg',	N'Nam',	null,	3,	null,	39,	N'Mặt tròn',	null,	4,	2,	1,	215,	3,	null,	3,	default);
insert into SanPham(ma_san_pham, id_thuong_hieu, ma_hang_hoa, gia_nhap, don_gia, so_luong_ton, hinh_anh, doi_tuong_su_dung, dong_san_pham, khang_nuoc, khoang_tru_cot, size_mat, hinh_dang, do_day, id_dong_may, id_chat_lieu_day, id_chat_lieu_kinh, id_xuat_xu, id_chat_lieu_vo, id_mau_vo, id_mau_mat, trang_thai) 
values ('SP000110',	18,	'0606369',	7125000,	9500000,	15,	'0606369.jpg',	N'Nam',	null,	3,	null,	39,	N'Mặt tròn',	null,	4,	2,	1,	null,	3,	17,	1,	default);


select * from SanPham
 
-- -- data table PhongCachSanPham
-- select * from PhongCachSanPham

-- insert into PhongCachSanPham(id_san_pham, id_phong_cach) values (2, 5);
-- insert into PhongCachSanPham(id_san_pham, id_phong_cach) values (3, 5);
-- insert into PhongCachSanPham(id_san_pham, id_phong_cach) values (68, 4);
-- insert into PhongCachSanPham(id_san_pham, id_phong_cach) values (22, 4);
-- insert into PhongCachSanPham(id_san_pham, id_phong_cach) values (22, 7);
-- insert into PhongCachSanPham(id_san_pham, id_phong_cach) values (22, 1);
-- insert into PhongCachSanPham(id_san_pham, id_phong_cach) values (38, 7);
-- insert into PhongCachSanPham(id_san_pham, id_phong_cach) values (38, 1);
-- insert into PhongCachSanPham(id_san_pham, id_phong_cach) values (25, 7);
-- insert into PhongCachSanPham(id_san_pham, id_phong_cach) values (25, 1);
-- insert into PhongCachSanPham(id_san_pham, id_phong_cach) values (25, 4);
-- insert into PhongCachSanPham(id_san_pham, id_phong_cach) values (26, 7);
-- insert into PhongCachSanPham(id_san_pham, id_phong_cach) values (26, 5);
-- insert into PhongCachSanPham(id_san_pham, id_phong_cach) values (26, 1);
-- insert into PhongCachSanPham(id_san_pham, id_phong_cach) values (30, 3);
-- insert into PhongCachSanPham(id_san_pham, id_phong_cach) values (81, 3);
-- insert into PhongCachSanPham(id_san_pham, id_phong_cach) values (65, 3);
-- insert into PhongCachSanPham(id_san_pham, id_phong_cach) values (65, 1);
-- insert into PhongCachSanPham(id_san_pham, id_phong_cach) values (28, 3);
-- insert into PhongCachSanPham(id_san_pham, id_phong_cach) values (28, 8);
-- insert into PhongCachSanPham(id_san_pham, id_phong_cach) values (31, 3);
-- insert into PhongCachSanPham(id_san_pham, id_phong_cach) values (31, 8);
-- insert into PhongCachSanPham(id_san_pham, id_phong_cach) values (33, 3);
-- insert into PhongCachSanPham(id_san_pham, id_phong_cach) values (33, 8);
-- insert into PhongCachSanPham(id_san_pham, id_phong_cach) values (52, 6);
-- insert into PhongCachSanPham(id_san_pham, id_phong_cach) values (8, 6);
-- insert into PhongCachSanPham(id_san_pham, id_phong_cach) values (8, 1);
-- insert into PhongCachSanPham(id_san_pham, id_phong_cach) values (61, 6);
-- insert into PhongCachSanPham(id_san_pham, id_phong_cach) values (61, 1);
-- insert into PhongCachSanPham(id_san_pham, id_phong_cach) values (101, 6);
-- insert into PhongCachSanPham(id_san_pham, id_phong_cach) values (101, 1);
-- insert into PhongCachSanPham(id_san_pham, id_phong_cach) values (102, 6);
-- insert into PhongCachSanPham(id_san_pham, id_phong_cach) values (102, 1);
-- insert into PhongCachSanPham(id_san_pham, id_phong_cach) values (7, 1);
-- insert into PhongCachSanPham(id_san_pham, id_phong_cach) values (9, 1);
-- insert into PhongCachSanPham(id_san_pham, id_phong_cach) values (10, 1);
-- insert into PhongCachSanPham(id_san_pham, id_phong_cach) values (11, 1);
-- insert into PhongCachSanPham(id_san_pham, id_phong_cach) values (12, 1);
-- insert into PhongCachSanPham(id_san_pham, id_phong_cach) values (14, 1);
-- insert into PhongCachSanPham(id_san_pham, id_phong_cach) values (20, 1);
-- insert into PhongCachSanPham(id_san_pham, id_phong_cach) values (24, 1);
-- insert into PhongCachSanPham(id_san_pham, id_phong_cach) values (34, 1);
-- insert into PhongCachSanPham(id_san_pham, id_phong_cach) values (35, 1);
-- insert into PhongCachSanPham(id_san_pham, id_phong_cach) values (37, 1);
-- insert into PhongCachSanPham(id_san_pham, id_phong_cach) values (39, 1);
-- insert into PhongCachSanPham(id_san_pham, id_phong_cach) values (47, 1);
-- insert into PhongCachSanPham(id_san_pham, id_phong_cach) values (69, 1);
-- insert into PhongCachSanPham(id_san_pham, id_phong_cach) values (75, 1);
-- insert into PhongCachSanPham(id_san_pham, id_phong_cach) values (77, 1);
-- insert into PhongCachSanPham(id_san_pham, id_phong_cach) values (63, 1);
-- insert into PhongCachSanPham(id_san_pham, id_phong_cach) values (63, 4);
-- insert into PhongCachSanPham(id_san_pham, id_phong_cach) values (66, 1);
-- insert into PhongCachSanPham(id_san_pham, id_phong_cach) values (66, 4);
-- insert into PhongCachSanPham(id_san_pham, id_phong_cach) values (64, 1);
-- insert into PhongCachSanPham(id_san_pham, id_phong_cach) values (64, 4);
-- insert into PhongCachSanPham(id_san_pham, id_phong_cach) values (64, 3);
-- insert into PhongCachSanPham(id_san_pham, id_phong_cach) values (36, 1);
-- insert into PhongCachSanPham(id_san_pham, id_phong_cach) values (36, 7);
-- insert into PhongCachSanPham(id_san_pham, id_phong_cach) values (36, 6);
-- insert into PhongCachSanPham(id_san_pham, id_phong_cach) values (36, 9);
-- insert into PhongCachSanPham(id_san_pham, id_phong_cach) values (36, 10);
-- insert into PhongCachSanPham(id_san_pham, id_phong_cach) values (62, 1);
-- insert into PhongCachSanPham(id_san_pham, id_phong_cach) values (62, 3);
-- insert into PhongCachSanPham(id_san_pham, id_phong_cach) values (71, 1);
-- insert into PhongCachSanPham(id_san_pham, id_phong_cach) values (100, 3);
-- insert into PhongCachSanPham(id_san_pham, id_phong_cach) values (13, 6);
-- insert into PhongCachSanPham(id_san_pham, id_phong_cach) values (13, 1);
-- insert into PhongCachSanPham(id_san_pham, id_phong_cach) values (67, 6);
-- insert into PhongCachSanPham(id_san_pham, id_phong_cach) values (67, 1);
-- insert into PhongCachSanPham(id_san_pham, id_phong_cach) values (18, 1);
-- insert into PhongCachSanPham(id_san_pham, id_phong_cach) values (18, 5);
-- insert into PhongCachSanPham(id_san_pham, id_phong_cach) values (41, 1);
-- insert into PhongCachSanPham(id_san_pham, id_phong_cach) values (41, 5);
-- insert into PhongCachSanPham(id_san_pham, id_phong_cach) values (42, 1);
-- insert into PhongCachSanPham(id_san_pham, id_phong_cach) values (42, 9);
-- insert into PhongCachSanPham(id_san_pham, id_phong_cach) values (42, 10);
-- insert into PhongCachSanPham(id_san_pham, id_phong_cach) values (89, 1);
-- insert into PhongCachSanPham(id_san_pham, id_phong_cach) values (89, 9);
-- insert into PhongCachSanPham(id_san_pham, id_phong_cach) values (89, 10);
-- insert into PhongCachSanPham(id_san_pham, id_phong_cach) values (5, 8);
-- insert into PhongCachSanPham(id_san_pham, id_phong_cach) values (29, 8);
-- insert into PhongCachSanPham(id_san_pham, id_phong_cach) values (29, 3);
-- insert into PhongCachSanPham(id_san_pham, id_phong_cach) values (16, 5);
-- insert into PhongCachSanPham(id_san_pham, id_phong_cach) values (32, 5);
-- insert into PhongCachSanPham(id_san_pham, id_phong_cach) values (45, 5);
-- insert into PhongCachSanPham(id_san_pham, id_phong_cach) values (46, 5);
-- insert into PhongCachSanPham(id_san_pham, id_phong_cach) values (97, 5);
-- insert into PhongCachSanPham(id_san_pham, id_phong_cach) values (98, 5);
-- insert into PhongCachSanPham(id_san_pham, id_phong_cach) values (15, 5);
-- insert into PhongCachSanPham(id_san_pham, id_phong_cach) values (15, 1);
-- insert into PhongCachSanPham(id_san_pham, id_phong_cach) values (49, 5);
-- insert into PhongCachSanPham(id_san_pham, id_phong_cach) values (49, 1);
-- insert into PhongCachSanPham(id_san_pham, id_phong_cach) values (1, 9);
-- insert into PhongCachSanPham(id_san_pham, id_phong_cach) values (1, 10);
-- insert into PhongCachSanPham(id_san_pham, id_phong_cach) values (17, 9);
-- insert into PhongCachSanPham(id_san_pham, id_phong_cach) values (17, 10);
-- insert into PhongCachSanPham(id_san_pham, id_phong_cach) values (19, 9);
-- insert into PhongCachSanPham(id_san_pham, id_phong_cach) values (19, 10);
-- insert into PhongCachSanPham(id_san_pham, id_phong_cach) values (50, 9);
-- insert into PhongCachSanPham(id_san_pham, id_phong_cach) values (50, 10);
-- insert into PhongCachSanPham(id_san_pham, id_phong_cach) values (72, 9);
-- insert into PhongCachSanPham(id_san_pham, id_phong_cach) values (72, 10);
-- insert into PhongCachSanPham(id_san_pham, id_phong_cach) values (74, 9);
-- insert into PhongCachSanPham(id_san_pham, id_phong_cach) values (74, 10);
-- insert into PhongCachSanPham(id_san_pham, id_phong_cach) values (86, 9);
-- insert into PhongCachSanPham(id_san_pham, id_phong_cach) values (86, 10);
-- insert into PhongCachSanPham(id_san_pham, id_phong_cach) values (87, 9);
-- insert into PhongCachSanPham(id_san_pham, id_phong_cach) values (87, 10);
-- insert into PhongCachSanPham(id_san_pham, id_phong_cach) values (27, 9);
-- insert into PhongCachSanPham(id_san_pham, id_phong_cach) values (27, 10);
-- insert into PhongCachSanPham(id_san_pham, id_phong_cach) values (27, 7);
-- insert into PhongCachSanPham(id_san_pham, id_phong_cach) values (27, 1);
-- insert into PhongCachSanPham(id_san_pham, id_phong_cach) values (23, 9);
-- insert into PhongCachSanPham(id_san_pham, id_phong_cach) values (23, 10);
-- insert into PhongCachSanPham(id_san_pham, id_phong_cach) values (23, 3);
-- insert into PhongCachSanPham(id_san_pham, id_phong_cach) values (23, 1);
-- insert into PhongCachSanPham(id_san_pham, id_phong_cach) values (73, 9);
-- insert into PhongCachSanPham(id_san_pham, id_phong_cach) values (73, 10);
-- insert into PhongCachSanPham(id_san_pham, id_phong_cach) values (73, 1);
-- insert into PhongCachSanPham(id_san_pham, id_phong_cach) values (88, 9);
-- insert into PhongCachSanPham(id_san_pham, id_phong_cach) values (88, 10);
-- insert into PhongCachSanPham(id_san_pham, id_phong_cach) values (88, 1);
-- insert into PhongCachSanPham(id_san_pham, id_phong_cach) values (4, 9);
-- insert into PhongCachSanPham(id_san_pham, id_phong_cach) values (4, 10);
-- insert into PhongCachSanPham(id_san_pham, id_phong_cach) values (4, 8);

-- data table TinhNangSanPham
select * from TinhNang

insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (5, 3);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (5, 12);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (5, 13);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (5, 18);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (5, 7);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (1, 7);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (1, 13);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (1, 12);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (1, 18);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (38, 8);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (38, 18);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (9, 8);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (9, 18);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (9, 13);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (18, 8);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (18, 18);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (18, 13);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (67, 8);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (67, 18);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (67, 13);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (67, 12);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (2, 8);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (2, 18);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (2, 13);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (2, 12);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (2, 24);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (12, 8);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (12, 13);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (12, 18);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (62, 8);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (62, 13);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (62, 18);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (29, 8);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (29, 13);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (29, 12);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (29, 18);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (17, 8);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (17, 12);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (17, 13);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (3, 4);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (3, 3);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (42, 20);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (97, 20);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (98, 20);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (8, 18);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (13, 18);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (22, 18);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (25, 18);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (26, 18);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (32, 18);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (45, 18);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (52, 18);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (101, 18);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (102, 18);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (36, 18);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (36, 8);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (41, 18);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (41, 8);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (41, 9);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (41, 12);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (41, 13);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (11, 18);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (11, 8);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (11, 13);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (14, 18);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (14, 8);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (14, 13);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (10, 18);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (10, 13);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (15, 18);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (15, 13);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (49, 18);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (49, 13);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (64, 18);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (64, 13);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (77, 18);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (77, 13);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (34, 18);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (34, 13);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (34, 8);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (37, 18);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (37, 13);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (37, 8);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (39, 18);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (39, 13);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (39, 8);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (16, 18);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (16, 13);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (16, 12);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (24, 18);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (24, 13);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (24, 12);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (28, 18);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (28, 13);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (28, 12);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (28, 8);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (72, 13);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (73, 13);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (75, 13);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (79, 13);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (82, 13);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (88, 13);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (89, 13);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (92, 13);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (87, 13);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (87, 8);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (20, 13);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (20, 20);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (46, 13);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (46, 18);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (47, 13);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (47, 18);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (61, 13);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (61, 18);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (63, 13)
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (63, 18);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (65, 13);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (65, 18);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (66, 13);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (66, 18);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (69, 13);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (69, 18);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (74, 13);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (74, 18);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (81, 13);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (81, 18);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (100, 13);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (100, 18);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (86, 13);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (86, 12)
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (33, 13);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (33, 12);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (33, 8);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (33, 18);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (4, 13);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (4, 12);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (4, 4);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (4, 3);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (23, 13);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (23, 12);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (23, 18);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (30, 12);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (30, 8);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (30, 13);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (30, 18);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (35, 12);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (35, 13);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (35, 9);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (35, 18);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (35, 14);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (31, 12);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (31, 13);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (31, 8);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (31, 18);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (7, 12);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (7, 13);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (7, 18);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (71, 2);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (71, 8);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (71, 13);
insert into TinhNangSanPham(id_san_pham, id_tinh_nang) values (71, 18);


-- data table NhanVien
select * from NhanVien


insert into NhanVien(ma_nhan_vien, mat_khau, ho_ten, gioi_tinh, ngay_sinh, can_cuoc_cong_dan, dia_chi, so_dien_thoai, email, vai_tro, hinh_anh, ngay_tao, trang_thai)
values ('ducta', '1e2f316fce0207ecb7f34229b365767fd9a3c8803c9b3c5410a1aa5b05c33d75', N'Trần Anh Đức', 1, '1999-01-01', '001202087634', N'Hà Nội', '0986543876', 'ductaph30986@fpt.edu.vn', 1, 'Diep-Co-Thanh.jpg', default, default);
insert into NhanVien(ma_nhan_vien, mat_khau, ho_ten, gioi_tinh, ngay_sinh, can_cuoc_cong_dan, dia_chi, so_dien_thoai, email, vai_tro, hinh_anh, ngay_tao, trang_thai)
values ('chunghlb', 'ed1f19ae96267ae162e0bc92c7f604778444cbda7f694d7e8ac31418bea86ae7', N'Hoàng Lê Bảo Chung', 1, '2000-03-03', '001837237372', N'Hà Nội', '0933376389', 'chunghlb@fpt.edu.vn', 1, 'anh2.jpg', default, default);
insert into NhanVien(ma_nhan_vien, mat_khau, ho_ten, gioi_tinh, ngay_sinh, can_cuoc_cong_dan, dia_chi, so_dien_thoai, email, vai_tro, hinh_anh, ngay_tao, trang_thai)
values ('longng', 'f5eaf16c8ba5cfa0c97a11e73f2ae375eb8c97653794d9911cffbed1124371e1', N'Nguyễn Gia Long', 1, '1999-02-02', '001736356354', N'Vĩnh Phúc', '0986736383', 'longng@fpt.edu.vn', 1, 'Tay-mon-xuy-tuyet.jpg', default, default)
insert into NhanVien(ma_nhan_vien, mat_khau, ho_ten, gioi_tinh, ngay_sinh, can_cuoc_cong_dan, dia_chi, so_dien_thoai, email, vai_tro, hinh_anh, ngay_tao, trang_thai)
values ('nguyenlk', '6f6c9c051e1146b2d54e5d728fdc95758165dc0bd2f1115e13361b9efff56a89', N'Lê Khoa Nguyên', 1, '1998-05-05', '001248505990', N'Hà Nội', '0984849494', 'nguyen@fpt.edu.vn', 1, 'luc-tieu-phung.jpg', default, default)
insert into NhanVien(ma_nhan_vien, mat_khau, ho_ten, gioi_tinh, ngay_sinh, can_cuoc_cong_dan, dia_chi, so_dien_thoai, email, vai_tro, hinh_anh, ngay_tao, trang_thai)
values ('dungltt', '2bf33dad05eb008b7610b9c89b4f3dabe96e4a58635e623382ba748891e4c71a', N'Lê Thi Thùy Dung', 0, '1998-11-11', '001284364664', N'Phú Thọ', '0984889484', 'dung@fpt.edu.vn', 0, 'No image', default, default)
insert into NhanVien(ma_nhan_vien, mat_khau, ho_ten, gioi_tinh, ngay_sinh, can_cuoc_cong_dan, dia_chi, so_dien_thoai, email, vai_tro, hinh_anh, ngay_tao, trang_thai)
values ('khanhdt', 'abe2cc7bfdb33cf7e1530165054e6cb4896b34d5c2d792beb0330a79a0d7731d', N'Đỗ Thị Hồng Khanh', 0, '2002-10-10', '001202087634', N'Bắc Ninh', '0984898839', 'khanh@fpt.edu.vn', 0, 'No image', default, default)
insert into NhanVien(ma_nhan_vien, mat_khau, ho_ten, gioi_tinh, ngay_sinh, can_cuoc_cong_dan, dia_chi, so_dien_thoai, email, vai_tro, hinh_anh, ngay_tao, trang_thai)
values ('tung', 'c27399264cafb7f8dc23bd334bf6ab068237eb706a6beac34443b1baf1b33c99', N'Ngô Gia Tự', 1, '2003-09-09', '001202484894', N'Hà Nội', '0983387464', 'tung@fpt.edu.vn', 0, 'No image', default, default)
insert into NhanVien(ma_nhan_vien, mat_khau, ho_ten, gioi_tinh, ngay_sinh, can_cuoc_cong_dan, dia_chi, so_dien_thoai, email, vai_tro, hinh_anh, ngay_tao, trang_thai)
values ('anhtp', '88bc42ee01ec1836dd1dc33b505aad6d8855cc76e2c0d3dcf61da6844f156ae6', N'Trần Phương Anh', 0, '2004-07-07', '001204838484', N'Hà Nội', '0947484848', 'anhtp@fpt.edu.vn', 0, 'No image', default, 1)



-- data table HoaDon
select * from HoaDon

insert into HoaDon(ma_hoa_don, ngay_tao, ten_khach_hang, dia_chi, ngay_thanh_toan, trang_thai, id_nhan_vien) 
values ('HD112823113327', '2023-12-08', N'Khách hàng lẻ', N'Tại cửa hàng', '2023-12-08', 1, 1);
insert into HoaDon(ma_hoa_don, ngay_tao, ten_khach_hang, dia_chi, ngay_thanh_toan, trang_thai, id_nhan_vien) 
values ('HD112923043755', '2023-12-08', N'Khách hàng lẻ', N'Tại cửa hàng', '2023-12-08', 1, 1);
insert into HoaDon(ma_hoa_don, ngay_tao, ten_khach_hang, dia_chi, ngay_thanh_toan, trang_thai, id_nhan_vien) 
values ('HD112923080128', '2023-12-08', N'Khách hàng lẻ', N'Tại cửa hàng', '2023-12-08', 1, 1);
insert into HoaDon(ma_hoa_don, ngay_tao, ten_khach_hang, dia_chi, ngay_thanh_toan, trang_thai, id_nhan_vien) 
values ('HD112923090317', '2023-12-08', N'Khách hàng lẻ', N'Tại cửa hàng', '2023-12-08', 1, 1);
insert into HoaDon(ma_hoa_don, ngay_tao, ten_khach_hang, dia_chi, ngay_thanh_toan, trang_thai, id_nhan_vien) 
values ('HD112923101701', '2023-12-08', N'Khách hàng lẻ', N'Tại cửa hàng', '2023-12-08', 1, 1);
insert into HoaDon(ma_hoa_don, ngay_tao, ten_khach_hang, so_dien_thoai, dia_chi, ngay_thanh_toan, trang_thai, id_nhan_vien) 
values ('HD112923111701', '2023-12-08', N'Nguyễn Văn Nam', '0986383628', N'Hà Nội', '2023-12-08', 1, 1);
insert into HoaDon(ma_hoa_don, ngay_tao, ten_khach_hang, so_dien_thoai, dia_chi, ngay_thanh_toan, trang_thai, id_nhan_vien) 
values ('HD112923122033', '2023-12-08', N'Ngô Thị Bích', '0986383628', N'Hà Nội', '2023-12-08', 1, 1);

insert into HoaDon(ma_hoa_don, ngay_tao, ten_khach_hang, so_dien_thoai, dia_chi, ngay_thanh_toan, trang_thai, id_nhan_vien) 
values ('HD112923122035', '2023-12-07', N'Hoàng Ngọc Hùng', '0374567890', N'Hà Nam', '2023-12-07', 1, 2);
insert into HoaDon(ma_hoa_don, ngay_tao, ten_khach_hang, so_dien_thoai, dia_chi, ngay_thanh_toan, trang_thai, id_nhan_vien) 
values ('HD112923122036', '2023-12-07', N'Dương Ngọc Thái', '0374567876', N'Phủ Lý', '2023-12-07', 1, 4);
insert into HoaDon(ma_hoa_don, ngay_tao, ten_khach_hang, so_dien_thoai, dia_chi, ngay_thanh_toan, trang_thai, id_nhan_vien) 
values ('HD112923122037', '2023-12-07', N'Châu Tinh Trì', '0388453155', N'Lào Cai',  '2023-12-07', 1, 2);
insert into HoaDon(ma_hoa_don, ngay_tao, ten_khach_hang, so_dien_thoai, dia_chi, ngay_thanh_toan, trang_thai, id_nhan_vien) 
values ('HD112923122038', '2023-12-07', N'Đạt Văn Tây', '0978564335', N'Tháp Chàm',  '2023-12-07', 1, 5);
insert into HoaDon(ma_hoa_don, ngay_tao, ten_khach_hang, so_dien_thoai, dia_chi, ngay_thanh_toan, trang_thai, id_nhan_vien) 
values ('HD112923122039', '2023-12-07', N'Trương Mẫn', '0367888434', N'Đại Tự',  '2023-12-07', 1, 6);
insert into HoaDon(ma_hoa_don, ngay_tao, ten_khach_hang, so_dien_thoai, dia_chi, ngay_thanh_toan, trang_thai, id_nhan_vien) 
values ('HD112923122040', '2023-12-07', N'Lưu Diệc Phi', '0398234789', N'Tam Dương', '2023-12-07', 1, 2);
insert into HoaDon(ma_hoa_don, ngay_tao, ten_khach_hang, so_dien_thoai, dia_chi, ngay_thanh_toan, trang_thai, id_nhan_vien) 
values ('HD112923122041', '2023-12-07', N'Lê Anh Tú', '0345678921', N'Củ Chi',  '2023-12-07', 1, 7);
insert into HoaDon(ma_hoa_don, ngay_tao, ten_khach_hang, so_dien_thoai, dia_chi, ngay_thanh_toan, trang_thai, id_nhan_vien) 
values ('HD112923122042', '2023-12-07', N'Hoàng Gia Bảo', '0375432667', N'Chùa Ha',  '2023-12-07', 1, 8);
insert into HoaDon(ma_hoa_don, ngay_tao, ten_khach_hang, so_dien_thoai, dia_chi, ngay_thanh_toan, trang_thai, id_nhan_vien) 
values ('HD112923122043', '2023-12-07', N'Khánh Đơn', '0366543766', N'Tam Đảo',  '2023-12-07', 1, 2);
insert into HoaDon(ma_hoa_don, ngay_tao, ten_khach_hang, so_dien_thoai, dia_chi, ngay_thanh_toan, trang_thai, id_nhan_vien) 
values ('HD112923122045', '2023-12-07', N'Nguyễn Anh Dũng', '0374555890', N'Lập Thạch',  '2023-12-07', 1, 2);

insert into HoaDon(ma_hoa_don, ngay_tao, ten_khach_hang, so_dien_thoai, dia_chi, ngay_thanh_toan, trang_thai, id_nhan_vien) 
values ('HD112923122046', '2023/12/06', N'Nguyễn Ngọc Vũ', '0374567890', N'Vĩnh Yên',   '2023/12/06', 1, 3);
insert into HoaDon(ma_hoa_don, ngay_tao, ten_khach_hang, so_dien_thoai, dia_chi, ngay_thanh_toan, trang_thai, id_nhan_vien) 
values ('HD112923122047', '2023/12/06', N'Vũ Thị Hà', '0374567890', N'Việt Trì',   '2023/12/06', 1, 4);
insert into HoaDon(ma_hoa_don, ngay_tao, ten_khach_hang, so_dien_thoai, dia_chi, ngay_thanh_toan, trang_thai, id_nhan_vien) 
values ('HD112923122048', '2023/12/06', N'Dương Trường', '0374567890', N'Phú Thọ',   '2023/12/06', 1, 5);
insert into HoaDon(ma_hoa_don, ngay_tao, ten_khach_hang, so_dien_thoai, dia_chi, ngay_thanh_toan, trang_thai, id_nhan_vien) 
values ('HD112923122049', '2023/12/06', N'Quách Tuấn Dương', '0374567890', N'Tam Đảo',  '2023/12/06', 1, 6);
insert into HoaDon(ma_hoa_don, ngay_tao, ten_khach_hang, so_dien_thoai, dia_chi, ngay_thanh_toan, trang_thai, id_nhan_vien) 
values ('HD112923122050', '2023/12/06', N'Hoàng Huy Hoàng', '0374567890', N'Hà Nội',   '2023/12/06', 1, 7);
insert into HoaDon(ma_hoa_don, ngay_tao, ten_khach_hang, so_dien_thoai, dia_chi, ngay_thanh_toan, trang_thai, id_nhan_vien) 
values ('HD112923122051', '2023/12/06', N'Trần Đình Trọng', '0374567890', N'Vĩnh Phúc',   '2023/12/06', 1, 8);
insert into HoaDon(ma_hoa_don, ngay_tao, ten_khach_hang, so_dien_thoai, dia_chi, ngay_thanh_toan, trang_thai, id_nhan_vien) 
values ('HD112923122052', '2023/12/05', N'Dương Khang', '0374567890', N'Di Trạch',  '2023/12/05', 1, 7);
insert into HoaDon(ma_hoa_don, ngay_tao, ten_khach_hang, so_dien_thoai, dia_chi, ngay_thanh_toan, trang_thai, id_nhan_vien) 
values ('HD112923122053', '2023/12/05', N'Hải My', '0374567890', N'Quốc Oai', '2023/12/05', 1, 6);
insert into HoaDon(ma_hoa_don, ngay_tao, ten_khach_hang, so_dien_thoai, dia_chi, ngay_thanh_toan, trang_thai, id_nhan_vien) 
values ('HD112923122054', '2023/12/05', N'Tú Bà', '0374567890', N'Thạch Thất',  '2023/12/05', 1, 5);
insert into HoaDon(ma_hoa_don, ngay_tao, ten_khach_hang, so_dien_thoai, dia_chi, ngay_thanh_toan, trang_thai, id_nhan_vien) 
values ('HD112923122055', '2023/12/05', N'Trương Mị', '0374567890', N'Vân Phúc',  '2023/12/05', 1, 6);

insert into HoaDon(ma_hoa_don, ngay_tao, ten_khach_hang, so_dien_thoai, dia_chi, ngay_thanh_toan, trang_thai, id_nhan_vien) 
values ('HD112923122056', '2023/12/05', N'A Châu', '0374567890', N'Hà Nội', '2023/12/05', 1, 6);
insert into HoaDon(ma_hoa_don, ngay_tao, ten_khach_hang, so_dien_thoai, dia_chi, ngay_thanh_toan, trang_thai, id_nhan_vien) 
values ('HD112923122057', '2023/12/05', N'A Phủ', '0374567890', N'Hà Nội',  '2023/12/05', 1, 7);
insert into HoaDon(ma_hoa_don, ngay_tao, ten_khach_hang, so_dien_thoai, dia_chi, ngay_thanh_toan, trang_thai, id_nhan_vien) 
values ('HD112923122058', '2023/12/05', N'Trương Tho', '0374567890', N'Hà Nội',  '2023/12/05', 1, 8);
insert into HoaDon(ma_hoa_don, ngay_tao, ten_khach_hang, so_dien_thoai, dia_chi, ngay_thanh_toan, trang_thai, id_nhan_vien) 
values ('HD112923122059', '2023/12/05', N'Bùi Tuấn', '0374567890', N'Vân Phúc',  '2023/12/05',1, 1);
insert into HoaDon(ma_hoa_don, ngay_tao, ten_khach_hang, so_dien_thoai, dia_chi, ngay_thanh_toan, trang_thai, id_nhan_vien) 
values ('HD112923122060', '2023/12/05', N'Hạ Tấn', '0374567890', N'Vân Phúc',  '2023/12/05', 1, 6);
insert into HoaDon(ma_hoa_don, ngay_tao, ten_khach_hang, so_dien_thoai, dia_chi, ngay_thanh_toan, trang_thai, id_nhan_vien) 
values ('HD112923122061', '2023/12/05', N'Dương Minh', '0374567890', N'Hà Nội',  '2023/12/05' ,1, 2);
insert into HoaDon(ma_hoa_don, ngay_tao, ten_khach_hang, so_dien_thoai, dia_chi, ngay_thanh_toan, trang_thai, id_nhan_vien) 
values ('HD112923122062', '2023/12/05', N'Yến Giang', '0374567890', N'Vân Phúc',  '2023/12/05' ,1, 3);
insert into HoaDon(ma_hoa_don, ngay_tao, ten_khach_hang, so_dien_thoai, dia_chi, ngay_thanh_toan, trang_thai, id_nhan_vien) 
values ('HD112923122063', '2023/12/05', N'Anh Đức', '0374567890', N'Hà Nội',  '2023/12/05' ,1, 4);
insert into HoaDon(ma_hoa_don, ngay_tao, ten_khach_hang, so_dien_thoai, dia_chi, ngay_thanh_toan, trang_thai, id_nhan_vien) 
values ('HD112923122064', '2023/12/05', N'Bao Bá', '0374567890', N'Hà Nội',  '2023/12/05',1, 4);
insert into HoaDon(ma_hoa_don, ngay_tao, ten_khach_hang, so_dien_thoai, dia_chi, ngay_thanh_toan, trang_thai, id_nhan_vien) 
values ('HD112923122065', '2023/12/05', N'Vũ Khang', '0374567890', N'Hà Nội',  '2023/12/05' , 1, 5);

insert into HoaDon(ma_hoa_don, ngay_tao, ten_khach_hang, so_dien_thoai, dia_chi, ngay_thanh_toan, trang_thai, id_nhan_vien) 
values ('HD112923122066', '2023/12/05', N'A Chư', '0374567890', N'Hà Nội',  '2023/12/05' , 1, 6);
insert into HoaDon(ma_hoa_don, ngay_tao, ten_khach_hang, so_dien_thoai, dia_chi, ngay_thanh_toan, trang_thai, id_nhan_vien) 
values ('HD112923122067', '2023/12/05', N'Cô Hiền', '0374567890', N'Hà Nội',  '2023/12/05' , 1, 7);
insert into HoaDon(ma_hoa_don, ngay_tao, ten_khach_hang, so_dien_thoai, dia_chi, ngay_thanh_toan, trang_thai, id_nhan_vien) 
values ('HD112923122068', '2023/12/05', N'Chú Tính', '0374567890', N'Hà Nội',  '2023/12/05' , 1, 8);
insert into HoaDon(ma_hoa_don, ngay_tao, ten_khach_hang, so_dien_thoai, dia_chi, ngay_thanh_toan, trang_thai, id_nhan_vien) 
values ('HD112923122069', '2023/12/05', N'Bác T', '0374567890', N'Vân Phúc',  '2023/12/05' , 1, 1);
insert into HoaDon(ma_hoa_don, ngay_tao, ten_khach_hang, so_dien_thoai, dia_chi, ngay_thanh_toan, trang_thai, id_nhan_vien) 
values ('HD112923122070', '2023/12/05', N'Khang', '0374567890', N'Vân Phúc',  '2023/12/05' , 1, 6);
insert into HoaDon(ma_hoa_don, ngay_tao, ten_khach_hang, so_dien_thoai, dia_chi, ngay_thanh_toan, trang_thai, id_nhan_vien) 
values ('HD112923122071', '2023/12/04', N'Phạm Văn', '0374567890', N'Hà Nội',  '2023/12/04' , 1, 2);
insert into HoaDon(ma_hoa_don, ngay_tao, ten_khach_hang, so_dien_thoai, dia_chi, ngay_thanh_toan, trang_thai, id_nhan_vien) 
values ('HD112923122072', '2023/12/04', N'Vân Pháp', '0374567890', N'Vân Phúc',  '2023/12/04', 1, 3);
insert into HoaDon(ma_hoa_don, ngay_tao, ten_khach_hang, so_dien_thoai, dia_chi, ngay_thanh_toan, trang_thai, id_nhan_vien) 
values ('HD112923122073', '2023/12/04', N'Văn Minh', '0374567890', N'Hà Nội',  '2023/12/04', 1, 4);
insert into HoaDon(ma_hoa_don, ngay_tao, ten_khach_hang, so_dien_thoai, dia_chi, ngay_thanh_toan, trang_thai, id_nhan_vien) 
values ('HD112923122074', '2023/12/04', N'Bao Tú', '0374567890', N'Hà Nội',  '2023/12/04', 1, 4);
insert into HoaDon(ma_hoa_don, ngay_tao, ten_khach_hang, so_dien_thoai, dia_chi, ngay_thanh_toan, trang_thai, id_nhan_vien) 
values ('HD112923122075', '2023/12/04', N'Vũ Vịt', '0374567890', N'Hà Nội',  '2023/12/04', 1, 5);

insert into HoaDon(ma_hoa_don, ngay_tao, ten_khach_hang, so_dien_thoai, dia_chi, ngay_thanh_toan, trang_thai, id_nhan_vien) 
values ('HD112923122076', '2023/12/04', N'A Phú', '0374567890', N'Vĩnh Phúc',  '2023/12/04', 1, 6);
insert into HoaDon(ma_hoa_don, ngay_tao, ten_khach_hang, so_dien_thoai, dia_chi, ngay_thanh_toan, trang_thai, id_nhan_vien) 
values ('HD112923122077', '2023/12/04', N'Ti Hợi', '0374567890', N'Vĩnh Phúc',  '2023/12/04', 1, 7);
insert into HoaDon(ma_hoa_don, ngay_tao, ten_khach_hang, so_dien_thoai, dia_chi, ngay_thanh_toan, trang_thai, id_nhan_vien) 
values ('HD112923122078', '2023/12/04', N'Lanh Cao', '0374567890', N'Vĩnh Phúc',  '2023/12/04', 1, 8);
insert into HoaDon(ma_hoa_don, ngay_tao, ten_khach_hang, so_dien_thoai, dia_chi, ngay_thanh_toan, trang_thai, id_nhan_vien) 
values ('HD112923122079', '2023/12/04', N'Bát Tho', '0374567890', N'Vân Phúc',  '2023/12/04', 1, 1);
insert into HoaDon(ma_hoa_don, ngay_tao, ten_khach_hang, so_dien_thoai, dia_chi, ngay_thanh_toan, trang_thai, id_nhan_vien) 
values ('HD112923122080', '2023/12/03', N'Hạ Thương', '0374567890', N'Vân Phúc',  '2023/12/03', 1, 6);
insert into HoaDon(ma_hoa_don, ngay_tao, ten_khach_hang, so_dien_thoai, dia_chi, ngay_thanh_toan, trang_thai, id_nhan_vien) 
values ('HD112923122081', '2023/12/03', N'Nguyễn Sôi', '0374567890', N'Hà Nội','2023/12/03', 1, 2);
insert into HoaDon(ma_hoa_don, ngay_tao, ten_khach_hang, so_dien_thoai, dia_chi, ngay_thanh_toan, trang_thai, id_nhan_vien) 
values ('HD112923122082', '2023/12/03', N'Giang Nam', '0374567890', N'Vân Phúc','2023/12/03', 1, 3);
insert into HoaDon(ma_hoa_don, ngay_tao, ten_khach_hang, so_dien_thoai, dia_chi, ngay_thanh_toan, trang_thai, id_nhan_vien) 
values ('HD112923122083', '2023/12/03', N'Trần Quang', '0374567890', N'Hà Nội','2023/12/03', 1, 4);
insert into HoaDon(ma_hoa_don, ngay_tao, ten_khach_hang, so_dien_thoai, dia_chi, ngay_thanh_toan, trang_thai, id_nhan_vien) 
values ('HD112923122084', '2023/12/03', N'Bá Đạo', '0374567890', N'Vĩnh Phúc','2023/12/03', 1, 4);
insert into HoaDon(ma_hoa_don, ngay_tao, ten_khach_hang, so_dien_thoai, dia_chi, ngay_thanh_toan, trang_thai, id_nhan_vien) 
values ('HD112923122085', '2023/12/03', N'Kiên', '0374567890', N'Vĩnh Phúc','2023/12/03', 1, 5);

insert into HoaDon(ma_hoa_don, ngay_tao, ten_khach_hang, so_dien_thoai, dia_chi, ngay_thanh_toan, trang_thai, id_nhan_vien) 
values ('HD112923122086', '2023/12/03', N'Ngọc Giàu', '0374567890', N'Vĩnh Phúc','2023/12/03', 1, 6);
insert into HoaDon(ma_hoa_don, ngay_tao, ten_khach_hang, so_dien_thoai, dia_chi, ngay_thanh_toan, trang_thai, id_nhan_vien) 
values ('HD112923122087', '2023/12/03', N'Thu Tiền', '0374567890', N'Vĩnh Phúc','2023/12/03', 1, 7);
insert into HoaDon(ma_hoa_don, ngay_tao, ten_khach_hang, so_dien_thoai, dia_chi, ngay_thanh_toan, trang_thai, id_nhan_vien) 
values ('HD112923122088', '2023/12/03', N'Thu Ngân', '0374567890', N'Vĩnh Phúc','2023/12/03', 1, 8);
insert into HoaDon(ma_hoa_don, ngay_tao, ten_khach_hang, so_dien_thoai, dia_chi, ngay_thanh_toan, trang_thai, id_nhan_vien) 
values ('HD112923122089', '2023/12/03', N'Bảo Ngân', '0374567890', N'Vân Phúc','2023/12/03', 1, 1);
insert into HoaDon(ma_hoa_don, ngay_tao, ten_khach_hang, so_dien_thoai, dia_chi, ngay_thanh_toan, trang_thai, id_nhan_vien) 
values ('HD112923122001', '2023/12/03', N'Hạ Thy', '0374567890', N'Vân Phúc','2023/12/03', 1, 6);
insert into HoaDon(ma_hoa_don, ngay_tao, ten_khach_hang, so_dien_thoai, dia_chi, ngay_thanh_toan, trang_thai, id_nhan_vien) 
values ('HD112923122002', '2023/12/03', N'Nguyễn Bắp', '0374567890', N'Hà Nội','2023/12/03', 1, 2);
insert into HoaDon(ma_hoa_don, ngay_tao, ten_khach_hang, so_dien_thoai, dia_chi, ngay_thanh_toan, trang_thai, id_nhan_vien) 
values ('HD112923122003', '2023/12/03', N'Hoàng Nam', '0374567890', N'Vân Phúc','2023/12/03', 1, 3);
insert into HoaDon(ma_hoa_don, ngay_tao, ten_khach_hang, so_dien_thoai, dia_chi, ngay_thanh_toan, trang_thai, id_nhan_vien) 
values ('HD112923122004', '2023/12/03', N'Bát Chàng', '0374567890', N'Hà Nội','2023/12/03', 1, 4);
insert into HoaDon(ma_hoa_don, ngay_tao, ten_khach_hang, so_dien_thoai, dia_chi, ngay_thanh_toan, trang_thai, id_nhan_vien) 
values ('HD112923122005', '2023/12/03', N'Join', '0374567890', N'Vĩnh Phúc','2023/12/03', 1, 4);
insert into HoaDon(ma_hoa_don, ngay_tao, ten_khach_hang, so_dien_thoai, dia_chi, ngay_thanh_toan, trang_thai, id_nhan_vien) 
values ('HD112923122006', '2023/12/03', N'Tri Cao', '0374567890', N'Vĩnh Phúc','2023/12/03', 1, 5);

insert into HoaDon(ma_hoa_don, ngay_tao, ten_khach_hang, so_dien_thoai, dia_chi, ngay_thanh_toan, trang_thai, id_nhan_vien) 
values ('HD112923122007', '2023/12/02', N'A Phú', '0374567890', N'Vĩnh Phúc','2023/12/02', 1, 6);
insert into HoaDon(ma_hoa_don, ngay_tao, ten_khach_hang, so_dien_thoai, dia_chi, ngay_thanh_toan, trang_thai, id_nhan_vien) 
values ('HD112923122008', '2023/12/02', N'Ti Hợi', '0374567890', N'Vĩnh Phúc','2023/12/02', 1, 7);
insert into HoaDon(ma_hoa_don, ngay_tao, ten_khach_hang, so_dien_thoai, dia_chi, ngay_thanh_toan, trang_thai, id_nhan_vien) 
values ('HD112923122009', '2023/12/02', N'Lanh Cao', '0374567890', N'Vĩnh Phúc','2023/12/02', 1, 8);
insert into HoaDon(ma_hoa_don, ngay_tao, ten_khach_hang, so_dien_thoai, dia_chi, ngay_thanh_toan, trang_thai, id_nhan_vien) 
values ('HD112923122110', '2023/12/02', N'Bát Tho', '0374567890', N'Vân Phúc','2023/12/02', 1, 1);
insert into HoaDon(ma_hoa_don, ngay_tao, ten_khach_hang, so_dien_thoai, dia_chi, ngay_thanh_toan, trang_thai, id_nhan_vien) 
values ('HD112923122111', '2023/12/02', N'Hạ Thương', '0374567890', N'Vân Phúc','2023/12/02', 1, 6);
insert into HoaDon(ma_hoa_don, ngay_tao, ten_khach_hang, so_dien_thoai, dia_chi, ngay_thanh_toan, trang_thai, id_nhan_vien) 
values ('HD112923122112', '2023/12/02', N'Nguyễn Sôi', '0374567890', N'Hà Nội','2023/12/02', 1, 2);
insert into HoaDon(ma_hoa_don, ngay_tao, ten_khach_hang, so_dien_thoai, dia_chi, ngay_thanh_toan, trang_thai, id_nhan_vien) 
values ('HD112923122113', '2023/12/02', N'Giang Nam', '0374567890', N'Vân Phúc','2023/12/02', 1, 3);
insert into HoaDon(ma_hoa_don, ngay_tao, ten_khach_hang, so_dien_thoai, dia_chi, ngay_thanh_toan, trang_thai, id_nhan_vien) 
values ('HD112923122114', '2023/12/02', N'Trần Quang', '0374567890', N'Hà Nội','2023/12/02', 1, 4);
insert into HoaDon(ma_hoa_don, ngay_tao, ten_khach_hang, so_dien_thoai, dia_chi, ngay_thanh_toan, trang_thai, id_nhan_vien) 
values ('HD112923122115', '2023/12/02', N'Bá Đạo', '0374567890', N'Vĩnh Phúc','2023/12/02', 1, 4);
insert into HoaDon(ma_hoa_don, ngay_tao, ten_khach_hang, so_dien_thoai, dia_chi, ngay_thanh_toan, trang_thai, id_nhan_vien) 
values ('HD112923122116', '2023/12/02', N'Kiên', '0374567890', N'Vĩnh Phúc','2023/12/02', 1, 5);

insert into HoaDon(ma_hoa_don, ngay_tao, ten_khach_hang, so_dien_thoai, dia_chi, ngay_thanh_toan, trang_thai, id_nhan_vien) 
values ('HD112923122117', '2023/12/02', N'A Phó', '0374567890', N'Vĩnh Phúc','2023/12/02', 1, 6);
insert into HoaDon(ma_hoa_don, ngay_tao, ten_khach_hang, so_dien_thoai, dia_chi, ngay_thanh_toan, trang_thai, id_nhan_vien) 
values ('HD112923122118', '2023/12/02', N'Ti Tí', '0374567890', N'Vĩnh Phúc','2023/12/02', 1, 7);
insert into HoaDon(ma_hoa_don, ngay_tao, ten_khach_hang, so_dien_thoai, dia_chi, ngay_thanh_toan, trang_thai, id_nhan_vien) 
values ('HD112923122119', '2023/12/02', N'Bảo Lãnh', '0374567890', N'Vĩnh Phúc','2023/12/02', 1, 8);
insert into HoaDon(ma_hoa_don, ngay_tao, ten_khach_hang, so_dien_thoai, dia_chi, ngay_thanh_toan, trang_thai, id_nhan_vien) 
values ('HD11292312212', '2023/12/02', N'Qua Môn', '0374567890', N'Vân Phúc','2023/12/02', 1, 1);
insert into HoaDon(ma_hoa_don, ngay_tao, ten_khach_hang, so_dien_thoai, dia_chi, ngay_thanh_toan, trang_thai, id_nhan_vien) 
values ('HD112923122121', '2023/12/02', N'Thu Qua', '0374567890', N'Vân Phúc','2023/12/02', 1, 6);
insert into HoaDon(ma_hoa_don, ngay_tao, ten_khach_hang, so_dien_thoai, dia_chi, ngay_thanh_toan, trang_thai, id_nhan_vien) 
values ('HD112923122122', '2023/12/02', N'Đông Phương', '0374567890', N'Hà Nội','2023/12/02', 1, 2);
insert into HoaDon(ma_hoa_don, ngay_tao, ten_khach_hang, so_dien_thoai, dia_chi, ngay_thanh_toan, trang_thai, id_nhan_vien) 
values ('HD112923122123', '2023/12/02', N'Bất Bại', '0374567890', N'Vân Phúc','2023/12/02', 1, 3);
insert into HoaDon(ma_hoa_don, ngay_tao, ten_khach_hang, so_dien_thoai, dia_chi, ngay_thanh_toan, trang_thai, id_nhan_vien) 
values ('HD112923122124', '2023/12/02', N'Tấn Dương', '0374567890', N'Hà Nội','2023/12/02', 1, 4);
insert into HoaDon(ma_hoa_don, ngay_tao, ten_khach_hang, so_dien_thoai, dia_chi, ngay_thanh_toan, trang_thai, id_nhan_vien) 
values ('HD112923122125', '2023/12/02', N'Bá Đạo Vương', '0374567890', N'Vĩnh Phúc','2023/12/02', 1, 4);
insert into HoaDon(ma_hoa_don, ngay_tao, ten_khach_hang, so_dien_thoai, dia_chi, ngay_thanh_toan, trang_thai, id_nhan_vien) 
values ('HD112923122126', '2023/12/02', N'Kiên', '0374567890', N'Vĩnh Phúc','2023/12/02', 1, 5);

insert into HoaDon(ma_hoa_don, ngay_tao, ten_khach_hang, so_dien_thoai, dia_chi, ngay_thanh_toan, trang_thai, id_nhan_vien) 
values ('HD112923122127', '2023/12/02', N'A Phú', '0374567890', N'Vĩnh Phúc','2023/12/02', 1, 6);
insert into HoaDon(ma_hoa_don, ngay_tao, ten_khach_hang, so_dien_thoai, dia_chi, ngay_thanh_toan, trang_thai, id_nhan_vien) 
values ('HD112923122128', '2023/12/02', N'Ti Hợi', '0374567890', N'Vĩnh Phúc','2023/12/02', 1, 7);
insert into HoaDon(ma_hoa_don, ngay_tao, ten_khach_hang, so_dien_thoai, dia_chi, ngay_thanh_toan, trang_thai, id_nhan_vien) 
values ('HD112923122129', '2023/12/02', N'Lanh Cao', '0374567890', N'Vĩnh Phúc','2023/12/02', 1, 8);
insert into HoaDon(ma_hoa_don, ngay_tao, ten_khach_hang, so_dien_thoai, dia_chi, ngay_thanh_toan, trang_thai, id_nhan_vien) 
values ('HD112923122130', '2023/12/02', N'Bát Tho', '0374567890', N'Vân Phúc','2023/12/02', 1, 1);
insert into HoaDon(ma_hoa_don, ngay_tao, ten_khach_hang, so_dien_thoai, dia_chi, ngay_thanh_toan, trang_thai, id_nhan_vien) 
values ('HD112923122131', '2023/12/02', N'Hạ Thương', '0374567890', N'Vân Phúc','2023/12/02', 1, 6);
insert into HoaDon(ma_hoa_don, ngay_tao, ten_khach_hang, so_dien_thoai, dia_chi, ngay_thanh_toan, trang_thai, id_nhan_vien) 
values ('HD112923122132', '2023/12/02', N'Nguyễn Sôi', '0374567890', N'Hà Nội','2023/12/02', 1, 2);
insert into HoaDon(ma_hoa_don, ngay_tao, ten_khach_hang, so_dien_thoai, dia_chi, ngay_thanh_toan, trang_thai, id_nhan_vien) 
values ('HD112923122133', '2023/12/01', N'Giang Nam', '0374567890', N'Vân Phúc','2023/12/01', 1, 3);
insert into HoaDon(ma_hoa_don, ngay_tao, ten_khach_hang, so_dien_thoai, dia_chi, ngay_thanh_toan, trang_thai, id_nhan_vien) 
values ('HD112923122134', '2023/12/01', N'Trần Quang', '0374567890', N'Hà Nội','2023/12/01', 1, 4);
insert into HoaDon(ma_hoa_don, ngay_tao, ten_khach_hang, so_dien_thoai, dia_chi, ngay_thanh_toan, trang_thai, id_nhan_vien) 
values ('HD112923122135', '2023/12/01', N'Bá Đạo', '0374567890', N'Vĩnh Phúc','2023/12/01', 1, 4);
insert into HoaDon(ma_hoa_don, ngay_tao, ten_khach_hang, so_dien_thoai, dia_chi, ngay_thanh_toan, trang_thai, id_nhan_vien) 
values ('HD112923122136', '2023/12/01', N'Kiên', '0374567890', N'Vĩnh Phúc','2023/12/01', 1, 5);


select * from HoaDon

-- data table HoaDonChiTiet

insert into HoaDonChiTiet(id_san_pham, id_hoa_don, so_luong, don_gia, don_gia_khuyen_mai) values(1, 1, 2, 510000, 484500);
insert into HoaDonChiTiet(id_san_pham, id_hoa_don, so_luong, don_gia, don_gia_khuyen_mai) values(2, 1, 1, 1200000, 1140000);
insert into HoaDonChiTiet(id_san_pham, id_hoa_don, so_luong, don_gia, don_gia_khuyen_mai) values(1, 3, 3, 510000, 484500);
insert into HoaDonChiTiet(id_san_pham, id_hoa_don, so_luong, don_gia, don_gia_khuyen_mai) values(1, 2, 1, 510000, 484500);
insert into HoaDonChiTiet(id_san_pham, id_hoa_don, so_luong, don_gia, don_gia_khuyen_mai) values(2, 2, 1, 1200000, 1140000);
insert into HoaDonChiTiet(id_san_pham, id_hoa_don, so_luong, don_gia, don_gia_khuyen_mai) values(3, 6, 2, 1020000, 969000);
insert into HoaDonChiTiet(id_san_pham, id_hoa_don, so_luong, don_gia, don_gia_khuyen_mai) values(4, 7, 2, 390000, 370500);
insert into HoaDonChiTiet(id_san_pham, id_hoa_don, so_luong, don_gia, don_gia_khuyen_mai) values(8, 4, 2, 1020000, 5861500);
insert into HoaDonChiTiet(id_san_pham, id_hoa_don, so_luong, don_gia, don_gia_khuyen_mai) values(9, 5, 2, 390000, 3021000);

insert into HoaDonChiTiet(id_san_pham, id_hoa_don, so_luong, don_gia, don_gia_khuyen_mai) values(1, 1, 1, 510000, 484500.000000);
insert into HoaDonChiTiet(id_san_pham, id_hoa_don, so_luong, don_gia, don_gia_khuyen_mai) values(2, 1, 1, 1200000, 1140000.000000);
insert into HoaDonChiTiet(id_san_pham, id_hoa_don, so_luong, don_gia, don_gia_khuyen_mai) values(3, 1, 1, 1020000, 969000.000000);
insert into HoaDonChiTiet(id_san_pham, id_hoa_don, so_luong, don_gia, don_gia_khuyen_mai) values(4, 2, 1, 390000, 370500.000000);
insert into HoaDonChiTiet(id_san_pham, id_hoa_don, so_luong, don_gia, don_gia_khuyen_mai) values(5, 3, 1, 640000, 608000.000000);
insert into HoaDonChiTiet(id_san_pham, id_hoa_don, so_luong, don_gia, don_gia_khuyen_mai) values(6, 2, 1, 1020000, 969000.000000);
insert into HoaDonChiTiet(id_san_pham, id_hoa_don, so_luong, don_gia, don_gia_khuyen_mai) values(7, 5, 1, 1630000, 1548500.000000);
insert into HoaDonChiTiet(id_san_pham, id_hoa_don, so_luong, don_gia, don_gia_khuyen_mai) values(8, 2, 1, 6170000, 5861500.000000);
insert into HoaDonChiTiet(id_san_pham, id_hoa_don, so_luong, don_gia, don_gia_khuyen_mai) values(9, 4, 1, 3180000, 3021000.000000);
insert into HoaDonChiTiet(id_san_pham, id_hoa_don, so_luong, don_gia, don_gia_khuyen_mai) values(10, 1, 1, 5040000, 4788000.000000);
insert into HoaDonChiTiet(id_san_pham, id_hoa_don, so_luong, don_gia, don_gia_khuyen_mai) values(11, 2, 1, 4160000, 3952000.000000);

insert into HoaDonChiTiet(id_san_pham, id_hoa_don, so_luong, don_gia, don_gia_khuyen_mai) values(12, 3, 1, 4160000, 3952000.000000);
insert into HoaDonChiTiet(id_san_pham, id_hoa_don, so_luong, don_gia, don_gia_khuyen_mai) values(13, 3, 1, 6170000, 5861500.000000);
insert into HoaDonChiTiet(id_san_pham, id_hoa_don, so_luong, don_gia, don_gia_khuyen_mai) values(14, 4, 1, 3920000, 3724000.000000);
insert into HoaDonChiTiet(id_san_pham, id_hoa_don, so_luong, don_gia, don_gia_khuyen_mai) values(15, 4, 1, 4600000, 4370000.000000);
insert into HoaDonChiTiet(id_san_pham, id_hoa_don, so_luong, don_gia, don_gia_khuyen_mai) values(16, 5, 1, 3710000, 3524500.000000);
insert into HoaDonChiTiet(id_san_pham, id_hoa_don, so_luong, don_gia, don_gia_khuyen_mai) values(17, 5, 1, 4120000, 3914000.000000);
insert into HoaDonChiTiet(id_san_pham, id_hoa_don, so_luong, don_gia, don_gia_khuyen_mai) values(18, 6, 1, 5080000, 4826000.000000);
insert into HoaDonChiTiet(id_san_pham, id_hoa_don, so_luong, don_gia, don_gia_khuyen_mai) values(19, 6, 1, 4200000, 3990000.000000);
insert into HoaDonChiTiet(id_san_pham, id_hoa_don, so_luong, don_gia, don_gia_khuyen_mai) values(20, 7, 1, 3970000, 3771500.000000);
insert into HoaDonChiTiet(id_san_pham, id_hoa_don, so_luong, don_gia, don_gia_khuyen_mai) values(21, 7, 1, 3150000, 2992500.000000);

insert into HoaDonChiTiet(id_san_pham, id_hoa_don, so_luong, don_gia, don_gia_khuyen_mai) values(22, 8, 1, 6990000, 6640500.000000);
insert into HoaDonChiTiet(id_san_pham, id_hoa_don, so_luong, don_gia, don_gia_khuyen_mai) values(23, 8, 1, 10110000, 9604500.000000);
insert into HoaDonChiTiet(id_san_pham, id_hoa_don, so_luong, don_gia, don_gia_khuyen_mai) values(24,9, 1, 6100000, 5795000.000000);
insert into HoaDonChiTiet(id_san_pham, id_hoa_don, so_luong, don_gia, don_gia_khuyen_mai) values(25,9, 1, 7050000, 6697500.000000);
insert into HoaDonChiTiet(id_san_pham, id_hoa_don, so_luong, don_gia, don_gia_khuyen_mai) values(26, 10, 1, 5090000, 4835500.000000);
insert into HoaDonChiTiet(id_san_pham, id_hoa_don, so_luong, don_gia, don_gia_khuyen_mai) values(27, 10, 1, 10570000, 10041500.000000);
insert into HoaDonChiTiet(id_san_pham, id_hoa_don, so_luong, don_gia, don_gia_khuyen_mai) values(28, 11, 1, 3370000, 3201500.000000);
insert into HoaDonChiTiet(id_san_pham, id_hoa_don, so_luong, don_gia, don_gia_khuyen_mai) values(29, 11, 1, 4420000, 4199000.000000);
insert into HoaDonChiTiet(id_san_pham, id_hoa_don, so_luong, don_gia, don_gia_khuyen_mai) values(30, 12, 1, 5890000, 5595500.000000);
insert into HoaDonChiTiet(id_san_pham, id_hoa_don, so_luong, don_gia, don_gia_khuyen_mai) values(31, 12, 1, 4350000, 4132500.000000);

insert into HoaDonChiTiet(id_san_pham, id_hoa_don, so_luong, don_gia, don_gia_khuyen_mai) values(32, 13, 1, 3780000, 3591000.000000);
insert into HoaDonChiTiet(id_san_pham, id_hoa_don, so_luong, don_gia, don_gia_khuyen_mai) values(33, 13, 1, 8390000, 7970500.000000);
insert into HoaDonChiTiet(id_san_pham, id_hoa_don, so_luong, don_gia, don_gia_khuyen_mai) values(34,14, 1, 3150000, 2992500.000000);
insert into HoaDonChiTiet(id_san_pham, id_hoa_don, so_luong, don_gia, don_gia_khuyen_mai) values(35,14, 1, 2730000, 2593500.000000);
insert into HoaDonChiTiet(id_san_pham, id_hoa_don, so_luong, don_gia, don_gia_khuyen_mai) values(36, 15, 1, 8590000, 8160500.000000);
insert into HoaDonChiTiet(id_san_pham, id_hoa_don, so_luong, don_gia, don_gia_khuyen_mai) values(37, 15, 1, 3360000, 3192000.000000);
insert into HoaDonChiTiet(id_san_pham, id_hoa_don, so_luong, don_gia, don_gia_khuyen_mai) values(38, 16, 1, 6040000, 5738000.000000);
insert into HoaDonChiTiet(id_san_pham, id_hoa_don, so_luong, don_gia, don_gia_khuyen_mai) values(39, 16, 1, 3360000, 3192000.000000);
insert into HoaDonChiTiet(id_san_pham, id_hoa_don, so_luong, don_gia, don_gia_khuyen_mai) values(40, 17, 1, 5500000, 5225000.000000);
insert into HoaDonChiTiet(id_san_pham, id_hoa_don, so_luong, don_gia, don_gia_khuyen_mai) values(41, 17, 1, 6730000, 6393500.000000);

insert into HoaDonChiTiet(id_san_pham, id_hoa_don, so_luong, don_gia, don_gia_khuyen_mai) values(42, 18, 1, 3740000, 3553000.000000);
insert into HoaDonChiTiet(id_san_pham, id_hoa_don, so_luong, don_gia, don_gia_khuyen_mai) values(43, 18, 1, 3400000, 3230000.000000);
insert into HoaDonChiTiet(id_san_pham, id_hoa_don, so_luong, don_gia, don_gia_khuyen_mai) values(44,19, 1, 9650000, 9167500.000000);
insert into HoaDonChiTiet(id_san_pham, id_hoa_don, so_luong, don_gia, don_gia_khuyen_mai) values(45,19, 1, 3120000, 2964000.000000);
insert into HoaDonChiTiet(id_san_pham, id_hoa_don, so_luong, don_gia, don_gia_khuyen_mai) values(46, 20, 1, 3330000, 3163500.000000);
insert into HoaDonChiTiet(id_san_pham, id_hoa_don, so_luong, don_gia, don_gia_khuyen_mai) values(47, 20, 1, 1120000, 1064000.000000);
insert into HoaDonChiTiet(id_san_pham, id_hoa_don, so_luong, don_gia, don_gia_khuyen_mai) values(48, 21, 1, 2510000, 2384500.000000);
insert into HoaDonChiTiet(id_san_pham, id_hoa_don, so_luong, don_gia, don_gia_khuyen_mai) values(49, 21, 1, 1120000, 1064000.000000);
insert into HoaDonChiTiet(id_san_pham, id_hoa_don, so_luong, don_gia, don_gia_khuyen_mai) values(50, 22, 1, 1030000, 978500.000000);
insert into HoaDonChiTiet(id_san_pham, id_hoa_don, so_luong, don_gia, don_gia_khuyen_mai) values(51, 22, 1, 1620000, 1539000.000000);

insert into HoaDonChiTiet(id_san_pham, id_hoa_don, so_luong, don_gia, don_gia_khuyen_mai) values(52, 23, 1, 4750000, 4512500.000000);
insert into HoaDonChiTiet(id_san_pham, id_hoa_don, so_luong, don_gia, don_gia_khuyen_mai) values(53, 23, 1, 3780000, 3591000.000000);
insert into HoaDonChiTiet(id_san_pham, id_hoa_don, so_luong, don_gia, don_gia_khuyen_mai) values(54,24, 1, 3260000, 3097000.000000);
insert into HoaDonChiTiet(id_san_pham, id_hoa_don, so_luong, don_gia, don_gia_khuyen_mai) values(55,24, 1, 5440000, 5168000.000000);
insert into HoaDonChiTiet(id_san_pham, id_hoa_don, so_luong, don_gia, don_gia_khuyen_mai) values(56, 25, 1, 5080000, 4826000.000000);
insert into HoaDonChiTiet(id_san_pham, id_hoa_don, so_luong, don_gia, don_gia_khuyen_mai) values(57, 25, 1, 4530000, 4303500.000000);
insert into HoaDonChiTiet(id_san_pham, id_hoa_don, so_luong, don_gia, don_gia_khuyen_mai) values(58, 26, 1, 4530000, 4303500.000000);
insert into HoaDonChiTiet(id_san_pham, id_hoa_don, so_luong, don_gia, don_gia_khuyen_mai) values(59, 26, 1, 4950000, 4702500.000000);
insert into HoaDonChiTiet(id_san_pham, id_hoa_don, so_luong, don_gia, don_gia_khuyen_mai) values(60, 27, 1, 4950000, 4650000.000000);
insert into HoaDonChiTiet(id_san_pham, id_hoa_don, so_luong, don_gia, don_gia_khuyen_mai) values(61, 27, 1, 13940000, 13640000.000000);

insert into HoaDonChiTiet(id_san_pham, id_hoa_don, so_luong, don_gia, don_gia_khuyen_mai) values(62, 28, 1, 14900000, 14600000.000000);
insert into HoaDonChiTiet(id_san_pham, id_hoa_don, so_luong, don_gia, don_gia_khuyen_mai) values(63, 28, 1, 17150000, 16850000.000000);
insert into HoaDonChiTiet(id_san_pham, id_hoa_don, so_luong, don_gia, don_gia_khuyen_mai) values(64,29, 1, 12500000, 12200000.000000);
insert into HoaDonChiTiet(id_san_pham, id_hoa_don, so_luong, don_gia, don_gia_khuyen_mai) values(65,29, 1, 8500000, 8200000.000000);
insert into HoaDonChiTiet(id_san_pham, id_hoa_don, so_luong, don_gia, don_gia_khuyen_mai) values(66,30, 1, 18900000, 18600000.000000);
insert into HoaDonChiTiet(id_san_pham, id_hoa_don, so_luong, don_gia, don_gia_khuyen_mai) values(67, 30, 1, 9000000, 8700000.000000);
insert into HoaDonChiTiet(id_san_pham, id_hoa_don, so_luong, don_gia, don_gia_khuyen_mai) values(68, 31, 1, 22030000, 21730000.000000);
insert into HoaDonChiTiet(id_san_pham, id_hoa_don, so_luong, don_gia, don_gia_khuyen_mai) values(69, 31, 1, 26740000, 26440000.000000);
insert into HoaDonChiTiet(id_san_pham, id_hoa_don, so_luong, don_gia, don_gia_khuyen_mai) values(70, 32, 1, 32710000, 32410000.000000);
insert into HoaDonChiTiet(id_san_pham, id_hoa_don, so_luong, don_gia, don_gia_khuyen_mai) values(71, 32, 1, 91470000, 91170000.000000);

insert into HoaDonChiTiet(id_san_pham, id_hoa_don, so_luong, don_gia, don_gia_khuyen_mai) values(72, 33, 1, 62220000, 61920000.000000);
insert into HoaDonChiTiet(id_san_pham, id_hoa_don, so_luong, don_gia, don_gia_khuyen_mai) values(73, 33, 1, 28840000, 28540000.000000);
insert into HoaDonChiTiet(id_san_pham, id_hoa_don, so_luong, don_gia, don_gia_khuyen_mai) values(74,34, 1, 28840000, 28540000.000000);
insert into HoaDonChiTiet(id_san_pham, id_hoa_don, so_luong, don_gia, don_gia_khuyen_mai) values(75,35, 1, 43450000, 43150000.000000);
insert into HoaDonChiTiet(id_san_pham, id_hoa_don, so_luong, don_gia, don_gia_khuyen_mai) values(76,36, 1, 32400000, 32100000.000000);
insert into HoaDonChiTiet(id_san_pham, id_hoa_don, so_luong, don_gia, don_gia_khuyen_mai) values(77, 36, 1, 50500000, 50200000.000000);
insert into HoaDonChiTiet(id_san_pham, id_hoa_don, so_luong, don_gia, don_gia_khuyen_mai) values(78, 37, 1, 35500000, 35500000.000000);
insert into HoaDonChiTiet(id_san_pham, id_hoa_don, so_luong, don_gia, don_gia_khuyen_mai) values(79, 38, 1, 30300000, 30300000.000000);
insert into HoaDonChiTiet(id_san_pham, id_hoa_don, so_luong, don_gia, don_gia_khuyen_mai) values(80, 38, 1, 79200000, 79200000.000000);
insert into HoaDonChiTiet(id_san_pham, id_hoa_don, so_luong, don_gia, don_gia_khuyen_mai) values(81, 37, 1, 44500000, 44500000.000000);

insert into HoaDonChiTiet(id_san_pham, id_hoa_don, so_luong, don_gia, don_gia_khuyen_mai) values(82, 38, 1, 27900000, 27900000.000000);
insert into HoaDonChiTiet(id_san_pham, id_hoa_don, so_luong, don_gia, don_gia_khuyen_mai) values(83, 38, 1, 63000000, 63000000.000000);
insert into HoaDonChiTiet(id_san_pham, id_hoa_don, so_luong, don_gia, don_gia_khuyen_mai) values(84,39, 1, 20370000, 20370000.000000);
insert into HoaDonChiTiet(id_san_pham, id_hoa_don, so_luong, don_gia, don_gia_khuyen_mai) values(85,39, 1, 20370000, 20370000.000000);
insert into HoaDonChiTiet(id_san_pham, id_hoa_don, so_luong, don_gia, don_gia_khuyen_mai) values(86,40, 1, 17860000, 17860000.000000);
insert into HoaDonChiTiet(id_san_pham, id_hoa_don, so_luong, don_gia, don_gia_khuyen_mai) values(87, 40, 1, 10880000, 10880000.000000);
insert into HoaDonChiTiet(id_san_pham, id_hoa_don, so_luong, don_gia, don_gia_khuyen_mai) values(88, 41, 1, 17860000, 17860000.000000);
insert into HoaDonChiTiet(id_san_pham, id_hoa_don, so_luong, don_gia, don_gia_khuyen_mai) values(89, 41, 1, 22450000, 22450000.000000);
insert into HoaDonChiTiet(id_san_pham, id_hoa_don, so_luong, don_gia, don_gia_khuyen_mai) values(90, 42, 1, 17860000, 17860000.000000);
insert into HoaDonChiTiet(id_san_pham, id_hoa_don, so_luong, don_gia, don_gia_khuyen_mai) values(91, 42, 1, 83000000, 83000000.000000);

insert into HoaDonChiTiet(id_san_pham, id_hoa_don, so_luong, don_gia, don_gia_khuyen_mai) values(92, 43, 1, 59000000, 59000000.000000);
insert into HoaDonChiTiet(id_san_pham, id_hoa_don, so_luong, don_gia, don_gia_khuyen_mai) values(93, 43, 1, 167000000, 167000000.000000);
insert into HoaDonChiTiet(id_san_pham, id_hoa_don, so_luong, don_gia, don_gia_khuyen_mai) values(94,44, 1, 69500000, 69500000.000000);
insert into HoaDonChiTiet(id_san_pham, id_hoa_don, so_luong, don_gia, don_gia_khuyen_mai) values(95, 45, 1, 46000000, 46000000.000000);
insert into HoaDonChiTiet(id_san_pham, id_hoa_don, so_luong, don_gia, don_gia_khuyen_mai) values(96,45, 1, 199000000, 199000000.000000);
insert into HoaDonChiTiet(id_san_pham, id_hoa_don, so_luong, don_gia, don_gia_khuyen_mai) values(97, 46, 1, 12370000, 12370000.000000);
insert into HoaDonChiTiet(id_san_pham, id_hoa_don, so_luong, don_gia, don_gia_khuyen_mai) values(98, 46, 1, 12750000, 12750000.000000);
insert into HoaDonChiTiet(id_san_pham, id_hoa_don, so_luong, don_gia, don_gia_khuyen_mai) values(99, 47, 1, 7560000, 7560000.000000);
insert into HoaDonChiTiet(id_san_pham, id_hoa_don, so_luong, don_gia, don_gia_khuyen_mai) values(100, 47, 1, 16660000, 16660000.000000);
insert into HoaDonChiTiet(id_san_pham, id_hoa_don, so_luong, don_gia, don_gia_khuyen_mai) values(101, 44, 1, 26050000, 26050000.000000);

insert into HoaDonChiTiet(id_san_pham, id_hoa_don, so_luong, don_gia, don_gia_khuyen_mai) values(102, 45, 1, 24900000, 24900000.000000);
insert into HoaDonChiTiet(id_san_pham, id_hoa_don, so_luong, don_gia, don_gia_khuyen_mai) values(103, 46, 1, 9670000, 9670000.000000);
insert into HoaDonChiTiet(id_san_pham, id_hoa_don, so_luong, don_gia, don_gia_khuyen_mai) values(104,47, 1, 10200000, 10200000.000000);
insert into HoaDonChiTiet(id_san_pham, id_hoa_don, so_luong, don_gia, don_gia_khuyen_mai) values(105, 48, 1, 10200000, 10200000.000000);
insert into HoaDonChiTiet(id_san_pham, id_hoa_don, so_luong, don_gia, don_gia_khuyen_mai) values(106,49, 1, 12800000, 12800000.000000);
insert into HoaDonChiTiet(id_san_pham, id_hoa_don, so_luong, don_gia, don_gia_khuyen_mai) values(107, 50, 1, 10200000, 10200000.000000);
insert into HoaDonChiTiet(id_san_pham, id_hoa_don, so_luong, don_gia, don_gia_khuyen_mai) values(108, 51, 1, 7140000, 7140000.000000);
insert into HoaDonChiTiet(id_san_pham, id_hoa_don, so_luong, don_gia, don_gia_khuyen_mai) values(109, 52, 1, 9860000, 9860000.000000);
insert into HoaDonChiTiet(id_san_pham, id_hoa_don, so_luong, don_gia, don_gia_khuyen_mai) values(110, 53, 1, 9500000, 9500000.000000);
insert into HoaDonChiTiet(id_san_pham, id_hoa_don, so_luong, don_gia, don_gia_khuyen_mai) values(10, 54, 1, 5040000, 4788000.000000);

insert into HoaDonChiTiet(id_san_pham, id_hoa_don, so_luong, don_gia, don_gia_khuyen_mai) values(11, 45, 1, 4160000, 3952000.000000);
insert into HoaDonChiTiet(id_san_pham, id_hoa_don, so_luong, don_gia, don_gia_khuyen_mai) values(12, 46, 1, 4160000, 3952000.000000);
insert into HoaDonChiTiet(id_san_pham, id_hoa_don, so_luong, don_gia, don_gia_khuyen_mai) values(13,47, 1, 6170000, 5861500.000000);
insert into HoaDonChiTiet(id_san_pham, id_hoa_don, so_luong, don_gia, don_gia_khuyen_mai) values(14, 48, 1, 3920000, 3724000.000000);
insert into HoaDonChiTiet(id_san_pham, id_hoa_don, so_luong, don_gia, don_gia_khuyen_mai) values(15,49, 1, 4600000, 4370000.000000);
insert into HoaDonChiTiet(id_san_pham, id_hoa_don, so_luong, don_gia, don_gia_khuyen_mai) values(16, 50, 1, 3710000, 3524500.000000);
insert into HoaDonChiTiet(id_san_pham, id_hoa_don, so_luong, don_gia, don_gia_khuyen_mai) values(17, 51, 1, 4120000, 3914000.000000);
insert into HoaDonChiTiet(id_san_pham, id_hoa_don, so_luong, don_gia, don_gia_khuyen_mai) values(18, 52, 1, 5080000, 4826000.000000);
insert into HoaDonChiTiet(id_san_pham, id_hoa_don, so_luong, don_gia, don_gia_khuyen_mai) values(19, 53, 1, 4200000, 3990000.000000);
insert into HoaDonChiTiet(id_san_pham, id_hoa_don, so_luong, don_gia, don_gia_khuyen_mai) values(20, 54, 1, 3970000, 3771500.000000);

insert into HoaDonChiTiet(id_san_pham, id_hoa_don, so_luong, don_gia, don_gia_khuyen_mai) values(21, 55, 1, 3150000, 2992500.000000);
insert into HoaDonChiTiet(id_san_pham, id_hoa_don, so_luong, don_gia, don_gia_khuyen_mai) values(22, 56, 1, 6990000, 6640500.000000);
insert into HoaDonChiTiet(id_san_pham, id_hoa_don, so_luong, don_gia, don_gia_khuyen_mai) values(23,57, 1, 10110000, 9604500.000000);
insert into HoaDonChiTiet(id_san_pham, id_hoa_don, so_luong, don_gia, don_gia_khuyen_mai) values(24, 58, 1, 6100000, 5795000.000000);
insert into HoaDonChiTiet(id_san_pham, id_hoa_don, so_luong, don_gia, don_gia_khuyen_mai) values(25,59, 1, 7050000, 6697500.000000);
insert into HoaDonChiTiet(id_san_pham, id_hoa_don, so_luong, don_gia, don_gia_khuyen_mai) values(26, 60, 1, 5090000, 4835500.000000);
insert into HoaDonChiTiet(id_san_pham, id_hoa_don, so_luong, don_gia, don_gia_khuyen_mai) values(27, 61, 1, 10570000, 10041500.000000);
insert into HoaDonChiTiet(id_san_pham, id_hoa_don, so_luong, don_gia, don_gia_khuyen_mai) values(28, 62, 1, 3370000, 3201500.000000);
insert into HoaDonChiTiet(id_san_pham, id_hoa_don, so_luong, don_gia, don_gia_khuyen_mai) values(29, 63, 1, 4420000, 4199000.000000);
insert into HoaDonChiTiet(id_san_pham, id_hoa_don, so_luong, don_gia, don_gia_khuyen_mai) values(30, 64, 1, 5890000, 5595500.000000);

insert into HoaDonChiTiet(id_san_pham, id_hoa_don, so_luong, don_gia, don_gia_khuyen_mai) values(31, 55, 1, 4350000, 4132500.000000);
insert into HoaDonChiTiet(id_san_pham, id_hoa_don, so_luong, don_gia, don_gia_khuyen_mai) values(32, 56, 1, 3780000, 3591000.000000);
insert into HoaDonChiTiet(id_san_pham, id_hoa_don, so_luong, don_gia, don_gia_khuyen_mai) values(33,57, 1, 8390000, 7970500.000000);
insert into HoaDonChiTiet(id_san_pham, id_hoa_don, so_luong, don_gia, don_gia_khuyen_mai) values(34, 58, 1, 3150000, 2992500.000000);
insert into HoaDonChiTiet(id_san_pham, id_hoa_don, so_luong, don_gia, don_gia_khuyen_mai) values(35,59, 1, 2730000, 2593500.000000);
insert into HoaDonChiTiet(id_san_pham, id_hoa_don, so_luong, don_gia, don_gia_khuyen_mai) values(36, 60, 1, 8590000, 8160500.000000);
insert into HoaDonChiTiet(id_san_pham, id_hoa_don, so_luong, don_gia, don_gia_khuyen_mai) values(37, 61, 1, 3360000, 3192000.000000);
insert into HoaDonChiTiet(id_san_pham, id_hoa_don, so_luong, don_gia, don_gia_khuyen_mai) values(38, 62, 1, 6040000, 5738000.000000);
insert into HoaDonChiTiet(id_san_pham, id_hoa_don, so_luong, don_gia, don_gia_khuyen_mai) values(39, 63, 1, 3360000, 3192000.000000);
insert into HoaDonChiTiet(id_san_pham, id_hoa_don, so_luong, don_gia, don_gia_khuyen_mai) values(40, 64, 1, 5500000, 5225000.000000);
insert into HoaDonChiTiet(id_san_pham, id_hoa_don, so_luong, don_gia, don_gia_khuyen_mai) values(41, 65, 1, 6730000, 6393500.000000);
insert into HoaDonChiTiet(id_san_pham, id_hoa_don, so_luong, don_gia, don_gia_khuyen_mai) values(42, 66, 1, 3740000, 3553000.000000);
insert into HoaDonChiTiet(id_san_pham, id_hoa_don, so_luong, don_gia, don_gia_khuyen_mai) values(43,67, 1, 3400000, 3230000.000000);
insert into HoaDonChiTiet(id_san_pham, id_hoa_don, so_luong, don_gia, don_gia_khuyen_mai) values(44, 68, 1, 9650000, 9167500.000000);
insert into HoaDonChiTiet(id_san_pham, id_hoa_don, so_luong, don_gia, don_gia_khuyen_mai) values(45,69, 1, 3120000, 2964000.000000);
insert into HoaDonChiTiet(id_san_pham, id_hoa_don, so_luong, don_gia, don_gia_khuyen_mai) values(46, 70, 1, 3330000, 3163500.000000);
insert into HoaDonChiTiet(id_san_pham, id_hoa_don, so_luong, don_gia, don_gia_khuyen_mai) values(47, 71, 1, 1120000, 1064000.000000);
insert into HoaDonChiTiet(id_san_pham, id_hoa_don, so_luong, don_gia, don_gia_khuyen_mai) values(48, 72, 1, 2510000, 2384500.000000);
insert into HoaDonChiTiet(id_san_pham, id_hoa_don, so_luong, don_gia, don_gia_khuyen_mai) values(49, 73, 1, 1120000, 1064000.000000);
insert into HoaDonChiTiet(id_san_pham, id_hoa_don, so_luong, don_gia, don_gia_khuyen_mai) values(50, 74, 1, 1030000, 978500.000000);
insert into HoaDonChiTiet(id_san_pham, id_hoa_don, so_luong, don_gia, don_gia_khuyen_mai) values(51, 75, 1, 1620000, 1539000.000000);
insert into HoaDonChiTiet(id_san_pham, id_hoa_don, so_luong, don_gia, don_gia_khuyen_mai) values(52, 76, 1, 4750000, 4512500.000000);
insert into HoaDonChiTiet(id_san_pham, id_hoa_don, so_luong, don_gia, don_gia_khuyen_mai) values(53,77, 1, 3780000, 3591000.000000);
insert into HoaDonChiTiet(id_san_pham, id_hoa_don, so_luong, don_gia, don_gia_khuyen_mai) values(54,78, 1, 3260000, 3097000.000000);
insert into HoaDonChiTiet(id_san_pham, id_hoa_don, so_luong, don_gia, don_gia_khuyen_mai) values(55,79, 1, 5440000, 5168000.000000);
insert into HoaDonChiTiet(id_san_pham, id_hoa_don, so_luong, don_gia, don_gia_khuyen_mai) values(56, 80, 1, 5080000, 4826000.000000);
insert into HoaDonChiTiet(id_san_pham, id_hoa_don, so_luong, don_gia, don_gia_khuyen_mai) values(57, 81, 1, 4530000, 4303500.000000);
insert into HoaDonChiTiet(id_san_pham, id_hoa_don, so_luong, don_gia, don_gia_khuyen_mai) values(58, 82, 1, 4530000, 4303500.000000);
insert into HoaDonChiTiet(id_san_pham, id_hoa_don, so_luong, don_gia, don_gia_khuyen_mai) values(59, 83, 1, 4950000, 4702500.000000);
insert into HoaDonChiTiet(id_san_pham, id_hoa_don, so_luong, don_gia, don_gia_khuyen_mai) values(60, 84, 1, 4950000, 4650000.000000);
insert into HoaDonChiTiet(id_san_pham, id_hoa_don, so_luong, don_gia, don_gia_khuyen_mai) values(61, 85, 1, 13940000, 13640000.000000);
insert into HoaDonChiTiet(id_san_pham, id_hoa_don, so_luong, don_gia, don_gia_khuyen_mai) values(62, 86, 1, 14900000, 14600000.000000);
insert into HoaDonChiTiet(id_san_pham, id_hoa_don, so_luong, don_gia, don_gia_khuyen_mai) values(63,87, 1, 17150000, 16850000.000000);
insert into HoaDonChiTiet(id_san_pham, id_hoa_don, so_luong, don_gia, don_gia_khuyen_mai) values(64,88, 1, 12500000, 12200000.000000);
insert into HoaDonChiTiet(id_san_pham, id_hoa_don, so_luong, don_gia, don_gia_khuyen_mai) values(65,89, 1, 8500000, 8200000.000000);
insert into HoaDonChiTiet(id_san_pham, id_hoa_don, so_luong, don_gia, don_gia_khuyen_mai) values(66, 90, 1, 18900000, 18600000.000000);
insert into HoaDonChiTiet(id_san_pham, id_hoa_don, so_luong, don_gia, don_gia_khuyen_mai) values(67, 91, 1, 9000000, 8700000.000000);
insert into HoaDonChiTiet(id_san_pham, id_hoa_don, so_luong, don_gia, don_gia_khuyen_mai) values(68, 92, 1, 22030000, 21730000.000000);
insert into HoaDonChiTiet(id_san_pham, id_hoa_don, so_luong, don_gia, don_gia_khuyen_mai) values(69, 93, 1, 26740000, 26440000.000000);
insert into HoaDonChiTiet(id_san_pham, id_hoa_don, so_luong, don_gia, don_gia_khuyen_mai) values(70, 94, 1, 32710000, 32410000.000000);
insert into HoaDonChiTiet(id_san_pham, id_hoa_don, so_luong, don_gia, don_gia_khuyen_mai) values(71, 95, 1, 91470000, 91170000.000000);
insert into HoaDonChiTiet(id_san_pham, id_hoa_don, so_luong, don_gia, don_gia_khuyen_mai) values(72, 96, 1, 62220000, 61920000.000000);
insert into HoaDonChiTiet(id_san_pham, id_hoa_don, so_luong, don_gia, don_gia_khuyen_mai) values(73,97, 1, 28840000, 28540000.000000);
insert into HoaDonChiTiet(id_san_pham, id_hoa_don, so_luong, don_gia, don_gia_khuyen_mai) values(74,98, 1, 28840000, 28540000.000000);
insert into HoaDonChiTiet(id_san_pham, id_hoa_don, so_luong, don_gia, don_gia_khuyen_mai) values(75,99, 1, 43450000, 43150000.000000);
insert into HoaDonChiTiet(id_san_pham, id_hoa_don, so_luong, don_gia, don_gia_khuyen_mai) values(76, 100, 1, 32400000, 32100000.000000);
insert into HoaDonChiTiet(id_san_pham, id_hoa_don, so_luong, don_gia, don_gia_khuyen_mai) values(77, 101, 1, 50500000, 50200000.000000);



select *from HoaDonChiTiet

-- data table HinhThucThanhToan
truncate table HinhThucThanhToan

insert into HinhThucThanhToan(loai_hinh_thanh_toan, id_hoa_don)
values (N'Tiền mặt', 1);
insert into HinhThucThanhToan(loai_hinh_thanh_toan, id_hoa_don)
values (N'Tiền mặt', 2);
insert into HinhThucThanhToan(loai_hinh_thanh_toan, id_hoa_don)
values (N'Tiền mặt', 3);
insert into HinhThucThanhToan(loai_hinh_thanh_toan, id_hoa_don)
values (N'Tiền mặt', 4);
insert into HinhThucThanhToan(loai_hinh_thanh_toan, id_hoa_don)
values (N'Tiền mặt', 5);
insert into HinhThucThanhToan(loai_hinh_thanh_toan, id_hoa_don)
values (N'Tiền mặt', 6);
insert into HinhThucThanhToan(loai_hinh_thanh_toan, id_hoa_don)
values (N'Tiền mặt', 7);
insert into HinhThucThanhToan(loai_hinh_thanh_toan, id_hoa_don)
values (N'Tiền mặt', 8);
insert into HinhThucThanhToan(loai_hinh_thanh_toan, id_hoa_don)
values (N'Tiền mặt', 9);
insert into HinhThucThanhToan(loai_hinh_thanh_toan, id_hoa_don)
values (N'Tiền mặt', 10);
insert into HinhThucThanhToan(loai_hinh_thanh_toan, id_hoa_don)
values (N'Tiền mặt', 11);
insert into HinhThucThanhToan(loai_hinh_thanh_toan, id_hoa_don)
values (N'Tiền mặt và Chuyển khoản', 12);
insert into HinhThucThanhToan(loai_hinh_thanh_toan, id_hoa_don)
values (N'Tiền mặt và Chuyển khoản', 13);
insert into HinhThucThanhToan(loai_hinh_thanh_toan, id_hoa_don)
values (N'Tiền mặt và Chuyển khoản', 14);
insert into HinhThucThanhToan(loai_hinh_thanh_toan, id_hoa_don)
values (N'Tiền mặt và Chuyển khoản', 15);
insert into HinhThucThanhToan(loai_hinh_thanh_toan, id_hoa_don)
values (N'Tiền mặt và Chuyển khoản', 16);
insert into HinhThucThanhToan(loai_hinh_thanh_toan, id_hoa_don)
values (N'Tiền mặt và Chuyển khoản', 17);
insert into HinhThucThanhToan(loai_hinh_thanh_toan, id_hoa_don)
values (N'Tiền mặt và Chuyển khoản', 18);
insert into HinhThucThanhToan(loai_hinh_thanh_toan, id_hoa_don)
values (N'Tiền mặt và Chuyển khoản', 19);
insert into HinhThucThanhToan(loai_hinh_thanh_toan, id_hoa_don)
values (N'Tiền mặt và Chuyển khoản', 20);
insert into HinhThucThanhToan(loai_hinh_thanh_toan, id_hoa_don)
values (N'Tiền mặt và Chuyển khoản', 21);
insert into HinhThucThanhToan(loai_hinh_thanh_toan, id_hoa_don)
values (N'Tiền mặt và Chuyển khoản', 22);
insert into HinhThucThanhToan(loai_hinh_thanh_toan, id_hoa_don)
values (N'Tiền mặt và Chuyển khoản', 23);
insert into HinhThucThanhToan(loai_hinh_thanh_toan, id_hoa_don)
values (N'Tiền mặt và Chuyển khoản', 24);
insert into HinhThucThanhToan(loai_hinh_thanh_toan, id_hoa_don)
values (N'Tiền mặt và Chuyển khoản', 25);
insert into HinhThucThanhToan(loai_hinh_thanh_toan, id_hoa_don)
values (N'Tiền mặt', 26);
insert into HinhThucThanhToan(loai_hinh_thanh_toan, id_hoa_don)
values (N'Tiền mặt', 27);
insert into HinhThucThanhToan(loai_hinh_thanh_toan, id_hoa_don)
values (N'Tiền mặt', 28);
insert into HinhThucThanhToan(loai_hinh_thanh_toan, id_hoa_don)
values (N'Tiền mặt', 29);
insert into HinhThucThanhToan(loai_hinh_thanh_toan, id_hoa_don)
values (N'Tiền mặt', 30);
insert into HinhThucThanhToan(loai_hinh_thanh_toan, id_hoa_don)
values (N'Tiền mặt', 31);
insert into HinhThucThanhToan(loai_hinh_thanh_toan, id_hoa_don)
values (N'Tiền mặt', 32);
insert into HinhThucThanhToan(loai_hinh_thanh_toan, id_hoa_don)
values (N'Tiền mặt', 33);
insert into HinhThucThanhToan(loai_hinh_thanh_toan, id_hoa_don)
values (N'Tiền mặt', 34);
insert into HinhThucThanhToan(loai_hinh_thanh_toan, id_hoa_don)
values (N'Tiền mặt', 35);
insert into HinhThucThanhToan(loai_hinh_thanh_toan, id_hoa_don)
values (N'Tiền mặt', 36);
insert into HinhThucThanhToan(loai_hinh_thanh_toan, id_hoa_don)
values (N'Tiền mặt', 37);
insert into HinhThucThanhToan(loai_hinh_thanh_toan, id_hoa_don)
values (N'Tiền mặt', 38);
insert into HinhThucThanhToan(loai_hinh_thanh_toan, id_hoa_don)
values (N'Tiền mặt', 39);
insert into HinhThucThanhToan(loai_hinh_thanh_toan, id_hoa_don)
values (N'Tiền mặt', 40);
insert into HinhThucThanhToan(loai_hinh_thanh_toan, id_hoa_don)
values (N'Tiền mặt', 41);
insert into HinhThucThanhToan(loai_hinh_thanh_toan, id_hoa_don)
values (N'Tiền mặt', 42);
insert into HinhThucThanhToan(loai_hinh_thanh_toan, id_hoa_don)
values (N'Tiền mặt', 43);
insert into HinhThucThanhToan(loai_hinh_thanh_toan, id_hoa_don)
values (N'Tiền mặt', 44);
insert into HinhThucThanhToan(loai_hinh_thanh_toan, id_hoa_don)
values (N'Tiền mặt', 45);
insert into HinhThucThanhToan(loai_hinh_thanh_toan, id_hoa_don)
values (N'Chuyển khoản', 46);
insert into HinhThucThanhToan(loai_hinh_thanh_toan, id_hoa_don)
values (N'Chuyển khoản', 47);
insert into HinhThucThanhToan(loai_hinh_thanh_toan, id_hoa_don)
values (N'Chuyển khoản', 48);
insert into HinhThucThanhToan(loai_hinh_thanh_toan, id_hoa_don)
values (N'Chuyển khoản', 49);
insert into HinhThucThanhToan(loai_hinh_thanh_toan, id_hoa_don)
values (N'Chuyển khoản', 50);
insert into HinhThucThanhToan(loai_hinh_thanh_toan, id_hoa_don)
values (N'Tiền mặt', 8);
insert into HinhThucThanhToan(loai_hinh_thanh_toan, id_hoa_don)
values (N'Tiền mặt', 51);
insert into HinhThucThanhToan(loai_hinh_thanh_toan, id_hoa_don)
values (N'Tiền mặt', 52);
insert into HinhThucThanhToan(loai_hinh_thanh_toan, id_hoa_don)
values (N'Tiền mặt', 53);
insert into HinhThucThanhToan(loai_hinh_thanh_toan, id_hoa_don)
values (N'Tiền mặt',54);
insert into HinhThucThanhToan(loai_hinh_thanh_toan, id_hoa_don)
values (N'Tiền mặt', 55);
insert into HinhThucThanhToan(loai_hinh_thanh_toan, id_hoa_don)
values (N'Tiền mặt', 56);
insert into HinhThucThanhToan(loai_hinh_thanh_toan, id_hoa_don)
values (N'Tiền mặt', 57);
insert into HinhThucThanhToan(loai_hinh_thanh_toan, id_hoa_don)
values (N'Tiền mặt', 58);
insert into HinhThucThanhToan(loai_hinh_thanh_toan, id_hoa_don)
values (N'Chuyển khoản', 59);
insert into HinhThucThanhToan(loai_hinh_thanh_toan, id_hoa_don)
values (N'Chuyển khoản', 60);
insert into HinhThucThanhToan(loai_hinh_thanh_toan, id_hoa_don)
values (N'Chuyển khoản', 61);
insert into HinhThucThanhToan(loai_hinh_thanh_toan, id_hoa_don)
values (N'Chuyển khoản', 62);
insert into HinhThucThanhToan(loai_hinh_thanh_toan, id_hoa_don)
values (N'Tiền mặt', 63);
insert into HinhThucThanhToan(loai_hinh_thanh_toan, id_hoa_don)
values (N'Tiền mặt', 64);
insert into HinhThucThanhToan(loai_hinh_thanh_toan, id_hoa_don)
values (N'Tiền mặt', 65);
insert into HinhThucThanhToan(loai_hinh_thanh_toan, id_hoa_don)
values (N'Tiền mặt', 66);
insert into HinhThucThanhToan(loai_hinh_thanh_toan, id_hoa_don)
values (N'Tiền mặt', 67);
insert into HinhThucThanhToan(loai_hinh_thanh_toan, id_hoa_don)
values (N'Tiền mặt', 68);
insert into HinhThucThanhToan(loai_hinh_thanh_toan, id_hoa_don)
values (N'Tiền mặt', 69);
insert into HinhThucThanhToan(loai_hinh_thanh_toan, id_hoa_don)
values (N'Tiền mặt', 70);
insert into HinhThucThanhToan(loai_hinh_thanh_toan, id_hoa_don)
values (N'Chuyển khoản', 71);
insert into HinhThucThanhToan(loai_hinh_thanh_toan, id_hoa_don)
values (N'Tiền mặt', 72);
insert into HinhThucThanhToan(loai_hinh_thanh_toan, id_hoa_don)
values (N'Chuyển khoản', 73);
insert into HinhThucThanhToan(loai_hinh_thanh_toan, id_hoa_don)
values (N'Tiền mặt', 74);
insert into HinhThucThanhToan(loai_hinh_thanh_toan, id_hoa_don)
values (N'Tiền mặt', 75);
insert into HinhThucThanhToan(loai_hinh_thanh_toan, id_hoa_don)
values (N'Tiền mặt', 76);
insert into HinhThucThanhToan(loai_hinh_thanh_toan, id_hoa_don)
values (N'Tiền mặt', 77);
insert into HinhThucThanhToan(loai_hinh_thanh_toan, id_hoa_don)
values (N'Chuyển khoản', 78);
insert into HinhThucThanhToan(loai_hinh_thanh_toan, id_hoa_don)
values (N'Chuyển khoản', 79);
insert into HinhThucThanhToan(loai_hinh_thanh_toan, id_hoa_don)
values (N'Tiền mặt', 80);
insert into HinhThucThanhToan(loai_hinh_thanh_toan, id_hoa_don)
values (N'Tiền mặt', 81);
insert into HinhThucThanhToan(loai_hinh_thanh_toan, id_hoa_don)
values (N'Tiền mặt', 82);
insert into HinhThucThanhToan(loai_hinh_thanh_toan, id_hoa_don)
values (N'Tiền mặt', 83);
insert into HinhThucThanhToan(loai_hinh_thanh_toan, id_hoa_don)
values (N'Tiền mặt', 84);
insert into HinhThucThanhToan(loai_hinh_thanh_toan, id_hoa_don)
values (N'Chuyển khoản', 85);
insert into HinhThucThanhToan(loai_hinh_thanh_toan, id_hoa_don)
values (N'Chuyển khoản', 86);
insert into HinhThucThanhToan(loai_hinh_thanh_toan, id_hoa_don)
values (N'Tiền mặt', 87);
insert into HinhThucThanhToan(loai_hinh_thanh_toan, id_hoa_don)
values (N'Tiền mặt', 88);
insert into HinhThucThanhToan(loai_hinh_thanh_toan, id_hoa_don)
values (N'Tiền mặt', 89);
insert into HinhThucThanhToan(loai_hinh_thanh_toan, id_hoa_don)
values (N'Chuyển khoản', 90);
insert into HinhThucThanhToan(loai_hinh_thanh_toan, id_hoa_don)
values (N'Chuyển khoản', 91);
insert into HinhThucThanhToan(loai_hinh_thanh_toan, id_hoa_don)
values (N'Chuyển khoản', 92);
insert into HinhThucThanhToan(loai_hinh_thanh_toan, id_hoa_don)
values (N'Chuyển khoản', 93);
insert into HinhThucThanhToan(loai_hinh_thanh_toan, id_hoa_don)
values (N'Chuyển khoản', 94);
insert into HinhThucThanhToan(loai_hinh_thanh_toan, id_hoa_don)
values (N'Chuyển khoản', 95);
insert into HinhThucThanhToan(loai_hinh_thanh_toan, id_hoa_don)
values (N'Chuyển khoản', 96);
insert into HinhThucThanhToan(loai_hinh_thanh_toan, id_hoa_don)
values (N'Chuyển khoản', 97);
insert into HinhThucThanhToan(loai_hinh_thanh_toan, id_hoa_don)
values (N'Tiền mặt', 98);
insert into HinhThucThanhToan(loai_hinh_thanh_toan, id_hoa_don)
values (N'Tiền mặt', 99);
insert into HinhThucThanhToan(loai_hinh_thanh_toan, id_hoa_don)
values (N'Tiền mặt', 100);
insert into HinhThucThanhToan(loai_hinh_thanh_toan, id_hoa_don)
values (N'Chuyển khoản', 101);

-- data table KhachHang

insert into KhachHang(ma_khach_hang, ho_ten, gioi_tinh, ngay_sinh, so_dien_thoai, email, dia_chi, hinh_anh, ngay_tao, ghi_chu, trang_thai)
values ('KH000001', N'Nguyễn Văn A', 1 , '1992-9-16', '0979075446', 'chiennv@gmail.com', 'Vĩnh Phúc',default, default , N'Không',default);
insert into KhachHang(ma_khach_hang, ho_ten, gioi_tinh, ngay_sinh, so_dien_thoai, email, dia_chi, hinh_anh, ngay_tao, ghi_chu, trang_thai)
values ('KH000002', N'Nguyễn Văn B', 1 , '1992-9-16', '0947468373', 'chiennv@gmail.com', 'Vĩnh Phúc',default, default , N'Không',default);
insert into KhachHang(ma_khach_hang, ho_ten, gioi_tinh, ngay_sinh, so_dien_thoai, email, dia_chi, hinh_anh, ngay_tao, ghi_chu, trang_thai)
values ('KH000003', N'Nguyễn Vân C', 0 , '1992-9-16', '0938236263', 'chiennv@gmail.com', 'Vĩnh Phúc',default, default , N'Không',default);
insert into KhachHang(ma_khach_hang, ho_ten, gioi_tinh, ngay_sinh, so_dien_thoai, email, dia_chi, hinh_anh, ngay_tao, ghi_chu, trang_thai)
values ('KH000004', N'Nguyễn Văn D', 1 , '1992-9-16', '0949847264', 'chiennv@gmail.com', 'Vĩnh Phúc',default, default , N'Không',default);
insert into KhachHang(ma_khach_hang, ho_ten, gioi_tinh, ngay_sinh, so_dien_thoai, email, dia_chi, hinh_anh, ngay_tao, ghi_chu, trang_thai)
values ('KH000005', N'Nguyễn Văn AN', 1 , '1992-9-16', '0921391733', 'chiennv@gmail.com', 'Vĩnh Phúc',default, default , N'Không',default);
insert into KhachHang(ma_khach_hang, ho_ten, gioi_tinh, ngay_sinh, so_dien_thoai, email, dia_chi, hinh_anh, ngay_tao, ghi_chu, trang_thai)
values ('KH000006', N'Nguyễn Văn F', 0 , '1992-9-16', '0932743264', 'chiennv@gmail.com', 'Vĩnh Phúc',default, default , N'Không',default);
insert into KhachHang(ma_khach_hang, ho_ten, gioi_tinh, ngay_sinh, so_dien_thoai, email, dia_chi, hinh_anh, ngay_tao, ghi_chu, trang_thai)
values ('KH000007', N'Nguyễn Văn Q', 1 , '1992-9-16', '0973283982', 'chiennv@gmail.com', 'Vĩnh Phúc',default, default , N'Không',default);
insert into KhachHang(ma_khach_hang, ho_ten, gioi_tinh, ngay_sinh, so_dien_thoai, email, dia_chi, hinh_anh, ngay_tao, ghi_chu, trang_thai)
values ('KH000008', N'Nguyễn Văn A', 1 , '1992-9-16', '0938293972', 'chiennv@gmail.com', 'Vĩnh Phúc',default, default , N'Không',default);
insert into KhachHang(ma_khach_hang, ho_ten, gioi_tinh, ngay_sinh, so_dien_thoai, email, dia_chi, hinh_anh, ngay_tao, ghi_chu, trang_thai)
values ('KH000009', N'Nguyễn Văn B', 1 , '1992-9-16', '0923983823', 'chiennv@gmail.com', 'Vĩnh Phúc',default, default , N'Không',default);
insert into KhachHang(ma_khach_hang, ho_ten, gioi_tinh, ngay_sinh, so_dien_thoai, email, dia_chi, hinh_anh, ngay_tao, ghi_chu, trang_thai)
values ('KH000010', N'Nguyễn Vân C', 0 , '1992-9-16', '0939273422', 'chiennv@gmail.com', 'Vĩnh Phúc',default, default , N'Không',default);
insert into KhachHang(ma_khach_hang, ho_ten, gioi_tinh, ngay_sinh, so_dien_thoai, email, dia_chi, hinh_anh, ngay_tao, ghi_chu, trang_thai)
values ('KH000011', N'Nguyễn Văn D', 1 , '1992-9-16', '0933293773', 'chiennv@gmail.com', 'Vĩnh Phúc',default, default , N'Không',default);
insert into KhachHang(ma_khach_hang, ho_ten, gioi_tinh, ngay_sinh, so_dien_thoai, email, dia_chi, hinh_anh, ngay_tao, ghi_chu, trang_thai)
values ('KH000012', N'Nguyễn Văn AN', 1 , '1992-9-16', '0328732836', 'chiennv@gmail.com', 'Vĩnh Phúc',default, default , N'Không',default);
insert into KhachHang(ma_khach_hang, ho_ten, gioi_tinh, ngay_sinh, so_dien_thoai, email, dia_chi, hinh_anh, ngay_tao, ghi_chu, trang_thai)
values ('KH000013', N'Nguyễn Văn F', 0 , '1992-9-16', '0937273283', 'chiennv@gmail.com', 'Vĩnh Phúc',default, default , N'Không',default);
insert into KhachHang(ma_khach_hang, ho_ten, gioi_tinh, ngay_sinh, so_dien_thoai, email, dia_chi, hinh_anh, ngay_tao, ghi_chu, trang_thai)
values ('KH000014', N'Nguyễn Văn Q', 1 , '1992-9-16', '0938726323', 'chiennv@gmail.com', 'Vĩnh Phúc',default, default , N'Không',default);
insert into KhachHang(ma_khach_hang, ho_ten, gioi_tinh, ngay_sinh, so_dien_thoai, email, dia_chi, hinh_anh, ngay_tao, ghi_chu, trang_thai)
values ('KH000015', N'Nguyễn Văn A', 1 , '1992-9-16', '0932783862', 'chiennv@gmail.com', 'Vĩnh Phúc',default, default , N'Không',default);
insert into KhachHang(ma_khach_hang, ho_ten, gioi_tinh, ngay_sinh, so_dien_thoai, email, dia_chi, hinh_anh, ngay_tao, ghi_chu, trang_thai)
values ('KH000016', N'Nguyễn Văn B', 1 , '1992-9-16', '0921022210', 'chiennv@gmail.com', 'Vĩnh Phúc',default, default , N'Không',default);
insert into KhachHang(ma_khach_hang, ho_ten, gioi_tinh, ngay_sinh, so_dien_thoai, email, dia_chi, hinh_anh, ngay_tao, ghi_chu, trang_thai)
values ('KH000017', N'Nguyễn Vân C', 0 , '1992-9-16', '0932839722', 'chiennv@gmail.com', 'Vĩnh Phúc',default, default , N'Không',default);
insert into KhachHang(ma_khach_hang, ho_ten, gioi_tinh, ngay_sinh, so_dien_thoai, email, dia_chi, hinh_anh, ngay_tao, ghi_chu, trang_thai)
values ('KH000018', N'Nguyễn Văn D', 1 , '1992-9-16', '0936535625', 'chiennv@gmail.com', 'Vĩnh Phúc',default, default , N'Không',default);
insert into KhachHang(ma_khach_hang, ho_ten, gioi_tinh, ngay_sinh, so_dien_thoai, email, dia_chi, hinh_anh, ngay_tao, ghi_chu, trang_thai)
values ('KH000019', N'Nguyễn Văn AN', 1 , '1992-9-16', '0928937283', 'chiennv@gmail.com', 'Vĩnh Phúc',default, default , N'Không',default);
insert into KhachHang(ma_khach_hang, ho_ten, gioi_tinh, ngay_sinh, so_dien_thoai, email, dia_chi, hinh_anh, ngay_tao, ghi_chu, trang_thai)
values ('KH000020', N'Nguyễn Văn F', 0 , '1992-9-16', '0932093009', 'chiennv@gmail.com', 'Vĩnh Phúc',default, default , N'Không',default);
insert into KhachHang(ma_khach_hang, ho_ten, gioi_tinh, ngay_sinh, so_dien_thoai, email, dia_chi, hinh_anh, ngay_tao, ghi_chu, trang_thai)
values ('KH000021', N'Nguyễn Văn Q', 1 , '1992-9-16', '0990697576', 'chiennv@gmail.com', 'Vĩnh Phúc',default, default , N'Không',default);

-- data table ChuongTrinhKhuyenMai
truncate table ChuongTrinhKhuyenMai
insert into ChuongTrinhKhuyenMai(ma_chuong_trinh, ten_chuong_trinh, ngay_bat_dau, ngay_ket_thuc, hinh_thuc_giam_gia, gia_tri_giam, trang_thai)
values ('KM000001', N'Thích thì giảm', '2023-12-01 08:00:00', '2023-12-10 17:30:00', N'Phần trăm', 5, default);
insert into ChuongTrinhKhuyenMai(ma_chuong_trinh, ten_chuong_trinh, ngay_bat_dau, ngay_ket_thuc, hinh_thuc_giam_gia, gia_tri_giam, trang_thai)
values ('KM000002', N'Thích thì giảm 2', '2023-12-01 08:00:00', '2023-12-20 17:30:00', N'Tiền mặt', 300000, default);

select * from ChuongTrinhKhuyenMai


-- data table SanPhamKhuyenMai
truncate table SanPhamKhuyenMai
insert into SanPhamKhuyenMai(id_san_pham, id_chuong_trinh_khuyen_mai) values(1,1);
insert into SanPhamKhuyenMai(id_san_pham, id_chuong_trinh_khuyen_mai) values(2,1);
insert into SanPhamKhuyenMai(id_san_pham, id_chuong_trinh_khuyen_mai) values(3,1);
insert into SanPhamKhuyenMai(id_san_pham, id_chuong_trinh_khuyen_mai) values(4,1);
insert into SanPhamKhuyenMai(id_san_pham, id_chuong_trinh_khuyen_mai) values(5,1);
insert into SanPhamKhuyenMai(id_san_pham, id_chuong_trinh_khuyen_mai) values(6,1);
insert into SanPhamKhuyenMai(id_san_pham, id_chuong_trinh_khuyen_mai) values(7,1);
insert into SanPhamKhuyenMai(id_san_pham, id_chuong_trinh_khuyen_mai) values(8,1);
insert into SanPhamKhuyenMai(id_san_pham, id_chuong_trinh_khuyen_mai) values(9,1);
insert into SanPhamKhuyenMai(id_san_pham, id_chuong_trinh_khuyen_mai) values(10,1);
insert into SanPhamKhuyenMai(id_san_pham, id_chuong_trinh_khuyen_mai) values(11,1);
insert into SanPhamKhuyenMai(id_san_pham, id_chuong_trinh_khuyen_mai) values(12,1);
insert into SanPhamKhuyenMai(id_san_pham, id_chuong_trinh_khuyen_mai) values(13,1);
insert into SanPhamKhuyenMai(id_san_pham, id_chuong_trinh_khuyen_mai) values(14,1);
insert into SanPhamKhuyenMai(id_san_pham, id_chuong_trinh_khuyen_mai) values(15,1);
insert into SanPhamKhuyenMai(id_san_pham, id_chuong_trinh_khuyen_mai) values(16,1);
insert into SanPhamKhuyenMai(id_san_pham, id_chuong_trinh_khuyen_mai) values(17,1);
insert into SanPhamKhuyenMai(id_san_pham, id_chuong_trinh_khuyen_mai) values(18,1);
insert into SanPhamKhuyenMai(id_san_pham, id_chuong_trinh_khuyen_mai) values(19,1);
insert into SanPhamKhuyenMai(id_san_pham, id_chuong_trinh_khuyen_mai) values(20,1);
insert into SanPhamKhuyenMai(id_san_pham, id_chuong_trinh_khuyen_mai) values(21,1);
insert into SanPhamKhuyenMai(id_san_pham, id_chuong_trinh_khuyen_mai) values(22,1);
insert into SanPhamKhuyenMai(id_san_pham, id_chuong_trinh_khuyen_mai) values(23,1);
insert into SanPhamKhuyenMai(id_san_pham, id_chuong_trinh_khuyen_mai) values(24,1);
insert into SanPhamKhuyenMai(id_san_pham, id_chuong_trinh_khuyen_mai) values(25,1);
insert into SanPhamKhuyenMai(id_san_pham, id_chuong_trinh_khuyen_mai) values(26,1);
insert into SanPhamKhuyenMai(id_san_pham, id_chuong_trinh_khuyen_mai) values(27,1);
insert into SanPhamKhuyenMai(id_san_pham, id_chuong_trinh_khuyen_mai) values(28,1);
insert into SanPhamKhuyenMai(id_san_pham, id_chuong_trinh_khuyen_mai) values(29,1);
insert into SanPhamKhuyenMai(id_san_pham, id_chuong_trinh_khuyen_mai) values(30,1);
insert into SanPhamKhuyenMai(id_san_pham, id_chuong_trinh_khuyen_mai) values(31,1);
insert into SanPhamKhuyenMai(id_san_pham, id_chuong_trinh_khuyen_mai) values(32,1);
insert into SanPhamKhuyenMai(id_san_pham, id_chuong_trinh_khuyen_mai) values(33,1);
insert into SanPhamKhuyenMai(id_san_pham, id_chuong_trinh_khuyen_mai) values(34,1);
insert into SanPhamKhuyenMai(id_san_pham, id_chuong_trinh_khuyen_mai) values(35,1);
insert into SanPhamKhuyenMai(id_san_pham, id_chuong_trinh_khuyen_mai) values(36,1);
insert into SanPhamKhuyenMai(id_san_pham, id_chuong_trinh_khuyen_mai) values(37,1);
insert into SanPhamKhuyenMai(id_san_pham, id_chuong_trinh_khuyen_mai) values(38,1);
insert into SanPhamKhuyenMai(id_san_pham, id_chuong_trinh_khuyen_mai) values(39,1);
insert into SanPhamKhuyenMai(id_san_pham, id_chuong_trinh_khuyen_mai) values(40,1);
insert into SanPhamKhuyenMai(id_san_pham, id_chuong_trinh_khuyen_mai) values(41,1);
insert into SanPhamKhuyenMai(id_san_pham, id_chuong_trinh_khuyen_mai) values(42,1);
insert into SanPhamKhuyenMai(id_san_pham, id_chuong_trinh_khuyen_mai) values(43,1);
insert into SanPhamKhuyenMai(id_san_pham, id_chuong_trinh_khuyen_mai) values(44,1);
insert into SanPhamKhuyenMai(id_san_pham, id_chuong_trinh_khuyen_mai) values(45,1);
insert into SanPhamKhuyenMai(id_san_pham, id_chuong_trinh_khuyen_mai) values(46,1);
insert into SanPhamKhuyenMai(id_san_pham, id_chuong_trinh_khuyen_mai) values(47,1);
insert into SanPhamKhuyenMai(id_san_pham, id_chuong_trinh_khuyen_mai) values(48,1);
insert into SanPhamKhuyenMai(id_san_pham, id_chuong_trinh_khuyen_mai) values(49,1);
insert into SanPhamKhuyenMai(id_san_pham, id_chuong_trinh_khuyen_mai) values(50,1);
insert into SanPhamKhuyenMai(id_san_pham, id_chuong_trinh_khuyen_mai) values(51,1);
insert into SanPhamKhuyenMai(id_san_pham, id_chuong_trinh_khuyen_mai) values(52,1);
insert into SanPhamKhuyenMai(id_san_pham, id_chuong_trinh_khuyen_mai) values(53,1);
insert into SanPhamKhuyenMai(id_san_pham, id_chuong_trinh_khuyen_mai) values(54,1);
insert into SanPhamKhuyenMai(id_san_pham, id_chuong_trinh_khuyen_mai) values(55,1);
insert into SanPhamKhuyenMai(id_san_pham, id_chuong_trinh_khuyen_mai) values(56,1);
insert into SanPhamKhuyenMai(id_san_pham, id_chuong_trinh_khuyen_mai) values(57,1);
insert into SanPhamKhuyenMai(id_san_pham, id_chuong_trinh_khuyen_mai) values(58,1);
insert into SanPhamKhuyenMai(id_san_pham, id_chuong_trinh_khuyen_mai) values(59,1);
insert into SanPhamKhuyenMai(id_san_pham, id_chuong_trinh_khuyen_mai) values(60,2);
insert into SanPhamKhuyenMai(id_san_pham, id_chuong_trinh_khuyen_mai) values(61,2);
insert into SanPhamKhuyenMai(id_san_pham, id_chuong_trinh_khuyen_mai) values(62,2);
insert into SanPhamKhuyenMai(id_san_pham, id_chuong_trinh_khuyen_mai) values(63,2);
insert into SanPhamKhuyenMai(id_san_pham, id_chuong_trinh_khuyen_mai) values(64,2);
insert into SanPhamKhuyenMai(id_san_pham, id_chuong_trinh_khuyen_mai) values(65,2);
insert into SanPhamKhuyenMai(id_san_pham, id_chuong_trinh_khuyen_mai) values(66,2);
insert into SanPhamKhuyenMai(id_san_pham, id_chuong_trinh_khuyen_mai) values(67,2);
insert into SanPhamKhuyenMai(id_san_pham, id_chuong_trinh_khuyen_mai) values(68,2);
insert into SanPhamKhuyenMai(id_san_pham, id_chuong_trinh_khuyen_mai) values(69,2);
insert into SanPhamKhuyenMai(id_san_pham, id_chuong_trinh_khuyen_mai) values(70,2);
insert into SanPhamKhuyenMai(id_san_pham, id_chuong_trinh_khuyen_mai) values(71,2);
insert into SanPhamKhuyenMai(id_san_pham, id_chuong_trinh_khuyen_mai) values(72,2);
insert into SanPhamKhuyenMai(id_san_pham, id_chuong_trinh_khuyen_mai) values(73,2);
insert into SanPhamKhuyenMai(id_san_pham, id_chuong_trinh_khuyen_mai) values(74,2);
insert into SanPhamKhuyenMai(id_san_pham, id_chuong_trinh_khuyen_mai) values(75,2);
insert into SanPhamKhuyenMai(id_san_pham, id_chuong_trinh_khuyen_mai) values(76,2);
insert into SanPhamKhuyenMai(id_san_pham, id_chuong_trinh_khuyen_mai) values(77,2);
