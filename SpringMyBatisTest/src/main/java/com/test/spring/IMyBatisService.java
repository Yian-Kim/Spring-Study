package com.test.spring;

import java.util.HashMap;
import java.util.List;

public interface IMyBatisService {
	
	void test();

	void m1();

	int m2(String seq);

	int m3(HashMap<String, String> map);

	int m4(MyBatisDTO dto);

	int m5();

	MyBatisDTO m6(String num);

	List<String> m7();

	List<MyBatisDTO> m8(String buseo);

}
