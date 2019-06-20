# windows-desktop-app-automation
Windows Desktop Application Automation using WinAppDriver / Appium

# Steps to Install WinAppDriver and Run the Notepad Application Test
! WinAppDriver => Selenium-style Driver for Windows Desktop Applications 
! More Details: https://github.com/Microsoft/WinAppDriver
! Requirement: Windows 10
! Compatible with Selenium JSON Wire Protocol. This allows to author test scripts in many languages including Java & Python
! Built on-top of previous Microsoft UI Automation Library => https://docs.microsoft.com/en-us/windows/desktop/winauto/entry-uiauto-win32
! Install WinAppDriver from installer file: https://github.com/microsoft/WinAppDriver/releases/download/v1.1.1/WindowsApplicationDriver.msi
! Goto Settings > Update & Security > For Developers and then Enable Debug Mode
! Start WinAppDriver => C:\Program Files (x86)\Windows Application Driver>WinAppDriver.exe
! Run the Test: mvn clean test

# UI Element Locator - (similar to Android ‘uiautomatorviewer’ tool)
! Use inspect.exe available under directory: C:\Program Files (x86)\Windows Kits\10\bin\x86
! More Info: https://docs.microsoft.com/en-us/windows/desktop/WinAuto/inspect-objects

