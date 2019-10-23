package com.idmgroup.ms.repository.search;
import com.idmgroup.ms.domain.OrderItem;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * Spring Data Elasticsearch repository for the {@link OrderItem} entity.
 */
public interface OrderItemSearchRepository extends ElasticsearchRepository<OrderItem, Long> {
}
