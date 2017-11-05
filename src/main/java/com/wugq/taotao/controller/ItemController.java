package com.wugq.taotao.controller;

import com.wugq.taotao.pojo.EUDataGridResult;
import com.wugq.taotao.pojo.TaotaoResult;
import com.wugq.taotao.pojo.TbItem;
import com.wugq.taotao.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ItemController {

    @Autowired
    private ItemService itemService;

    @RequestMapping("/item/list")
    @ResponseBody
    public EUDataGridResult getItemList(Integer page, Integer rows) {
        EUDataGridResult result = itemService.getItemList(page, rows);
        return result;
    }

    @RequestMapping(value="/item/save", method= RequestMethod.POST)
    @ResponseBody
    private TaotaoResult createItem(TbItem item) {
        TaotaoResult result = itemService.createItem(item);
        return result;
    }
}