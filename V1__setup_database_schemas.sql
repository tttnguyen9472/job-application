CREATE DATABASE JobDB;
GO
USE JobDB;
GO
CREATE LOGIN TomiLogin WITH PASSWORD = 'Password123';
GO
CREATE USER TomiLogin FOR LOGIN [TomiLogin];
GO
EXEC sp_addrolemember N'db_owner', N'TomiLogin';
GO
CREATE SCHEMA Jobs;
GO