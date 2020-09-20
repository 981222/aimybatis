package com.huang.repository;

import com.huang.entity.Goods;

public interface GoodsRepository {
    public Goods findById(long id);
}
