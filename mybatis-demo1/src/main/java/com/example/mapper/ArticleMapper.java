package com.example.mapper;

import com.example.entity.vo.ArticleInfoVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface ArticleMapper {
    ArticleInfoVO getDetail(@Param("id")Integer id);
}
