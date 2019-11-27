// @autor: Israel Bejarano
package com.microservicios.springboot.app.item.models.service;

import java.util.List;

import com.microservicios.springboot.app.item.models.Item;

public interface ItemService {

	public List<Item> findAll();
	public Item findById(Long id, Integer cantidad);
}
