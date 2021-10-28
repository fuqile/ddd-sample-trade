package com.company.system.goods.resource.call;

import com.company.system.goods.resource.entity.GoodsEntity;
import org.springframework.stereotype.Repository;

/**
 * 商品服务
 *
 * @author only
 * @since 2020-05-22
 */
@Repository
public interface GoodsCall {
    GoodsEntity getGoodsById(Long goodsId);
}
