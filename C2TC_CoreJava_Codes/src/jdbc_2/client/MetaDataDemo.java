//Program to demonstrate Database MetaData and ResultSet Metadata
package jdbc_2.client;

import jdbc_2.metadata.DBMetadata;

public class MetaDataDemo {

	public static void main(String[] args) {
		DBMetadata.showDatabaseMetataData();
		DBMetadata.showRSMetadata();

	}

}
