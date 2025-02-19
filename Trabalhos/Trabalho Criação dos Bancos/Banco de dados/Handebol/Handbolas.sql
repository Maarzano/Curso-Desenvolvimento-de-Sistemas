USE [master]
GO
/****** Object:  Database [CampeonatoHandebol]    Script Date: 11/12/2024 21:31:48 ******/
CREATE DATABASE [CampeonatoHandebol]
 CONTAINMENT = NONE
 ON  PRIMARY 
( NAME = N'CampeonatoHandebol', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL16.SQLEXPRESS\MSSQL\DATA\CampeonatoHandebol.mdf' , SIZE = 8192KB , MAXSIZE = UNLIMITED, FILEGROWTH = 65536KB )
 LOG ON 
( NAME = N'CampeonatoHandebol_log', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL16.SQLEXPRESS\MSSQL\DATA\CampeonatoHandebol_log.ldf' , SIZE = 8192KB , MAXSIZE = 2048GB , FILEGROWTH = 65536KB )
 WITH CATALOG_COLLATION = DATABASE_DEFAULT, LEDGER = OFF
GO
ALTER DATABASE [CampeonatoHandebol] SET COMPATIBILITY_LEVEL = 160
GO
IF (1 = FULLTEXTSERVICEPROPERTY('IsFullTextInstalled'))
begin
EXEC [CampeonatoHandebol].[dbo].[sp_fulltext_database] @action = 'enable'
end
GO
ALTER DATABASE [CampeonatoHandebol] SET ANSI_NULL_DEFAULT OFF 
GO
ALTER DATABASE [CampeonatoHandebol] SET ANSI_NULLS OFF 
GO
ALTER DATABASE [CampeonatoHandebol] SET ANSI_PADDING OFF 
GO
ALTER DATABASE [CampeonatoHandebol] SET ANSI_WARNINGS OFF 
GO
ALTER DATABASE [CampeonatoHandebol] SET ARITHABORT OFF 
GO
ALTER DATABASE [CampeonatoHandebol] SET AUTO_CLOSE OFF 
GO
ALTER DATABASE [CampeonatoHandebol] SET AUTO_SHRINK OFF 
GO
ALTER DATABASE [CampeonatoHandebol] SET AUTO_UPDATE_STATISTICS ON 
GO
ALTER DATABASE [CampeonatoHandebol] SET CURSOR_CLOSE_ON_COMMIT OFF 
GO
ALTER DATABASE [CampeonatoHandebol] SET CURSOR_DEFAULT  GLOBAL 
GO
ALTER DATABASE [CampeonatoHandebol] SET CONCAT_NULL_YIELDS_NULL OFF 
GO
ALTER DATABASE [CampeonatoHandebol] SET NUMERIC_ROUNDABORT OFF 
GO
ALTER DATABASE [CampeonatoHandebol] SET QUOTED_IDENTIFIER OFF 
GO
ALTER DATABASE [CampeonatoHandebol] SET RECURSIVE_TRIGGERS OFF 
GO
ALTER DATABASE [CampeonatoHandebol] SET  DISABLE_BROKER 
GO
ALTER DATABASE [CampeonatoHandebol] SET AUTO_UPDATE_STATISTICS_ASYNC OFF 
GO
ALTER DATABASE [CampeonatoHandebol] SET DATE_CORRELATION_OPTIMIZATION OFF 
GO
ALTER DATABASE [CampeonatoHandebol] SET TRUSTWORTHY OFF 
GO
ALTER DATABASE [CampeonatoHandebol] SET ALLOW_SNAPSHOT_ISOLATION OFF 
GO
ALTER DATABASE [CampeonatoHandebol] SET PARAMETERIZATION SIMPLE 
GO
ALTER DATABASE [CampeonatoHandebol] SET READ_COMMITTED_SNAPSHOT OFF 
GO
ALTER DATABASE [CampeonatoHandebol] SET HONOR_BROKER_PRIORITY OFF 
GO
ALTER DATABASE [CampeonatoHandebol] SET RECOVERY SIMPLE 
GO
ALTER DATABASE [CampeonatoHandebol] SET  MULTI_USER 
GO
ALTER DATABASE [CampeonatoHandebol] SET PAGE_VERIFY CHECKSUM  
GO
ALTER DATABASE [CampeonatoHandebol] SET DB_CHAINING OFF 
GO
ALTER DATABASE [CampeonatoHandebol] SET FILESTREAM( NON_TRANSACTED_ACCESS = OFF ) 
GO
ALTER DATABASE [CampeonatoHandebol] SET TARGET_RECOVERY_TIME = 60 SECONDS 
GO
ALTER DATABASE [CampeonatoHandebol] SET DELAYED_DURABILITY = DISABLED 
GO
ALTER DATABASE [CampeonatoHandebol] SET ACCELERATED_DATABASE_RECOVERY = OFF  
GO
ALTER DATABASE [CampeonatoHandebol] SET QUERY_STORE = ON
GO
ALTER DATABASE [CampeonatoHandebol] SET QUERY_STORE (OPERATION_MODE = READ_WRITE, CLEANUP_POLICY = (STALE_QUERY_THRESHOLD_DAYS = 30), DATA_FLUSH_INTERVAL_SECONDS = 900, INTERVAL_LENGTH_MINUTES = 60, MAX_STORAGE_SIZE_MB = 1000, QUERY_CAPTURE_MODE = AUTO, SIZE_BASED_CLEANUP_MODE = AUTO, MAX_PLANS_PER_QUERY = 200, WAIT_STATS_CAPTURE_MODE = ON)
GO
USE [CampeonatoHandebol]
GO
/****** Object:  Table [dbo].[CadastroElenco]    Script Date: 11/12/2024 21:31:48 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[CadastroElenco](
	[IDJogador] [int] IDENTITY(1,1) NOT NULL,
	[NomeJogador] [varchar](100) NULL,
	[DataNascimentoJogador] [date] NULL,
	[AlturaJogador] [int] NULL,
	[GeneroJogador] [varchar](20) NULL,
	[IDTime] [int] NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[IDJogador] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[CadastroEstadio]    Script Date: 11/12/2024 21:31:48 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[CadastroEstadio](
	[IDEstadio] [int] IDENTITY(1,1) NOT NULL,
	[NomeEstadio] [varchar](100) NULL,
	[Lugar] [varchar](150) NULL,
	[CapacidadeEstadio] [int] NULL,
	[DonoEstadio] [varchar](100) NULL,
PRIMARY KEY CLUSTERED 
(
	[IDEstadio] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[CadastroTime]    Script Date: 11/12/2024 21:31:48 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[CadastroTime](
	[IDTime] [int] IDENTITY(1,1) NOT NULL,
	[NomeTime] [varchar](100) NULL,
	[EscudoTime] [varchar](255) NULL,
	[DataCriacao] [date] NULL,
	[CapitaoDoTime] [varchar](100) NULL,
PRIMARY KEY CLUSTERED 
(
	[IDTime] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[CadastroUsuario]    Script Date: 11/12/2024 21:31:48 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[CadastroUsuario](
	[IDUsuario] [int] IDENTITY(1,1) NOT NULL,
	[EmailUser] [varchar](150) NULL,
	[SenhaUser] [varchar](255) NULL,
	[NomeUser] [varchar](100) NULL,
	[DataNascimentoUser] [date] NULL,
	[CPFUser] [char](11) NULL,
	[NumeroCelularUser] [varchar](15) NULL,
PRIMARY KEY CLUSTERED 
(
	[IDUsuario] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Campeonato]    Script Date: 11/12/2024 21:31:48 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Campeonato](
	[IDCampeonato] [int] IDENTITY(1,1) NOT NULL,
	[NomeCampeonato] [varchar](100) NULL,
	[AnoCampeonato] [date] NULL,
PRIMARY KEY CLUSTERED 
(
	[IDCampeonato] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Classificacao]    Script Date: 11/12/2024 21:31:48 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Classificacao](
	[IDClassificacao] [int] IDENTITY(1,1) NOT NULL,
	[IDCampeonato] [int] NULL,
	[IDTime] [int] NULL,
	[Posicao] [int] NULL,
	[Vitorias] [int] NULL,
	[SaldoGols] [int] NULL,
	[Pontuacao] [int] NULL,
PRIMARY KEY CLUSTERED 
(
	[IDClassificacao] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[ProximasPartidas]    Script Date: 11/12/2024 21:31:48 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[ProximasPartidas](
	[IDPartida] [int] IDENTITY(1,1) NOT NULL,
	[TimeMandante] [int] NOT NULL,
	[TimeVisitante] [int] NOT NULL,
	[Placar] [varchar](10) NULL,
	[Dia] [date] NULL,
	[Horario] [time](7) NULL,
	[IDEstadio] [int] NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[IDPartida] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
ALTER TABLE [dbo].[CadastroElenco]  WITH CHECK ADD  CONSTRAINT [FK_CadastroElenco_CadastroTime] FOREIGN KEY([IDTime])
REFERENCES [dbo].[CadastroTime] ([IDTime])
GO
ALTER TABLE [dbo].[CadastroElenco] CHECK CONSTRAINT [FK_CadastroElenco_CadastroTime]
GO
ALTER TABLE [dbo].[Classificacao]  WITH CHECK ADD FOREIGN KEY([IDCampeonato])
REFERENCES [dbo].[Campeonato] ([IDCampeonato])
GO
ALTER TABLE [dbo].[Classificacao]  WITH CHECK ADD FOREIGN KEY([IDTime])
REFERENCES [dbo].[CadastroTime] ([IDTime])
GO
ALTER TABLE [dbo].[ProximasPartidas]  WITH CHECK ADD FOREIGN KEY([TimeMandante])
REFERENCES [dbo].[CadastroTime] ([IDTime])
GO
ALTER TABLE [dbo].[ProximasPartidas]  WITH CHECK ADD FOREIGN KEY([TimeVisitante])
REFERENCES [dbo].[CadastroTime] ([IDTime])
GO
ALTER TABLE [dbo].[ProximasPartidas]  WITH CHECK ADD  CONSTRAINT [FK_ProximasPartidas_CadastroEstadio] FOREIGN KEY([IDEstadio])
REFERENCES [dbo].[CadastroEstadio] ([IDEstadio])
GO
ALTER TABLE [dbo].[ProximasPartidas] CHECK CONSTRAINT [FK_ProximasPartidas_CadastroEstadio]
GO
USE [master]
GO
ALTER DATABASE [CampeonatoHandebol] SET  READ_WRITE 
GO
