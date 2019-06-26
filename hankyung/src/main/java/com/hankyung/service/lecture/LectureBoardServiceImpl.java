package com.hankyung.service.lecture;

import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Service;

import com.hankyung.domain.board.BoardDTO;
import com.hankyung.domain.lecture.LectureBoardDTO;
import com.hankyung.persistence.lecture.LectureBoardDAO;

import lombok.extern.slf4j.Slf4j;
@Service
@Slf4j
public class LectureBoardServiceImpl implements LectureBoardService{
	@Inject
	private LectureBoardDAO lbDao;
	
	@Override
	public List<LectureBoardDTO> list(String viewoption, String search_option, String keyword, int btype, int start,
			int end) {
		return  lbDao.list(viewoption, search_option, keyword, btype, start, end);
	}

	@Override
	public int create(LectureBoardDTO lbDto) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(LectureBoardDTO lbDto) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public BoardDTO read(LectureBoardDTO lbDto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void increaseViewCnt(LectureBoardDTO lbDto, HttpSession session) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int delete(LectureBoardDTO lbDto) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int countArticle(int btype, String search_option, String keyword) {
		return lbDao.countArticle(btype, search_option, keyword);
	}

}