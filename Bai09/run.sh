cd src
mvn clean
mvn test
echo "---- noi dung file log ----"
cat logs/app.log 2>/dev/null || echo "(chua co log file)"
