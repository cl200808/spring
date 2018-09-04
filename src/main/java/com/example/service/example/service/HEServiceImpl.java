package com.example.service.example.service;


import com.example.service.example.entity.HotEvents;
import com.example.service.example.mapper.HEMapper;
import org.springframework.beans.factory.annotation.Autowired;

import javax.jws.WebService;
import java.util.List;

@WebService
public class HEServiceImpl implements HEService {
	@Autowired
	private HEMapper heMapper;

	public List<HotEvents> findAllByOrder(Integer startRow, Integer pageSize, String search) {
		return heMapper.findAllByOrder(startRow, pageSize, search);
	}

	public int findCount(String search) {
		return heMapper.findCount(search);
	}

	public List<HotEvents> findByidC(int id) {
		return heMapper.findByidC(id);
	}

	public HotEvents findByidH(int id) {
		return heMapper.findByidH(id);
	}

	public int addContent(int id, String content) {
		return heMapper.addContent(id, content);
	}

	public Integer findSearchSum(int id) {
		return heMapper.findSearchSum(id);
	}

	public int addSearchSum(int id, int count) {
		return heMapper.addSearchSum(id, count);
	}


}
