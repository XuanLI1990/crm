package com.idmgroup.ms.repository.search;
import com.idmgroup.ms.domain.Product;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * Spring Data Elasticsearch repository for the {@link Product} entity.
 */
public interface ProductSearchRepository extends ElasticsearchRepository<Product, Long> {
}
