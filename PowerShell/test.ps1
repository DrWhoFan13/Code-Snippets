#test.ps1
#Show Hello and time
"" # Blank Line
"Hello " + $env:UserName + "!"
"Time is " + "{0:HH}:{0:mm}" -f (Get-Date)
"" # Blank Line