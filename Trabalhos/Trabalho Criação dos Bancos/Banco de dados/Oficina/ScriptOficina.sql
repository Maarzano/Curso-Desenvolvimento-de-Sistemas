USE [master]
GO
/****** Object:  Database [OFICINA03]    Script Date: 12/12/2024 21:30:04 ******/
CREATE DATABASE [OFICINA03]
 CONTAINMENT = NONE
 ON  PRIMARY 
( NAME = N'OFICINA03', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL16.SQLEXPRESS\MSSQL\DATA\OFICINA03.mdf' , SIZE = 8192KB , MAXSIZE = UNLIMITED, FILEGROWTH = 65536KB )
 LOG ON 
( NAME = N'OFICINA03_log', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL16.SQLEXPRESS\MSSQL\DATA\OFICINA03_log.ldf' , SIZE = 8192KB , MAXSIZE = 2048GB , FILEGROWTH = 65536KB )
 WITH CATALOG_COLLATION = DATABASE_DEFAULT, LEDGER = OFF
GO
ALTER DATABASE [OFICINA03] SET COMPATIBILITY_LEVEL = 160
GO
IF (1 = FULLTEXTSERVICEPROPERTY('IsFullTextInstalled'))
begin
EXEC [OFICINA03].[dbo].[sp_fulltext_database] @action = 'enable'
end
GO
ALTER DATABASE [OFICINA03] SET ANSI_NULL_DEFAULT OFF 
GO
ALTER DATABASE [OFICINA03] SET ANSI_NULLS OFF 
GO
ALTER DATABASE [OFICINA03] SET ANSI_PADDING OFF 
GO
ALTER DATABASE [OFICINA03] SET ANSI_WARNINGS OFF 
GO
ALTER DATABASE [OFICINA03] SET ARITHABORT OFF 
GO
ALTER DATABASE [OFICINA03] SET AUTO_CLOSE ON 
GO
ALTER DATABASE [OFICINA03] SET AUTO_SHRINK OFF 
GO
ALTER DATABASE [OFICINA03] SET AUTO_UPDATE_STATISTICS ON 
GO
ALTER DATABASE [OFICINA03] SET CURSOR_CLOSE_ON_COMMIT OFF 
GO
ALTER DATABASE [OFICINA03] SET CURSOR_DEFAULT  GLOBAL 
GO
ALTER DATABASE [OFICINA03] SET CONCAT_NULL_YIELDS_NULL OFF 
GO
ALTER DATABASE [OFICINA03] SET NUMERIC_ROUNDABORT OFF 
GO
ALTER DATABASE [OFICINA03] SET QUOTED_IDENTIFIER OFF 
GO
ALTER DATABASE [OFICINA03] SET RECURSIVE_TRIGGERS OFF 
GO
ALTER DATABASE [OFICINA03] SET  ENABLE_BROKER 
GO
ALTER DATABASE [OFICINA03] SET AUTO_UPDATE_STATISTICS_ASYNC OFF 
GO
ALTER DATABASE [OFICINA03] SET DATE_CORRELATION_OPTIMIZATION OFF 
GO
ALTER DATABASE [OFICINA03] SET TRUSTWORTHY OFF 
GO
ALTER DATABASE [OFICINA03] SET ALLOW_SNAPSHOT_ISOLATION OFF 
GO
ALTER DATABASE [OFICINA03] SET PARAMETERIZATION SIMPLE 
GO
ALTER DATABASE [OFICINA03] SET READ_COMMITTED_SNAPSHOT OFF 
GO
ALTER DATABASE [OFICINA03] SET HONOR_BROKER_PRIORITY OFF 
GO
ALTER DATABASE [OFICINA03] SET RECOVERY SIMPLE 
GO
ALTER DATABASE [OFICINA03] SET  MULTI_USER 
GO
ALTER DATABASE [OFICINA03] SET PAGE_VERIFY CHECKSUM  
GO
ALTER DATABASE [OFICINA03] SET DB_CHAINING OFF 
GO
ALTER DATABASE [OFICINA03] SET FILESTREAM( NON_TRANSACTED_ACCESS = OFF ) 
GO
ALTER DATABASE [OFICINA03] SET TARGET_RECOVERY_TIME = 60 SECONDS 
GO
ALTER DATABASE [OFICINA03] SET DELAYED_DURABILITY = DISABLED 
GO
ALTER DATABASE [OFICINA03] SET ACCELERATED_DATABASE_RECOVERY = OFF  
GO
ALTER DATABASE [OFICINA03] SET QUERY_STORE = ON
GO
ALTER DATABASE [OFICINA03] SET QUERY_STORE (OPERATION_MODE = READ_WRITE, CLEANUP_POLICY = (STALE_QUERY_THRESHOLD_DAYS = 30), DATA_FLUSH_INTERVAL_SECONDS = 900, INTERVAL_LENGTH_MINUTES = 60, MAX_STORAGE_SIZE_MB = 1000, QUERY_CAPTURE_MODE = AUTO, SIZE_BASED_CLEANUP_MODE = AUTO, MAX_PLANS_PER_QUERY = 200, WAIT_STATS_CAPTURE_MODE = ON)
GO
USE [OFICINA03]
GO
/****** Object:  Table [dbo].[Cliente]    Script Date: 12/12/2024 21:30:04 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Cliente](
	[IDcliente] [int] IDENTITY(1,1) NOT NULL,
	[CEP] [varchar](50) NULL,
	[TELEFONE] [int] NULL,
	[CPF] [varchar](11) NULL,
	[Nome] [varchar](50) NULL,
PRIMARY KEY CLUSTERED 
(
	[IDcliente] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[CLT]    Script Date: 12/12/2024 21:30:04 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[CLT](
	[IDclt] [int] IDENTITY(1,1) NOT NULL,
	[CEP] [varchar](50) NULL,
	[Telefone] [varchar](15) NULL,
	[CPF] [varchar](11) NULL,
PRIMARY KEY CLUSTERED 
(
	[IDclt] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[OrdemServiço]    Script Date: 12/12/2024 21:30:04 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[OrdemServiço](
	[IDordem] [int] IDENTITY(1,1) NOT NULL,
	[StatusServ] [varchar](20) NULL,
	[IDveiculo] [int] NULL,
	[IDserviços] [int] NULL,
	[IDclt] [int] NULL,
PRIMARY KEY CLUSTERED 
(
	[IDordem] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Serviços]    Script Date: 12/12/2024 21:30:04 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Serviços](
	[IDserviços] [int] IDENTITY(1,1) NOT NULL,
	[ServiçoSele] [varchar](50) NULL,
	[Valor] [money] NULL,
PRIMARY KEY CLUSTERED 
(
	[IDserviços] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Veiculo]    Script Date: 12/12/2024 21:30:04 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Veiculo](
	[IDveiculo] [int] IDENTITY(1,1) NOT NULL,
	[Modelo] [varchar](50) NULL,
	[Placa] [varchar](7) NULL,
	[IDcliente] [int] NULL,
PRIMARY KEY CLUSTERED 
(
	[IDveiculo] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
SET IDENTITY_INSERT [dbo].[Cliente] ON 

INSERT [dbo].[Cliente] ([IDcliente], [CEP], [TELEFONE], [CPF], [Nome]) VALUES (1, N'12345-678', 912345678, N'12345678901', N'João Silva')
INSERT [dbo].[Cliente] ([IDcliente], [CEP], [TELEFONE], [CPF], [Nome]) VALUES (2, N'98765-432', 987654321, N'98765432100', N'Maria Oliveira')
INSERT [dbo].[Cliente] ([IDcliente], [CEP], [TELEFONE], [CPF], [Nome]) VALUES (3, N'54321-876', 934567890, N'45678912345', N'Carlos Pereira')
INSERT [dbo].[Cliente] ([IDcliente], [CEP], [TELEFONE], [CPF], [Nome]) VALUES (4, N'11223-445', 963258745, N'11223344556', N'Fernanda Costa')
INSERT [dbo].[Cliente] ([IDcliente], [CEP], [TELEFONE], [CPF], [Nome]) VALUES (5, N'66777-889', 912347654, N'66778899001', N'Pedro Santos')
INSERT [dbo].[Cliente] ([IDcliente], [CEP], [TELEFONE], [CPF], [Nome]) VALUES (6, N'23456-789', 998765432, N'23456789012', N'Luciana Almeida')
INSERT [dbo].[Cliente] ([IDcliente], [CEP], [TELEFONE], [CPF], [Nome]) VALUES (7, N'34567-890', 934567890, N'34567890123', N'Marcos Lima')
INSERT [dbo].[Cliente] ([IDcliente], [CEP], [TELEFONE], [CPF], [Nome]) VALUES (8, N'45678-901', 912346789, N'45678901234', N'Juliana Souza')
INSERT [dbo].[Cliente] ([IDcliente], [CEP], [TELEFONE], [CPF], [Nome]) VALUES (9, N'56789-012', 987654321, N'56789012345', N'Paulo Costa')
INSERT [dbo].[Cliente] ([IDcliente], [CEP], [TELEFONE], [CPF], [Nome]) VALUES (10, N'67890-123', 923456789, N'67890123456', N'Tatiane Rocha')
INSERT [dbo].[Cliente] ([IDcliente], [CEP], [TELEFONE], [CPF], [Nome]) VALUES (11, N'78901-234', 934567890, N'78901234567', N'Felipe Martins')
INSERT [dbo].[Cliente] ([IDcliente], [CEP], [TELEFONE], [CPF], [Nome]) VALUES (12, N'89012-345', 912345678, N'89012345678', N'Renata Oliveira')
INSERT [dbo].[Cliente] ([IDcliente], [CEP], [TELEFONE], [CPF], [Nome]) VALUES (13, N'90123-456', 998765432, N'90123456789', N'Ricardo Barbosa')
INSERT [dbo].[Cliente] ([IDcliente], [CEP], [TELEFONE], [CPF], [Nome]) VALUES (14, N'10234-567', 967891234, N'10234567890', N'Ana Costa')
INSERT [dbo].[Cliente] ([IDcliente], [CEP], [TELEFONE], [CPF], [Nome]) VALUES (15, N'21345-678', 912347890, N'21345678901', N'Eduardo Souza')
SET IDENTITY_INSERT [dbo].[Cliente] OFF
GO
SET IDENTITY_INSERT [dbo].[CLT] ON 

INSERT [dbo].[CLT] ([IDclt], [CEP], [Telefone], [CPF]) VALUES (1, N'12345-678', N'912345678', N'12345678901')
INSERT [dbo].[CLT] ([IDclt], [CEP], [Telefone], [CPF]) VALUES (2, N'98765-432', N'987654321', N'98765432100')
INSERT [dbo].[CLT] ([IDclt], [CEP], [Telefone], [CPF]) VALUES (3, N'54321-876', N'934567890', N'45678912345')
INSERT [dbo].[CLT] ([IDclt], [CEP], [Telefone], [CPF]) VALUES (4, N'11223-445', N'963258745', N'11223344556')
INSERT [dbo].[CLT] ([IDclt], [CEP], [Telefone], [CPF]) VALUES (5, N'66777-889', N'912347654', N'66778899001')
INSERT [dbo].[CLT] ([IDclt], [CEP], [Telefone], [CPF]) VALUES (6, N'23456-789', N'998765432', N'23456789012')
INSERT [dbo].[CLT] ([IDclt], [CEP], [Telefone], [CPF]) VALUES (7, N'34567-890', N'934567890', N'34567890123')
INSERT [dbo].[CLT] ([IDclt], [CEP], [Telefone], [CPF]) VALUES (8, N'45678-901', N'912346789', N'45678901234')
INSERT [dbo].[CLT] ([IDclt], [CEP], [Telefone], [CPF]) VALUES (9, N'56789-012', N'987654321', N'56789012345')
INSERT [dbo].[CLT] ([IDclt], [CEP], [Telefone], [CPF]) VALUES (10, N'67890-123', N'923456789', N'67890123456')
INSERT [dbo].[CLT] ([IDclt], [CEP], [Telefone], [CPF]) VALUES (11, N'78901-234', N'934567890', N'78901234567')
INSERT [dbo].[CLT] ([IDclt], [CEP], [Telefone], [CPF]) VALUES (12, N'89012-345', N'912345678', N'89012345678')
INSERT [dbo].[CLT] ([IDclt], [CEP], [Telefone], [CPF]) VALUES (13, N'90123-456', N'998765432', N'90123456789')
INSERT [dbo].[CLT] ([IDclt], [CEP], [Telefone], [CPF]) VALUES (14, N'10234-567', N'967891234', N'10234567890')
INSERT [dbo].[CLT] ([IDclt], [CEP], [Telefone], [CPF]) VALUES (15, N'21345-678', N'912347890', N'21345678901')
SET IDENTITY_INSERT [dbo].[CLT] OFF
GO
SET IDENTITY_INSERT [dbo].[OrdemServiço] ON 

INSERT [dbo].[OrdemServiço] ([IDordem], [StatusServ], [IDveiculo], [IDserviços], [IDclt]) VALUES (1, N'Em andamento', 2, 1, 5)
INSERT [dbo].[OrdemServiço] ([IDordem], [StatusServ], [IDveiculo], [IDserviços], [IDclt]) VALUES (2, N'Concluído', 3, 2, 1)
INSERT [dbo].[OrdemServiço] ([IDordem], [StatusServ], [IDveiculo], [IDserviços], [IDclt]) VALUES (3, N'Em andamento', 4, 3, 2)
INSERT [dbo].[OrdemServiço] ([IDordem], [StatusServ], [IDveiculo], [IDserviços], [IDclt]) VALUES (4, N'Concluído', 5, 4, 3)
INSERT [dbo].[OrdemServiço] ([IDordem], [StatusServ], [IDveiculo], [IDserviços], [IDclt]) VALUES (5, N'Em andamento', 6, 5, 4)
INSERT [dbo].[OrdemServiço] ([IDordem], [StatusServ], [IDveiculo], [IDserviços], [IDclt]) VALUES (6, N'Concluído', 7, 6, 5)
INSERT [dbo].[OrdemServiço] ([IDordem], [StatusServ], [IDveiculo], [IDserviços], [IDclt]) VALUES (7, N'Em andamento', 8, 7, 6)
INSERT [dbo].[OrdemServiço] ([IDordem], [StatusServ], [IDveiculo], [IDserviços], [IDclt]) VALUES (8, N'Concluído', 9, 8, 7)
INSERT [dbo].[OrdemServiço] ([IDordem], [StatusServ], [IDveiculo], [IDserviços], [IDclt]) VALUES (9, N'Em andamento', 10, 9, 8)
INSERT [dbo].[OrdemServiço] ([IDordem], [StatusServ], [IDveiculo], [IDserviços], [IDclt]) VALUES (10, N'Concluído', 11, 10, 9)
INSERT [dbo].[OrdemServiço] ([IDordem], [StatusServ], [IDveiculo], [IDserviços], [IDclt]) VALUES (11, N'Em andamento', 12, 11, 10)
INSERT [dbo].[OrdemServiço] ([IDordem], [StatusServ], [IDveiculo], [IDserviços], [IDclt]) VALUES (12, N'Concluído', 13, 12, 11)
INSERT [dbo].[OrdemServiço] ([IDordem], [StatusServ], [IDveiculo], [IDserviços], [IDclt]) VALUES (13, N'Em andamento', 14, 13, 12)
INSERT [dbo].[OrdemServiço] ([IDordem], [StatusServ], [IDveiculo], [IDserviços], [IDclt]) VALUES (14, N'Concluído', 15, 14, 13)
INSERT [dbo].[OrdemServiço] ([IDordem], [StatusServ], [IDveiculo], [IDserviços], [IDclt]) VALUES (15, N'Em andamento', 15, 15, 14)
SET IDENTITY_INSERT [dbo].[OrdemServiço] OFF
GO
SET IDENTITY_INSERT [dbo].[Serviços] ON 

INSERT [dbo].[Serviços] ([IDserviços], [ServiçoSele], [Valor]) VALUES (1, N'Troca de óleo', 120.0000)
INSERT [dbo].[Serviços] ([IDserviços], [ServiçoSele], [Valor]) VALUES (2, N'Alinhamento', 80.0000)
INSERT [dbo].[Serviços] ([IDserviços], [ServiçoSele], [Valor]) VALUES (3, N'Balanceamento', 60.0000)
INSERT [dbo].[Serviços] ([IDserviços], [ServiçoSele], [Valor]) VALUES (4, N'Troca de pastilhas de freio', 150.0000)
INSERT [dbo].[Serviços] ([IDserviços], [ServiçoSele], [Valor]) VALUES (5, N'Troca de pneu', 200.0000)
INSERT [dbo].[Serviços] ([IDserviços], [ServiçoSele], [Valor]) VALUES (6, N'Lavagem completa', 50.0000)
INSERT [dbo].[Serviços] ([IDserviços], [ServiçoSele], [Valor]) VALUES (7, N'Troca de bateria', 250.0000)
INSERT [dbo].[Serviços] ([IDserviços], [ServiçoSele], [Valor]) VALUES (8, N'Troca de filtro de ar', 40.0000)
INSERT [dbo].[Serviços] ([IDserviços], [ServiçoSele], [Valor]) VALUES (9, N'Reparo de motor', 800.0000)
INSERT [dbo].[Serviços] ([IDserviços], [ServiçoSele], [Valor]) VALUES (10, N'Troca de correia dentada', 350.0000)
INSERT [dbo].[Serviços] ([IDserviços], [ServiçoSele], [Valor]) VALUES (11, N'Inspeção veicular', 100.0000)
INSERT [dbo].[Serviços] ([IDserviços], [ServiçoSele], [Valor]) VALUES (12, N'Serviço de funilaria', 600.0000)
INSERT [dbo].[Serviços] ([IDserviços], [ServiçoSele], [Valor]) VALUES (13, N'Troca de vela de ignição', 90.0000)
INSERT [dbo].[Serviços] ([IDserviços], [ServiçoSele], [Valor]) VALUES (14, N'Troca de óleo de câmbio', 220.0000)
INSERT [dbo].[Serviços] ([IDserviços], [ServiçoSele], [Valor]) VALUES (15, N'Instalação de rádio no carro', 120.0000)
SET IDENTITY_INSERT [dbo].[Serviços] OFF
GO
SET IDENTITY_INSERT [dbo].[Veiculo] ON 

INSERT [dbo].[Veiculo] ([IDveiculo], [Modelo], [Placa], [IDcliente]) VALUES (1, N'Fusca', N'ABC1234', 1)
INSERT [dbo].[Veiculo] ([IDveiculo], [Modelo], [Placa], [IDcliente]) VALUES (2, N'Gol', N'DEF5678', 2)
INSERT [dbo].[Veiculo] ([IDveiculo], [Modelo], [Placa], [IDcliente]) VALUES (3, N'Civic', N'GHI9101', 3)
INSERT [dbo].[Veiculo] ([IDveiculo], [Modelo], [Placa], [IDcliente]) VALUES (4, N'HB20', N'JKL1122', 4)
INSERT [dbo].[Veiculo] ([IDveiculo], [Modelo], [Placa], [IDcliente]) VALUES (5, N'Cruze', N'MNO3344', 5)
INSERT [dbo].[Veiculo] ([IDveiculo], [Modelo], [Placa], [IDcliente]) VALUES (6, N'Onix', N'PQR5566', 6)
INSERT [dbo].[Veiculo] ([IDveiculo], [Modelo], [Placa], [IDcliente]) VALUES (7, N'Corolla', N'STU7788', 7)
INSERT [dbo].[Veiculo] ([IDveiculo], [Modelo], [Placa], [IDcliente]) VALUES (8, N'Kwid', N'VWX9900', 8)
INSERT [dbo].[Veiculo] ([IDveiculo], [Modelo], [Placa], [IDcliente]) VALUES (9, N'S10', N'YZA2233', 9)
INSERT [dbo].[Veiculo] ([IDveiculo], [Modelo], [Placa], [IDcliente]) VALUES (10, N'Saveiro', N'BCD4455', 10)
INSERT [dbo].[Veiculo] ([IDveiculo], [Modelo], [Placa], [IDcliente]) VALUES (11, N'Civic', N'EFG6677', 11)
INSERT [dbo].[Veiculo] ([IDveiculo], [Modelo], [Placa], [IDcliente]) VALUES (12, N'Fusca', N'HIJ8899', 12)
INSERT [dbo].[Veiculo] ([IDveiculo], [Modelo], [Placa], [IDcliente]) VALUES (13, N'Focus', N'KLM1001', 13)
INSERT [dbo].[Veiculo] ([IDveiculo], [Modelo], [Placa], [IDcliente]) VALUES (14, N'Tiguan', N'NOP2234', 14)
INSERT [dbo].[Veiculo] ([IDveiculo], [Modelo], [Placa], [IDcliente]) VALUES (15, N'Mobi', N'QRS4456', 15)
SET IDENTITY_INSERT [dbo].[Veiculo] OFF
GO
ALTER TABLE [dbo].[OrdemServiço]  WITH CHECK ADD  CONSTRAINT [FK_IDclt] FOREIGN KEY([IDclt])
REFERENCES [dbo].[CLT] ([IDclt])
GO
ALTER TABLE [dbo].[OrdemServiço] CHECK CONSTRAINT [FK_IDclt]
GO
ALTER TABLE [dbo].[OrdemServiço]  WITH CHECK ADD  CONSTRAINT [FK_IDserviços] FOREIGN KEY([IDserviços])
REFERENCES [dbo].[Serviços] ([IDserviços])
GO
ALTER TABLE [dbo].[OrdemServiço] CHECK CONSTRAINT [FK_IDserviços]
GO
ALTER TABLE [dbo].[OrdemServiço]  WITH CHECK ADD  CONSTRAINT [FK_IDveiculo] FOREIGN KEY([IDveiculo])
REFERENCES [dbo].[Veiculo] ([IDveiculo])
GO
ALTER TABLE [dbo].[OrdemServiço] CHECK CONSTRAINT [FK_IDveiculo]
GO
ALTER TABLE [dbo].[Veiculo]  WITH CHECK ADD  CONSTRAINT [FK_IDcliente] FOREIGN KEY([IDcliente])
REFERENCES [dbo].[Cliente] ([IDcliente])
GO
ALTER TABLE [dbo].[Veiculo] CHECK CONSTRAINT [FK_IDcliente]
GO
USE [master]
GO
ALTER DATABASE [OFICINA03] SET  READ_WRITE 
GO
