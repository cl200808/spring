package com.example.service.example.mapper;

import com.example.service.example.entity.HotEvents;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface HEMapper {
	//��ҳ��ѯ���е���Ϣ����������ָ����������
	List<HotEvents> findAllByOrder(@Param("startRow") Integer startRow, @Param("pageSize") Integer pageSize, @Param("search") String search);
	//��ѯ����
	 int findCount(@Param("search") String search);

	//�����ȵ��¼���Ų�ѯ---�ؼ��ʡ�����ʱ��----�������ݡ�����ʱ��

	//�����ȵ��¼���Ų�ѯ�������ݡ�����ʱ��
	public List<HotEvents> findByidC(int id);

	//�����ȵ��¼���Ų�ѯ---�ؼ��ʡ�����ʱ�䡢��������
	public HotEvents findByidH(int id);

	//����id�������
	public int addContent(@Param("hotEventsId") int id, @Param("content") String content);

	//��������hotEventsId(�����ȵ��¼���id)��ѯ����ָ��
	public Integer findSearchSum(int id);

	//����id�޸�����ָ��������
	public int addSearchSum(@Param("id") int id, @Param("searchSum") int count);
}
