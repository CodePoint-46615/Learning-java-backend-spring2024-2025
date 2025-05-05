@echo off
cd /d "D:\OneDrive - American International University-Bangladesh\0. 10th Semester\Advance Programming with Java\Learning-java-backend"
git pull origin main --rebase 
git add --all 
git commit -m "Auto Commit - %date% %time%"
git push origin main