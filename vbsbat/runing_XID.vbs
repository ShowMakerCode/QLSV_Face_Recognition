main
Sub main
Set oShell = CreateObject ("Wscript.Shell") 
Dim strArgs
strArgs = "cmd /c C:/Users/98tae/Desktop/QLSVMAINOVER/vbsbat/runningXID.bat"
oShell.Run strArgs, 0, false
End Sub