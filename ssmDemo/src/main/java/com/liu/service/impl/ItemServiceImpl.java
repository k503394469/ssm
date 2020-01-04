package com.liu.service.impl;

import com.liu.dao.ItemDao;
import com.liu.pojo.Item;
import com.liu.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("itemService")
@Transactional
public class ItemServiceImpl implements ItemService {
    private final ItemDao itemDao;
    @Autowired
    public ItemServiceImpl(ItemDao itemDao) {
        this.itemDao = itemDao;
    }

    @Override
    public Item findById(int id) {
        return itemDao.findById(id);
    }
}
