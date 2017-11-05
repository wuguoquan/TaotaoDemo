package com.wugq.taotao.service;

import java.util.List;

import com.wugq.taotao.pojo.EUTreeNode;

public interface ItemCatService {

	List<EUTreeNode> getCatList(long parentId);
}
