def class Test {
	/**
	 * Executes a batch of tests from a scenario folder against a running TEEXMA application 
	 * this will execute a subset of the tests contained in the folder from test number batchIndex * batchSize to (batchIndex + 1) * batchSize
	 * @param selConfig the selenium config object
	 * @param scenariosFolder the tests scenario folder that should be executed
	 * @param errorsFolder the name of the errors folder which will contain errors log files
	 * @param filesMap the map object that will store the log files format is [filePath, fileContent]
	 * @param batchIndex the index of the batch of tests to execute
	 * @param batchSize the size of the batch of tests to execute
	 * @param isFirstBatch set to true if this call will execute the first folder of a batch or the only folder
	 * @param isLastBatch set to true if this call will execute the last folder of a batch or the only folder
	 * @param isAdminUser set to true if the user will be the admin false for for a regular user
	 * @return nothing
	 */
	def static seleniumTests(script) {
	
		def archivesPath = "./archives"
		def logsPath = "./logs"
			
		script.node ("Deleting archives") {
			script.echo "deleting archives"

        }

    }

}