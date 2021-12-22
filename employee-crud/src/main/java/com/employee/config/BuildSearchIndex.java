package com.employee.config;

import javax.persistence.EntityManager;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.CacheMode;
import org.hibernate.search.jpa.FullTextEntityManager;
import org.hibernate.search.jpa.Search;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class BuildSearchIndex implements ApplicationListener<ApplicationReadyEvent>{
	@Autowired
	private EntityManager entityManager;

	Logger logger = LogManager.getLogger();

	@Override
	@Transactional
	public void onApplicationEvent(final ApplicationReadyEvent event) {

		logger.info("Started Initializing Indexes");
		FullTextEntityManager fullTextEntityManager = null;
		
		try {
			fullTextEntityManager = Search.getFullTextEntityManager(entityManager);
			fullTextEntityManager.createIndexer()
								.batchSizeToLoadObjects(25)
								.threadsToLoadObjects(12).idFetchSize(150)
								.cacheMode(CacheMode.IGNORE)
								.startAndWait();

			logger.info("Completed indexing");		
		} catch (Exception e) {
			logger.info("An error occurred while trying to build the serach index: " + e.toString());
		}

	}
}
