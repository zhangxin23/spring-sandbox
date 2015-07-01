package com.sandbox.spring.mybatis.mapper;

import com.sandbox.spring.mybatis.pojo.City;
import com.sandbox.spring.mybatis.pojo.CityExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;

public interface CityMapper {
    int countByExample(CityExample example);

    int deleteByExample(CityExample example);

    @Delete({
        "delete from city",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into city (name, population, ",
        "province)",
        "values (#{name,jdbcType=VARCHAR}, #{population,jdbcType=INTEGER}, ",
        "#{province,jdbcType=VARCHAR})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Integer.class)
    int insert(City record);

    int insertSelective(City record);

    List<City> selectByExample(CityExample example);

    @Select({
        "select",
        "id, name, population, province",
        "from city",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @ResultMap("BaseResultMap")
    City selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") City record, @Param("example") CityExample example);

    int updateByExample(@Param("record") City record, @Param("example") CityExample example);

    int updateByPrimaryKeySelective(City record);

    @Update({
        "update city",
        "set name = #{name,jdbcType=VARCHAR},",
          "population = #{population,jdbcType=INTEGER},",
          "province = #{province,jdbcType=VARCHAR}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(City record);
}