USE [master]
GO
/****** Object:  Database [EduSys]    Script Date: 02/03/2022 9:38:12 pm ******/
CREATE DATABASE [EduSys]
GO
USE [EduSys]
GO
/****** Object:  Table [dbo].[ChuyenDe]    Script Date: 02/03/2022 9:38:13 pm ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[ChuyenDe](
	[MaCD] [nchar](5) NOT NULL,
	[TenCD] [nvarchar](50) NOT NULL,
	[HocPhi] [float] NOT NULL,
	[ThoiLuong] [int] NOT NULL,
	[Hinh] [nvarchar](50) NOT NULL,
	[MoTa] [nvarchar](255) NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[MaCD] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Gmail_FaceID]    Script Date: 02/03/2022 9:38:13 pm ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Gmail_FaceID](
	[MANV] [nvarchar](50) NOT NULL,
	[Gmail] [nvarchar](100) NULL,
	[FaceID] [int] IDENTITY(1,1) NOT NULL,
	[MaID] [varchar](50) NULL,
PRIMARY KEY CLUSTERED 
(
	[MANV] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[HocVien]    Script Date: 02/03/2022 9:38:13 pm ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[HocVien](
	[MaHV] [int] IDENTITY(1,1) NOT NULL,
	[MaKH] [int] NOT NULL,
	[MaNH] [nchar](7) NOT NULL,
	[Diem] [float] NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[MaHV] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[KhoaHoc]    Script Date: 02/03/2022 9:38:13 pm ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[KhoaHoc](
	[MaKH] [int] IDENTITY(1,1) NOT NULL,
	[MaCD] [nchar](5) NOT NULL,
	[HocPhi] [float] NOT NULL,
	[ThoiLuong] [int] NOT NULL,
	[NgayKG] [date] NOT NULL,
	[GhiChu] [nvarchar](50) NOT NULL,
	[MaNV] [nvarchar](50) NOT NULL,
	[NgayTao] [date] NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[MaKH] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[NguoiHoc]    Script Date: 02/03/2022 9:38:13 pm ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[NguoiHoc](
	[MaNH] [nchar](7) NOT NULL,
	[HoTen] [nvarchar](50) NOT NULL,
	[NgaySinh] [date] NOT NULL,
	[GioiTinh] [bit] NOT NULL,
	[DienThoai] [nvarchar](50) NOT NULL,
	[Email] [nvarchar](50) NOT NULL,
	[GhiChu] [nvarchar](max) NOT NULL,
	[MaNV] [nvarchar](50) NOT NULL,
	[NgayDK] [date] NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[MaNH] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
/****** Object:  Table [dbo].[NhanVien]    Script Date: 02/03/2022 9:38:13 pm ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[NhanVien](
	[MaNV] [nvarchar](50) NOT NULL,
	[MatKhau] [nvarchar](50) NOT NULL,
	[HoTen] [nvarchar](50) NOT NULL,
	[VaiTro] [bit] NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[MaNV] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
INSERT [dbo].[ChuyenDe] ([MaCD], [TenCD], [HocPhi], [ThoiLuong], [Hinh], [MoTa]) VALUES (N'CD01 ', N'Lap Trinh C', 450, 26, N'C#.png', N'Tuyệt Vời')
GO
INSERT [dbo].[ChuyenDe] ([MaCD], [TenCD], [HocPhi], [ThoiLuong], [Hinh], [MoTa]) VALUES (N'JAV01', N'Lập trình Java cơ bản', 300, 90, N'codeqrlogin.png', N'JAV01 - Lập trình Java cơ bản')
GO
INSERT [dbo].[ChuyenDe] ([MaCD], [TenCD], [HocPhi], [ThoiLuong], [Hinh], [MoTa]) VALUES (N'JAV02', N'Lập trình Java nâng cao', 300, 90, N'HTCS.jpg', N'JAV02 - Lập trình Java nâng cao')
GO
INSERT [dbo].[ChuyenDe] ([MaCD], [TenCD], [HocPhi], [ThoiLuong], [Hinh], [MoTa]) VALUES (N'JAV03', N'Lập trình mạng với Java', 200, 70, N'INMA.jpg', N'JAV03 - Lập trình mạng với Java')
GO
INSERT [dbo].[ChuyenDe] ([MaCD], [TenCD], [HocPhi], [ThoiLuong], [Hinh], [MoTa]) VALUES (N'JAV04', N'Lập trình desktop với Swing', 200, 70, N'LAYO.jpg', N'JAV04 - Lập trình desktop với Swing')
GO
INSERT [dbo].[ChuyenDe] ([MaCD], [TenCD], [HocPhi], [ThoiLuong], [Hinh], [MoTa]) VALUES (N'PRO01', N'Dự án với công nghệ MS.NET MVC', 300, 90, N'MOWE.png', N'PRO01 - Dự án với công nghệ MS.NET MVC')
GO
INSERT [dbo].[ChuyenDe] ([MaCD], [TenCD], [HocPhi], [ThoiLuong], [Hinh], [MoTa]) VALUES (N'PRO02', N'Dự án với công nghệ Spring MVC', 300, 90, N'Subject.png', N'PRO02 - Dự án với công nghệ Spring MVC')
GO
INSERT [dbo].[ChuyenDe] ([MaCD], [TenCD], [HocPhi], [ThoiLuong], [Hinh], [MoTa]) VALUES (N'PRO03', N'Dự án với công nghệ Servlet/JSP', 300, 90, N'GAME.png', N'PRO03 - Dự án với công nghệ Servlet/JSP')
GO
INSERT [dbo].[ChuyenDe] ([MaCD], [TenCD], [HocPhi], [ThoiLuong], [Hinh], [MoTa]) VALUES (N'PRO04', N'Dự án với AngularJS & WebAPI', 300, 90, N'HTCS.jpg', N'PRO04 - Dự án với AngularJS & WebAPI')
GO
INSERT [dbo].[ChuyenDe] ([MaCD], [TenCD], [HocPhi], [ThoiLuong], [Hinh], [MoTa]) VALUES (N'PRO05', N'Dự án với Swing & JDBC', 300, 90, N'INMA.jpg', N'PRO05 - Dự án với Swing & JDBC')
GO
INSERT [dbo].[ChuyenDe] ([MaCD], [TenCD], [HocPhi], [ThoiLuong], [Hinh], [MoTa]) VALUES (N'PRO06', N'Dự án với WindowForm', 300, 90, N'LAYO.jpg', N'PRO06 - Dự án với WindowForm')
GO
INSERT [dbo].[ChuyenDe] ([MaCD], [TenCD], [HocPhi], [ThoiLuong], [Hinh], [MoTa]) VALUES (N'RDB01', N'Cơ sở dữ liệu SQL Server', 100, 50, N'MOWE.png', N'RDB01 - Cơ sở dữ liệu SQL Server')
GO
INSERT [dbo].[ChuyenDe] ([MaCD], [TenCD], [HocPhi], [ThoiLuong], [Hinh], [MoTa]) VALUES (N'RDB02', N'Lập trình JDBC', 150, 60, N'Subject.png', N'RDB02 - Lập trình JDBC')
GO
INSERT [dbo].[ChuyenDe] ([MaCD], [TenCD], [HocPhi], [ThoiLuong], [Hinh], [MoTa]) VALUES (N'RDB03', N'Lập trình cơ sở dữ liệu Hibernate', 250, 80, N'GAME.png', N'RDB03 - Lập trình cơ sở dữ liệu Hibernate')
GO
INSERT [dbo].[ChuyenDe] ([MaCD], [TenCD], [HocPhi], [ThoiLuong], [Hinh], [MoTa]) VALUES (N'SER01', N'Lập trình web với Servlet/JSP', 350, 100, N'HTCS.jpg', N'SER01 - Lập trình web với Servlet/JSP')
GO
INSERT [dbo].[ChuyenDe] ([MaCD], [TenCD], [HocPhi], [ThoiLuong], [Hinh], [MoTa]) VALUES (N'SER02', N'Lập trình Spring MVC', 400, 110, N'INMA.jpg', N'SER02 - Lập trình Spring MVC')
GO
INSERT [dbo].[ChuyenDe] ([MaCD], [TenCD], [HocPhi], [ThoiLuong], [Hinh], [MoTa]) VALUES (N'SER03', N'Lập trình MS.NET MVC', 400, 110, N'LAYO.jpg', N'SER03 - Lập trình MS.NET MVC')
GO
INSERT [dbo].[ChuyenDe] ([MaCD], [TenCD], [HocPhi], [ThoiLuong], [Hinh], [MoTa]) VALUES (N'SER04', N'Xây dựng Web API với Spring MVC & ASP.NET MVC', 200, 70, N'MOWE.png', N'SER04 - Xây dựng Web API với Spring MVC & ASP.NET MVC')
GO
INSERT [dbo].[ChuyenDe] ([MaCD], [TenCD], [HocPhi], [ThoiLuong], [Hinh], [MoTa]) VALUES (N'WEB01', N'Thiết kế web với HTML và CSS', 200, 70, N'Subject.png', N'WEB01 - Thiết kế web với HTML và CSS')
GO
INSERT [dbo].[ChuyenDe] ([MaCD], [TenCD], [HocPhi], [ThoiLuong], [Hinh], [MoTa]) VALUES (N'WEB02', N'Thiết kế web với Bootstrap', 0, 40, N'GAME.png', N'WEB02 - Thiết kế web với Bootstrap')
GO
INSERT [dbo].[ChuyenDe] ([MaCD], [TenCD], [HocPhi], [ThoiLuong], [Hinh], [MoTa]) VALUES (N'WEB03', N'Lập trình front-end với JavaScript và jQuery', 150, 60, N'HTCS.jpg', N'WEB03 - Lập trình front-end với JavaScript và jQuery')
GO
INSERT [dbo].[ChuyenDe] ([MaCD], [TenCD], [HocPhi], [ThoiLuong], [Hinh], [MoTa]) VALUES (N'WEB04', N'Lập trình AngularJS', 250, 80, N'INMA.jpg', N'WEB04 - Lập trình AngularJS')
GO
SET IDENTITY_INSERT [dbo].[Gmail_FaceID] ON 
GO
INSERT [dbo].[Gmail_FaceID] ([MANV], [Gmail], [FaceID], [MaID]) VALUES (N'fpt', N'duongdtph18761@fpt.edu.vn', 1, N'True:DongDuong')
GO
INSERT [dbo].[Gmail_FaceID] ([MANV], [Gmail], [FaceID], [MaID]) VALUES (N'nv01', N'98taeyang@gmail.com', 2, N'xxxTrue:DongDuong')
GO
SET IDENTITY_INSERT [dbo].[Gmail_FaceID] OFF
GO
SET IDENTITY_INSERT [dbo].[HocVien] ON 
GO
INSERT [dbo].[HocVien] ([MaHV], [MaKH], [MaNH], [Diem]) VALUES (1000, 102, N'NH001  ', 7.8000001907348633)
GO
INSERT [dbo].[HocVien] ([MaHV], [MaKH], [MaNH], [Diem]) VALUES (1006, 106, N'NH002  ', 9)
GO
INSERT [dbo].[HocVien] ([MaHV], [MaKH], [MaNH], [Diem]) VALUES (1007, 106, N'NH003  ', 8)
GO
INSERT [dbo].[HocVien] ([MaHV], [MaKH], [MaNH], [Diem]) VALUES (1008, 124, N'NH001  ', 0)
GO
INSERT [dbo].[HocVien] ([MaHV], [MaKH], [MaNH], [Diem]) VALUES (1009, 124, N'NH002  ', 0)
GO
INSERT [dbo].[HocVien] ([MaHV], [MaKH], [MaNH], [Diem]) VALUES (1010, 102, N'NH002  ', 10)
GO
INSERT [dbo].[HocVien] ([MaHV], [MaKH], [MaNH], [Diem]) VALUES (1012, 129, N'NH003  ', 9)
GO
INSERT [dbo].[HocVien] ([MaHV], [MaKH], [MaNH], [Diem]) VALUES (1013, 102, N'NH003  ', 9)
GO
INSERT [dbo].[HocVien] ([MaHV], [MaKH], [MaNH], [Diem]) VALUES (1014, 102, N'NH005  ', 8.8000001907348633)
GO
INSERT [dbo].[HocVien] ([MaHV], [MaKH], [MaNH], [Diem]) VALUES (1015, 102, N'NH007  ', 9.9899997711181641)
GO
SET IDENTITY_INSERT [dbo].[HocVien] OFF
GO
SET IDENTITY_INSERT [dbo].[KhoaHoc] ON 
GO
INSERT [dbo].[KhoaHoc] ([MaKH], [MaCD], [HocPhi], [ThoiLuong], [NgayKG], [GhiChu], [MaNV], [NgayTao]) VALUES (102, N'CD01 ', 450, 26, CAST(N'2022-02-28' AS Date), N'Không Có', N'nv01', CAST(N'2022-02-10' AS Date))
GO
INSERT [dbo].[KhoaHoc] ([MaKH], [MaCD], [HocPhi], [ThoiLuong], [NgayKG], [GhiChu], [MaNV], [NgayTao]) VALUES (106, N'CD01 ', 450, 26, CAST(N'2019-10-10' AS Date), N'Không Có', N'fpt', CAST(N'2021-09-10' AS Date))
GO
INSERT [dbo].[KhoaHoc] ([MaKH], [MaCD], [HocPhi], [ThoiLuong], [NgayKG], [GhiChu], [MaNV], [NgayTao]) VALUES (112, N'CD01 ', 7500000, 72, CAST(N'2021-10-10' AS Date), N'Không Có', N'nv01', CAST(N'2021-09-10' AS Date))
GO
INSERT [dbo].[KhoaHoc] ([MaKH], [MaCD], [HocPhi], [ThoiLuong], [NgayKG], [GhiChu], [MaNV], [NgayTao]) VALUES (114, N'CD01 ', 7500000, 72, CAST(N'2021-10-13' AS Date), N'Không Có', N'nv01', CAST(N'2021-09-10' AS Date))
GO
INSERT [dbo].[KhoaHoc] ([MaKH], [MaCD], [HocPhi], [ThoiLuong], [NgayKG], [GhiChu], [MaNV], [NgayTao]) VALUES (115, N'CD01 ', 4500000, 16, CAST(N'2022-02-21' AS Date), N'Không Có', N'nv01', CAST(N'2022-02-21' AS Date))
GO
INSERT [dbo].[KhoaHoc] ([MaKH], [MaCD], [HocPhi], [ThoiLuong], [NgayKG], [GhiChu], [MaNV], [NgayTao]) VALUES (116, N'CD01 ', 4500000, 16, CAST(N'2022-02-21' AS Date), N'Không Có', N'nv01', CAST(N'2022-02-21' AS Date))
GO
INSERT [dbo].[KhoaHoc] ([MaKH], [MaCD], [HocPhi], [ThoiLuong], [NgayKG], [GhiChu], [MaNV], [NgayTao]) VALUES (117, N'CD01 ', 4500000, 16, CAST(N'2022-02-21' AS Date), N'Không Có', N'nv01', CAST(N'2022-02-21' AS Date))
GO
INSERT [dbo].[KhoaHoc] ([MaKH], [MaCD], [HocPhi], [ThoiLuong], [NgayKG], [GhiChu], [MaNV], [NgayTao]) VALUES (118, N'CD01 ', 4500000, 16, CAST(N'2022-02-21' AS Date), N'zedadas', N'nv01', CAST(N'2022-02-21' AS Date))
GO
INSERT [dbo].[KhoaHoc] ([MaKH], [MaCD], [HocPhi], [ThoiLuong], [NgayKG], [GhiChu], [MaNV], [NgayTao]) VALUES (119, N'CD01 ', 4500000, 19, CAST(N'2022-02-21' AS Date), N'Không Có', N'nv01', CAST(N'2022-02-21' AS Date))
GO
INSERT [dbo].[KhoaHoc] ([MaKH], [MaCD], [HocPhi], [ThoiLuong], [NgayKG], [GhiChu], [MaNV], [NgayTao]) VALUES (120, N'CD01 ', 4500000, 199, CAST(N'2022-02-21' AS Date), N'zedadas', N'nv01', CAST(N'2022-02-21' AS Date))
GO
INSERT [dbo].[KhoaHoc] ([MaKH], [MaCD], [HocPhi], [ThoiLuong], [NgayKG], [GhiChu], [MaNV], [NgayTao]) VALUES (121, N'CD01 ', 4500000, 169, CAST(N'2022-02-21' AS Date), N'Không Có', N'nv01', CAST(N'2022-02-21' AS Date))
GO
INSERT [dbo].[KhoaHoc] ([MaKH], [MaCD], [HocPhi], [ThoiLuong], [NgayKG], [GhiChu], [MaNV], [NgayTao]) VALUES (124, N'JAV01', 450, 66, CAST(N'2022-03-01' AS Date), N'khong có', N'nv01', CAST(N'2022-02-26' AS Date))
GO
INSERT [dbo].[KhoaHoc] ([MaKH], [MaCD], [HocPhi], [ThoiLuong], [NgayKG], [GhiChu], [MaNV], [NgayTao]) VALUES (125, N'CD01 ', 450, 26, CAST(N'2022-03-01' AS Date), N'Không Có', N'nv01', CAST(N'2022-03-01' AS Date))
GO
INSERT [dbo].[KhoaHoc] ([MaKH], [MaCD], [HocPhi], [ThoiLuong], [NgayKG], [GhiChu], [MaNV], [NgayTao]) VALUES (126, N'CD01 ', 450, 26, CAST(N'2021-05-01' AS Date), N'Không Có', N'nv01', CAST(N'2021-05-15' AS Date))
GO
INSERT [dbo].[KhoaHoc] ([MaKH], [MaCD], [HocPhi], [ThoiLuong], [NgayKG], [GhiChu], [MaNV], [NgayTao]) VALUES (127, N'CD01 ', 450, 26, CAST(N'2022-03-01' AS Date), N'Không Có', N'nv01', CAST(N'2022-03-01' AS Date))
GO
INSERT [dbo].[KhoaHoc] ([MaKH], [MaCD], [HocPhi], [ThoiLuong], [NgayKG], [GhiChu], [MaNV], [NgayTao]) VALUES (128, N'CD01 ', 450, 26, CAST(N'2021-03-01' AS Date), N'Không Có', N'fpt', CAST(N'2020-03-01' AS Date))
GO
INSERT [dbo].[KhoaHoc] ([MaKH], [MaCD], [HocPhi], [ThoiLuong], [NgayKG], [GhiChu], [MaNV], [NgayTao]) VALUES (129, N'JAV02', 300, 90, CAST(N'2022-03-15' AS Date), N'Java nâng Cao', N'fpt', CAST(N'2022-03-02' AS Date))
GO
SET IDENTITY_INSERT [dbo].[KhoaHoc] OFF
GO
INSERT [dbo].[NguoiHoc] ([MaNH], [HoTen], [NgaySinh], [GioiTinh], [DienThoai], [Email], [GhiChu], [MaNV], [NgayDK]) VALUES (N'NH001  ', N'Đồng Thái Dương', CAST(N'2002-10-11' AS Date), 1, N'0528192718', N'facebook.dongduong02@gmail.com', N'con chủ tịch', N'hs01', CAST(N'2022-02-06' AS Date))
GO
INSERT [dbo].[NguoiHoc] ([MaNH], [HoTen], [NgaySinh], [GioiTinh], [DienThoai], [Email], [GhiChu], [MaNV], [NgayDK]) VALUES (N'NH002  ', N'Đồng Thùy Dương', CAST(N'2001-12-11' AS Date), 0, N'0528192718', N'thuyduongcute@gmail.com', N'con chủ tịch', N'fpt', CAST(N'2022-03-01' AS Date))
GO
INSERT [dbo].[NguoiHoc] ([MaNH], [HoTen], [NgaySinh], [GioiTinh], [DienThoai], [Email], [GhiChu], [MaNV], [NgayDK]) VALUES (N'NH003  ', N'Nguyễn Tiến Zõ', CAST(N'1997-01-10' AS Date), 1, N'01254455877', N'danglachanly@gmail.com', N'Anh chủ tịch', N'fpt', CAST(N'2022-03-01' AS Date))
GO
INSERT [dbo].[NguoiHoc] ([MaNH], [HoTen], [NgaySinh], [GioiTinh], [DienThoai], [Email], [GhiChu], [MaNV], [NgayDK]) VALUES (N'NH005  ', N'Mai Xuân Thèn', CAST(N'1997-10-01' AS Date), 1, N'054221254712', N'thanhPO@gmail.com', N'Không Có', N'fpt', CAST(N'2022-03-01' AS Date))
GO
INSERT [dbo].[NguoiHoc] ([MaNH], [HoTen], [NgaySinh], [GioiTinh], [DienThoai], [Email], [GhiChu], [MaNV], [NgayDK]) VALUES (N'NH007  ', N'Nguyễn Thị Hương', CAST(N'2000-10-01' AS Date), 0, N'0528190000', N'huoingteasx@gmail.com', N'Khooing Có', N'fpt', CAST(N'2022-03-01' AS Date))
GO
INSERT [dbo].[NguoiHoc] ([MaNH], [HoTen], [NgaySinh], [GioiTinh], [DienThoai], [Email], [GhiChu], [MaNV], [NgayDK]) VALUES (N'NH008  ', N'Bùi Phương Linh', CAST(N'2002-10-11' AS Date), 0, N'05521250000', N'linhlinhlinh@gmail.com', N'Không Có', N'fpt', CAST(N'2022-03-01' AS Date))
GO
INSERT [dbo].[NguoiHoc] ([MaNH], [HoTen], [NgaySinh], [GioiTinh], [DienThoai], [Email], [GhiChu], [MaNV], [NgayDK]) VALUES (N'NH009  ', N'Nông Văn Đạt', CAST(N'1997-10-11' AS Date), 1, N'055212550145', N'datprovjp09@gmail.com', N'Không Có', N'fpt', CAST(N'2022-03-01' AS Date))
GO
INSERT [dbo].[NhanVien] ([MaNV], [MatKhau], [HoTen], [VaiTro]) VALUES (N'fpt', N'123', N'Đồng Thái Dương', 1)
GO
INSERT [dbo].[NhanVien] ([MaNV], [MatKhau], [HoTen], [VaiTro]) VALUES (N'fpt7', N'123456789Ad', N'Mai Xuân Thành', 1)
GO
INSERT [dbo].[NhanVien] ([MaNV], [MatKhau], [HoTen], [VaiTro]) VALUES (N'hs01', N'456', N'Đồng Thái Dương', 0)
GO
INSERT [dbo].[NhanVien] ([MaNV], [MatKhau], [HoTen], [VaiTro]) VALUES (N'meosimmy', N'D123456789d', N'Mèo Simmy', 1)
GO
INSERT [dbo].[NhanVien] ([MaNV], [MatKhau], [HoTen], [VaiTro]) VALUES (N'nv01', N'123', N'Đồng Thái Dương', 0)
GO
INSERT [dbo].[NhanVien] ([MaNV], [MatKhau], [HoTen], [VaiTro]) VALUES (N'ph02', N'Dd123456789', N'Nguyễn Tiến Zõ', 0)
GO
INSERT [dbo].[NhanVien] ([MaNV], [MatKhau], [HoTen], [VaiTro]) VALUES (N'ph03', N'Dd123456789dat09', N'Nông Văn Đạt', 0)
GO
INSERT [dbo].[NhanVien] ([MaNV], [MatKhau], [HoTen], [VaiTro]) VALUES (N'ph04', N'Dd123456789', N'Nguyễn Thị Hương', 1)
GO
ALTER TABLE [dbo].[Gmail_FaceID]  WITH CHECK ADD FOREIGN KEY([MANV])
REFERENCES [dbo].[NhanVien] ([MaNV])
GO
ALTER TABLE [dbo].[HocVien]  WITH CHECK ADD FOREIGN KEY([MaKH])
REFERENCES [dbo].[KhoaHoc] ([MaKH])
ON UPDATE CASCADE
GO
ALTER TABLE [dbo].[HocVien]  WITH CHECK ADD FOREIGN KEY([MaNH])
REFERENCES [dbo].[NguoiHoc] ([MaNH])
ON DELETE CASCADE
GO
ALTER TABLE [dbo].[KhoaHoc]  WITH CHECK ADD FOREIGN KEY([MaCD])
REFERENCES [dbo].[ChuyenDe] ([MaCD])
ON UPDATE CASCADE
GO
ALTER TABLE [dbo].[KhoaHoc]  WITH CHECK ADD FOREIGN KEY([MaNV])
REFERENCES [dbo].[NhanVien] ([MaNV])
ON UPDATE CASCADE
GO
ALTER TABLE [dbo].[NguoiHoc]  WITH CHECK ADD FOREIGN KEY([MaNV])
REFERENCES [dbo].[NhanVien] ([MaNV])
ON UPDATE CASCADE
GO
/****** Object:  StoredProcedure [dbo].[sp_BangDiem]    Script Date: 02/03/2022 9:38:13 pm ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE PROC [dbo].[sp_BangDiem](@MaKH INT)
AS BEGIN
	SELECT
		nh.MaNH,
		nh.HoTen,
		hv.Diem
	FROM HOCVIEN hv
		JOIN NGUOIHOC nh ON nh.MaNH=hv.MaNH
	WHERE hv.MaKH = @MaKH
	ORDER BY hv.Diem DESC
END
GO
/****** Object:  StoredProcedure [dbo].[sp_ThongKeDiem]    Script Date: 02/03/2022 9:38:13 pm ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
--tạo thủ tục lưu thống kê điểm
CREATE PROC [dbo].[sp_ThongKeDiem]
AS BEGIN
	SELECT
		TenCD ChuyenDe,
		COUNT(MaHV) SoHV,
		MIN(Diem) ThapNhat,
		MAX(Diem) CaoNhat,
		AVG(Diem) TrungBinh
	FROM KhoaHoc kh
		JOIN HocVien hv ON kh.MaKH=hv.MaKH
		JOIN ChuyenDe cd ON cd.MaCD=kh.MaCD
	GROUP BY TenCD
END
GO
/****** Object:  StoredProcedure [dbo].[sp_ThongKeDoanhThu]    Script Date: 02/03/2022 9:38:13 pm ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
--tạo thủ tục lưu thống kê điểm
CREATE PROC [dbo].[sp_ThongKeDoanhThu](@Year INT)
AS BEGIN
	SELECT
		TenCD ChuyenDe,
		COUNT(DISTINCT kh.MaKH) SoKH,
		COUNT(hv.MaHV) SoHV,
		SUM(kh.HocPhi) DoanhThu,
		MIN(kh.HocPhi) ThapNhat,
		MAX(kh.HocPhi) CaoNhat,
		AVG(kh.HocPhi) TrungBinh
	FROM KHOAHOC kh
		JOIN HOCVIEN hv ON kh.MaKH=hv.MaKH
		JOIN CHUYENDE cd ON cd.MaCD=kh.MaCD
	WHERE YEAR(NgayKG) = @Year
	GROUP BY TenCD
END
GO
/****** Object:  StoredProcedure [dbo].[sp_ThongKeNguoiHoc]    Script Date: 02/03/2022 9:38:13 pm ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
--tạo thủ tục lưu thống kê người học
CREATE PROC [dbo].[sp_ThongKeNguoiHoc]
AS BEGIN
	SELECT
		YEAR(NgayDK) Nam,
		COUNT(*) SoLuong,
		MIN(NgayDK) DauTien,
		MAX(NgayDK) CuoiCung
	FROM NGUOIHOC
	GROUP BY YEAR(NgayDK)
END
GO
USE [master]
GO
ALTER DATABASE [EduSys] SET  READ_WRITE 
GO
