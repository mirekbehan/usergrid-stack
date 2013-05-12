if [ ! -d "tmp" ] 
then

	echo "starting cassandra with init database > java -jar target/usergrid-standalone-0.0.16-SNAPSHOT.jar -init -db"
 	java -jar target/usergrid-standalone-0.0.16-SNAPSHOT.jar -init -db & >> std.out

else 
	echo "starting cassandra without init >  java -jar target/usergrid-standalone-0.0.16-SNAPSHOT.jar -db"
	java -jar target/usergrid-standalone-0.0.16-SNAPSHOT.jar -db & >> std.out

fi

