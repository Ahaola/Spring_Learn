package com.example.mapper;

import com.example.entity.vo.ArticleInfoVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface ArticleMapper {
    ArticleInfoVO getDetail(@Param("id")Integer id);
    //多表联查
    List<ArticleInfoVO> getlistbyuid(@Param("uid")Integer uid);
}
