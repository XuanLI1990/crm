package com.idmgroup.ms.repository.search;

import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Configuration;

/**
 * Configure a Mock version of {@link ProductOrderSearchRepository} to test the
 * application without starting Elasticsearch.
 */
@Configuration
public class ProductOrderSearchRepositoryMockConfiguration {

    @MockBean
    private ProductOrderSearchRepository mockProductOrderSearchRepository;

}
