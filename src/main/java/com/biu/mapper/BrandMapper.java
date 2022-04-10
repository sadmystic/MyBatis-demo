package com.biu.mapper;

import com.biu.pojo.Brand;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface BrandMapper {
    /*
    *单个参数
    * 1.POJO:直接使用,属性名和参数占位符一致
    * 2.Map:直接使用,键名和参数占位符一致
    * 3.Collection:封装为map，推荐用@Param替换arg键名
    *   map.put("arg0",collection集合);
    *   map.put("collection",collection集合);
    * 4.List:封装为map，推荐用@Param替换arg键名
    *   map.put("arg0",List集合);
    *   map.put("collection",List集合);
    *   map.put("List",List集合);
    * 5.Array:封装为map，推荐用@Param替换arg键名
    *   map.put("arg0",数组);
    *   map.put("array",数组);
    * 其他:直接使用

    *多个参数：封装为map,推荐用@Param替换arg键名
    * map.put("arg0",参数1)
    * map.put("param1",参数1)
    * map.put("arg1",参数2)
    * map.put("param2",参数1)
    * */



    /*
    *查询所有
    */
    List<Brand> selectAll();

    /*
    *查看详情
    */
    Brand selectById(int id);

    /*
    *条件查询
    *   参数接受
    *   1.散装参数:多个参数，需要使用@Param("SQL参数占位符名称")
    *   2.对象参数:对象的属性名称要和参数占位符名称一致
    *   3.map集合参数
    */

    //List<Brand> selectByCondition(@Param("status") int status,@Param("companyName")String companyName,@Param("brandName")String brandName);

    //List<Brand> selectByCondition(Brand brand);

    List<Brand> selectByCondition(Map map);

    /*
    * 单条件动态查询
    */
    List<Brand> selectByConditionSingle(Brand brand);


    /*
    * 添加
    * */
    void add(Brand brand);

    /*
    * 修改
    * */
    int update(Brand brand);

    /*
    * 根据id删除
    * */
    void delteById(int id);

    /*
    * 批量删除
    */
    void deleteByIds(@Param("ids") int[] ids);
}
