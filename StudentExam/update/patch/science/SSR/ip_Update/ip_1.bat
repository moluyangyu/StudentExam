@Echo Off
Title 从GitHub云端更新 SSR 配置文件
cd /d %~dp0
..\..\wget --no-check-certificate https://gitlab.com/free9999/ipupdate/-/raw/master/ssr/ssconfig.txt

if exist ssconfig.txt goto startcopy

..\..\wget --no-check-certificate https://www.githubip.xyz/Alvin9999/pac2/master/SSR/ssconfig.txt

if exist ssconfig.txt goto startcopy

echo ip更新失败，请试试另外一个，如果都不行，请反馈kebi2014@gmail.com
pause
exit
:startcopy

del "..\gui-config.json_backup"
ren "..\gui-config.json"  gui-config.json_backup
b64 -d ssconfig.txt gui-config.json
copy /y "%~dp0gui-config.json" ..\gui-config.json
del "%~dp0ssconfig.txt"
del "%~dp0gui-config.json"
ECHO.&ECHO.已更新SSR配置文件,请按回车键或空格键启动程序！ &PAUSE >NUL 2>NUL
exit