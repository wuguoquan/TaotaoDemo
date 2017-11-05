package com.wugq.taotao.service;

import com.wugq.taotao.pojo.EUDataGridResult;
import com.wugq.taotao.pojo.TaotaoResult;
import com.wugq.taotao.pojo.TbItem;

public interface ItemService {

    EUDataGridResult getItemList(int page, int rows);

    TaotaoResult createItem(TbItem item);
}