package com.wugq.taotao.service;

import com.wugq.taotao.pojo.EUDataGridResult;

public interface ItemService {

    EUDataGridResult getItemList(int page, int rows);
}